class ExceptionDemo{
	public static void main(String args[]){
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			System.out.println(a/(b-c));	
			}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			}
		catch(Exception e){
			System.out.println(e.getMessage());
			}
		finally{
			System.out.println("Finally Block");
			}
		}
	}