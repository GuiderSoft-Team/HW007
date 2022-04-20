public class Hali {
    private double price;

    Hali(double price)
    {
        setPrice(price);
    }

    public void setPrice(double price) {
        if (price<0)
        {
            this.price=0;
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Birim fiyati: "+getPrice();
    }
}
