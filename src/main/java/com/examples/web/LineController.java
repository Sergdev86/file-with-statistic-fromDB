package com.examples.web;

import com.examples.model.FileObj;
import com.examples.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LineController {

    @Autowired
    private FileService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){

        List<FileObj> files = (List<FileObj>) service.getAllFiles();
        files.stream().forEach(o -> System.out.println(o.toString()));
        model.addAttribute("files", files);
        return "welcome";
    }
}
