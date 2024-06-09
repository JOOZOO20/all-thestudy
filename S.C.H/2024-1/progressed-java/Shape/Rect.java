//***************************
// 파일명: Rect .java
// 작성자: ###
// 작성일: 24.03.22
// 내용: 밑변와 높이를 매개변수로 받아 초기화하고, 인터페이스의 일부 메소드를 재정의하여 반지름을 출력하고, 넓이도 계산해주는 Rect클래스
//***************************

class Rect implements Shape {
    private double sWidth;
    private double sHeight;

    //밑변과 높이를 매개변수로 받아 초기화하는 생성자 
    public Rect(double width, double height) {
        this.sWidth = width;
        this.sHeight = height;
    }

    // 사각형을 그릴 수 있는 draw메소드를 오버라이딩 하여 사각형의 크기를 계산함.
    @Override
    public void draw() {
    	int w=(int)sWidth;
    	int h=(int)sHeight;
        System.out.println(w + "X" + h + "크기의 사각형입니다.");
    }

    //사각형 면적을 계산할 수 있는 getArea메소드를 오버라이딩 하여 사각형의 면적을 계산함.
    @Override
    public double getArea() {
        return sWidth * sHeight;
    }
}