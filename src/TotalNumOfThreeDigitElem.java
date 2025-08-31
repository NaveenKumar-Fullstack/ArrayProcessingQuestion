public class TotalNumOfThreeDigitElem {
    public static void main(String[] args) {
        ProcessingArray processingArray = new ProcessingArray();
        int[] arr = processingArray.givenArray;
        int count = 0 ;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > 99 && arr[i] <= 999){
                count ++;
            }
        }
        System.out.println("Total number of 3 digits elements = "+count);
    }
}
