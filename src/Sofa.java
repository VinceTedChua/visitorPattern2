class Sofa implements Furniture {
    private FurnitureType furnitureType;

    public Sofa(FurnitureType furnitureType) {
        this.furnitureType = furnitureType;
    }

    public FurnitureType getFurnitureType() {
        return furnitureType;
    }

    //sofa is connected through this
    public void accept(Shopper shopper) {
        shopper.shop(this);
    }
}