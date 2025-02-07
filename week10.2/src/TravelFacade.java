
public class TravelFacade {
    private FlightBookingSystem flightBookingSystem;
    private HotelReservationSystem hotelReservationSystem;
    private CarRentalSystem carRentalSystem;
    private ActivityBookingSystem activityBookingSystem;
    private InsuranceSystem insuranceSystem;
    private NotificationService notificationService;

    public TravelFacade() {
        this.flightBookingSystem = new FlightBookingSystem();
        this.hotelReservationSystem = new HotelReservationSystem();
        this.carRentalSystem = new CarRentalSystem();
        this.activityBookingSystem = new ActivityBookingSystem();
        this.insuranceSystem = new InsuranceSystem();
        this.notificationService = new NotificationService();
    }

    public void planTrip(String departureCity, String destinationCity, String departureDate,
                            String checkInDate, String checkOutDate, String carRentalStartDate, int rentalDays,
                                String activityName, String activityDate, String insuranceStartDate, String insuranceEndDate) {


        flightBookingSystem.bookFlight(departureCity, destinationCity, departureDate);
        hotelReservationSystem.reserveHotel(destinationCity, checkInDate, checkOutDate);
        carRentalSystem.rentCar(destinationCity, carRentalStartDate, rentalDays);
        activityBookingSystem.bookActivity(destinationCity, activityName, activityDate);
        insuranceSystem.purchaseInsurance(destinationCity, insuranceStartDate, insuranceEndDate);
        notificationService.sendNotification("Your trip is booked successfully!");
    }
}
