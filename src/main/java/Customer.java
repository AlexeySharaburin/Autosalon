public class Customer implements Runnable {

    private Autosalon autosalon;

    public Customer(Autosalon autosalon) {
        this.autosalon = autosalon;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);// запуск покупателей в салон
            System.out.printf("%s зашёл в автосалон\n", Thread.currentThread().getName());
            Thread.sleep(1000); // тайм-аут желания
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        autosalon.sellAuto();
    }

    public synchronized Auto buyAuto() {
        autosalon.produceAuto();
        try {
            while (autosalon.getAuto().size() == 0) {
                System.out.println("Нет автомобилей в наличии");
                wait();
            }
            Thread.sleep(1000); // оформляем автомобиль
            System.out.printf("%s уехал домой на новом автомобиле\n", Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return autosalon.getAuto().remove(0);
    }

    public synchronized void recieveAuto() {
        try {
            Thread.sleep(1000);// разгрузка автомобиля
            notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
