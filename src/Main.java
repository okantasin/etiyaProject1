public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new ICustomerRepository());

        ICustomerRepository iCustomerRepository = new ICustomerRepository();

        System.out.println("********************* GET ALL ***********************************");
        customerManager.getAll();

        System.out.println("********************** ADD ***************************************");

        customerManager.add(new Customer(4, "ozan", "tasin", 20));
        customerManager.add(new Customer(5, "ozan", "tasin", 20));
        customerManager.add(new Customer(6, "ozan", "tasin", 20));

        customerManager.getAll();

        System.out.println("********************* GET BY ID ***********************************");
        customerManager.getById(4);

        System.out.println("********************* DELETE ***********************************");
        customerManager.delete(5);
        customerManager.getAll();

        System.out.println("********************* UPDATE ***********************************");
        Customer customer = new Customer(2, "ss", "bbb", 15);
        customerManager.update(1, customer);
        customerManager.getAll();
    }
}