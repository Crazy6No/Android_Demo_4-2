package com.example.enrollscoreactivity.bean;

import java.io.Serializable;

public class SchoolRecruit implements Serializable {
    private static final long serialVersionUID = 7096243975046077426L;
    private int sRecruitHScore;
    private int sRecruitAScore;
    private int enterLine;

    private String schoolName;
    private String batchName;
    private String categoryName;
    private int sRecruitYear;
    private String areaName;

    private int controlLine;

    public int getsRecruitHScore() {
        return sRecruitHScore;
    }

    public void setsRecruitHScore(int sRecruitHScore) {
        this.sRecruitHScore = sRecruitHScore;
    }

    public int getsRecruitAScore() {
        return sRecruitAScore;
    }

    public void setsRecruitAScore(int sRecruitAScore) {
        this.sRecruitAScore = sRecruitAScore;
    }

    public int getEnterLine() {
        return enterLine;
    }

    public void setEnterLine(int enterLine) {
        this.enterLine = enterLine;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getsRecruitYear() {
        return sRecruitYear;
    }

    public void setsRecruitYear(int sRecruitYear) {
        this.sRecruitYear = sRecruitYear;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getControlLine() {
        return controlLine;
    }

    public void setControlLine(int controlLine) {
        this.controlLine = controlLine;
    }

    @Override
    public String toString() {
        return "SchoolRecruit [sRecruitHScore=" + + sRecruitHScore
                + ", sRecruitAScore=" + sRecruitAScore + ", enterLine="
                + enterLine + ", schoolName=" + schoolName + ", batchName="
                + batchName  + ", categoryName=" + categoryName
                + ", sRecruitYear=" + sRecruitYear + ", areaName=" + areaName
                + ", controlLine=" + controlLine + ']';
    }
}
