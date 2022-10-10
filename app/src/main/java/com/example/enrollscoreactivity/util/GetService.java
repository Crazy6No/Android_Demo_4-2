package com.example.enrollscoreactivity.util;

import android.util.Log;

import com.example.enrollscoreactivity.bean.MajorRecruit;
import com.example.enrollscoreactivity.bean.SchoolRecruit;

import java.util.ArrayList;
import java.util.List;

public class GetService {
    private int[] yearString= new int[]{2015,2014,2013,2012,2011,2010};
    private int[] controlLineSreing= new int[]{555,524,532,533,511,510};//2015年的省控线555
    private int[] enterLinerString= new int[]{520,521,522,523,501,510};//2015年的投档线520
    private int[] averageScoreString= new int[]{566,528,532,543,521,520};//2015年的平均分566
    private int[] maxScoreString= new int[]{588,548,552,553,541,540};//2015年的最好分588

    public List<SchoolRecruit> setSchoolRecruit(){
        List<SchoolRecruit> schoolRe = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Log.d("tag1",yearString[i]+"");
            SchoolRecruit schoolRecruit = new SchoolRecruit();
            schoolRecruit.setsRecruitYear(yearString[i]);
            schoolRecruit.setControlLine(controlLineSreing[i]);
            schoolRecruit.setEnterLine(enterLinerString[i]);
            schoolRecruit.setsRecruitAScore(averageScoreString[i]);
            schoolRecruit.setsRecruitHScore(maxScoreString[i]);
            schoolRe.add(schoolRecruit);
        }
        return schoolRe;
    }

    private String[] majorString = new String[]{"行政管理","护理学","电器信息","历史学","管理科学","临床医学"};
    private String[] categoryString = new String[]{"理工","理工","理工","文史","理工","文史"};
    private String[] batchString = new String[]{"一本","一本","一本","一本","一本","一本"};

    private int[] averageScoreStringMaj = new int[]{528,532,543,521,520,533};
    private int[] maxScoreStringMaj = new int[]{548,552,553,541,540,566};

    public List<MajorRecruit> setMajorRecruits(){
        List<MajorRecruit> majorRe = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            MajorRecruit majorRecruit = new MajorRecruit();
            majorRecruit.setMajorName(majorString[i]);
            majorRecruit.setCategoryName(categoryString[i]);
            majorRecruit.setBatchName(batchString[i]);
            majorRecruit.setmReruitAScore(averageScoreStringMaj[i]);
            majorRecruit.setmReruitHScore(maxScoreStringMaj[i]);
            majorRe.add(majorRecruit);
        }
        return majorRe;
    }
}

