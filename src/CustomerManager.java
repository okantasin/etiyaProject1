import java.util.List;

public class CustomerManager implements ICustomerDal {
    ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }

    @Override
    public List<Customer> getAll() {
        System.out.println("Get All");
        return iCustomerDal.getAll();
    }

    @Override
    public Customer getById(int id) {
        return iCustomerDal.getById(id);
    }

    @Override
    public void add(Customer customer) {
        iCustomerDal.add(customer);
    }

    @Override
    public void delete(int id) {
        iCustomerDal.delete(id);

    }


    @Override
    public void update(int id,Customer customer) {
        iCustomerDal.update(id,customer);
    }
}