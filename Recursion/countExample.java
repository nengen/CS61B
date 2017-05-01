public class countExample {
	static int count = 0;
	public static void countMethod() {
		count += 1;
		if(count <= 5) {
				System.out.println("hello " + count);
				countMethod();
		}
	}
	public static void main(String[] args) {
		countMethod();
	}

}
