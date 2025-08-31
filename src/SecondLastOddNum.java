public class SecondLastOddNum {
    public static void main(String[] args) {
        ProcessingArray processingArray = new ProcessingArray();
        int[] arr = processingArray.givenArray;
        int count = 0;
        System.out.print("Index of second last odd element = ");
        for(int i = arr.length - 1 ; i >= 0 ; i--){

            if(arr[i] % 2 != 0 ){
                count++;
                if(count == 2){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
