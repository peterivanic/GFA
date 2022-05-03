package com.greenfox.todo.repositories;


import com.greenfox.todo.model.Assignee;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AssigneesRepository extends CrudRepository<Assignee,Long> {

}
