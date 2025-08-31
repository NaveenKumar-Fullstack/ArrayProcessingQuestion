import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        ProcessingArray processingArray  = new ProcessingArray();
        int[] arr = processingArray.givenArray;

        int minValue=arr[0];
        for (int i=0 ; i < arr.length; i++) {
           if(minValue > arr[i]){
               minValue = arr[i];
           }

        }
        System.out.println("Smallest Element of the givenArray is: "+minValue);

    }
}
