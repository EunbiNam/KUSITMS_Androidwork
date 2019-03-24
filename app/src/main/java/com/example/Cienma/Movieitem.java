package com.example.Cienma;

public class Movieitem {

    String name;
    String time;
    String review;
    String recom;
    String report;
    int resId;

    public Movieitem(String name, String time, String review, String recom, String report, int resId){
        this.name = name;
        this.time = time;
        this.review = review;
        this.recom = recom;
        this.report = report;
        this.resId = resId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time){
        this.time = time;
    }

    public String getReview(){
        return review;
    }
    public void setReview(String review){
        this.review = review;
    }

    public String getRecom(){
        return recom;
    }
    public void setRecom(){
        this.recom = recom;
    }

    public String getReport(){
        return report;
    }
    public void setReport(){
        this.report = report;
    }

    public int getResId(){
        return resId;
    }
    public void setResId(int resId){
        this.resId = resId;
    }

    public String toString(){
        return "Movieitem{" + "name='" + name + '\'' + ", time='" + time +'\''
                + ", review='" + review +'\'' + ", recom='" + recom +'\''
                + ",report='" + report +'\'' + '}';
    }
}
