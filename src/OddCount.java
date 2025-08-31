public class OddCount {
    public static void main(String[] args) {
        ProcessingArray processingArray = new ProcessingArray();
        int[] arr = processingArray.givenArray;
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        System.out.println("Total number of odd elements in givenArray = "+count);
    }
}
