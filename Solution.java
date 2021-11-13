import java.util.*;

public class Solution {

    public static void main (String[] args) {
        Solution A = new Solution();
        long n = 329873;
        String answer = A.solution(n);
        System.out.println(answer);

    }

    public String solution(long n) {
        String[] str_arr = (n+"").split("");
        int sum = 0;
        int len = str_arr.length;
        int[] int_arr = new int[len];
        String[] exp_arr = new String[len];

        for(int i = 0; i <len; i++) {
            int_arr[i] = Integer.parseInt(str_arr[len-1-i]);
            sum += int_arr[i];
        }

        for (int j = 0; j<len-1; j++) {
            exp_arr[j] = String.valueOf(int_arr[j]) + "+";
        }

        System.out.println(Arrays.toString(int_arr));
        System.out.println(sum);
        System.out.println(Arrays.toString(exp_arr));

        exp_arr[len-1] = int_arr[len-1] + "=" + sum;

        System.out.println(Arrays.toString(exp_arr));

        String done = String.join("", exp_arr);

        System.out.println(done);







//        for (int j = 0; j<=len-2; j++) {
//            exp_arr[j] = B[j].concat("[+]");
//        }
//
//        System.out.println(exp_arr);


        return done;
    }
}