//Lambda only works with functional interface (a method that returns something)
@FunctionalInterface
interface A{
        int add(int i, int j);
}

interface S{
        int sub(int i, int j);
}

public class Lambda{
    public static void main(String[] args){

            A addition = (int i, int j) -> i + j; // turns into this.
            S subtraction = (int i, int j) -> i - j;

            int result = addition.add(5, 4);
            int subRes = subtraction.sub(5, 4);
            System.out.println(result);
            System.out.println(subRes);
    }
}
