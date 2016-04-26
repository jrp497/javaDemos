interface i1{
	void add(int a,int b);
	}
interface i2{
	void sub(int a,int b);
	}
class Arithmetic{
}
class A extends Arithmetic implements i1,i2{
	public void add(int a,int b){
		System.out.println("Sum="+(a+b));
		}
	public void sub(int a,int b){
	}
	}
class InterfaceDemo{
	public static void main(String args[]){
		A a1 = new A();
		a1.add(10,30);
		}
	}