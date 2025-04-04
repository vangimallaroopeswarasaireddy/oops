// Abstract interface for Shoe
interface Shoe {
    void wear();        // Method to wear the shoe
    String size();      // Method to get the shoe size
}

// Implementing the Shoe interface for RunningShoe
class RunningShoe implements Shoe {
    @Override
    public void wear() {
        System.out.println("Wearing running shoes. Great for jogging!");
    }

    @Override
    public String size() {
        return "Running shoe size: 10";
    }
}

// Implementing the Shoe interface for Boots
class Boot implements Shoe {
    @Override
    public void wear() {
        System.out.println("Wearing boots. Perfect for hiking.");
    }

    @Override
    public String size() {
        return "Boot size: 12";
    }
}

// Implementing the Shoe interface for Sneakers
class Sneaker implements Shoe {
    @Override
    public void wear() {
        System.out.println("Wearing sneakers. Comfortable for casual use.");
    }

    @Override
    public String size() {
        return "Sneaker size: 9";
    }
}

public class ShoeExample {
    public static void main(String[] args) {
        // Create instances of different shoes
        Shoe runningShoe = new RunningShoe();
        Shoe boot = new Boot();
        Shoe sneaker = new Sneaker();
        
        // Calling methods on each shoe type
        System.out.println(runningShoe.size());
        runningShoe.wear();
        
        System.out.println(boot.size());
        boot.wear();
        
        System.out.println(sneaker.size());
        sneaker.wear();
    }
}