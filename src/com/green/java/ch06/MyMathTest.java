package com.green.java.ch06;

public class MyMathTest {
    public static void main(String[] args) {
        int n1 = 10, n2 = 22;
        MyMathInstance mmi = new MyMathInstance();
        int r1 = mmi.sum(n1, n2); // void 면 ri = mmi.sum(n1,n2);이렇게 쓴다.
        System.out.println(r1);
        //MyMathInstance 클래스에 있는 sum메소드
        //이용하여 n1, n2값을 더한 결과를 콘솔에 출력

        int r2 = MyMathStatic.sum(n1, n2); // 리턴 메스드이다.
        System.out.println(r2); // 소괄호() 가있으면 메소드를 호출한것이다.
        //MyMathStatic 클래스에 있는 sum메소드
        //이용하여 n1, n2값을 더한 결과를 콘솔에 출력
    }
}
