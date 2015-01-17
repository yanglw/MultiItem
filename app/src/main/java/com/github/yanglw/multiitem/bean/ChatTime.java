package com.github.yanglw.multiitem.bean;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.yanglw.multiitem.R;

public class ChatTime extends MultBean
{
    @Override
    public int getItemType()
    {
        return 0;
    }

    @Override
    public View getItemView(int position, View convertView, ViewGroup parent, LayoutInflater inflater, Object... objs)
    {
        TextView textView;
        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.i_chat_time, parent, false);
            textView = (TextView) convertView.findViewById(R.id.i_lv_chat_time_tv_time);
            convertView.setTag(textView);
        }
        else
        {
            textView = (TextView) convertView.getTag();
        }

        textView.setText(text);

        return convertView;
    }
}