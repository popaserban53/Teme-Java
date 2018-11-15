public class Main {
    public static void main(String[] args) {

        Cars car = new Bmw3Series(30, "ade35236");
        car.Start();
        car.setGears(1);
        car.Drive(1);
        car.setGears(2);
        car.Drive(1);
        car.setGears(3);
        car.Drive(3);
        car.setGears(4);
        car.Drive(10);
        car.Stop();
        System.out.println(car.toString());
        System.out.println("--------------------------------------------------------------------------------------------");

    }
}
