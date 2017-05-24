public class CircleCalc {

	public static double pi = 3.14;
	public int r;
	public int d = r + r;

	public static double areaCalc(int r) {
		double area = (double) r * (double) r * (double) pi;
		return area;
	}
	public static double circumferenceCalc(int r) {
		double circumference = ( (double) r + (double) r) * (double) pi;
		return circumference;
	}

	public static void main(String[] args) {
		int radius = 5;
		double areaOfCircle = areaCalc(radius);
		double circumferenceOfCircle = circumferenceCalc(radius);

		System.out.println("A circle with a radius of " + radius + " has a area of " + areaOfCircle + " and a circumference of " + circumferenceOfCircle);
	}


}
