package priv.kira.springcloudtest.userservice.repository;

import org.springframework.data.repository.CrudRepository;
import priv.kira.springcloudtest.userservice.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
