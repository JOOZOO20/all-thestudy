//***************************
// 파일명: Main .java
// 작성자: ##
// 작성일: 24.03.15
// 내용: 객체 생성 및 출력을 담당하는 메인메소드
//***************************

public class Main {
	public static void main(String[] args) {

		System.out.println("hw1_1 : ##");

		// 각 학생에 대한 정보를 담은 객체를 생성함.
		Student kim = new Student("Kim", 20);
		ForeignStudent jobs = new ForeignStudent("Jobs", 5, "USA");
		VisitingStudent lee = new VisitingStudent("Lee", 8, "강원대");

		// 각 학생의 속성이 담긴 정보를 출력하도록 함.
		kim.print();
		System.out.println();
		jobs.print();
		lee.print();

		
		// 세 학생의 등록금 합을 더해 출력하도록 함.
		int totalFee = kim.calculateFee() + jobs.calculateFee() + lee.calculateFee();
		System.out.println("등록금 합 = " + totalFee + "원");
	}
}