//The Employee class inherits from the Person class
public class Employee extends Person {
    // Additional instance variables
    private String employeeId; 
    private String employeePosition;  

    // Default constructor
    public Employee() {
        super();  
        this.employeeId = "Unknown";
        this.employeePosition = "Unknown";
    }

   // Constructor with arguments
    public Employee(String name, int age, String gender, String phone, String employeeId, String employeePosition) {
        super(name, age, gender, phone);  
        this.employeeId = employeeId;
        this.employeePosition = employeePosition;
    }

    // Get the employee ID
    public String getEmployeeId() {
        return employeeId;
    }

    // Set the employee ID
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Get employee position
    public String getEmployeePosition() {
        return employeePosition;
    }

    // Set employee position
    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    // Override the toString method
    @Override
    public String toString() {
        return super.toString() + ", employeeId='" + employeeId + "', employeePosition='" + employeePosition + "'";
    }
}
