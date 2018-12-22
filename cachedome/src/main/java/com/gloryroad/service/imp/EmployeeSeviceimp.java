package com.gloryroad.service.imp;

import com.gloryroad.mapper.EmployeeMapper;
import com.gloryroad.pojo.Employee;
import com.gloryroad.service.EmployeeSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lw
 * @createTime 2018/12/22 19:05
 * @description  雇员业务实现曾层
 */
@Service
public class EmployeeSeviceimp implements EmployeeSevice {

    @Autowired
    EmployeeMapper employeeMapper;

    //查询员工
    @Override
    public Employee getEmp(Integer id) {
        System.out.println("查询的是"+id+"员工");
        Employee employeeById = employeeMapper.getEmployeeById(id);
        return employeeById;
    }

    @Override
    public void updataEmp(Employee employee) {

    }

    @Override
    public void delectEmpByid(Integer id) {

    }

    @Override
    public void insertEmployee(Employee employee) {

    }

}
