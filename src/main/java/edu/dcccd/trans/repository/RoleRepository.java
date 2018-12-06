package edu.dcccd.trans.repository;
import edu.dcccd.trans.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    List<Role> findByUserId( @Param("user_id") Long user_id );
}
16. In the repository package, create a new class UserRepository as follows:
        package edu.dcccd.trans.repository;
        import edu.dcccd.trans.entity.User;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername( String username );
}