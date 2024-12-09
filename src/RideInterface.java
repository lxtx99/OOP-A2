public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);  // Add visitors to the queue
    void removeVisitorFromQueue(Visitor visitor);  // Remove visitors to the queue
    void printQueue();  // Print visitors in the queue
    void runOneCycle();  // Run a cycle
    void addVisitorToHistory(Visitor visitor);  // Add guests to ride history
    boolean checkVisitorFromHistory(Visitor visitor);  // Check if the visitor is in the history
    int numberOfVisitors();  // Return to the number of visitors in the ride history
    void printRideHistory();  // Print the ride history
}