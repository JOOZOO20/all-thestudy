package chap6;

import java.sql.SQLOutput;

public class Ex6_10 {
    public static void main(String args[]){
        MyMath3 m3 = new MyMath3();

        System.out.println("m3.add(3,3) 결과: "+m3.add(3,3));
        System.out.println("m3.add(3L,3) 결과: "+m3.add(3L,3));
        System.out.println("m3.add(3,3L) 결과: "+m3.add(3,3L));
        System.out.println("m3.add(3L,3L) 결과: "+m3.add(3L,3L));

        int[] a = {100,200,300};
        System.out.println("m3.add(a)의 결과 : "+m3.add(a));
    }
}
