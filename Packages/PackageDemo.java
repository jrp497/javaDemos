import ClassA.*;
import ClassB.B;
import ClassB.E;

public class PackageDemo{
						
		public static void main(String args[]){
		A a1 = new A();
		B b1 = new B();
		E e1 = new E();

		e1.display();
		a1.display();
		b1.display();
						
		protectedDemo2 p = new protectedDemo2();
		p.display2();
		System.out.println(p.methodP2());
		System.out.println(p.methodP());
		}
	}

class protectedDemo extends E {
		
		protected void display2(){
			System.out.println("protected method");
			super.display2();
		}	
		protected String methodP(){
			return methodE();
		}	

}

class protectedDemo2 extends protectedDemo{
	
		public void display2(){
			System.out.println("protected method 2 "+x);
			super.display2();
		}
		public String methodP2(){
			System.out.println("This is the method of PD2 class "+methodP());

			return methodP();
		}

}