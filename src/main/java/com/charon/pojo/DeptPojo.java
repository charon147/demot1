package com.charon.pojo;

public class DeptPojo {
    private Integer did;
    private String dname;

    @Override
    public String toString() {
        return "DeptPojo{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
