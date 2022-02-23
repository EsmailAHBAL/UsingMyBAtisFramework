package info.mybatis.usingmbf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.mybatis.usingmbf.modules.Department;
import info.mybatis.usingmbf.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> GETDFROMDB() {
        return this.departmentRepository.getAlldeaptments();
    }

}
