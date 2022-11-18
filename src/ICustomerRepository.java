import java.util.ArrayList;
import java.util.List;

public class ICustomerRepository implements ICustomerDal {

    List<Customer> customers = new ArrayList<>();

    public ICustomerRepository() {
        customers.add(new Customer(1, "okan", "tasin", 28));
        customers.add(new Customer(2, "serkan", "yavas", 30));
        customers.add(new Customer(3, "gubar", "wave", 30));
    }

    @Override
    public List<Customer> getAll() {
        customers.forEach((n)->System.out.println("id: "+n.getId()+" , first name:"+n.getFirstName()+" , last name:"+n.getLastName()+" ,age:"+n.getAge()));
        return customers;
    }
 // oda olur farketmez
    @Override
    public Customer getById(int id) {
       System.out.println("id : "+ customers.get(id-1).getId()
                +", first name:"+customers.get(id-1).getFirstName()
                + ", last name:"+customers.get(id-1).getLastName()
                + ", age"+customers.get(id-1).getAge());
        return null;
    }

    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void delete(int id) {
        customers.remove(id-1);
    }

    @Override
    public void update(int id,Customer customer) {
        customers.set(id,customer);
    }
}