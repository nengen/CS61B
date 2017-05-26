import java.util.*;
import java.io.*;
import java.math.*;

public class StringArrayToInt {
/*Basic algorithm for splitting a String of numbers into an string array*/
/*Then parsing them to a int array*/

public static void main(String[] args) {
	String startString = "-12 -5 -6 -16 -1";
	String[] stringArray = startString.split(" ");
	int[] intArray = new int[stringArray.length];

	for(int i = 0; i < stringArray.length; i += 1){
		intArray[i] = Integer.parseInt(stringArray[i]);
	}

	//intArray now holds the values of startString as integers

           System.out.println(intArray[0]);
}

}
