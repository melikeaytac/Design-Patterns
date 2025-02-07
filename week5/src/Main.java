public class Main {
    public static void main(String[] args) {
        Server server1 = new NormalCPU();
        server1 = new BasicGPU(server1);
        server1 = new LowMemory(server1);

        System.out.println("Description: " + server1.getDescription());
        System.out.println("Total Cost: $" + server1.getCost());

        Server server2 = new HighEndCPU();
        server2 = new HighEndGPU(server2);
        server2 = new HighMemory(server2);

        System.out.println("Description: " + server2.getDescription());
        System.out.println("Total Cost: $" + server2.getCost());

    }
}

