package interior;

public abstract class Wall {
    private int price;

    public Wall(){
    }
    public Wall (int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
