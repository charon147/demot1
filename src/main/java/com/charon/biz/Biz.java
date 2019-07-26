package com.charon.biz;

import com.charon.dao.Idao;
import com.charon.pojo.DeptPojo;
import com.charon.pojo.EmpPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Biz {
    @Autowired
    private Idao dao;

    /**
     * 查询所有部门
     * @return
     */
    public List<DeptPojo> findDept(){
        return dao.findDept();
    }

    /**
     * 查询所有员工
     * @return
     */
    public List<EmpPojo> findEmps(){
        return dao.findEmps();
    }
}
