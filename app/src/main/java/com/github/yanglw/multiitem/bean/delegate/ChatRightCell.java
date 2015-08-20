package com.github.yanglw.multiitem.bean.delegate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.yanglw.multiitem.R;
import com.github.yanglw.multiitem.bean.ChatRight;
import com.github.yanglw.multiitem.library.internal.ItemDelegate;

public class ChatRightCell implements ItemDelegate {
    @Override
    public int getItemType() {
        return 2;
    }

    @Override
    public View newView(LayoutInflater inflater, ViewGroup parent, int position, Object... objs) {
        Holder holder = new Holder();
        View convertView = inflater.inflate(R.layout.i_chat_r, parent, false);
        holder.headLike = (ImageView) convertView.findViewById(R.id.i_lv_chat_r_iv_headlike);
        holder.text = (TextView) convertView.findViewById(R.id.i_lv_chat_r_tv_text);
        holder.time = (TextView) convertView.findViewById(R.id.i_lv_chat_r_tv_time);

        convertView.setTag(holder);
        return convertView;
    }

    @Override
    public void bindView(View convertView, int position, Object data, Object... objs) {
        ChatRight chatRight = (ChatRight) data;
        Holder holder = (Holder) convertView.getTag();
        holder.text.setText(chatRight.text);
        holder.time.setText(chatRight.time);
        holder.headLike.setImageResource(R.drawable.xiaohei);
    }

    protected static class Holder {
        public TextView text, time;
        public ImageView headLike;
    }
}
