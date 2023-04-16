public class Main {
    public static void main(String args[]) {
        Singleton instance1 = Singleton.getInstance("Instance1");
        Singleton instance2 = Singleton.getInstance("Instance2");
        System.out.println(instance1.getValue());
        System.out.println(instance2.getValue());
    }
}
