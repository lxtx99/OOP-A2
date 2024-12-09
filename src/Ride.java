import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    private Queue<Visitor> visitorQueue ; // Tourist queue
    private List<Visitor> rideHistory; // Ride history
    private int maxRider; // The maximum number of visitors that can be accommodated in a cycle
    private int numOfCycles; // The number of rides run

    // Default constructor
    public Ride() {
        this.name = "Unknown Ride";
        this.type = "Unknown Type";
        this.isOpen = false;
        this.operator = new Employee(); 
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new ArrayList<>();
        this.maxRider = 1;
        this.numOfCycles = 0;
    }

    // Constructor with arguments
    public Ride(String name, String type, boolean isOpen, Employee operator, int maxRider) {
        this.name = name;
        this.type = type;
        this.isOpen = isOpen;
        this.operator = operator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new ArrayList<>();
        this.maxRider = maxRider; // Set the maximum number of visitors that can be accommodated in a period
        this.numOfCycles = 0; // The default number of runs is 0
    }


   // Implement addVisitorToQueue method
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            visitorQueue.offer(visitor); // Add visitors to the queue
            System.out.println(visitor.getName() + " has been added to the queue.");
        } else {
            System.out.println("Failed to add visitor to the queue: Visitor is null.");
        }
    }

    // Implement removeVisitorFromQueue method
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitorQueue.contains(visitor)) {
            visitorQueue.remove(visitor); // Remove visitors to the queue
            System.out.println(visitor.getName() + " has been removed from the queue.");
        } else {
            System.out.println("Failed to remove visitor: Visitor not found in the queue.");
        }
    }

    // Implement printQueue method
    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Visitor Queue:");
            for (Visitor visitor : visitorQueue) {
                System.out.println(visitor.getName()); 
            }
        }
    }

    // Implement runOneCycle method
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
            Visitor visitor = visitorQueue.poll(); // Remove the first tourist in the queue
            System.out.println(visitor.getName() + " is riding the " + name + "!");
            addVisitorToHistory(visitor); // Add guests to ride history
            ridersMoved++;
        }

        numOfCycles++; // The number of runs increases
    }

    // Implement addVisitorToHistory method
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor); // Add guests to ride history
    }

    // Implement checkVisitorFromHistory method
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor); // Check if the visitor is in the history
    }

    // Implement numberOfVisitors method
    @Override
    public int numberOfVisitors() {
        return rideHistory.size(); // Return the number of tourists in the ride history
    }

    // Implement printRideHistory method
    @Override
    public void printRideHistory() {
        System.out.println("Ride History:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName()); 
        }
    }

    // A method for sorting rideHistory based on the Comparator interface
    public void sortRideHistory(Comparator<Visitor> comparator) {
        Collections.sort(rideHistory, comparator);
    }

    // Getter and Setter method
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

    // Add the getRideHistory method to get the rideHistory list

    public List<Visitor> getRideHistory() {
         return rideHistory;
    }

    /**
     * Import visitor history from CSV file
     *
     * param filePath(The path of the CSV file) 
     * IOException(If the file failed to read)
     */
    public void importRideHistory(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Use commas to separate each line of data
                String[] data = line.split(",");
                if (data.length == 6) { // Ensure data integrity
                    String Name = data[0];
                    int age = Integer.parseInt(data[1]);
                    String gender = data[2];
                    String phone = data[3];
                    String ticketType = data[4]; // Assume that the CSV file contains only these information, but no VIP information
 
                    // Create the Visitor object and add it to the rideHistory
                    Visitor visitor = new Visitor(Name, age, gender, phone, ticketType, false); // Default is not VIP
                    addVisitorToHistory(visitor); // Add visitors to ride history
                } else {
                    System.err.println("Invalid data format in file: " + line);
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Error parsing age in file: " + e.getMessage());
        }
    }
}