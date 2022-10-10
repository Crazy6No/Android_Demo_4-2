package com.example.enrollscoreactivity.bean;

import java.io.Serializable;

public class School implements Serializable {
    private static final long serialVersionUID = 6952345113636426730L;
    public static final String SCHOOL_NAME = "schoolName";
    public static final String  SCHOOL_CODE = "schoolCode";
    public static final String  SCHOOL_ID = "schoolId";
    private int schoolId;
    private String schoolName;
    private int schoolCode;
    private boolean is211;
    private boolean is985;
    private boolean isMinistry;
    private String areaName;

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(int schoolCode) {
        this.schoolCode = schoolCode;
    }

    public boolean isIs211() {
        return is211;
    }

    public void setIs211(boolean is211) {
        this.is211 = is211;
    }

    public boolean isIs985() {
        return is985;
    }

    public void setIs985(boolean is985) {
        this.is985 = is985;
    }

    public boolean isMinistry() {
        return isMinistry;
    }

    public void setMinistry(boolean isMinistry) {
        this.isMinistry = isMinistry;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public String toString() {
        return "School [schoolName=" + schoolName + ", schoolCode ="
                + schoolCode + ", is211=" + is211 +", is985=" + is985
                + ", isMinistry=" + isMinistry + ", areaName="  + areaName;
    }
}
