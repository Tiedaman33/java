public class Main {
    public static void main(String[] args) {
        // Sample boolean values
        boolean isJavaFun   = true;
        boolean isFishTasty = true;

        // Print the boolean values
        System.out.println("Boolean value isJavaFun: "   + isJavaFun);
        System.out.println("Boolean value isJavaNotFun: "   + !isJavaFun);
        System.out.println("Boolean value isFishTasty: " + isFishTasty);
        System.out.println("Boolean value isFishNotTasty: " + !isFishTasty);

        // Example of boolean operations
        boolean andOperation = isJavaFun && isFishTasty; // AND operation
        boolean orOperation  = isJavaFun || isFishTasty; // OR operation

        System.out.println("AND Operation (isJavaFun && isFishTasty): " + andOperation);
        System.out.println("OR Operation  (isJavaFun || isFishTasty): " + orOperation);
    }
}
