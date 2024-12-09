public abstract class Person {
    // Instance variable
    private String name;
    private int age;
    private String gender;
    private String phone;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
        this.phone = "Unknown";
    }

    // Constructor with arguments
    public Person(String name, int age, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    // Getter and Setter methods

    // Get name
    public String getName() {
        return name;
    }

    // Set name
    public void setName(String name) {
        this.name = name;
    }

    // Get age
    public int getAge() {
        return age;
    }

    // Set age
    public void setAge(int age) {
        this.age = age;
    }

    // Get gender
    public String getGender() {
        return gender;
    }

    // Set gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Get phone
    public String getPhone() {
        return phone;
    }

    // Set phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

   // Override the toString method to print object information
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", gender='" + gender + "', phone='" + phone + "'}";
    }
}
