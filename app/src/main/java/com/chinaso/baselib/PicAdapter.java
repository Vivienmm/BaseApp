package com.chinaso.baselib;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chinaso.baselibrary.utils.GlideApp;

import java.util.List;

/**
 * @auther Su Yuewen
 * @time 2019/4/17 10:58.
 */

public class PicAdapter  extends BaseQuickAdapter<PicEntity, BaseViewHolder> {
    public PicAdapter(int layoutResId, @Nullable List<PicEntity> data) {
        super(layoutResId, data);
    }
    @Override
    protected void convert(BaseViewHolder helper, PicEntity item) {
        helper.setText(R.id.list_pic_title_tv, item.getTitle());
        helper.setText(R.id.list_pic_location_tv, item.getTitle());
        helper.setText(R.id.list_pic_time_tv, item.getDate().substring(0, 10));
        GlideApp.with(mContext).load(item.getPicUrl()).placeholder(R.mipmap.ic_launcher)
                .into((ImageView) helper.getView(R.id.list_pic_img));
    }
}
