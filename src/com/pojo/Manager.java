package com.pojo;

/**
 * @author xhz
 * @description 管理员对象
 * @date 2021-01-20
 */
public class Manager {
    private String id;
    private String managename;
    private String pwd;
    private String acc;
    private String createtime;
    private String isdelete;

    public Manager() {
    }

    public Manager(String id, String managename, String pwd, String acc, String createtime, String isdelete) {
        this.id = id;
        this.managename = managename;
        this.pwd = pwd;
        this.acc = acc;
        this.createtime = createtime;
        this.isdelete = isdelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManagename() {
        return managename;
    }

    public void setManagename(String managename) {
        this.managename = managename;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id='" + id + '\'' +
                ", managename='" + managename + '\'' +
                ", pwd='" + pwd + '\'' +
                ", acc='" + acc + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isdelete='" + isdelete + '\'' +
                '}';
    }
}
