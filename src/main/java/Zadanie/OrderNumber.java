package Zadanie;

class OrderNumber{
    Integer number;
    Integer index;

    public OrderNumber(Integer number, Integer index){
        this.number = number;
        this.index = index;
    }
    @Override
    public boolean equals(Object o){
        OrderNumber e = (OrderNumber) o;
        return this.number.equals(e.number) && this.index.equals(e.index);
    }
    @Override
    public int hashCode(){
        int hc = 7;
        hc = 31 * hc + number.hashCode();
        hc = 31 * hc + index.hashCode();
        return hc;
    }
    public int getOrderNumber(){
        return this.number;
    }
    public String toString(){
        return number + "\\" + index;
    }
}
