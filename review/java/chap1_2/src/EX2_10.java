import java.util.Scanner;


public class EX2_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("두 자리 정수를 입력해주세요>");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);


        System.out.println("입력 내용 : "+input);
        System.out.printf("입력 내용 : %s%n",input);
        System.out.printf("num=%d%n", num);



    }
}
