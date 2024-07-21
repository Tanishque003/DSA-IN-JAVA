import java.util.*;

public class PrefixSum {
    public static void maxsub( int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        prefix[0] = numbers[0];
        // calculate prefix array

        for( int i=0; i<prefix.length; i++ ){
            prefix[i] = prefix[i-1] + numbers[i];

        }

        for( int i = 0; i <numbers.length; i++){
            int start = 0;
            for( int j = i; j <numbers.length; j++){
                int end = j;
                currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
                // for( int k = i; k <=end; k++){
                //     currSum += numbers[k];
                // }
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
            }
            
        }
        System.out.println("max sum" + maxSum);
    }

    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10};
      maxsub(numbers);
    }
    
}
