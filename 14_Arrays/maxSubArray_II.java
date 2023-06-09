// To imporve time complexity we use prefix method in this program

//prefix sum

public class maxSubArray_II {

  public static void MaxSubArray(int numbers[]) {
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int[numbers.length];

    prefix[0] = numbers[0];

    //calculate prefix array
    for(int i=1; i<prefix.length; i++) {
      prefix[i] = prefix[i-1] + numbers[i];
;    }  

    for (int i=0; i<numbers.length; i++) {
      int start = i;
      for (int j=i; j<numbers.length; j++) {
        int end = j;
        currSum = 0;

        currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

        if(maxSum < currSum) {
          maxSum = currSum;
        }
      }
    }
    System.out.println("Maximum Sum by using prefix method : " + maxSum);
  }
  public static void main(String[] args) {
    int numbers[] = {1, -2, 6, -1, 3};
    MaxSubArray(numbers);
  }
}

// Brute force time complexity O(n3) > prefix Sum time complexity O(n2) (bcz only 2 loops in prefix method)