public class FirstFiftyEven {
    public static void main(String[] args) {
        ProcessingArray processingArray = new ProcessingArray();
        int[] arr = processingArray.givenArray;
        int count = 0 ;
        System.out.print("Indexes of first 50 even elements: ");
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] % 2 == 0 && count < 50){
                System.out.print(i + ",\t");
                count ++;
            }

        }
    }
}
