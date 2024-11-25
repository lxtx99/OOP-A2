// Visitor 类继承自 Person 类
public class Visitor extends Person {
    // 额外的实例变量
    private String ticketType;  // 票种（如成人票、儿童票等）
    private boolean isVIP;  // 是否为VIP

    // 默认构造函数
    public Visitor() {
        super();  // 调用父类的默认构造函数
        this.ticketType = "Standard";  // 默认票种
        this.isVIP = false;  // 默认不是VIP
    }

    // 带参数的构造函数
    public Visitor(String name, int age, String gender, String phone, String ticketType, boolean isVIP) {
        super(name, age, gender, phone);  // 调用父类的带参数构造函数
        this.ticketType = ticketType;
        this.isVIP = isVIP;
    }

    // 获取票种
    public String getTicketType() {
        return ticketType;
    }

    // 设置票种
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    // 获取是否为VIP
    public boolean isVIP() {
        return isVIP;
    }

    // 设置是否为VIP
    public void setVIP(boolean isVIP) {
        this.isVIP = isVIP;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        // 调用父类的 toString 方法，并添加游客特有的字段
        return super.toString() + ", ticketType='" + ticketType + "', isVIP=" + isVIP;
    }
}
