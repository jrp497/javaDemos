import java.util.Scanner;
class CustomException1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter value:");
			int a = sc.nextInt();
			if(a<0){
				throw new Throwable("Negative value not allowed");
			}
			else{
				System.out.println("A=" + a);
				}
			}
		catch(Throwable e){
			System.out.println(e.getMessage());
			}
		}
	}