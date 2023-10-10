// This is a decorator class that inherits from the base class.
public abstract class CondimentDecorator extends Coffee {
    public abstract String getDescription();
}

//Milk condiment
class Milk extends CondimentDecorator {
    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public int cost() {
        return coffee.cost() + 50;
    }
}

//Marshmallow condiment
class Marshmallow extends CondimentDecorator {
    Coffee coffee;

    public Marshmallow(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Marshmallow";
    }

    public int cost() {
        return coffee.cost() + 200;
    }
}

//Syrup condiment
class Syrup extends CondimentDecorator {
    Coffee coffee;

    public Syrup(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Syrup";
    }

    public int cost() {
        return coffee.cost() + 100;
    }
}