package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import Mernis.VRNKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService
{
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        VRNKPSPublicSoap client = new VRNKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(customer.getNationalityID(), customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(), customer.getDateOfBirth());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
