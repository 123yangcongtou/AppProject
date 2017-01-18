package lisc.appproject.shouyefragment.newsFragment.dapter.viewholder;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;
import lisc.appproject.shouyefragment.newsFragment.dapter.BaseViewHolder;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 21:07
 */

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.ItemViewHolder> {
    private final Context context;
    private final Bean_news bean_news;
    private OnItemClickListener onItemClickListener;

    public MyAdapter(Context context, Bean_news bean_news) {

        this.context = context;
        this.bean_news = bean_news;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_news_2_item,parent,false),onItemClickListener);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.setData(context,bean_news.stories.get(position));
    }

    @Override
    public int getItemCount() {
        return bean_news.stories.size();
    }


    class ItemViewHolder extends BaseViewHolder<Bean_news.StoriesBean> {
        private final CardView cardview;
        private ImageView iv;
        private TextView tv;

        public ItemViewHolder(View view, final OnItemClickListener listener) {
            super(view);
            iv = (ImageView) view.findViewById(R.id.item_iv);
            tv=  (TextView) view.findViewById(R.id.item_tv);
            cardview = (CardView) view.findViewById(R.id.cardview);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                        //
                        listener.ItenClilistener(v,getPosition());
                    }
                }
            });
        }
        @Override
        public void setData(Context context, Bean_news.StoriesBean storiesBean) {
            cardview.setRadius(20);//设置图片圆角的半径大小
            cardview.setContentPadding(8,8,8,8);//设置图片距离阴影大小
            tv.setText(storiesBean.title);
            Glide.with(context)
                    .load(storiesBean.images.get(0))
                    .into(iv);
        }
    }



        //接口回调
        public interface OnItemClickListener{
            void ItenClilistener(View v,int position);
        }

        public void setOnItemClickListener(OnItemClickListener listener){
            this.onItemClickListener=listener;
        }
}
