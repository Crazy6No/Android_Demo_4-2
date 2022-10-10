package com.example.enrollscoreactivity.util;

import com.example.enrollscoreactivity.bean.School;

import java.util.ArrayList;
import java.util.List;

public class GetSQLite {
    private String[] provinces = new String[]{"上海","浙江","江西","北京"};

    private String[][] schoollists = new String[][]{{"复旦大学","上海中医药大学","同济大学","上海大学","上海交通大学","上海财经大学"},
    {"浙江大学","杭州电子科技大学","杭州师范大学","浙江财经学院","浙江传媒学院","浙江工商大学"},
    {"南昌大学","江西师范大学","江西农业大学","江西财经大学","华东交通大学","华东理工大学"},
    {"北京大学","清华大学","中国人民大学","北京交通大学","北京航空航天大学","北京理工大学"}};

    public List<String> setProvince(){
        List<String> provinces = new ArrayList<>();
        provinces.add("上海");
        provinces.add("浙江");
        provinces.add("江西");
        provinces.add("北京");
        return provinces;
    }

    public List<School> setSchoolList(){
        List<School> list = new ArrayList<>();
        for (int i = 0; i < schoollists.length; i++) {
            for (int j = 0; j < schoollists.length; j++) {
                School school = new School();
                school.setAreaName(provinces[i]);
                school.setSchoolName(schoollists[i][j]);
                list.add(school);
            }
        }
        return list;
    }

}
