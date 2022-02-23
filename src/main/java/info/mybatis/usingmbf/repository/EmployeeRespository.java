package info.mybatis.usingmbf.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import info.mybatis.usingmbf.modules.Employee;

@Mapper
public interface EmployeeRespository {

    @Select("SELECT * FROM Employee")
    public List<Employee> getAllEmployees();

    @Select("SELECT * FROM Employee where id= #{id}")
    public Employee getEmployeeById(Long id);

    @Select("SELECT * FROM Employee where id= #{idemp}")
    public Employee getEmployeebyId(Long idemp);

    @Insert("INSERT INTO Employee VALUES (#{id},#{name})")
    public void insertEmploye(Employee emp);

    @Delete("DELETE FROM `Employee` WHERE id=#{id}")
    public void DeleteEmployee(Long id);

    @Update("UPDATE `Employee` SET name=${name} WHERE id=#{id}")
    public void updateEmployee(Employee employee);

}
