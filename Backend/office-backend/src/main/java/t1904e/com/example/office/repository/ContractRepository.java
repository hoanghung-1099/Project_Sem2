package t1904e.com.example.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1904e.com.example.office.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
