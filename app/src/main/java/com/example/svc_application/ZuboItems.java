package com.example.svc_application;
import java.io.Serializable;

public class ZuboItems implements Serializable{

    private String title="3.4% 다움";
    private String bible="John 3:16";
    private String repre_prayer_1="신혜은";
    private String donate_prayer_1="김민선";
    private String repre_prayer_2="김성현";
    private String donate_prayer_2="김지영";
    private String final_worship="시 선";

    public ZuboItems(String title, String bible, String rppr, String dppr, String rppr2, String dppr2, String dows){}
    public ZuboItems(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBible() {
        return bible;
    }

    public void setBible(String bible) {
        this.bible = bible;
    }

//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }

    public String getRpPr1() {
        return repre_prayer_1;
    }

    public void setRpPr1(String repre_prayer_1) {
        this.repre_prayer_1 = repre_prayer_1;
    }

    public String getRpPr2() {
        return repre_prayer_2;
    }

    public void setRpPr2(String repre_prayer_2) {
        this.repre_prayer_2 = repre_prayer_2;
    }

    public String getDoPr1() {
        return donate_prayer_1;
    }

    public void setDoPr1(String donate_prayer_1) {
        this.donate_prayer_1 = donate_prayer_1;
    }

    public String getDoPr2() {
        return donate_prayer_2;
    }

    public void setDoPr2(String donate_prayer_2) {
        this.donate_prayer_2 = donate_prayer_2;
    }

    public String getFnWs() {
        return final_worship;
    }


    public void setFnWs(String final_worship) {
            this.final_worship = final_worship;
        }

}
