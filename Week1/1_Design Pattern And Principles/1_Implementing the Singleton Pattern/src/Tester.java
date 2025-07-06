
public class Tester {
    public void runTest() {
        Logger logOne = Logger.getLogger();
        Logger logTwo = Logger.getLogger();

        if (logOne == logTwo) {
            System.out.println("Both references point to the same Logger instance.");
        } else {
            System.out.println("Different Logger instances detected.");
        }
    }
}
