//***************************

// 파일명: LamdaTest .java

// 작성일: 24.04.03

// 내용: timer 클래스를 사용하여 1초에 한번씩 beep을 출력하는 기존 과제에 제시된 타이머 프로그램을 람다식을 이용하여 간결하게 표현하기.

//***************************

import java.awt.event.ActionEvent; 
import javax.swing.Timer; 

public class LamdaTest {
    public static void main(String[] args) {

    	// timer객체를 생성하여 1초마다 beep이 출력되도록 하는 작동을 람다식으로 표현함.
        Timer t = new Timer(1000, (ActionEvent event) -> {
            System.out.println("beep"); 
        });

        t.start(); 

        // 1초의 간격이 있도록 하는 반복문 (기존 과제에 올려진 코드와 동일함)
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000); //1초 후에 출력되도록 sleep을 사용함.
            } catch (InterruptedException e) {
                
            }
        }
    }
}
