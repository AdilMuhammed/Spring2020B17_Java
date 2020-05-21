package Resources;

public class StoreProduct {

    String label;
    int price;
    String category="misc";
    boolean hasExpiration=false;
    int stock=0;

    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, int price, int stock) { //2
        this.label = label;
        this.price = price;
        this.stock = stock;
    }

    public StoreProduct(String label, int price) { //3
        this.label = label;
        this.price = price;
    }

    public StoreProduct(String label, int price, String category, boolean hasExpiration) {//4
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
    }

    public void expired(boolean hasExpired){
        stock = 0;
        setStock(0);
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public boolean sale(int quantity){
        int temp = stock - quantity;
        if (temp>0){
            setStock(temp);
            return true;
        }else {
            return false;
        }
    }

    public double getDiscountedPrice(double discount){
        return price * (1 - discount);
    }


}

