import java.util.ArrayList;
import java.util.List;

public class Autosalon implements Runnable {

    List<Auto> auto = new ArrayList<>(1);
    Customer customer = new Customer(this);

    @Override
    public void run() {
        System.out.printf("%s открыл продажи автомобилей!\n", Thread.currentThread().getName());
    }

    public void produceAuto() {
        try {
            Thread.sleep(3000); // производим автомобиль
            getAuto().add(new Auto());
            System.out.println("Автосалон выпустил 1 автомобиль");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        customer.recieveAuto();
    }

    public Auto sellAuto() {
        return customer.buyAuto();
    }

    List<Auto> getAuto() {
        return auto;
    }


}
