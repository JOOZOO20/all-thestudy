//***************************

// 파일명: LamdaTest .java
// 내용: 두개의 정수를 받아서 두개의 정수를 곱한 값을 "출력"하는 프로그램을 적절한 함수형 인터페이스와 람다식을 사용하여 작성하는 hw10_2 과제
//***************************

package hw10_2;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class LamdaTest {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        // BiConsumer라는 함수형 인터페이스와 람다식을 사용하여 연산을 처리함.
        BiConsumer<Integer, Integer> m = (a, b) -> System.out.println("\n두 정수의 곱은 " + (a * b) + " 입니다.");

        
        System.out.print("첫 번째 정수 입력 : ");
        x = sc.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        y = sc.nextInt();

        m.accept(x, y);
    }
}
