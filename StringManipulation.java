public class StringManipulation
{
	public static void main(String[] args) {

		// creating Strings
		
		char a[] = {'w', 'a', 't', 'e', 'r', 'm', 'e', 'l', 'o', 'n'};
		String s = new String(a);
		String ss = new String(s);

		System.out.println(s);
		System.out.println(ss);
		System.out.println();
		

		// concatenation of Strings
		
		String s1 = new String("hello");
		String s2 = new String("word");
		String s3 = s1 + " " + s2;
		System.out.println(s3);
		System.out.println();
		

		// String infor

		// length
		String dick = "dick";
		System.out.println("The length of the String \"dick\" is: " + dick.length());
		System.out.println();

		// search
		// 		indexOf(String s)
		//		str.indexOf(substr)
		String str = "We are students";
		int size = str.indexOf("a");
		System.out.println(size);
		System.out.println();
		//		lastIndexOf(String s)
		//		str.lastIndexOf(substr)
		String fk = "abcdefg";
		System.out.println(fk.lastIndexOf(" "));
		System.out.println((fk.length() == fk.lastIndexOf("")));
		System.out.println();

		// index (charAt)
		String hi = "university of michigan";
		char mychar = hi.charAt(11);
		System.out.println(mychar);

	}
}
