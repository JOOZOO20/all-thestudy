package chap6;

public class EX6_2 {
    public static void main(String args[]){
        TV t1 = new TV();
        TV t2 = new TV();

        System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
        System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");

        t1.channel=7;
        System.out.println("t1의 채널을"+t1.channel+"로 변경하였습니다.");

        System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
        System.out.println("t2의 channel값은 "+t2.channel+" 입니다.");




    }
}
