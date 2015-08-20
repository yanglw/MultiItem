package com.github.yanglw.multiitem.bean;

import com.github.yanglw.multiitem.bean.delegate.ChatRight2Cell;
import com.github.yanglw.multiitem.library.internal.ItemDelegate;

public class ChatRight2 extends ChatRight {
    @Override
    public Class<? extends ItemDelegate> getItemDelegateClass() {
        return ChatRight2Cell.class;
    }
}