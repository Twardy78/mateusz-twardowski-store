package Zadanie;
import java.util.*;


class OrderName {
    String name;

    public OrderName (String name){
        this.name = name;
    }
    public String getOrderName(){
        return this.name;
    }
    public String toString(){
        return name;}
}

public class Store {
    public static void main (String[] args) {

        System.out.println("Użycie listy \"ArrayList\" nie zabezpiecza przed duplikowaniem zamówień więc \n do tego zadania użyłem mapy \"HashMap()\"\n");

        OrderNumber order1 = new OrderNumber(3453,2);
        OrderNumber order2 = new OrderNumber(3453,2);
        OrderNumber order3 = new OrderNumber(3453,4);
        OrderNumber order4 = new OrderNumber(3487,5);
        OrderNumber order5 = new OrderNumber(7887,6);


        OrderName name1 = new OrderName("Red Book");
        OrderName name2 = new OrderName("Red Book");
        OrderName name3 = new OrderName("Yellow Book");
        OrderName name4 = new OrderName("Black Book");
        OrderName name5 = new OrderName("Green Book");

        HashMap<OrderNumber, OrderName> store = new HashMap<OrderNumber, OrderName>();

        store.put(order1,name1);
        store.put(order2,name2);
        store.put(order3,name3);
        store.put(order4,name4);
        store.put(order5,name5);

        //printing all map
        System.out.println("Map content : \n" + store + "\n");
        //Order duplicate veification
        System.out.println("Order duplicate veification - compared order1 vs order 2 : " + order1.equals(order2));
        //print hashCode()
        System.out.println("\nhashCode checks : ");
        System.out.println(order1.hashCode());
        System.out.println(order2.hashCode());
        System.out.println(order3.hashCode());
        System.out.println(order4.hashCode());
        System.out.println(order5.hashCode());

    }
}