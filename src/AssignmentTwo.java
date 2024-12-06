import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AssignmentTwo {
    public static void main(String[] args) {

        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree(); // Invoke partThree to execute the task
        
        assignment.partFourA(); // Invoke partFourA to execute the task

        assignment.partFourB(); // Invoke partFourB to execute the task

        assignment.partFive(); // Invoke partFive to execute the task
             
        assignment.partSix(); // Invoke partSix to execute the task

        assignment.partSeven(); // Invoke partSeven to execute the task
        
        
    }

 
    public void partThree() {
        // Create a Ride object
        Employee rideOperator = new Employee("John Doe", 38, "Male", "123-111-7890", "E001", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", "Thrill", true, rideOperator, 4); 
 
        // Create some Visitoe objects
        Visitor visitor1 = new Visitor("Jack", 26, "Male", "111-222-7857", "Adult", false);
        Visitor visitor2 = new Visitor("Sharon", 33, "Female", "222-1567-4444", "Adult", true);
        Visitor visitor3 = new Visitor("Benny", 22, "Male", "333-8974-5555", "Student", false);
        Visitor visitor4 = new Visitor("Leo", 28, "Male", "444-1675-6666", "Adult", true);
        Visitor visitor5 = new Visitor("Nehemia", 21, "Female", "555-1023-7777", "Student", false);
 
        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
 
        // Print the visitor in the current queue
        System.out.println("Current Visitor Queue:");
        rollerCoaster.printQueue();
 
        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue(visitor3); // remove Benny
 
        // Print the tourist in the queue again
        System.out.println("\nUpdated Visitor Queue (after removal):");
        rollerCoaster.printQueue();
    }


    public void partFourA() {
        // Create a Ride object
        Employee rideOperator = new Employee("Jane Smith", 46, "Female", "966-654-3210", "E002", "Ride Operator");
        Ride thunderstorm = new Ride("Thunderstorm", "Adventure", true, rideOperator,4);
        
        // Create some Visitoe objects
        Visitor visitor1 = new Visitor("Jack", 28, "Male", "111-222-3333", "Adult", false);
        Visitor visitor2 = new Visitor("Lee", 22, "Male", "222-333-4445", "Adult", false);
        Visitor visitor3 = new Visitor("Tom", 57, "Male", "333-444-5556", "Adult", false);
        Visitor visitor4 = new Visitor("Sherly", 39, "Female", "444-555-6667", "Adult", false);
        Visitor visitor5 = new Visitor("Ben", 23, "Male", "555-666-7778", "Student", false);
        
        // Assume that these tourists have taken Thunderstorm
        thunderstorm.addVisitorToHistory(visitor1);
        thunderstorm.addVisitorToHistory(visitor2);
        thunderstorm.addVisitorToHistory(visitor3);
        thunderstorm.addVisitorToHistory(visitor4);
        thunderstorm.addVisitorToHistory(visitor5);
        
        // Check whether visitors are in the collection
        System.out.println("\nChecking if Jack is in ride history: " + thunderstorm.checkVisitorFromHistory(visitor1));
        System.out.println("Checking if Neo (not in history) is in ride history: " + thunderstorm.checkVisitorFromHistory(new Visitor("Neo", 20, "Male", "777-888-9999", "Adult", false)));
        
        // Print the number of visitors
        System.out.println("\nNumber of visitors in ride history: " + thunderstorm.numberOfVisitors());
        
        // Print all visitors in the collection
        thunderstorm.printRideHistory();
    }


    public void partFourB() {
    // Create a new Ride object
    Employee rideOperator = new Employee("Jane Smith", 40, "Female", "987-654-3210", "E002", "Ride Operator");
    Ride thunderstorm = new Ride("Thunderstorm", "Adventure", true, rideOperator,4);
 
    // Create some Visitor objects
    Visitor visitor1 = new Visitor("Jack", 25, "Male", "111-222-3333", "Adult", false);
    Visitor visitor2 = new Visitor("Lee", 32, "Male", "222-333-4445", "Adult", false);
    Visitor visitor3 = new Visitor("Tom", 27, "Male", "333-444-5556", "Adult", false);
    Visitor visitor4 = new Visitor("Sherly", 29, "Female", "444-555-6667", "Adult", false);
    Visitor visitor5 = new Visitor("Ben", 23, "Male", "555-666-7778", "Student", false);
 
    // Assume that these tourists have taken Thunderstorm
    thunderstorm.addVisitorToHistory(visitor1);
    thunderstorm.addVisitorToHistory(visitor2);
    thunderstorm.addVisitorToHistory(visitor3);
    thunderstorm.addVisitorToHistory(visitor4);
    thunderstorm.addVisitorToHistory(visitor5);
 
    // Print the guest collection before sorting
    System.out.println("\nRide History before sorting:");
    thunderstorm.printRideHistory();
 
    // Use a custom Comparator to sort the rideHistory
    thunderstorm.sortRideHistory(new VisitorComparator());
 
    // Print the guest collection after sorting
    System.out.println("\nRide History after sorting:");
    thunderstorm.printRideHistory();
    }
    

    public void partFive() {
        // Create a new Ride object
        Employee rideOperator = new Employee("Jane Smith", 40, "Female", "987-654-3210", "E002", "Ride Operator");
        Ride thunderstorm = new Ride("Thunderstorm", "Adventure", true, rideOperator, 3); // 设置maxRider为3
 
       // Create some Visitor objects
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
 
        // Add visitors to the queue
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

        // Print all visitors in the queue
        System.out.println("\nVisitor Queue before running a cycle:");
        thunderstorm.printQueue();
 
        // run a cycle
        thunderstorm.runOneCycle();
 
        // Prints all visitors in the queue after one cycle
        System.out.println("\nVisitor Queue after running a cycle:");
        thunderstorm.printQueue();
 
        // Print all visitors in the collection
        System.out.println("\nVisitors in ride history:");
        thunderstorm.printRideHistory();
 
        // Print the number of rides
        System.out.println("\nNumber of cycles run: " + thunderstorm.getNumOfCycles());
    }

    public void partSix() {
        // Create a new Ride object
        Employee rideOperator = new Employee("Mike Johnson", 38, "Male", "888-999-1234", "E003", "Ride Operator");
        Ride fireworks = new Ride("Fireworks", "Family", true, rideOperator, 6);
 
        // Create some new Visitor objects
        Visitor visitor1 = new Visitor("Jack", 25, "Male", "111-222-3333", "Adult", false);
        Visitor visitor2 = new Visitor("Emily", 31, "Female", "222-333-4444", "Adult", false);
        Visitor visitor3 = new Visitor("Zach", 28, "Male", "333-444-5555", "Student", true);
        Visitor visitor4 = new Visitor("Lena", 22, "Female", "444-555-6666", "Student", false);
        Visitor visitor5 = new Visitor("Michael", 35, "Male", "555-666-7777", "Adult", true);
 
        // Assume that these visitors have already taken a Fireworks ride 
        fireworks.addVisitorToHistory(visitor1);
        fireworks.addVisitorToHistory(visitor2);
        fireworks.addVisitorToHistory(visitor3);
        fireworks.addVisitorToHistory(visitor4);
        fireworks.addVisitorToHistory(visitor5);
 
        // Export visitor information to a file
        String filePath = "ride_history.csv";
        exportRideHistory(fireworks, filePath);
    }
 
    // Assistance: Export Ride visitor history to a CSV file
    private void exportRideHistory(Ride ride, String filePath) {
        List<Visitor> visitors = ride.getRideHistory();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Visitor visitor : visitors) {
                // Write the Visitor object details to the file in CSV format
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
        // Create a new Ride object
        Employee rideOperator = new Employee("Mike Johnson", 38, "Male", "888-999-1234", "E003", "Ride Operator");
        Ride fireworks = new Ride("Fireworks", "Family", true, rideOperator, 6);
 
        // Import the previously created ride_history.csv file
        String filePath = "ride_history.csv";
        try {
            fireworks.importRideHistory(filePath);
            // Print the number of visitors in LinkedList
            System.out.println("Number of visitors in ride history: " + fireworks.numberOfVisitors());
            // Print all visitors in LinkedList (here it is rideHistory)
            fireworks.printRideHistory();
        } catch (IOException e) {
            System.err.println("Error importing ride history: " + e.getMessage());
        }
    }
    
}