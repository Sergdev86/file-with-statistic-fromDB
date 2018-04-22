package com.examples.dao;

import com.examples.model.LineObj;
import org.springframework.data.repository.CrudRepository;


public interface LineDao extends CrudRepository<LineObj, Integer> {
}
