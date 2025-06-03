//Does not adhere to Open/Closed principle
//The getDiscount Method is not closed for modification
public class Discount {
    public double getDiscount(String customerType) {
        if (customerType.equals("regular")) return 0.1;
        else if (customerType.equals("vip")) return 0.2;
        else return 0;
    }
}

//Adhere to Open/closed principle
// The program is open to extension by creation of new classes 
// closed to modification : no need to modify existing classes
public interface Discount {
    double getDiscount();
}

public class RegularDiscount implements Discount {
    public double getDiscount() {
        return 0.1;
    }
}

public class VIPDiscount implements Discount {
    public double getDiscount() {
        return 0.2;
    }
}
