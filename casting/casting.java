public class casting {
    public static void main(String[] args) {
        int price = 100;  
        long largePrice = 500000l; 
        System.out.println("Big price is: " + largePrice);
        double discount = price; //widening conversion from int to double
        System.out.println("Original price: " + price); 
        discount = discount * 0.9; // Apply 10% discount
        System.out.println("Price after discount: " + discount);
        // Narrowing conversion
        double finalPrice = (double) largePrice; // long to double
        System.out.println("Final price after conversion: " + finalPrice);

}
}