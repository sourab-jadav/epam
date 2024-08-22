import java.util.*;
import java.util.Arrays;



public class Temp {
    public static void main(String[] args) {
        // int[] arr,b; // this line and above line are not same
        int[] arr={2,4,4,2,4,6,9};
        System.out.println(Arrays.toString(arr));
        // using the copy of method here
        int[] newArray=Arrays.copyOf(arr, 18);
        System.out.println(Arrays.toString(newArray));
    }
}
