public class CheckMergeArray 
{ 
    // merge arr1 and arr2 into a new result array 
    static int[] mergeArrays(int[] arr1, int[] arr2) 
    {  
      System.out.println("------------");
      int[] result = new int[arr1.length + arr2.length];
      // write your code here
      int index1 = 0;
      int index2 = 0;
      boolean end1 = false;
      for (int i = 0; i < result.length; i++) {
        
        if (arr1[index1] < arr2[index2] && !end1) {
          result[i] = arr1[index1];
          if (index1 < arr1.length-1) {
            index1++;
          } else if (index1 == arr1.length-1) {
            end1 = true;
          }
        } else {
          result[i] = arr2[index2];
          System.out.println(arr2.length);
          
            index2++;
            System.out.println("Entrou");
          
          // System.out.println("index2= " + index2);
        }
      }
      return result; // make a new resultant array and return your results in that
    } 

    public static void main(String[] args) throws Exception {
        int[] resultantArray = CheckMergeArray.mergeArrays(new int[]{1,12,14,17,23}, new int[]{11,19,27});

        System.out.print("Arrays after merging: ");
        for(int i = 0; i < 8; i++) {
            System.out.print(resultantArray[i] + " ");
        }
    }
}