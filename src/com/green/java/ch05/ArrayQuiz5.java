package com.green.java.ch05;
/*
    numArr 배열을 이용하여
    모든 방 중에 홀수 값만 전부 더해서 출력해 주세요.
    odd-sum =
 */


public class ArrayQuiz5 {
    public static void main(String[] args) {
        int[] numArr = {11, 14, 2, 7, 36, 35};

        int oddsum = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 1) {
                oddsum += numArr[i];
            }
        }
        System.out.println("odd-sum :" + oddsum);
    }
}
