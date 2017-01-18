package lisc.appproject.shouyefragment.newsFragment.dapter.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import cn.bingoogolapple.bgabanner.BGABanner;
import lisc.appproject.R;
import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;
import lisc.appproject.shouyefragment.newsFragment.dapter.BaseViewHolder;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 21:30
 */
public class Type0Holder extends BaseViewHolder<Bean_news> {

    private final BGABanner viewpager;

    public Type0Holder(View itemView) {
        super(itemView);
        viewpager = (BGABanner) itemView.findViewById(R.id.banner_viewpager);
    }

    @Override
    public void setData(final Context context, Bean_news beanNews) {
        List<String> list_img=new ArrayList<>();
        List<String> list_title=new ArrayList<>();
        for (int i = 0; i < beanNews.top_stories.size(); i++) {
            list_img.add(beanNews.top_stories.get(i).image);
            list_title.add(beanNews.top_stories.get(i).title);
        }
        viewpager.setAdapter(new BGABanner.Adapter() {
            @Override
            public void fillBannerItem(BGABanner banner, View itemView, Object model, int position) {
                Glide.with(context)
                        .load(model)
                        .placeholder(R.drawable.holder)
                        .error(R.drawable.holder)
                        .into((ImageView) itemView);
            }
        });
        viewpager.setData(list_img,list_title);
    }
}
