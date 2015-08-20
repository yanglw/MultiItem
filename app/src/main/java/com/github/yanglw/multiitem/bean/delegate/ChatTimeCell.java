package com.github.yanglw.multiitem.bean.delegate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.yanglw.multiitem.R;
import com.github.yanglw.multiitem.bean.ChatTime;
import com.github.yanglw.multiitem.library.internal.ItemDelegate;

public class ChatTimeCell implements ItemDelegate {
    @Override
    public int getItemType() {
        return 0;
    }

    @Override
    public View newView(LayoutInflater inflater, ViewGroup parent, int position, Object... objs) {
        View convertView = inflater.inflate(R.layout.i_chat_time, parent, false);
        TextView textView = (TextView) convertView.findViewById(R.id.i_lv_chat_time_tv_time);
        convertView.setTag(textView);
        return convertView;
    }

    @Override
    public void bindView(View convertView, int position, Object object, Object... objs) {
        ChatTime chatTime = (ChatTime) object;
        TextView textView = (TextView) convertView.getTag();
        textView.setText(chatTime.text);
    }
}
