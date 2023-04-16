public class TransportFactory {
    public Transport getPrice(String transport) {
        switch(transport) {
            case "Bus" : return new Bus();
            case "Flight" : return new Flight();
            case "Train" : return new Train();
            default : return null;
        }
    }
}
