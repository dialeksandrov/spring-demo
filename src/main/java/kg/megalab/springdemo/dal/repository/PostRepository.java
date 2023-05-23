package kg.megalab.springdemo.dal.repository;

import kg.megalab.springdemo.dal.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<PostEntity, Long> {
}
