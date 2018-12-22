package com.gloryroad.controller;

import com.gloryroad.pojo.Employee;
import com.gloryroad.service.imp.EmployeeSeviceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lw
 * @createTime 2018/12/22 19:09
 * @description
 */
@Controller
public class EmployeeCotroller {

    //通过sevice把数据自动传过来
    @Autowired
    EmployeeSeviceimp employeeSevice;

    @ResponseBody
    @GetMapping("/emp/{id}")   //通过请求获取id值
    public Employee getEmployee(@PathVariable("id") Integer id) {
        Employee emp = employeeSevice.getEmp(id);
        return emp;
    }
}
