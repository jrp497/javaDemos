class SwitchDemo{
	public static void main(String args[]){
		int month_number=Integer.parseInt(args[1]);
		switch(month_number){
		case 1:
		System.out.println("January");
		break;
		case 2:
		System.out.println("February");
		break;
		case 3:
		System.out.println("March");
		break;
		default:
		System.out.println("Invalid");
		}
	}
}