package javaTutorialOOPS;

public class factorial {

	static int inputNumber =10; 
	public static void main(String[] args) { 
		int a=0;
		int b=1;
		int c; 
		System.out.print(a+","+b);
		for(int d=2;d<inputNumber; d++) {
			c=a+b; 
			System.out.print(","+ c);			
			a=b;
			b=c;
			
		}
	
}
}