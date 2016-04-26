import java.util.Scanner;
class Rectangle{
	int length,breadth;
	void setdata(int l,int b){
		length=l;
		breadth=b;
		}
	void setdata(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and breadth:");
		length = sc.nextInt();
		breadth=sc.nextInt();
		}
	void display(){
		System.out.println("Length="+ length+"\nBreadth=" + breadth);
		}
	void area(){
		System.out.println("Area="+length*breadth);
		}
	}
class Demo{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle();
		r1.setdata(10,20);
		r1.display();
		r1.area();

		Rectangle r2 = new Rectangle();
		r2.setdata();
		r2.display();
		r2.area();
		}
	}