package com.github.yanglw.multiitem.bean;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.yanglw.multiitem.R;

public class ChatRight2 extends ChatRight
{
    @Override
    public View getItemView(int position, View convertView, ViewGroup parent, LayoutInflater inflater, Object... objs)
    {
        View view = super.getItemView(position, convertView, parent, inflater);
        Holder holder = (Holder) view.getTag();
        holder.headLike.setImageResource(R.drawable.ic_launcher);

        return view;
    }
}