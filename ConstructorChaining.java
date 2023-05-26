public class ConstructorChaining {
    private String name;
    private int age;
    private String address;

    // Default constructor
    public ConstructorChaining() {
        this("Shraboni", 27, "Kolkata");
    }

    // Constructor with name parameter
    public ConstructorChaining(String name) {
        this(name, 30, "Behala");
    }

    // Constructor with name and age parameters
    public ConstructorChaining(String name, int age) {
        this(name, age, "Kestopur");
    }

    // Constructor with name, age, and address parameters
    public ConstructorChaining(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
// Getters and setters omitted for brevity

    public static void main(String[] args) {
        ConstructorChaining person1 = new ConstructorChaining();
        System.out.println(person1.getName() + ", " + person1.getAge() + ", " + person1.getAddress());

        ConstructorChaining person2 = new ConstructorChaining("Aditi");
        System.out.println(person2.getName() + ", " + person2.getAge() + ", " + person2.getAddress());

        ConstructorChaining person3 = new ConstructorChaining("Sneha", 25);
        System.out.println(person3.getName() + ", " + person3.getAge() + ", " + person3.getAddress());

        ConstructorChaining person4 = new ConstructorChaining("Tania", 35, "Birati");
        System.out.println(person4.getName() + ", " + person4.getAge() + ", " + person4.getAddress());
    }


}
