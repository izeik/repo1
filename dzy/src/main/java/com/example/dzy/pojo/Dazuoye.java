package com.example.dzy.pojo;

public class Dazuoye {


    public int sid;
    public String sname;
    public int score;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Dazuoye{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", score=" + score +
                '}';
    }
}
