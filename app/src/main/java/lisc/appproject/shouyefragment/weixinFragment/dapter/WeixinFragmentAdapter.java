package lisc.appproject.shouyefragment.weixinFragment.dapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.weixinFragment.bean.Bean_Weixin;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/5 14:52
 */
public class WeixinFragmentAdapter extends RecyclerView.Adapter<WeixinFragmentAdapter.MyWeixinHolder> {
    private final Context context;
    private final Bean_Weixin beanWeixin;
    private OnItemClickListener onItemClickListener;

    public WeixinFragmentAdapter(Context context, Bean_Weixin beanWeixin) {
        this.context = context;
        this.beanWeixin = beanWeixin;
    }


    @Override
    public MyWeixinHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyWeixinHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_weixin,parent,false),onItemClickListener);
    }

    @Override
    public void onBindViewHolder(MyWeixinHolder holder, int position) {
        holder.tv.setText(beanWeixin.newslist.get(position).title);
        Glide.with(context)
                .load(beanWeixin.newslist.get(position).picUrl)
                .placeholder(R.drawable.zx_jz)
                .error(R.drawable.zx_jz1)
                .into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return beanWeixin.newslist.size();
    }

    class MyWeixinHolder extends RecyclerView.ViewHolder{

        private final ImageView iv;
        private final TextView tv;

        public MyWeixinHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.item_weixin_iv);
            tv = (TextView) itemView.findViewById(R.id.item_weixin_tv);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                        //如果用户点击了Item,就获返回当前点击Item的位置
                        listener.onItemClick(v,getPosition());
                    }
                }
            });
        }
    }

    //接口回调监听
    public interface OnItemClickListener {
        void onItemClick(View v, int position);
    }

    /**
     * 设置条目点击事件方法
     *
     * @param onItemClickListener 回调接口
     */
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

}
