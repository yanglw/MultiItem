package com.github.yanglw.multiitem.internal;

/**
 * ListView多类型Item接口
 * <p/>
 * Created by yanglw on 2014/7/18 018.
 */
public interface MultiItemIF  extends ItemViewIF
{
    /**获取当前Item的类型。
     *
     * @return type
     *
     * @see android.widget.Adapter#getItemViewType(int)
     */
    int getItemType();
}
