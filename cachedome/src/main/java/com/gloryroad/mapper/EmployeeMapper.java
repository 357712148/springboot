package com.gloryroad.mapper;

import com.gloryroad.pojo.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @author lw
 * @createTime 2018/12/22 18:44
 * @description 员工mapper数据层
 */
@Mapper
public interface EmployeeMapper {

    //查询
    @Select("SELECT * FROM employee WHERE id = #{id}")
    public Employee getEmployeeById(Integer id);

    //更新
    @Update("UPDATE employee SET lastName=#{lastName} ,email = #{email},gender = #{gender},d_id=#{d_id} WHERE id=#{id}")
    public void updataEmp(Employee employee);

    //删除
    @Delete("DELETE FROM employee WHERE id=#{id}")
    public void delectEmpByid(Integer id);

    //插入
    @Insert("INSERT INTO employee(lastName,email,gender,d_id) VALUES(#{lastName},#{email},#{gender}#{d_id},#{id})")
    public void insertEmployee(Employee employee);

}
