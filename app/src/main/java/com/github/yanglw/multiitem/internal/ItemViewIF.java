package com.github.yanglw.multiitem.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * <p>用以ListAdapter获取Item的View</p>
 * <p>Created by yanglw on 2015-01-14 14:31.</p>
 */
public interface ItemViewIF
{
    /** 当前对象所要显示的View */
    View getItemView(int position, View convertView, ViewGroup parent, LayoutInflater inflater, Object... objs);
}
