package com.github.yanglw.multiitem.bean.delegate;

import android.view.View;

import com.github.yanglw.multiitem.R;

public class ChatRight2Cell extends ChatRightCell {
    @Override
    public void bindView(View convertView, int position, Object data, Object... objs) {
        super.bindView(convertView, position, data, objs);
        Holder holder = (Holder) convertView.getTag();
        holder.headLike.setImageResource(R.drawable.ic_launcher);
    }
}
