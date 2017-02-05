 import com.pluralsught.service.CustomerService;
import com.pluralsught.service.CustomerServiceImpl;

public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        System.out.println(service.findAll().get(0).getFistName());
    }
}
