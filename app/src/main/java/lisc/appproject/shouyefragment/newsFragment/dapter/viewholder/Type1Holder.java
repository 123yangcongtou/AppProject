package lisc.appproject.shouyefragment.newsFragment.dapter.viewholder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;
import lisc.appproject.shouyefragment.newsFragment.dapter.BaseViewHolder;
import lisc.appproject.shouyefragment.newscontentActivity.view.NewsContentActivity;
import lisc.appproject.shouyefragment.specialcontentActivity.view.ContentActivity;
import lisc.appproject.shouyefragment.specialitemActivity.view.SpecialActivity;
import lisc.appproject.shouyefragment.weixinFragment.dapter.WeixinFragmentAdapter;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/4 15:48
 */

public class Type1Holder extends BaseViewHolder<Bean_news> {
    private final RecyclerView rv;
    private Context context;
    private Bean_news bean_news;

    public Type1Holder(View itemView) {
        super(itemView);
        rv = (RecyclerView) itemView.findViewById(R.id.item1_rv);
    }

    @Override
    public void setData(final Context context, final Bean_news bean_news) {
        this.context = context;
        this.bean_news = bean_news;
        rv.setLayoutManager(new LinearLayoutManager(context));
        MyAdapter adapter = new MyAdapter(context,bean_news);
        rv.setAdapter(adapter);
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void ItenClilistener(View v, int position) {
                Intent intent=new Intent(context,NewsContentActivity.class);
                intent.putExtra("id",bean_news.stories.get(position).id+"");
                context.startActivity(intent);
            }
        });

    }

}
