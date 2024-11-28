public class Ride {
    private String name;  // 游乐设施的名称
    private String type;  // 游乐设施的类型（例如：过山车、水上骑手等）
    private boolean isOpen;  // 游乐设施是否开放
    private Employee operator;  // 操作员，负责运行该设施

    // 默认构造函数
    public Ride() {
        this.name = "Unknown Ride";
        this.type = "Unknown Type";
        this.isOpen = false;
        this.operator = new Employee();  // 默认分配一个操作员
    }

    // 带参数的构造函数
    public Ride(String name, String type, boolean isOpen, Employee operator) {
        this.name = name;
        this.type = type;
        this.isOpen = isOpen;
        this.operator = operator;
    }

    // Getter 和 Setter 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "Ride{name='" + name + "', type='" + type + "', isOpen=" + isOpen + ", operator=" + operator + "}";
    }
}
