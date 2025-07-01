public class Params {
    static void myMethod(String fname, int age) {
        System.out.println("Name: " + fname + ", Age: " + age);

    }
    public static void main(String[] args) {
       myMethod("John", 25);
       myMethod("Alice", 30);
}
}