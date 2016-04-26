class A{
	int x;
	A(){
		x=5;
		}
	A(int x1){
		x=x1;
		}
	void display(){
		System.out.println("X=" + x);
		}
	}
class B extends A{
	int y;
	B(){
		y=10;
		}
	B(int x1,int y1){
		super(x1);
		y=y1;
		}
	void display(){ //method overriding
		super.display();
		System.out.println("Y=" + y);
		}
	}
class InheritanceDemo{
	public static void main(String args[]){
		A Aptr = new B();
		Aptr.display();
		}
	}	