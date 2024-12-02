import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ride implements RideInterface {
    private String name;
    private String type;
    private boolean isOpen;
    private Employee operator;
    private Queue<Visitor> visitorQueue; // 游客队列
    private List<Visitor> rideHistory; // 乘车历史
    private int maxRider; // 一个周期内可以容纳的最大游客数
    private int numOfCycles; // 骑行运行的次数

    // 默认构造函数
    public Ride() {
        this.name = "Unknown Ride";
        this.type = "Unknown Type";
        this.isOpen = false;
        this.operator = new Employee(); // 默认分配一个操作员
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new ArrayList<>();
        this.maxRider = 1; // 默认至少1名游客乘坐
        this.numOfCycles = 0; // 默认运行次数为0
    }

    // 带参数的构造函数
    public Ride(String name, String type, boolean isOpen, Employee operator, int maxRider) {
        this.name = name;
        this.type = type;
        this.isOpen = isOpen;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new ArrayList<>();
        this.maxRider = maxRider; // 设置一个周期内可以容纳的最大游客数
        this.numOfCycles = 0; // 默认运行次数为0
    }

    // 实现 addVisitorToQueue 方法
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            visitorQueue.offer(visitor); // 将游客添加到队列
            System.out.println(visitor.getName() + " has been added to the queue.");
        } else {
            System.out.println("Failed to add visitor to the queue: Visitor is null.");
        }
    }

    // 实现 removeVisitorFromQueue 方法
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitorQueue.contains(visitor)) {
            visitorQueue.remove(visitor); // 从队列中移除游客
            System.out.println(visitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println("Failed to remove visitor: Visitor not found in the queue.");
        }
    }

    // 实现 printQueue 方法
    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Visitor Queue:");
            for (Visitor visitor : visitorQueue) {
                System.out.println(visitor.getName()); // 假设Visitor类有getName()方法
            }
        }
    }

    // 实现 runOneCycle 方法
    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No operator assigned to the ride. Cannot run the cycle.");
            return;
        }

        if (visitorQueue.isEmpty()) {
            System.out.println("No visitors in queue.");
            return;
        }

        int ridersMoved = 0;
        while (!visitorQueue.isEmpty() && ridersMoved < maxRider) {
            Visitor visitor = visitorQueue.poll(); // 取出队列中的第一个游客
            System.out.println(visitor.getName() + " is riding the " + name + "!");
            addVisitorToHistory(visitor); // 将游客添加到乘车历史
            ridersMoved++;
        }

        numOfCycles++; // 运行次数增加
    }

    // 实现 addVisitorToHistory 方法
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor); // 将游客添加到乘车历史
    }

    // 实现 checkVisitorFromHistory 方法
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor); // 检查游客是否在历史记录中
    }

    // 实现 numberOfVisitors 方法
    @Override
    public int numberOfVisitors() {
        return rideHistory.size(); // 返回乘车历史记录中的游客数
    }

    // 实现 printRideHistory 方法
    @Override
    public void printRideHistory() {
        System.out.println("Ride History:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName()); // 假设Visitor类有getName()方法
        }
    }

    // 新增：根据Comparator接口对rideHistory进行排序的方法
    public void sortRideHistory(Comparator<Visitor> comparator) {
        Collections.sort(rideHistory, comparator);
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

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        if (maxRider < 1) {
            System.out.println("maxRider must be at least 1.");
        } else {
            this.maxRider = maxRider;
        }
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    @Override
    public String toString() {
        return "Ride{name='" + name + "', type='" + type + "', isOpen=" + isOpen + ", operator=" + operator + ", maxRider=" + maxRider + ", numOfCycles=" + numOfCycles + "}";
    }
}