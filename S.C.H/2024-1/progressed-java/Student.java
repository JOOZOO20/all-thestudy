//***************************
// 파일명: Student.java
// 작성자: 차희주
// 작성일: 24.03.15
// 내용: 학생을 표현하는 Student 클래스
//***************************

class Student {
    private String name;
    private int subject;

    // 생성자를 형성함
    public Student(String name, int subject) {
        this.name = name;
        this.subject = subject;
    }

    // 이름 getter
    public String getName() {
        return name;
    }

    // 이름 setter
    public void setName(String name) {
        this.name = name;
    }

    // 신청학점수 getter
    public int getSubject() {
        return subject;
    }

    // 신청학점수 setter
    public void setSubject(int subject) {
        this.subject = subject;
    }

    // 등록금 계산-등록금 액수를 리턴(신청학점수가 6 초과이면 300만원, 6 이하이면 1학점당 20만원)
    public int calculateFee() {
        if (subject > 6) {
            return 3000000; // 300만원
        } else {
            return subject * 200000; // 1학점당 20만원
        }
    }

    // print()- 모든 속성 (이름, 신청학점수)을 출력.
    public void print() {
        System.out.print("이름: " + name + ", 학점: " + subject);
        
    }
}