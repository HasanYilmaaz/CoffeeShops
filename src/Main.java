import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstName("hasan hüseyin");
        customer.setNationalityID("11223344551");
        customer.setLastName("yılmaz");
        customer.setDateOfBirth(1996);

        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
        customerManager.Save(customer);


    }

}
