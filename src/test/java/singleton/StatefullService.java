package singleton;

public class StatefullService {

//    private int price; // 상태를 유지하는 필드 10000 -> 20000

    public int order(String name, int price){
        System.out.println("name = " + name + ", price = " + price);
//        this.price = price; // 여기가 문제!
        return price;
    }
}