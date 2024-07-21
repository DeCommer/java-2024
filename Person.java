//used in BMI.java

public class Person 
    {
        private String fName;
        private String lName;
        private int age;
        private int weight;
        private double height;

        // public Person(String fName, String lName, int age, int weight, double height) 
        //     { //Constructor
        //         this.fName = fName;
        //         this.lName = lName;
        //         this.age = age;
        //         this.weight = weight;
        //         this.height = height;
        //     }

        public Person() 
        { //Constructor

        }

        public Person(Person source)
            { //Copy Constructor
                this.fName = source.fName;
                this.lName = source.lName;
                this.age = source.age;
                this.weight = source.weight;
                this.height = source.height;
            }

        public String getfName()
            {
                return this.fName;
            }
        public void setfName(String fName)
            {
                this.fName = fName;
            }
        public String getlName()
            {
                return this.lName;
            }
        public void setlName(String lName)
            {
                this.lName = lName;
            }
        public int getAge()
            {
                return this.age;
            }
        public void setAge(int age)
            {
                this.age = age;
            }
        public int getWeight()
            {
                return this.weight;
            }
        public void setWeight(int weight)
            {
                this.weight = weight;
            }
        public double getHeight()
            {
                return this.height;
            }
        public void setHeight(double height)
            {
                this.height = height;
            }
    }