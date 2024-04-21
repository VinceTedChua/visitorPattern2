class FurnitureType implements Furniture {
    private String furniture;

    public FurnitureType(String furniture) {
        this.furniture = furniture; //calls furniture type which is represented from the furniture
    }

    public String getType() {
        return furniture;
    }

    //the furniture then accepts it and chooses.
    public void accept(Shopee shopee) {
        if (furniture.equals("Chairs")) {
            shopee.shop(new Chair(this));
        } else if (furniture.equals("Tables")) {
            shopee.shop(new Table(this));
        } else if (furniture.equals("Sofas")) {
            shopee.shop(new Sofa(this));
        }
    }
}
