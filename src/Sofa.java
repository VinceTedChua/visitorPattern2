class Sofa implements Furniture {
    private FurnitureType furnitureType;

    public Sofa(FurnitureType furnitureType) {
        this.furnitureType = furnitureType;
    }

    public FurnitureType getFurnitureType() {
        return furnitureType;
    }

    //sofa is connected through this
    public void accept(Shopee shopee) {
        shopee.shop(this);
    }
}