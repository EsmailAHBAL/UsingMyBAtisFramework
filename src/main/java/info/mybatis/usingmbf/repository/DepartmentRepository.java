package info.mybatis.usingmbf.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import info.mybatis.usingmbf.modules.Department;

@Mapper
public interface DepartmentRepository {

    @Select("SELECT * FROM Department")
    public List<Department> getAlldeaptments();

}
