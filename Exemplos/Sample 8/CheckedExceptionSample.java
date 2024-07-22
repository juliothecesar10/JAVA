package sef.module8.sample;
// Needs to be completed
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

	public static void main(String arg[]) throws FileNotFoundException{
		
		String fileName = "SomeFileThatDoesNotExist.txt";
		
		//The following class is used to open a file for reading
				
		try{

			FileReader reader =  new FileReader(fileName);	
			
			System.out.println("Passou por aqui");

			reader.read();

		}
		//2 - catch FileNotFoundException 
		catch (FileNotFoundException e) {	
			System.out.println("Arquivo nao encontrado");

		}	
		catch (Exception e) {	
			System.out.println(e);
		}

		System.out.println("parei aqui");
	}
}