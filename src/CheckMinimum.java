class CheckMinimum {

    public static int findMinimum(int[] arr) {
  
      int value = Integer.MIN_VALUE;
      int i = 0;
      int j = arr.length-1;
      while (i != j) {
        if (arr[i] < arr[j]) {
          value = arr[i];
          j++;
        } else {
          value = arr[j];
          i++;
        }
      }
      return value;        
    }

  }