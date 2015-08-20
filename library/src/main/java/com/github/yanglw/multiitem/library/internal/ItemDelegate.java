package com.github.yanglw.multiitem.library.internal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * <p>
 * ListView 多类型 item 接口。
 * </p>
 * Created by yanglw on 2015-08-07.
 */
public interface ItemDelegate {
    /**
     * 创建当前 item 的视图。
     *
     * @param inflater
     *         用于通过布局文件创建视图。
     * @param parent
     *         AbsListView 。
     * @param position
     *         当前的位置。
     * @param objs
     *         需要当前视图处理的其他内容，例如单击事件。
     *
     * @return 当前 item 的视图。
     *
     * @see android.widget.Adapter#getView(int, View, ViewGroup)
     */
    View newView(LayoutInflater inflater, ViewGroup parent, int position, Object... objs);

    /**
     * 将数据绑定到视图上。
     *
     * @param view
     *         当前即将要展示的视图。
     * @param position
     *         当前的位置。
     * @param data
     *         当前对应的 Item 数据。
     * @param objs
     *         需要当前视图处理的其他内容，例如单击事件。
     */
    void bindView(View view, int position, Object data, Object... objs);

    /**
     * 获取当前 item 的类型。
     *
     * @return type
     *
     * @see android.widget.Adapter#getItemViewType(int)
     */
    int getItemType();
}
