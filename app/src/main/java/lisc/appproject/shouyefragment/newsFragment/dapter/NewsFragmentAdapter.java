package lisc.appproject.shouyefragment.newsFragment.dapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import lisc.appproject.R;
import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;
import lisc.appproject.shouyefragment.newsFragment.dapter.viewholder.Type0Holder;
import lisc.appproject.shouyefragment.newsFragment.dapter.viewholder.Type1Holder;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 21:00
 */
public class NewsFragmentAdapter extends RecyclerView.Adapter<BaseViewHolder>{
    private final Context context;
    private final Bean_news beanNews;
    private final LayoutInflater mInflater;
    private static final int TYPE0 = 0;
    private static final int TYPE1 = 1;
    public NewsFragmentAdapter(Context context, Bean_news beanNews) {

        this.context = context;
        this.beanNews = beanNews;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemViewType(int position) {
        switch (position){
            case 0:
                return TYPE0;
            case 1:
                return TYPE1;
        }
        return TYPE1;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE0:
                return new Type0Holder(mInflater.inflate(
                        R.layout.item_news_1, parent, false));
            case TYPE1:
                return new Type1Holder(mInflater.inflate(
                        R.layout.item_news_2, parent, false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(context,beanNews);
    }

    @Override
    public int getItemCount() {
//        return beanNews.stories.size();
        return  2;
    }
}
