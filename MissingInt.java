import java.util.Arrays;
import java.util.Collections;

public class MissingInt {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] arr = {1, 3, 6, 4, 1, 2};
        int smallestInt = 1;

        if(arr.length == 0) System.out.println(smallestInt);

        Arrays.sort(arr);

        if(arr[0] > 1) System.out.println(smallestInt);
        if(arr[ arr.length - 1] <= 0 ) System.out.println(smallestInt);

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == smallestInt){
                smallestInt++;
            }
        }
        System.out.println(smallestInt);
    }
}
