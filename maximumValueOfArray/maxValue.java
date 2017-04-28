public class maxValue {
	public static int max(int[] m){
		int i = 0;
		int largest = m[0];
		while(i < m.length){
			if(m[i] > largest) {
				largest = m[i];
			}
			i += 1;
		}
		return largest;
	}
	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 8};
		System.out.println(max(numbers));
	}
}
