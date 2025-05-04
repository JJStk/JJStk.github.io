public class Debugger {
    public static boolean debugMode = false;

    public static void setDebugMode(String input) {
        if (input.equalsIgnoreCase("Debug mode")) {
            debugMode = true;
            System.out.println("Debug mode engaged, bug radar online.");
        } else if (input.equalsIgnoreCase("Normal mode")) {
            debugMode = false;
            System.out.println("Normal mode engaged, enjoy your game.");
        } else {
            System.out.println("Invalid input. Use 'Debug mode' or 'Normal mode' to choose your mode.");
        }
    }

    public static void log(String message) {
        if (debugMode) {
            System.out.println("[DEBUG] " + message);
        }
    }
}
