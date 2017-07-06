public class ReverseAString {
	public String string;

	public static String Reverse(String string) {
		String s = string;
		String[] splitString = s.split("");
		String[] reversedArray = new String[splitString.length];
		int i = 0;
		while(i<splitString.length){
			reversedArray[i] = splitString[(splitString.length-1)-i];
			i += 1;
		}

		String reversedString = String.join("",reversedArray);
		return reversedString;
	}
	public static void main(String[] args) {
		String example = "I like big cats";
		String exampleResult = Reverse(example);
		System.out.println("The original string is " + example);
		System.out.println("The reversed string is " + exampleResult);
	}
}
