package com.example.enrollscoreactivity.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.ColorInt;

import com.example.enrollscoreactivity.R;
import com.example.enrollscoreactivity.bean.MajorRecruit;

import java.util.List;

public  class Major_recruitAdapter extends BaseAdapter {
    private Context context;
    private List<MajorRecruit> majorRecruits;

    public Major_recruitAdapter(Context context, List<MajorRecruit> majorRecruits) {
        this.context = context;
        this.majorRecruits = majorRecruits;
    }

    @Override
    public int getCount() {
        return majorRecruits.size();
    }

    @Override
    public Object getItem(int i) {
        return majorRecruits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if(convertView == null){
            convertView = LayoutInflater.from(this.context).inflate(
                    R.layout.list_item_major_recruit,null,false);
            if(position%2==0){
                convertView.setBackgroundColor(Color.BLACK);//设置单行背景颜色为黑色
                //设置相对应的文字的字体颜色为白色
                TextView textView1 = (TextView) convertView.findViewById(R.id.major) ;
                textView1.setTextColor(Color.parseColor("#FFFFFF"));

                TextView textView2 = (TextView) convertView.findViewById(R.id.category) ;
                textView2.setTextColor(Color.parseColor("#FFFFFF"));

                TextView textView3 = (TextView) convertView.findViewById(R.id.batch) ;
                textView3.setTextColor(Color.parseColor("#FFFFFF"));

                TextView textView4 = (TextView) convertView.findViewById(R.id.averageScore) ;
                textView4.setTextColor(Color.parseColor("#FFFFFF"));

                TextView textView5 = (TextView) convertView.findViewById(R.id.maxScore) ;
                textView5.setTextColor(Color.parseColor("#FFFFFF"));


            }else{
                convertView.setBackgroundColor(Color.argb(51,170,187,204));
            }
            holder.major = (TextView) convertView.findViewById(R.id.major);
            holder.category = (TextView) convertView.findViewById(R.id.category);
            holder.batch = (TextView) convertView.findViewById(R.id.batch);
            holder.averageScore = (TextView) convertView.findViewById(R.id.averageScore);
            holder.maxScore = (TextView) convertView.findViewById(R.id.maxScore);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.major.setText(majorRecruits.get(position).getMajorName());
        holder.category.setText(majorRecruits.get(position).getCategoryName());
        holder.batch.setText(majorRecruits.get(position).getBatchName());
        holder.averageScore.setText(majorRecruits.get(position).getmReruitAScore()+"");
        holder.maxScore.setText(majorRecruits.get(position).getmReruitHScore()+"");
        return convertView;

    }

    public final class ViewHolder{
        public TextView major;
        public TextView category;
        public TextView batch;
        public TextView averageScore;
        public TextView maxScore;
    }
}
