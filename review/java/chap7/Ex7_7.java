package chap7;

public class Ex7_7 {
    public static void main(String args[]){
        Car c = null;
        FireEngine f1 = new FireEngine();
        FireEngine f2 = new FireEngine();

        f1.water();
        c = f1;
        f2 = (FireEngine) c;
        f2.water();
    }
}
