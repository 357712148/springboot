package com.gloryroad.service;

import com.gloryroad.pojo.Employee;

//雇员接口层
public interface EmployeeSevice {
    public Employee getEmp(Integer id);

    public void updataEmp(Employee employee);

    public void delectEmpByid(Integer id);

    public void insertEmployee(Employee employee);

}
