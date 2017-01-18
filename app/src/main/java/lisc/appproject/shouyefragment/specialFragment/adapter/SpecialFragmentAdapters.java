package lisc.appproject.shouyefragment.specialFragment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.specialFragment.bean.Bean_Special;
import lisc.appproject.shouyefragment.weixinFragment.dapter.WeixinFragmentAdapter;
import lisc.lilibrary.imageloader.ImageUtils;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/5 22:52
 */
public class SpecialFragmentAdapters extends RecyclerView.Adapter<SpecialFragmentAdapters.MyItemHolder> {
    private final Context context;
    private final Bean_Special beanSpecial;
    private OnItemClickListener onItemClickListener;

    public SpecialFragmentAdapters(Context context, Bean_Special beanSpecial) {
        this.context = context;
        this.beanSpecial = beanSpecial;
    }

    @Override
    public MyItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyItemHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_special,parent,false),onItemClickListener);
    }

    @Override
    public void onBindViewHolder(MyItemHolder holder, int position) {
        holder.des.setText(beanSpecial.data.get(position).description);
        holder.name.setText(beanSpecial.data.get(position).name);
//        Glide.with(context)
//                .load(beanSpecial.data.get(position).thumbnail)
//                .into(holder.iv);
        ImageUtils.getInstance()
                .displayRoundImg(holder.iv,beanSpecial.data.get(position).thumbnail,8);
    }

    @Override
    public int getItemCount() {
        return beanSpecial.data.size();
    }

    class MyItemHolder extends RecyclerView.ViewHolder{
        private final TextView des;
        private final ImageView iv;
        private final TextView name;

        public MyItemHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.imageview_special);
            des = (TextView) itemView.findViewById(R.id.des);
            name = (TextView) itemView.findViewById(R.id.name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                        //如果用户点击了Item,就获返回当前点击Item的位置
                        listener.ItemClickListener(v,getPosition());
                    }
                }
            });
        }
    }
    //接口回调监听
    public interface OnItemClickListener{
        void ItemClickListener(View v,int position);
    }

    public void SetOnItemClick(OnItemClickListener listener){
        this.onItemClickListener=listener;
    }

}
