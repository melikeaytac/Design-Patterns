public class Main {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();

        travelFacade.planTrip(
                "Izmir", "Istanbul", "2023-12-11", "2023-12-11",
                "2023-12-17", "2023-12-11", 6, "Sightseeing Tour",
                "2023-12-15", "2023-12-11", "2023-12-17"
        );
    }
}
