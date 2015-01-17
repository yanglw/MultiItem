package com.github.yanglw.multiitem;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import com.github.yanglw.multiitem.adapter.MultBaseAdapter;
import com.github.yanglw.multiitem.bean.ChatLeft;
import com.github.yanglw.multiitem.bean.ChatRight;
import com.github.yanglw.multiitem.bean.ChatRight2;
import com.github.yanglw.multiitem.bean.ChatTime;
import com.github.yanglw.multiitem.internal.MultiItemIF;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity
{
    private ArrayList<MultiItemIF> mList;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.a_main);

        setData();
        ListView listView = (ListView) findViewById(R.id.a_main_lv_lv);
        listView.setAdapter(new MultBaseAdapter(getApplicationContext(), mList, 3));
    }

    private void setData()
    {
        String[] texts = {"有大吗？", "有！你呢？", "我也有。上吧。", "..战斗开始了..", "打啊！你放大啊！", "你tm咋不放大呢？留大抢人头那！Cao的。你个菜b！"};
        int[] types = {1, 0, 1, 2, 1, 0};
        mList = new ArrayList<MultiItemIF>();
        for (int j = 0; j < 5; j++)
        {
            ChatTime time = new ChatTime();
            time.text = "第" + (j + 1) + "次";
            mList.add(time);

            if (j != 0)
            {
                ChatRight2 chatRight2 = new ChatRight2();
                chatRight2.text = "这才几秒，又来了一次，你们两个的大CD好短哇";
                mList.add(chatRight2);
            }

            for (int i = 0; i < texts.length; i++)
            {
                if (types[i] == 2)
                {
                    time = new ChatTime();
                    time.text = texts[i];
                    mList.add(time);
                    continue;
                }

                if (types[i] == 0)
                {
                    ChatLeft chat = new ChatLeft();
                    chat.text = texts[i];
                    chat.time = "32'" + j + i + "\"";
                    mList.add(chat);
                    continue;
                }

                ChatRight chat = new ChatRight();
                chat.text = texts[i];
                chat.time = "32'" + j + i + "\"";
                mList.add(chat);
            }
        }
    }
}
