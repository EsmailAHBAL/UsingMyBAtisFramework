package info.mybatis.usingmbf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.mybatis.usingmbf.modules.Employee;
import info.mybatis.usingmbf.repository.EmployeeRespository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRespository employeeRespository;

    public List<Employee> getfromdb() {
        return this.employeeRespository.getAllEmployees();
    }

    public Employee getById(Long id) {
        return this.employeeRespository.getEmployeebyId(id);
    }

    public void toDb(Employee employee) {
        this.employeeRespository.insertEmploye(employee);
    }

    public Employee getByIdFromDb(Long id) {
        return this.employeeRespository.getEmployeeById(id);
    }

    public void rmDb(Long id) {
        this.employeeRespository.DeleteEmployee(id);
    }

    public void updateEmployeetodb(Employee employee) {
        this.employeeRespository.updateEmployee(employee);
    }
}