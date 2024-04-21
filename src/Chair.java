class Chair implements Furniture {
    private FurnitureType furnitureType;

    public Chair(FurnitureType furnitureType) {
        this.furnitureType = furnitureType;
    }

    public FurnitureType getFurnitureType() {
        return furnitureType;
    }

    //chair is connected through this
    public void accept(Shopper shopper) {
        shopper.shop(this);
    }
}