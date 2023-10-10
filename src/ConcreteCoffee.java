class Espresso extends Coffee {
    public Espresso() {
        description = "Espresso";
    }

    public int cost() {
        return 700;
    }
}

class Latte extends Coffee {
    public Latte() {
        description = "Latte";
    }

    public int cost() {
        return 800;
    }
}
