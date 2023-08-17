package io.projects.tmptool.repositories;

import io.projects.tmptool.dto.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

    @Override
    Iterable<Task> findAllById(Iterable<Long> longs);
}
