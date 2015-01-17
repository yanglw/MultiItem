package com.github.yanglw.multiitem.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.github.yanglw.multiitem.internal.MultiItemIF;

import java.util.List;

public class MultBaseAdapter extends MyBaseAdapter<MultiItemIF>
{
    private Object[] mObjs;
    private int mTypeCount;

    public MultBaseAdapter(Context context, List<MultiItemIF> list, int typeCount, Object... objs)
    {
        super(context, list);
        mObjs = objs;
        mTypeCount = typeCount;
    }

    @Override
    public int getItemViewType(int position)
    {
        return mList == null ? 0 : mList.get(position).getItemType();
    }

    @Override
    public int getViewTypeCount()
    {
        return mTypeCount;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        MultiItemIF bean = mList.get(position);
        return bean.getItemView(position, convertView, parent, mInflater, mObjs);
    }
}