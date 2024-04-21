class FurnitureShippingCost implements Shopper {

    public void shop(Chair chair) {
        int lightweight = 25;
        int shippingCost = lightweight * 200 / 10; // let weight be  25 and shipping per kg is 200
        System.out.println("The price shipping of the chair: PHP" + shippingCost);
    }


    public void shop(Table table) {
        int minVal = 10000;
        int shippingCost = minVal * 15 / 100; // Assuming a base price of 10000 for tables and 10% is deducted for shipping
        System.out.println("The price shipping of the table: PHP" + shippingCost);
    }

    public void shop(Sofa sofa) {
        int minVal = 600;
        int shippingCost = 2500 * 2; // Assuming a base price of 600 for sofas
        System.out.println("The price shipping of the sofa: PHP" + shippingCost);
    }
}