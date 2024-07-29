package acc.br.enumeracao;
//Complete Code
public enum EnumSample {


	//each constant is treated as an EnumSample object
	
	ONE(1,10), //the parameter 1 is passed to the constructor
	TWO(2,20),
	THREE(3,30),
	FOUR(4,40);
	
	private int x;;
	private int y;
	private EnumSample(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	
	public static void main(String arg[]){
		for(EnumSample item : EnumSample.values()){
			
			System.out.println(item.getX() + item.getY());
			
		}
	}
}