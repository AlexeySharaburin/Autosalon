public class Main {


    public static void main(String[] args) {

        final Autosalon autosalon = new Autosalon();

        final Customer customer1 = new Customer(autosalon);
        final Customer customer2 = new Customer(autosalon);
        final Customer customer3 = new Customer(autosalon);
        final Customer customer4 = new Customer(autosalon);
        final Customer customer5 = new Customer(autosalon);
        final Customer customer6 = new Customer(autosalon);
        final Customer customer7 = new Customer(autosalon);
        final Customer customer8 = new Customer(autosalon);
        final Customer customer9 = new Customer(autosalon);
        final Customer customer10 = new Customer(autosalon);


        new Thread(null, autosalon, "Автосалон с производством").start();

        new Thread(null, customer1, "Покупатель 1").start();
        new Thread(null, customer2, "Покупатель 2").start();
        new Thread(null, customer3, "Покупатель 3").start();
        new Thread(null, customer4, "Покупатель 4").start();
        new Thread(null, customer5, "Покупатель 5").start();
        new Thread(null, customer6, "Покупатель 6").start();
        new Thread(null, customer7, "Покупатель 7").start();
        new Thread(null, customer8, "Покупатель 8").start();
        new Thread(null, customer9, "Покупатель 9").start();
        new Thread(null, customer10, "Покупатель 10").start();


    }
}
