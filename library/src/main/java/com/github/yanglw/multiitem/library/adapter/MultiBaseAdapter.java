package com.github.yanglw.multiitem.library.adapter;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;

import com.github.yanglw.multiitem.library.internal.ItemDelegate;
import com.github.yanglw.multiitem.library.internal.ItemVisualIF;

import java.util.List;

public class MultiBaseAdapter extends MyBaseAdapter<ItemVisualIF> {
    protected int mTypeCount;
    private ArrayMap<Class<? extends ItemDelegate>, ItemDelegate> mDelegateCacheMap;

    public MultiBaseAdapter(Context context, List<ItemVisualIF> list, int typeCount, Object... objs) {
        super(context, list, objs);
        mTypeCount = typeCount < 1 ? 1 : typeCount;
        mDelegateCacheMap = new ArrayMap<>(mTypeCount);
    }

    @Override
    public int getViewTypeCount() {
        return mTypeCount;
    }

    @Override
    public int getItemViewType(int position) {
        if (mTypeCount == 1) {
            return 0;
        }

        ItemVisualIF data = mList.get(position);
        ItemDelegate delegate = getDelegate(data.getItemDelegateClass());
        return delegate.getItemType();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemVisualIF data = mList.get(position);
        ItemDelegate delegate = getDelegate(data.getItemDelegateClass());
        if (convertView == null) {
            convertView = delegate.newView(mInflater, parent, position, mObjs);
        }
        delegate.bindView(convertView, position, data, mObjs);
        return convertView;
    }

    private ItemDelegate getDelegate(Class<? extends ItemDelegate> clz) {
        if (mDelegateCacheMap.containsKey(clz)) {
            return mDelegateCacheMap.get(clz);
        } else {
            ItemDelegate delegate = createDelegate(clz);
            mDelegateCacheMap.put(clz, delegate);
            return delegate;
        }
    }

    private ItemDelegate createDelegate(Class<? extends ItemDelegate> clz) {
        try {
            return clz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("create delegate object fail", e);
        }
    }
}