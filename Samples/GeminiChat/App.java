import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class App {
	//String myVariable = System.getenv("GOOGLE_API_KEY");
	//private static final String API_KEY = "<<Adicione sua chave aqui>>";
	private static final String API_KEY = System.getenv("GOOGLE_API_KEY");;
	private static final String URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:streamGenerateContent";
	private static final ArrayList<String> history = new ArrayList<String>();
	private static final int CAPACITY = 100;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		try(var scanner = new Scanner(System.in)) {
			while(true) {
				System.out.println("\nyou:");
				var ask = scanner.nextLine();
				if (ask.equals("quit")) {
					System.out.println("answer: bye");
					System.exit(0);
				}
				sendRequest(ask);
			}
		}
	}

	private static void sendRequest(String prompt) throws IOException, InterruptedException {
		var context = history.stream().collect(Collectors.joining(""));
		var fullPrompt = context + "return the result as plain text without any formatting, special characters, or backticks. Question:" + prompt;
		//conversationHistory(prompt);
		var jsonRequest = "{\"contents\":[{\"parts\":[{\"text\":\"" + fullPrompt + "\"}],\"role\":\"user\"}]}";
		var httpClient = HttpClient.newHttpClient();
		var request = HttpRequest.newBuilder()
				.uri(URI.create(URL + "?alt=sse&key=" + API_KEY))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
				.build();
		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		processResponse(response);
	}

	private static void processResponse(HttpResponse<String> response) throws IOException {
		if (response.statusCode() != 200) {
			System.out.println("Error: " + response.statusCode());
			return;
		}
		var pattern = Pattern.compile("\"text\"\\s*:\\s*\"([^\"]+)\"");
		var answer = new StringBuilder();
		String line;
		try(var reader = new BufferedReader(new StringReader(response.body()))){
			while ((line = reader.readLine()) != null) {
				if(line.isEmpty()) continue;
				Matcher matcher = pattern.matcher(line.substring(5));
				if(matcher.find()) {
					answer.append(matcher.group(1));
				}
			}
		}
		line = answer.substring(0, answer.toString().length() - 2);
		System.out.println("answer: " + line);
	}
	
	private static String conversationHistory(String prompt) {
		if(history.size() == CAPACITY) {
			history.remove(0);
		}
		history.add(prompt);
		var result = history.stream().collect(Collectors.joining(" "));
		return result;
	}
}
