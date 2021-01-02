package Model;
import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> orderList;

    Order() {
        orderList = new ArrayList<FoodItem>();
        orderList.add(new KFC("Chicken Fry", 160));
        orderList.add(new KFC("Golden Stir Fried Babycorn", 180));
        orderList.add(new KFC("Cheeza", 250));
        orderList.add(new KFC("Regular Pizza", 250));
        orderList.add(new KFC("Continental Sizzler", 350));
        orderList.add(new Kabbabari("beef boti kabab", 320));
        orderList.add(new Kabbabari("chicken tikka", 250));
        orderList.add(new Kabbabari("Vegetable Jalfrezi", 220));
        orderList.add(new Kabbabari("chicken jaal fry", 220));
        orderList.add(new Kabbabari("Butter Naan", 60));
        orderList.add(new BhooterAdda("Chicken Set Menu", 145));
        orderList.add(new BhooterAdda("Beef Set Menu", 165));
        orderList.add(new BhooterAdda("Beef kicchudi", 160));
        orderList.add(new BhooterAdda("Indian Set Menu", 125));
        orderList.add(new BhooterAdda("Masala Vada", 130));
        orderList.add(new MomoWorld("Steam Momo", 140));
        orderList.add(new MomoWorld("Tandoori Momo", 100));
        orderList.add(new MomoWorld("Vegetable Momo", 150));
        orderList.add(new MomoWorld("Chicken Momo", 120));
        orderList.add(new MomoWorld("Beef Momo", 30));
        orderList.add(new DosaExpress("papri chaat", 100));
        orderList.add(new DosaExpress("raj kacchori", 90));
        orderList.add(new DosaExpress("fuchka", 150));
        orderList.add(new DosaExpress("pani puri", 150));
        orderList.add(new DosaExpress("mint lemonade", 125));
    }

    public ArrayList<FoodItem> getOrderList() {
        return orderList;
    }
}

class KFC extends FoodItem {
    
    KFC(String name, int price) {
        super(name, price);
    }
}

class Kabbabari extends FoodItem {
    
    Kabbabari(String name, int price) {
        super(name, price);
    }
}

class BhooterAdda extends FoodItem {
    
    BhooterAdda(String name, int price) {
        super(name, price);
    }
}

class MomoWorld extends FoodItem {
    
    MomoWorld(String name, int price) {
        super(name, price);
    }
}

class DosaExpress extends FoodItem {
    
    DosaExpress(String name, int price) {
        super(name, price);
    }
}
