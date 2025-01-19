package chap6;

import java.sql.SQLOutput;

public class Ex6_9 {
    public static void main(String args[]){
        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.subtract(200L,100L));
        System.out.println(MyMath2.multiply(200L,100L));
        System.out.println(MyMath2.divide(200L,100L));

        MyMath2 m2 = new MyMath2();
        m2.a=200L;
        m2.b=100L;

        System.out.println(m2.add());
        System.out.println(m2.subtract());
        System.out.println(m2.multiply());
        System.out.println(m2.divide());
    }
}
