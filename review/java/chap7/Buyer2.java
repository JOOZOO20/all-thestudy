package chap7;

public class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    int i =0;

    void buy(Product2 p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] =p;
        System.out.println(p+"을/를 구입하셨습니다.");
    }

    void summary(){
        int sum =0;
        String itemList = "";

        for(int i=0;i<cart.length;i++){
            if(cart[i]==null) break;
            sum+=cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
        System.out.println("구입하신 제품은 "+itemList+"입니다.");
    }
}
