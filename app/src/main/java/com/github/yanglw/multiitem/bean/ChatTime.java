package com.github.yanglw.multiitem.bean;

import com.github.yanglw.multiitem.bean.delegate.ChatTimeCell;
import com.github.yanglw.multiitem.library.internal.ItemDelegate;

public class ChatTime extends MultiBean {
    @Override
    public Class<? extends ItemDelegate> getItemDelegateClass() {
        return ChatTimeCell.class;
    }
}