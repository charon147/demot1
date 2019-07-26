package com.charon.pojo;

import java.util.Date;

public class EmpPojo {
    private Integer eid;
    private String ename;
    private String ejob;
    private Double esalary; //工资
    private Date etime;
    private Double ebonus;
    private Integer did;

    @Override
    public String toString() {
        return "EmpPojo{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", ejob='" + ejob + '\'' +
                ", esalary=" + esalary +
                ", etime=" + etime +
                ", ebonus=" + ebonus +
                ", did=" + did +
                '}';
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEjob() {
        return ejob;
    }

    public void setEjob(String ejob) {
        this.ejob = ejob;
    }

    public Double getEsalary() {
        return esalary;
    }

    public void setEsalary(Double esalary) {
        this.esalary = esalary;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Double getEbonus() {
        return ebonus;
    }

    public void setEbonus(Double ebonus) {
        this.ebonus = ebonus;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}

