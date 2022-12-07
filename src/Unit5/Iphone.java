package Unit5;

import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (obj.getClass() != getClass())) {
            return false;
        }
        Iphone iphone = (Iphone) obj;
        if (iphone.model == null) {
            return (Objects.equals(model, iphone.model) || (model != null && model.equals(iphone.model)));
        }
        if (iphone.color == null) {
            return (Objects.equals(color, iphone.color) || (color != null && color.equals(iphone.color)));

        }
        if(this.model == null && this.color == null) {
            return (price == iphone.price || (price != 0 && price == iphone.price));
        }
    return true;
}

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}

