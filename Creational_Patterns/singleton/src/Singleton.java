public class Singleton {
private static Singleton singletonInstance;
private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(singletonInstance==null) {
            singletonInstance =  new Singleton(value);
        }
        return singletonInstance;
    }

    public String getValue() {
        return value;
    }
}
