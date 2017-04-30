public class maxValue {
	/*
	* Max function
	* Takes an array and returns an integer
	* While loop, loops through the array
	* Checks if the next number is larger than
	the largest so far
	* If it is the largest then we assign it to
	the largest variable, if not we don't do anything
	* Then we increment the counter i.
	* The method returns the largest number
	*/
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
	/*
	* Main method
	* creates a new array called numbers which contains
	7 random numbers
	* Then we print the result of using the max method
	on the numbers array
	*/
	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 8};
		System.out.println(max(numbers));
	}
}
