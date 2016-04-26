import java.util.Scanner;
class Bank{
	int bal; //instance
	static int rate; //static
	Bank(){
		Scanner sc = new Scanner(System.in);
		bal=sc.nextInt();
		}
	static void changeint(){
		Scanner sc = new Scanner(System.in);
		rate=sc.nextInt();	
		}
	void calinterest(){
		System.out.println("Interest:"+ (bal*rate)/100);
		}
	}
class StaticDemo{
	public static void main(String args[]){
		Bank.changeint();
		Bank b1 = new Bank();
		b1.calinterest();
		Bank b2 = new Bank();
		b2.calinterest();
		}
	}