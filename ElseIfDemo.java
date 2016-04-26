import javax.swing.JOptionPane;
class ElseIfDemo{
	public static void main(String args[]){
		double d = Double.parseDouble(JOptionPane.showInputDialog("Enter number:"));
		if(d>70){
			System.out.println("Grade A");
		}
		else if(d>60){
			System.out.println("Grade B");
		}
		else if(d>50){
			System.out.println("Grade C");
		}
		else if(d>40){
			System.out.println("Grade D");
		}
		else{
			System.out.println("Fail");
		}
	}
}