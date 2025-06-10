//Does not adhere to Open/Closed principle
//The getShippingCost Method is not closed for modification
public class ShippingCalculator {
    public double getShippingCost(String shippingType) {
        if (shippingType.equals("standard")) return 5.99;
        else if (shippingType.equals("express")) return 12.99;
        else return 0.0; // free shipping
    }
}
    }
}

//Adhere to Open/closed principle
// The program is open to extension by creation of new classes 
// closed to modification : no need to modify existing classes
public interface ShippingCalculator {
    double getShippingCost();
}

public class Standard implements ShippingCalculator {
    public double getShippingCost() {
        return 5.99;
    }
}

public class Express implements ShippingCalculator {
    public double getShippingCost() {
        return 12.99;
    }
}
