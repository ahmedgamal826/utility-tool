public class UtilityTool {

    public static void main(String[] args) {
        System.out.println("Welcome to My Utility Tool!");
        System.out.println("Sum Result = " + addNumbers(1, 2));
        System.out.println("Current Time: " + getCurrentTime());
        System.out.println("Hostname: " + getHostName());
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static String getCurrentTime() {
        return java.time.LocalTime.now().toString();
    }

    public static String getHostName() {
        try {
            return java.net.InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "Unknown Host";
        }
    }
}
