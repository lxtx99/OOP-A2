import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AssignmentTwo {
    public static void main(String[] args) {
        // 在 main 方法中调用 partThree 方法来测试
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(); // 调用 partThree 执行任务
        
        // 调用 partFourA 方法来测试
        assignment.partFourA(); // 新增的 partFourA 方法执行任务

        assignment.partFourB();

        assignment.partFive();
             
        assignment.partSix();

        assignment.partSeven();
        
        
    }

    // partThree 方法：实现创建 Ride，游客 Visitor，操作队列等逻辑
    public void partThree() {
        // 创建一个 Ride 对象
        Employee rideOperator = new Employee("John Doe", 35, "Male", "123-456-7890", "E001", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", true, rideOperator, 4); // 设置maxRider为4
 
        // 创建一些 Visitor 对象
        Visitor visitor1 = new Visitor("Jack", 25, "Male", "111-222-3333", "Adult", false);
        Visitor visitor2 = new Visitor("Sharon", 30, "Female", "222-333-4444", "Adult", true);
        Visitor visitor3 = new Visitor("Benny", 22, "Male", "333-444-5555", "Student", false);
        Visitor visitor4 = new Visitor("Leo", 28, "Male", "444-555-6666", "Adult", true);
        Visitor visitor5 = new Visitor("Nehemia", 35, "Female", "555-666-7777", "Senior", false);
 
        // 将游客添加到队列
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
 
        // 打印当前队列中的游客
        System.out.println("Current Visitor Queue:");
        rollerCoaster.printQueue();
 
        // 从队列中移除一个游客
        rollerCoaster.removeVisitorFromQueue(visitor3); // 移除 Benny
 
        // 再次打印队列中的游客
        System.out.println("\nUpdated Visitor Queue (after removal):");
        rollerCoaster.printQueue();
    }

    // partFourA 方法：测试 Ride 类中的与乘车历史记录相关的方法
    public void partFourA() {
        // 创建一个新的 Ride 对象
        Employee rideOperator = new Employee("Jane Smith", 40, "Female", "987-654-3210", "E002", "Ride Operator");
        Ride thunderstorm = new Ride("Thunderstorm", "Adventure", true, rideOperator,4);
        
        // 创建一些 Visitor 对象
        Visitor visitor1 = new Visitor("Jack", 25, "Male", "111-222-3333", "Adult", false);
        Visitor visitor2 = new Visitor("Lee", 32, "Male", "222-333-4445", "Adult", false);
        Visitor visitor3 = new Visitor("Tom", 27, "Male", "333-444-5556", "Adult", false);
        Visitor visitor4 = new Visitor("Sherly", 29, "Female", "444-555-6667", "Adult", false);
        Visitor visitor5 = new Visitor("Ben", 23, "Male", "555-666-7778", "Student", false);
        
        // 假设这些游客已经乘坐了 Thunderstorm（在实际应用中，这部分逻辑会由 rideOneCycle 方法处理）
        thunderstorm.addVisitorToHistory(visitor1);
        thunderstorm.addVisitorToHistory(visitor2);
        thunderstorm.addVisitorToHistory(visitor3);
        thunderstorm.addVisitorToHistory(visitor4);
        thunderstorm.addVisitorToHistory(visitor5);
        
        // 检查来访者是否在集合中
        System.out.println("\nChecking if Jack is in ride history: " + thunderstorm.checkVisitorFromHistory(visitor1));
        System.out.println("Checking if Neo (not in history) is in ride history: " + thunderstorm.checkVisitorFromHistory(new Visitor("Neo", 20, "Male", "777-888-9999", "Adult", false)));
        
        // 打印访客数量
        System.out.println("\nNumber of visitors in ride history: " + thunderstorm.numberOfVisitors());
        
        // 打印集合中的所有访客
        thunderstorm.printRideHistory();
    }

    // partFourB 方法、partFive 方法、partSix 方法、partSeven 方法：保留以供后续实现
    public void partFourB() {
        // 创建一个新的 Ride 对象
    Employee rideOperator = new Employee("Jane Smith", 40, "Female", "987-654-3210", "E002", "Ride Operator");
    Ride thunderstorm = new Ride("Thunderstorm", "Adventure", true, rideOperator,4);
 
    // 创建一些 Visitor 对象
    Visitor visitor1 = new Visitor("Jack", 25, "Male", "111-222-3333", "Adult", false);
    Visitor visitor2 = new Visitor("Lee", 32, "Male", "222-333-4445", "Adult", false);
    Visitor visitor3 = new Visitor("Tom", 27, "Male", "333-444-5556", "Adult", false);
    Visitor visitor4 = new Visitor("Sherly", 29, "Female", "444-555-6667", "Adult", false);
    Visitor visitor5 = new Visitor("Ben", 23, "Male", "555-666-7778", "Student", false);
 
    // 假设这些游客已经乘坐了 Thunderstorm（在实际应用中，这部分逻辑会由 rideOneCycle 方法处理）
    thunderstorm.addVisitorToHistory(visitor1);
    thunderstorm.addVisitorToHistory(visitor2);
    thunderstorm.addVisitorToHistory(visitor3);
    thunderstorm.addVisitorToHistory(visitor4);
    thunderstorm.addVisitorToHistory(visitor5);
 
    // 打印排序前的访客集合
    System.out.println("\nRide History before sorting:");
    thunderstorm.printRideHistory();
 
    // 使用自定义的 Comparator 对 rideHistory 进行排序
    thunderstorm.sortRideHistory(new VisitorComparator());
 
    // 打印排序后的访客集合
    System.out.println("\nRide History after sorting:");
    thunderstorm.printRideHistory();
    }
    

    public void partFive() {
        // 创建一个新的 Ride 对象
        Employee rideOperator = new Employee("Jane Smith", 40, "Female", "987-654-3210", "E002", "Ride Operator");
        Ride thunderstorm = new Ride("Thunderstorm", "Adventure", true, rideOperator, 3); // 设置maxRider为3
 
        // 创建一些 Visitor 对象
        Visitor visitor1 = new Visitor("Jack", 25, "Male", "111-222-3333", "Adult", false);
        Visitor visitor2 = new Visitor("Lee", 32, "Male", "222-333-4445", "Adult", false);
        Visitor visitor3 = new Visitor("Tom", 27, "Male", "333-444-5556", "Adult", false);
        Visitor visitor4 = new Visitor("Sherly", 29, "Female", "444-555-6667", "Adult", false);
        Visitor visitor5 = new Visitor("Ben", 23, "Male", "555-666-7778", "Student", false);
        Visitor visitor6 = new Visitor("Thomas", 28, "Male", "222-222-3333", "Adult", false);
        Visitor visitor7 = new Visitor("Jing", 39, "Male", "282-333-4445", "Adult", false);
        Visitor visitor8 = new Visitor("Trump", 77, "Male", "363-444-5556", "Adult", false);
        Visitor visitor9 = new Visitor("Dony", 19, "Female", "484-555-6667", "Adult", false);
        Visitor visitor10 = new Visitor("Shawn", 23, "Male", "515-666-7778", "Student", false);
 
        // 将游客添加到队列
        thunderstorm.addVisitorToQueue(visitor1);
        thunderstorm.addVisitorToQueue(visitor2);
        thunderstorm.addVisitorToQueue(visitor3);
        thunderstorm.addVisitorToQueue(visitor4);
        thunderstorm.addVisitorToQueue(visitor5);
        thunderstorm.addVisitorToQueue(visitor6);
        thunderstorm.addVisitorToQueue(visitor7);
        thunderstorm.addVisitorToQueue(visitor8);
        thunderstorm.addVisitorToQueue(visitor9);
        thunderstorm.addVisitorToQueue(visitor10);
        // 打印队列中的所有访客
        System.out.println("\nVisitor Queue before running a cycle:");
        thunderstorm.printQueue();
 
        // 运行一个周期
        thunderstorm.runOneCycle();
 
        // 在一个周期运行后打印队列中的所有访客
        System.out.println("\nVisitor Queue after running a cycle:");
        thunderstorm.printQueue();
 
        // 打印集合中的所有访客
        System.out.println("\nVisitors in ride history:");
        thunderstorm.printRideHistory();
 
        // 打印骑行的运行次数
        System.out.println("\nNumber of cycles run: " + thunderstorm.getNumOfCycles());
    }

    public void partSix() {
        // 创建一个新的 Ride 对象
        Employee rideOperator = new Employee("Mike Johnson", 38, "Male", "888-999-1234", "E003", "Ride Operator");
        Ride fireworks = new Ride("Fireworks", "Family", true, rideOperator, 6);
 
        // 创建一些 Visitor 对象
        Visitor visitor1 = new Visitor("Jack", 25, "Male", "111-222-3333", "Adult", false);
        Visitor visitor2 = new Visitor("Emily", 31, "Female", "222-333-4444", "Adult", false);
        Visitor visitor3 = new Visitor("Zach", 28, "Male", "333-444-5555", "Student", true);
        Visitor visitor4 = new Visitor("Lena", 22, "Female", "444-555-6666", "Student", false);
        Visitor visitor5 = new Visitor("Michael", 35, "Male", "555-666-7777", "Adult", true);
 
        // 假设这些游客已经乘坐了 Fireworks（在实际应用中，这部分逻辑会由 rideOneCycle 方法处理）
        fireworks.addVisitorToHistory(visitor1);
        fireworks.addVisitorToHistory(visitor2);
        fireworks.addVisitorToHistory(visitor3);
        fireworks.addVisitorToHistory(visitor4);
        fireworks.addVisitorToHistory(visitor5);
 
        // 将访客信息导出为文件
        String filePath = "ride_history.csv";
        exportRideHistory(fireworks, filePath);
    }
 
    // 辅助方法：将Ride的访客历史记录导出到CSV文件
    private void exportRideHistory(Ride ride, String filePath) {
        List<Visitor> visitors = ride.getRideHistory();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Visitor visitor : visitors) {
                // 将Visitor对象的详细信息按照CSV格式写入文件
                String line = String.format("%s,%s,%s,%s,%s,%b",
                        visitor.getName(),
                        visitor.getAge(),
                        visitor.getGender(),
                        visitor.getPhone(),
                        visitor.getTicketType(),
                        visitor.isVIP()
                );
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Ride history exported to " + filePath + " successfully.");
        } catch (IOException e) {
            System.err.println("Error exporting ride history: " + e.getMessage());
        }
    }

    public void partSeven() {
        // 创建一个新的Ride对象
        Employee rideOperator = new Employee("Mike Johnson", 38, "Male", "888-999-1234", "E003", "Ride Operator");
        Ride fireworks = new Ride("Fireworks", "Family", true, rideOperator, 6);
 
        // 导入之前创建的ride_history.csv文件
        String filePath = "ride_history.csv";
        try {
            fireworks.importRideHistory(filePath);
            // 打印LinkedList中的访客数量（注意：原代码中未提供LinkedList的直接访问，这里仅验证rideHistory）
            System.out.println("Number of visitors in ride history: " + fireworks.numberOfVisitors());
            // 打印LinkedList中的所有访客（这里打印的是rideHistory）
            fireworks.printRideHistory();
        } catch (IOException e) {
            System.err.println("Error importing ride history: " + e.getMessage());
        }
    }
    
}