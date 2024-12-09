//The Visitor class inherits from the Person class
public class Visitor extends Person {
    // Additional instance variables
    private String ticketType; 
    private boolean isVIP;  

    // Default constructor
    public Visitor() {
        super();  // Call the default constructor of the parent class
        this.ticketType = "Standard";  // Default ticket
        this.isVIP = false;  // Default is not VIP
    }

    // Constructor with arguments
    public Visitor(String name, int age, String gender, String phone, String ticketType, boolean isVIP) {
        super(name, age, gender, phone);  // Call the parameterized constructor of the parent class
        this.ticketType = ticketType;
        this.isVIP = isVIP;
    }

    // Get the ticket type
    public String getTicketType() {
        return ticketType;
    }

    // Set the ticket type
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    // Get whether it is VIP
    public boolean isVIP() {
        return isVIP;
    }

    // Set whether to be VIP
    public void setVIP(boolean isVIP) {
        this.isVIP = isVIP;
    }

    // Override the toString method
    @Override
    public String toString() {
        return super.toString() + ", ticketType='" + ticketType + "', isVIP=" + isVIP;
    }
}
