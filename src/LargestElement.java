public class LargestElement {
    public static void main(String[] args) {
        ProcessingArray processingArray = new ProcessingArray();
        int [] arr = processingArray.givenArray;

        int maxvalue = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(maxvalue < arr[i]){
                maxvalue = arr[i];
            }
        }
        System.out.println("Largest Element of the givenArray is :"+maxvalue);
    }
}
