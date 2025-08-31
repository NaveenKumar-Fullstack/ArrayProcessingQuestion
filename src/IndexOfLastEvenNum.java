public class IndexOfLastEvenNum {
    public static void main(String[] args) {
        ProcessingArray processingArray = new ProcessingArray();
        int[] arr = processingArray.givenArray;

        System.out.print("Index of last even element = ");
        for(int i = arr.length-1 ; i >= 0; i--){
            if(arr[i] % 2 == 0){
                System.out.println(i);
                break;
            }

        }
    }
}
