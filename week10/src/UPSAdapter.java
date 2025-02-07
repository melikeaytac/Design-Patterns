public class UPSAdapter implements ShippingService {

    private UPSAPI upsAPI;
    public UPSAdapter(UPSAPI upsAPI) {
        this.upsAPI= upsAPI;
    }

    @Override
    public double calculateShippingCost(String origin, String destination, double weight) {
        return upsAPI.calculateCost(origin, destination, weight);
    }
}
