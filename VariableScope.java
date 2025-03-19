public class VariableScope {
    
    // Global variable
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print the globalCount inside main method
        System.out.println("Global Count (from main): " + globalCount);

        // Call the showScope method
        showScope();
    }

    // Method to demonstrate local and global scope
    public static void showScope() {
        // Local variable
        int localCount = 50;

        // Access globalCount (can be accessed from both main and showScope)
        System.out.println("Global Count (from showScope): " + globalCount);

        // Access localCount (only accessible within showScope)
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
