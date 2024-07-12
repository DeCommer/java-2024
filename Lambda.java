//Lambda only works with functional interface (a method that returns something)
@FunctionalInterface
interface A {
    int add(int i, int j);
    // int sub(int i, int j);

}

public class Lambda {
    public static void main(String[] args) {

        // A obj = new A(){
        //     public int add(int i, int j) {  //this ...
        //         return i + j;
        //     }
        // };

        A addition = (int i, int j) -> i + j; // turns into this.

        int result = addition.add(5, 4);
        System.out.println(result);
    }
}
