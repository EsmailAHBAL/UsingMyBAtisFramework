package info.mybatis.usingmbf.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import info.mybatis.usingmbf.modules.Department;
import info.mybatis.usingmbf.services.DepartmentService;

@RestController
public class DepartmenyRepository {

    @Autowired
    DepartmentService dbs;

    @GetMapping(value = "/db")
    public List<Department> getdb() {
        return this.dbs.GETDFROMDB();
    }
}
