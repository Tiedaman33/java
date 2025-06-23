public class strings{
    public static void main(String[] args) {
        // Sample strings
        String greeting = "Hello, World!";
        String name = "Alice";
        
        // Concatenation
        String message = greeting + " My name is " + name + ".";
        
        // Print the message
        System.out.println(message);
        
        // String length
        int length = message.length();
        System.out.println("Length of the message: " + length);
        
        // Substring
        String subMessage = message.substring(0, 12);
        System.out.println("Substring: " + subMessage);
        
        // Convert to uppercase
        String upperCaseMessage = message.toUpperCase();
        System.out.println("Uppercase message: " + upperCaseMessage);

        //Fiding a Character in a String
        System.out.println(message.indexOf("World")); // Outputs 7

         //finsing a character in a string
         System.out.println(name.indexOf("c")); // Outputs 3

         //special characters
         String txt = "We are the so-called \"Vikings\" from the north."; // Using escape character \ to include double quotes
         System.out.println(txt); // Outputs: We are the so-called "Vikings"


    }
}