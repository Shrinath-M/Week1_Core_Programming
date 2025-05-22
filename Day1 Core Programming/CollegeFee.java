public class CollegeFee {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int discount = (125000*10)/100;
        int discountedFee = fee - discount;
        System.out.println("The discount amount is INR " +discount+" and final discounted fee is INR "+discountedFee);

    }
}
