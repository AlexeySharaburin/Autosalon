import java.util.ArrayList;
import java.util.List;

public class Autosalon implements Runnable {

    List<Auto> auto = new ArrayList<>(1);
    Customer customer = new Customer(this);

    @Override
    public void run() {
        System.out.println("Наш автосалон открыл продажи автомобилей!\n");
    }

    public void produceAuto() {
        customer.recieveAuto();
    }

    public Auto sellAuto() {
        return customer.buyAuto();
    }

    List<Auto> getAuto() {
        return auto;
    }


}
