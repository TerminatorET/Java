public class StringOperation{
	public static void main(String[] args) {
		
		// substring
		// substring
		String str = "Hello World";
		String subright = str.substring(0,4);
		System.out.println(subright);
		// OUT OF RANGE!! RUN TIME ERROR!!
		//String sub = str.substring(0, 12);
		//System.out.println(sub);
		System.out.println();

		// remove initial and appending white space
		// trim()
		String original = "   Hermaphrodite";
		System.out.println(original);
		System.out.println(original.trim());
		System.out.println();

		// replacing
		// replace()
		String hi = "address";
		String newhi = hi.replace("a", "A");
		System.out.println("Original: " + hi + "\nRevised: " + newhi);
		System.out.println();

		// beginning and ending
		// startsWith & endsWith
		String num1 = "3155113";
		String num2 = "5650156";
		boolean b1 = num1.startsWith("31");
		boolean b2 = num1.endsWith("14");
		boolean b3 = num2.startsWith("65");
		boolean b4 = num2.endsWith("56");
		System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
		System.out.println();

		// equal?
		// equals() & equalsIgnoreCase()
		// why "==" fails
		String tom = "I am a gay";
		String bob = "I am a gay";
		//System.out.println((tom == bob));
		String tom1 = new String("I am a lesbian");
		String bob1 = new String("I am a lesbian");
		System.out.println((tom == bob) + " " + (tom1 == bob1) + " " + (tom == bob1));
		// back to methods
		String s1 = new String("AbC");
		String s2 = new String("aBc");
		String s3 = new String("AbC");
		boolean b11 = s1.equals(s2);
		boolean b22 = s2.equalsIgnoreCase(s3);
		System.out.println(b11 + " " + b22);
		System.out.println();

		// compare two strings in a lexicographic order
		// compareTo()
		String first = "anna";
		String second = "bob";
		String third = "anne";
		// return the "distance" between the two char
		System.out.println(first.compareTo(second) + " " + third.compareTo(first));
		System.out.println();

		// upper & lower case
		// toLowerCase() & toUpperCase()
		String myGod = "Kiss me BABY";
		System.out.println(myGod.toUpperCase() + " " + myGod.toLowerCase());
		System.out.println();

		// split string
		// split(String sign) & split(String sign, int limit)
		String subject = new String("university of michigan ann arbor is a great university");
		// using signle parameter variation of split()
		String[] re1 = subject.split(" ");
		for (String x : re1)
			System.out.println(x);
		System.out.println();
		//using double parameter variation of split()
		String[] re2 = subject.split(" ", 4);
		for (String x : re2)
			System.out.println(x);
		System.out.println();

	}
}
