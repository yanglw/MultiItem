package com.github.yanglw.multiitem.library.internal;

/**
 * <p>
 * 用于标记当前数据拥有显示视图。
 * </p>
 * Created by yanglw on 2015-08-07.
 */
public interface ItemVisualIF {
    Class<? extends ItemDelegate> getItemDelegateClass();
}
