import java.util.Scanner;
class A{
	int x;
	A(){	//default
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		}
	A(int x){ //parameterised
		this.x=x;
		}
	A(A a1){	//copy
		x=a1.x;
		}
	void display(){
		System.out.println("X="+x);
		}
	}
class ConsDemo{
	public static void main(String args[]){
		A a1 = new A();
		a1.display();
		
		A a2 = new A(10);
		a2.display();

		A a3 = new A(a1);
		a3.display();
		}
	}