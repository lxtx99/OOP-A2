// Employee 类继承自 Person 类
public class Employee extends Person {
    // 额外的实例变量
    private String employeeId;  // 员工ID
    private String employeePosition;    // 员工职位

    // 默认构造函数
    public Employee() {
        super();  // 调用父类默认构造函数
        this.employeeId = "Unknown";
        this.employeePosition = "Unknown";
    }

    // 带参数的构造函数
    public Employee(String name, int age, String gender, String phone, String employeeId, String employeePosition) {
        super(name, age, gender, phone);  // 调用父类的带参数构造函数
        this.employeeId = employeeId;
        this.employeePosition = employeePosition;
    }

    // 获取员工ID
    public String getEmployeeId() {
        return employeeId;
    }

    // 设置员工ID
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // 获取员工职位
    public String getEmployeePosition() {
        return employeePosition;
    }

    // 设置员工职位
    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        // 调用父类的 toString 方法，并添加员工特有的字段
        return super.toString() + ", employeeId='" + employeeId + "', employeePosition='" + employeePosition + "'";
    }
}
