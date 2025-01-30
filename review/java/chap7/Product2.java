package chap7;

public class Product2 {
    int Price;
    int bonusPoint;

    Product2(int price){
        this.Price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product2(){};
}
