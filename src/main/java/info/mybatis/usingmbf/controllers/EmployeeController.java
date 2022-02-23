package info.mybatis.usingmbf.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import info.mybatis.usingmbf.modules.Employee;
import info.mybatis.usingmbf.services.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/")
    public List<Employee> Toshow() {
        return this.employeeService.getfromdb();
    }

    @GetMapping(value = "/id/{id}")
    public Employee getEmployeeFromDB(@PathVariable Long id) {
        return this.employeeService.getById(id);
    }

    @GetMapping(value = "/byid/{id}")
    public Employee getById(@PathVariable Long id) {
        return this.employeeService.getByIdFromDb(id);
    }

    @PostMapping(value = "/add")
    public void addnewEmpmoyee(@RequestBody Employee employee) {

        employeeService.toDb(employee);
    }

    @PostMapping(value = "/update")
    public void updFroDb(@PathVariable Employee employee) {
        this.employeeService.updateEmployeetodb(employee);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void DeleteEmployee(@PathVariable Long id) {
        this.employeeService.rmDb(id);
    }
}