package lisc.appproject.tvfragment.yanzhikongFragment.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Arrays;

import cn.bingoogolapple.bgabanner.BGABanner;
import lisc.appproject.R;
import lisc.appproject.shouyefragment.newsFragment.dapter.BaseViewHolder;
import lisc.appproject.tvfragment.yanzhikongFragment.bean.Bean_Yanzhikong;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 20:00
 */
public class Type0ViewHolder extends BaseViewHolder<Bean_Yanzhikong.RoomBean> {

    private final BGABanner banner;

    public Type0ViewHolder(View itemView) {
        super(itemView);
        banner = (BGABanner) itemView.findViewById(R.id.banner_yzk);
    }

    @Override
    public void setData(final Context context, Bean_Yanzhikong.RoomBean roomBean) {
        banner.setAdapter(new BGABanner.Adapter() {
            @Override
            public void fillBannerItem(BGABanner banner, View itemView, Object model, int position) {
                Glide.with(context)
                        .load(model)
                        .error(R.drawable.zx_jz)
                        .placeholder(R.drawable.zx_jz1)
                        .into((ImageView) itemView);
            }
        });

        banner.setData(Arrays.asList(R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
                R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j)
                ,Arrays.asList("1111111","222222","333333","4444444","555555"
                        ,"666666","77777","888888","999999","0000000"));
    }

}
