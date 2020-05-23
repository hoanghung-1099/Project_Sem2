package t1904e.com.example.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import t1904e.com.example.office.model.Office;

public interface OfficeRepository extends JpaRepository<Office, Integer> {
}
