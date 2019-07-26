package com.charon.action;

import com.charon.biz.Biz;
import com.charon.pojo.DeptPojo;
import com.charon.pojo.EmpPojo;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/persons") // 命名空间
public class SkipAction {
    @Autowired
    private Biz biz;

    @RequestMapping(value = "user")
    public String findUser(){
        return  "{id:'001',name:'李棋',pwd:'123456'}";
    }

    /**
     * 查询所有部门
     * @return
     */
    @RequestMapping(value = "findDept")
    public List<DeptPojo> findDept(){
        return biz.findDept();
    }

    /**
     * 查询所有员工
     * @return
     */
    @RequestMapping(value = "findEmps")
    public List<EmpPojo> findEmps(){
        return biz.findEmps();
    }

}
