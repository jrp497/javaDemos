import java.util.Scanner;
class Student{
	int roll_no;
	String name;
	void setdata(){
		Scanner sc = new Scanner(System.in);
		roll_no = sc.nextInt();
		name = sc.next();
		}
	void setdata(int r,String s){
		roll_no = r;
		name = s;
		}
	void display(){
		System.out.println("Roll No:"+roll_no+"\nName:"+name);
		}
	}
class ClassDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students:");
		int size = sc.nextInt();
		Student s1[] = new Student[size];
		for(int i=0;i<s1.length;i++){
			s1[i]=new Student();
			s1[i].setdata(101,"abc");
			}
		for(int i=0;i<s1.length;i++){
			s1[i].display();
			}
		}
	}