public class TravelService {
    public static void main(String args[]) {
        TransportFactory transportFactory = new TransportFactory();
        Transport transportObj = transportFactory.getPrice("Flight");
        System.out.println("Price is: "+transportObj.price());
    }
}
