package ClassB;


public class E{
	

protected int x=5;


public void display(){
		System.out.println("Class E");
		D d = new D();
		d.displayD();	
		}

protected String methodE(){

	return "This is the method of E class";
		}


protected void display2(){
	
		B b = new B(); 
		B.F  f = b.new F();
		f.display();
		}


}