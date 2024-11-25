public class Person {
    // 实例变量
    private String name;
    private int age;
    private String gender;
    private String phone;

    // 默认构造函数
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
        this.phone = "Unknown";
    }

    // 带参数的构造函数
    public Person(String name, int age, String gender, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    // Getter 和 Setter 方法

    // 获取姓名
    public String getName() {
        return name;
    }

    // 设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    // 获取性别
    public String getGender() {
        return gender;
    }

    // 设置性别
    public void setGender(String gender) {
        this.gender = gender;
    }

    // 获取电话号码
    public String getPhone() {
        return phone;
    }

    // 设置电话号码
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // 重写 toString 方法以便打印对象信息
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", gender='" + gender + "', phone='" + phone + "'}";
    }
}
