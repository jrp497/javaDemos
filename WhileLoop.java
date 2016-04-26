//reversing a given : 123 ==>321
class WhileLoop{
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		while(num>0){
			int rev = num%10;
			System.out.print(rev);
			num=num/10;
			}
		}
	}