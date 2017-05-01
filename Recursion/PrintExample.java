public class PrintExample {
	public static void recursivePrint(){
			System.out.println("Hello");
			recursivePrint();
	}

	public static void main(String[] args) {
		recursivePrint();
	}
}
