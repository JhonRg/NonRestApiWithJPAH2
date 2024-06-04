package other;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import payroll.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
