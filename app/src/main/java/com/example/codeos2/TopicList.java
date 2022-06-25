package com.example.codeos2;

public class TopicList {
    private int Tno;
    private String Tname;

    public TopicList(int tno, String tname) {
        Tno = tno;
        Tname = tname;
    }

    public int getTno() {
        return Tno;
    }

    public void setTno(int tno) {
        Tno = tno;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }
}
