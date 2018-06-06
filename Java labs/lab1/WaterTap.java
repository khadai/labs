
public class WaterTap {

    private String name = "Its Name";
    private String brand = "Its Brand";
    private String bodyMaterial = "Its Material";
    private int price;
    private int quantityOfTaps;

    public static int totalQuantityOfTaps = 0;

    public WaterTap() {
    }

    public WaterTap(String brand, String name, String bodyMaterial, int price) {
        this.brand = brand;
        this.name = name;
        this.bodyMaterial = bodyMaterial;
        this.price = price;
    }

    public WaterTap(String brand, String name, String bodyMaterial, int price, int quantity) {
        this.brand = brand;
        this.name = name;
        this.bodyMaterial = bodyMaterial;
        this.price = price;
        setQuantityOfTaps(quantity);
    }

    /**
     * Method that set non-static variable "quantityOfTaps" with parameter;
     * and also updates static variable "totalQuantityOfTaps" to contain new "quantity"
     *
     * @param quantityOfTaps new amount of taps
     **/
    public void setQuantityOfTaps(int quantityOfTaps) {
        totalQuantityOfTaps -= this.quantityOfTaps;     //subtracts its old value
        this.quantityOfTaps = quantityOfTaps;           //set a new
        totalQuantityOfTaps += this.quantityOfTaps;     //adds the new
    }

    @Override
    public String toString() {
        String info = "This water tap of brand " + brand;
        info += " is called " + name;
        info += ", its body material is " + bodyMaterial;
        info += ", its price is $" + price;
        info += ", quantity of this tap is " + quantityOfTaps + " pieces";
        return info;
    }

    public void printSum() {
        String info = "There is " + this.quantityOfTaps;
        info += " of taps, which called " + name;
        info += ", there is " + totalQuantityOfTaps + " taps total";
        System.out.println(info);
    }

    public void resetValues(String brand, String name,
                            String bodyMaterial, int price, int quantity) {
        setBrand(brand);
        setName(name);
        setBodyMaterial(bodyMaterial);
        setPrice(price);
        setQuantityOfTaps(quantity);
    }

    static void printStaticSum() {
        System.out.println("There is " + totalQuantityOfTaps + " taps total");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityOfTaps() {
        return quantityOfTaps;
    }


}
