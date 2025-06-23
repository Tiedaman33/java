public class concatenation {
    public static void main(String[] args) {
        // Sample strings
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation using + operator
        String result1 = str1 + " " + str2;
        System.out.println("Concatenation using + operator: " + result1);

        // Concatenation using concat() method
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Concatenation using concat() method: " + result2);

        // Concatenation using StringBuilder

        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        String result3 = sb.toString();
        System.out.println("Concatenation using StringBuilder: " + result3);
    }
}