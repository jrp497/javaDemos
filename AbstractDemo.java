//abstract classes
import java.util.Scanner;
abstract class Shape{
	int len,breadth;
	void display(){
		System.out.println("Length:"+len+"\nBreadth:" + breadth);
		}
	abstract void area();
	}
class Rect extends Shape{
	
	Rect(){
		Scanner sc = new Scanner(System.in);
		len=sc.nextInt();
		breadth=sc.nextInt();
		}
	void area(){
		System.out.println("Area="+len*breadth);
		}
}
class AbstractDemo{
	public static void main(String args[]){
		Rect r1 = new Rect();
		r1.display();
		r1.area();
		}
	}