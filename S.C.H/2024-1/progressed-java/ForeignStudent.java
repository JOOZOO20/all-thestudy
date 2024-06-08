//***************************
// 파일명: ForeignStudent .java
// 작성자: 차희주
// 작성일: 24.03.15
// 내용: 외국인학생을 표현하는 ForeignStudent 클래스
//***************************

class ForeignStudent extends Student {
    private String country;

    // 생성자를 형성함.
    public ForeignStudent(String name, int subject, String country) {
        super(name, subject);
        this.country = country;
    }

    // 국적 getter
    public String getCountry() {
        return country;
    }

    // 국적 setter
    public void setCountry(String country) {
        this.country = country;
    }

    // print()를 재정의 - 모든 속성(이름,신청학점수, 국적)을 출력
    @Override
    public void print() {
        super.print();
        System.out.println(" 국적: " + country);
    }
}