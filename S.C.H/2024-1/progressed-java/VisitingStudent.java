//***************************
// 파일명: VisitingStudent .java
// 작성자: 차희주
// 작성일: 24.03.15
// 내용: 교환학생을 표현하는 VisitingStudent 클래스
//***************************

class VisitingStudent extends Student {
    private String school;

    // 생성자를 형성함.
    public VisitingStudent(String name, int subject, String school) {
        super(name, subject);
        this.school = school;
    }

    // 소속학교명 getter
    public String getSchool() {
        return school;
    }

    // 소속학교명 setter
    public void setSchool(String school) {
        this.school = school;
    }

    // 등록금 계산을 재정의함 - 신청학점 1학점 당 10만원
    @Override
    public int calculateFee() {
        return getSubject() * 100000; // 신청학점 1학점당 10만원
    }

    // print()를 재정의 - 모든 속성(이름, 신청학점수, 소속학교명)을 출력
    @Override
    public void print() {
        super.print();
        System.out.println(" 소속학교: " + school);
    }
}