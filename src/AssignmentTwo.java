public class AssignmentTwo {
    public static void main(String[] args) {
        // 在 main 方法中调用 partThree 方法来测试
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(); // 调用 partThree 执行任务
        
        // 调用 partFourA 方法来测试
        assignment.partFourA(); // 新增的 partFourA 方法执行任务

        assignment.partFourB();
        
    }

    // partThree 方法：实现创建 Ride，游客 Visitor，操作队列等逻辑
    public void partThree() {
        // 创建一个 Ride 对象
        Employee rideOperator = new Employee("John Doe", 35, "Male", "123-456-7890", "E001", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", true, rideOperator);
        
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
        Ride thunderstorm = new Ride("Thunderstorm", "Adventure", true, rideOperator);
        
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
    Ride thunderstorm = new Ride("Thunderstorm", "Adventure", true, rideOperator);
 
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
        // 你可以根据需要在此方法中添加相应功能
    }

    public void partSix() {
        // 你可以根据需要在此方法中添加相应功能
    }

    public void partSeven() {
        // 你可以根据需要在此方法中添加相应功能
    }
}