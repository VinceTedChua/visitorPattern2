class Table implements Furniture {
    private FurnitureType furnitureType;

    public Table(FurnitureType furnitureType) {
        this.furnitureType = furnitureType;
    }

    public FurnitureType getFurnitureType() {
        return furnitureType;
    }

    //table is connected through this
    public void accept(Shopper shopper) {
        shopper.shop(this);
    }
}
