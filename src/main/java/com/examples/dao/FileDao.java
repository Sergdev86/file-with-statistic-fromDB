package com.examples.dao;


import com.examples.model.FileObj;
import org.springframework.data.repository.CrudRepository;

public interface FileDao extends CrudRepository<FileObj, Integer>{

}
