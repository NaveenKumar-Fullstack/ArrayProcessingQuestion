public class EveryFifthOddElem {
    public static void main(String[] args) {
        ProcessingArray processingArray = new ProcessingArray();
        int[] arr = processingArray.givenArray;
       int totalCount = 0;
        int count = 0;
        System.out.print("Printing every 5th odd element: ");
        for(int i = 1; i < arr.length ; i++){

            if(arr[i] % 2 != 0){
                count ++;
                if(count == 5){
                    count = 0;
                    System.out.print(arr[i]+",\t");

                }


            }else {
                totalCount++;
            }
        }
        System.out.println("Total count :"+ totalCount);
    }
}
