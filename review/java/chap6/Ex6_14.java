package chap6;

public class Ex6_14 {
    public static void main(String args[]){
        System.out.println("Ex6_14 bt = new EX6_14(); ");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new EX6_14(); ");
        Ex6_14 bt2 = new Ex6_14();
    }

    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public Ex6_14(){
        System.out.println("생성자");
    }
    
}
