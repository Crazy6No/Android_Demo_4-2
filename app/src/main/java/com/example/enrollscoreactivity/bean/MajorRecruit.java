package com.example.enrollscoreactivity.bean;

public class MajorRecruit {
    private static final long serialVersionUID = 7276854851842065102L;
    private String majorName;
    private String schoolName;

    private int year;
    private int mReruitHScore;
    private int mReruitAScore;
    private String areaName;
    private String batchName;
    private String categoryName;

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getmReruitHScore() {
        return mReruitHScore;
    }

    public void setmReruitHScore(int mReruitHScore) {
        this.mReruitHScore = mReruitHScore;
    }

    public int getmReruitAScore() {
        return mReruitAScore;
    }

    public void setmReruitAScore(int mReruitAScore) {
        this.mReruitAScore = mReruitAScore;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
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

    @Override
    public String toString() {
        return "MajorRecruit[" +
                "majorName=" + majorName + ", schoolName="
                + schoolName + ", year=" + year + ", mReruitHScore="
                + mReruitHScore + ", mReruitAScore=" + mReruitAScore
                + ", areaName=" + areaName + ", batchName=" + batchName +
                ", categoryName=" + categoryName + ']';
    }
}
