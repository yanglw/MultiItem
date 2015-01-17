package com.github.yanglw.multiitem.bean;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.yanglw.multiitem.R;

public class ChatLeft extends Chat
{
    @Override
    public int getItemType()
    {
        return 1;
    }

    @Override
    public View getItemView(int position, View convertView, ViewGroup parent, LayoutInflater inflater, Object... objs)
    {
        Holder holder;
        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.i_chat_l, parent, false);
            holder = new Holder();
            holder.headLike = (ImageView) convertView.findViewById(R.id.i_lv_chat_l_iv_headlike);
            holder.text = (TextView) convertView.findViewById(R.id.i_lv_chat_l_tv_text);
            holder.time = (TextView) convertView.findViewById(R.id.i_lv_chat_l_tv_time);

            convertView.setTag(holder);
        }
        else
        {
            holder = (Holder) convertView.getTag();
        }

        holder.text.setText(text);
        holder.time.setText(time);
        holder.headLike.setImageResource(R.drawable.renma);

        return convertView;
    }

    protected class Holder
    {
        public TextView text, time;
        public ImageView headLike;
    }
}
