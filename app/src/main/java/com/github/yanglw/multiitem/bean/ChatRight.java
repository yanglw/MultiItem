package com.github.yanglw.multiitem.bean;

import com.github.yanglw.multiitem.bean.delegate.ChatRightCell;
import com.github.yanglw.multiitem.library.internal.ItemDelegate;

public class ChatRight extends Chat {
    @Override
    public Class<? extends ItemDelegate> getItemDelegateClass() {
        return ChatRightCell.class;
    }
}
