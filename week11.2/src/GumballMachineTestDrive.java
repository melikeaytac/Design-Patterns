public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);
        System.out.println("--- GUMBALL MACHINE ---");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("--- GUMBALL MACHINE ---");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("--- GUMBALL MACHINE ---");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }
}