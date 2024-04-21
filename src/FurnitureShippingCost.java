class FurnitureShippingCost implements Shopee {

    public void shop(Chair chair) {
        int lightweight = 25;
        int flatShippingRate = lightweight * 200 / 10; // let weight be  25 and shipping per kg is 200
        System.out.println("The price shipping of the chair: PHP" + flatShippingRate);
    }


    public void shop(Table table) {
        int minVal = 10000;
        int flatShippingRate = minVal * 15 / 100; // Assuming a base price of 10000 for tables and 10% is deducted for shipping
        System.out.println("The price shipping of the table: PHP" + flatShippingRate);
    }

    public void shop(Sofa sofa) {
        int minVal = 600;
        int flatShippingRate = 2500 * 2; // Assuming a base price of 600 for sofas
        System.out.println("The price shipping of the sofa: PHP" + flatShippingRate);
    }
}