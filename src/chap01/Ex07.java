package chap01;

import java.net.Socket;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if(i != 1)
                System.out.print(" + ");
            System.out.print(i);
            sum += i;
        }
        System.out.println(" = " + sum);
    }
}
