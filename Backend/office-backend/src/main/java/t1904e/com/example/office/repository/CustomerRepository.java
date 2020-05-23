package t1904e.com.example.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1904e.com.example.office.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
