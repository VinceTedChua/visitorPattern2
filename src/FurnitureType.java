class FurnitureType implements Furniture {
    private String type;

    public FurnitureType(String type) {
        this.type = type; //calls furniture type which is represented from the furniture
    }

    public String getType() {
        return type;
    }

    //the furniture then accepts it and chooses.
    public void accept(Shopper shopper) {
        if (type.equals("Chairs")) {
            shopper.shop(new Chair(this));
        } else if (type.equals("Tables")) {
            shopper.shop(new Table(this));
        } else if (type.equals("Sofas")) {
            shopper.shop(new Sofa(this));
        }
    }
}
