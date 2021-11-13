package javaStudy;

import java.util.ArrayList;
import java.util.Arrays;


public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }

    public int[] solution(int[] numbers) {
        ArrayList<Integer> sum = new ArrayList<>();
        int n = numbers.length;
        int summer = 0;


        for ( int i = 0; i < n; i ++ ) {
            for ( int j = 0; j < n; j++ ) {
                summer = numbers[i] + numbers[j];
                if ( i != j && !sum.contains(summer)) {
                    sum.add(summer);
                }
            }
        }

        int[] answer = new int[sum.size()];
        for (int i = 0; i < sum.size(); i++ ) {
            answer[i] = sum.get(i);
        }

        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));

        return answer;
    }



}

//     /** + Enter this is something else! (문서화 주석)