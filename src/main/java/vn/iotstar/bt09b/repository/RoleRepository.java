package vn.iotstar.bt09b.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.iotstar.bt09b.entity.Role;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}