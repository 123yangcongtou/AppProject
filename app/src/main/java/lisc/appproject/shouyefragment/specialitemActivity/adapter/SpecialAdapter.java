package lisc.appproject.shouyefragment.specialitemActivity.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.specialitemActivity.bean.Bean_Special_item;
import lisc.lilibrary.imageloader.ImageUtils;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/9 15:42
 */
public class SpecialAdapter extends RecyclerView.Adapter<SpecialAdapter.MyViewHolder> {


    private final Context context;
    private final Bean_Special_item specialItem;
    private OnContentClickListener contentClickListener;


    public SpecialAdapter(Context context, Bean_Special_item specialItem) {
        this.context = context;
        this.specialItem = specialItem;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.item_special_item,parent,false),contentClickListener);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(specialItem.stories.get(position).title);
        ImageUtils.getInstance().displayRoundImg(holder.iv
                ,specialItem.stories.get(position).images.get(0));
    }

    @Override
    public int getItemCount() {
        return specialItem.stories.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private final ImageView iv;
        private final TextView tv;

        public MyViewHolder(View itemView, final OnContentClickListener listener) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.item_special_iv);
            tv = (TextView) itemView.findViewById(R.id.item_special_tv);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                        //如果用户点击了Item,就获返回当前点击Item的位置
                        listener.OnContentListener(v,getPosition());
                    }
                }
            });
        }
    }
    //接口回调
    public interface OnContentClickListener{
        void OnContentListener(View v,int position);
    }

    public void setContentClickListener(OnContentClickListener listener){
        this.contentClickListener=listener;
    }
}
