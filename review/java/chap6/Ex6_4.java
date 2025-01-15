package chap6;

public class Ex6_4 {
    public static void main(String args[]){
        MyMath m = new MyMath();
        long result1 = m.add(5L,3L);
        long result2 = m.substract(5L,3L);
        long result3 = m.multiply(5L,3L);
        double result4 = m.divide(5L,3L);

        System.out.println("add(5L,3L) = "+result1);
        System.out.println("subtract(5L,3L) = "+result2);
        System.out.println("multiply(5L,3L) = "+result3);
        System.out.println("divide(5L,3L) = "+result4);

    }
}
