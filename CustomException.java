import java.util.Scanner;
class NegativeException extends Exception{
	NegativeException(String s){
		super(s);
		}
}
class CustomException{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter value:");
			int a = sc.nextInt();
			if(a<0){
				throw new NegativeException("Negative value not allowed");
			}
			else{
				System.out.println("A=" + a);
				}
			}
		catch(NegativeException e){
			System.out.println(e.getMessage());
			}
		}
	}