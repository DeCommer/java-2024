
class Computer 
    { //parent (superclass)

    }
class Laptop extends Computer 
    { //child (subclass)
        String model;
        int price;

        public String description()
            {
                return model + " : $" + price;
            }

        @Override
        public int hashCode()
            {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((model == null) ? 0 : model.hashCode());
                result = prime * result + price;
                return result;
            }

        @Override
        public boolean equals(Object obj)
            {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                Laptop other = (Laptop) obj;
                if (model == null) 
                    {
                        if (other.model != null)
                            return false;
                    } 
                else if (!model.equals(other.model))
                    return false;
                if (price != other.price)
                    return false;
                return true;
            }

        @Override
        public String toString()
            {
                return "Laptop [model=" + model + ", price=" + price + "]";
            }

    }

class A 
    {

        public void show()
            {
                System.out.println("Inside A show method");
            }

    }
class B extends A
    {

        public void show()
            {
                System.out.println("Inside B show method");
            }
    }

class C extends A
    {

        public void show()
            {
                System.out.println("Inside C show method");
            }
    }

class Calc
    { // can be made final to prevent inheritance

        public void show()
            {
                System.out.println("Inside Calc show method");
            }

        public void add(int a, int b) 
            {
                System.out.println(a + b);
            }

    }

class AdvCalc extends Calc
    {

    }


public class Learn
    {
        public static void main(String[] args)
            {
                // only works with "extended" inheritance
                A obj = new A();
                obj.show();
                obj = new B();
                obj.show();
                obj = new C();
                obj.show();
                Calc calcObj = new Calc();
                calcObj.show();
                calcObj.add(4, 5);
                Laptop objLaptop = new Laptop();
                objLaptop.model = "Apple MacBook";
                objLaptop.price = 2100;
                Laptop objLaptop2 = new Laptop();
                objLaptop2.model = "Apple MacBook Air";
                objLaptop2.price = 2100;
                System.out.println(objLaptop.equals(objLaptop2));
                int num = 9;
                Integer num1 = num;  //boxing
                System.out.println("Wrapped in a wrapper class " + num1);
                String str = "99";
                int num2 = Integer.parseInt(str); //Turns string into int
                System.out.println("String to int: " + (num2 + 1));
            }
    }
