//***************************
// 파일명: Circle .java
// 작성자: ###
// 작성일: 24.03.22
// 내용: 반지름을 매개변수로 받아 값을 초기화하고, 인터페이스의 일부 메소드를 재정의하여 반지름을 출력하고, 넓이도 계산해주는 circle클래스
//***************************

class Circle implements Shape {
    private double cRadius;

    //반지름을 매개변수로 받아 초기화하는 생성자 
    public Circle(double radius) {
        this.cRadius = radius;
    }

    // 원을 그릴 수 있는 draw메소드를 오버라이딩 하여 원의 반지름을 계산함.
    @Override
    public void draw() {
    	int r=(int)cRadius;
        System.out.println("반지름이 " + r + "인 원입니다.");
    }

    // 원의 면적을 계산할 수 있는 getArea메소드를 오버라이딩 하여 원의 면적을 계산함.
    @Override
    public double getArea() {
        return PI * cRadius * cRadius;
    }
}