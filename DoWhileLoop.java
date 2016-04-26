import java.util.Scanner;
class DoWhileLoop{
	public static void main(String args[]){
		//menu driven
		Scanner sc = new Scanner(System.in);
		int choice;
		char ch;
		do{
			System.out.println("1.Addition\n2.Subtraction");
			System.out.print("Enter Choice:");
			choice = sc.nextInt();
			switch(choice){
			case 1:
				System.out.println(10+20);
				break;
			case 2:
				System.out.println(30-210);
				break;
			default:
				System.out.println("Exit");
				break;
			}
		System.out.println("Do wish to continue(y|n)");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		}
	}				