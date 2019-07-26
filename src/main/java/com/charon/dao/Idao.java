package com.charon.dao;

import com.charon.pojo.DeptPojo;
import com.charon.pojo.EmpPojo;

import java.util.List;

public interface Idao {
    List<DeptPojo> findDept();
    List<EmpPojo> findEmps();
}
