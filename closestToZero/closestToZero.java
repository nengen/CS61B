import java.util.*;
import java.io.*;
import java.math.*;
public class closestToZero {

/*Takes an int array and returns the int closest to zero*/
/*If there is two ints, one neg and one pos with the same value, return the pos*/
/* If there are no ints in the array, return zero.*/
/*Combine with StringArrayToInt program for integers in a string*/
	public static int calculateClosest(int[] intArray ) {
		if(intArray.length != 0){

            int i = 0;
            int min = 5526;
            while(i < intArray.length){

                if(Math.abs(min) > Math.abs(intArray[i])){
                    min = intArray[i];
                }
                else if(intArray.length == 0){
                    min = 0;
                }
                else if(Math.abs(min) == Math.abs(intArray[i])){
                    if(intArray[i] > 0){
                        min = intArray[i];
                    }
                }


            i += 1;
            }


        return min;
    }
    else{
        return 0;
        }
	}

	public static void main(String[] args) {
		int[] array = {-1, 1, 2, 4, 8 ,-10};
		int answer = calculateClosest(array);
        System.out.println(answer);
	}
}
