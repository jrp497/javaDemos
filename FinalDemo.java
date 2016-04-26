class A{
	final int x=12;
	void display(){
		System.out.println("Class A");
		}
	}
class B extends A{
	void display(){
		System.out.println("Class B");
		}
	}
class FinalDemo{
	public static void main(String args[]){
		B b1 = new B();
		b1.display();
		}
	}