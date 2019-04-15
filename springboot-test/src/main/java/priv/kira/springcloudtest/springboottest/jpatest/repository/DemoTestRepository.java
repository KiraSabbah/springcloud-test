package priv.kira.springcloudtest.springboottest.jpatest.repository;

import org.springframework.data.repository.CrudRepository;
import priv.kira.springcloudtest.springboottest.jpatest.entity.DemoTest;

public interface DemoTestRepository extends CrudRepository<DemoTest,Long> {
}
