public class javaClass {
    // This class represents a Java class with its name, package, imports, and methods that are set private
    //  to be only accessible within this class eg. photo albums
    private String name;
    private String packageName;
    private String[] imports;
    private String[] methods;
    
    //this is a constructor that initializes the Java class with its name, package, imports, and methods
    // it is used to create an instance of the Java class
    public javaClass(String name, String packageName, String[] imports, String[] methods) {
        this.name = name;
        this.packageName = packageName;
        this.imports = imports;
        this.methods = methods;
    }
    // Getters for the class properties
    // These methods allow access to the private properties of the class
    public String getName() {
        return name;
    }

    public String getPackageName() {
        return packageName;
    }

    public String[] getImports() {
        return imports;
    }

    public String[] getMethods() {
        return methods;
    }
}   