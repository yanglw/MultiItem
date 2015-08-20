package com.github.yanglw.multiitem.bean;

import com.github.yanglw.multiitem.bean.delegate.ChatLeftCell;
import com.github.yanglw.multiitem.library.internal.ItemDelegate;

public class ChatLeft extends Chat {
    @Override
    public Class<? extends ItemDelegate> getItemDelegateClass() {
        return ChatLeftCell.class;
    }
}
