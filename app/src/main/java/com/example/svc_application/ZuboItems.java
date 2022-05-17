package com.example.svc_application;
import java.io.Serializable;

public class ZuboItems implements Serializable{

    private String title;
    private String bible;
    private String repre_prayer_1;
    private String donate_prayer_1;
    private String repre_prayer_2;
    private String donate_prayer_2;
    private String final_worship;

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
