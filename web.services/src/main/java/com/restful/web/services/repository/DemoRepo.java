package com.restful.web.services.repository;

import com.restful.web.services.model.Demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepo extends CrudRepository<Demo, Long> {
}
