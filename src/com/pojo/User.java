package com.pojo;

/**
 * @author xhz
 * @description 用户对象
 * @date 2021-01-20
 */
public class User {
    private String id;
    private String username;
    private String pwd;
    private String acc;
    private String phone;
    private String email;
    private String imgpath;
    private String createtime;
    private int isdelete;

    public User() {
    }

    public User(String id, String username, String pwd, String acc, String phone, String email, String imgpath, String createtime, int isdelete) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
        this.acc = acc;
        this.phone = phone;
        this.email = email;
        this.imgpath = imgpath;
        this.createtime = createtime;
        this.isdelete = isdelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                ", acc='" + acc + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", imgpath='" + imgpath + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isdelete='" + isdelete + '\'' +
                '}';
    }
}
