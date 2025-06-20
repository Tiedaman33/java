public class Main {
    public static void main(String[] args) {
        // Sample data
        String name = "MyClass";
        String packageName = "com.example";
        String[] imports = {"java.util.List", "java.io.File"};
        String[] methods = {"getData()", "setData()"};

        // Create an instance of javaClass and pass the sample data
        javaClass myClass = new javaClass(name, packageName, imports, methods);

        // Print the values
        System.out.println("Class Name: " + myClass.getName());
        System.out.println("Package Name: " + myClass.getPackageName());

        System.out.println("Imports:");
        for (String imp : myClass.getImports()) {
            System.out.println("  " + imp);
        }

        System.out.println("Methods:");
        for (String method : myClass.getMethods()) {
            System.out.println("  " + method);
        }
    }
}
// This is a simple Java program that demonstrates the use of a class named javaClass
// which encapsulates the properties of a Java class such as its name, package, imports, and methods.
// The program creates an instance of javaClass and prints its properties to the console.