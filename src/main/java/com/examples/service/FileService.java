package com.examples.service;

import com.examples.dao.FileDao;
import com.examples.model.FileObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    @Autowired
    private FileDao fileDao;

    public Iterable<FileObj> getAllFiles(){ return fileDao.findAll();}

}
