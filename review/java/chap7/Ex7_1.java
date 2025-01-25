package chap7;

public class Ex7_1 {
    public static void main(String args[]){
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello world!");
        ctv.caption=true;
        ctv.displayCaption("Hello, world!");

    }
}

class Tv{
    boolean power;
    int channel;

    // power != power 은 왜 안되는 거임? 무슨 에러가 발생하길래?
    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class CaptionTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if (caption){
            System.out.println(text);
        }
    }
}
