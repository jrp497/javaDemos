class StringDemo{
	public static void main(String args[]){
		String s1 = new String();
		String s2 = new String("Akash Infotech");
		char c[]={'A','k','a','s','h',' ','I','n'};
		String s3 = new String(c);
		StringBuffer s4 = new StringBuffer("abc def");
		String s5= "Akash InfoTech";
		String s6="Akash InfoTech";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s5==s6);
		System.out.println(s2.equalsIgnoreCase(s5));
		System.out.println(s2.compareTo(s5));
		System.out.println(s2.charAt(6));
		System.out.println(s2.endsWith("s"));
		System.out.println(s2.indexOf("h"));
		System.out.println(s2.lastIndexOf("h"));
		System.out.println(s2.lastIndexOf("h",9));
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(2,5));
		System.out.println(s2.concat(" hello"));
		System.out.println(s4);
		}
	}