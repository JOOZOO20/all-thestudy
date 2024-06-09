//***************************
// 파일명: Main .java
// 작성자: ###
// 작성일: 24.03.22
// 내용: 크기가 4인 Shape 배열을 생성하고, 다음과 같은 Circle 객체 2, Rect 객체 2개를 생성하여 배열에 저장하며, 
//  	반복문을 통해, redraw() 메소드 호출하고 getArea() 메소드를 호출하는 main메소드
//***************************

public class Main {
    public static void main(String[] args) {
        System.out.println("hw7_1: ###");
        
        //크기가 4인 Shape 배열을 생성하고, 다음과 같은 Circle 객체 2, Rect 객체 2개를 생성하여 배열에 저장함.
        Shape[] listShape = new Shape[4];
        listShape[0] = new Circle(10);
        listShape[1] = new Circle(20);
        listShape[2] = new Rect(10, 40);
        listShape[3] = new Rect(20, 40);

        // 반복문을 이용하여 배열 원소들의 redraw() 메소드 호출
        for (Shape s : listShape) {
            s.redraw();
        }

        //반복문을 이용하여 배열 원소들의 getArea() 메소드를 호출하여 조건에 맞도록 출력하도록 함.
        for (Shape s : listShape) {
            System.out.println("면적은 " + s.getArea());
        }
    }
}