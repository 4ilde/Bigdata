package com.flight.ticketsAnalysis.entity;


public class AdminEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7742764123835596208L;

    /** adminId */
    private Integer admin_id;

    /** adminname */
    private String adminname;

    /** password */
    private String password;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}