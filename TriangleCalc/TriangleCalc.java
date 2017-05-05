import java.lang.Math;


public class TriangleCalc {
	public double a;
	public double b;
	public double c;


	public static double findSide(double a, double b, double c){
		double missingSide = 0.0;

		if(c == 0.0) {
			c =  Math.sqrt((a * a)+(b * b));
			missingSide = c;
			return missingSide;
		} else if(a == 0.0) {
			a = Math.sqrt((c * c) - (b * b));
			missingSide = a;
			return missingSide;
		} else{
			b = Math.sqrt((c * c) - (a * a));
			a = missingSide;
			return missingSide;
		}
	}
	public static void main(String[] args) {
		double missingSide = findSide(3.0,4.0,0.0);
		System.out.println("The missing side is " + missingSide);
		
	}

}
