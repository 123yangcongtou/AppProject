package lisc.appproject.tvfragment.otherFragment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pili.pldroid.player.widget.PLVideoView;

import lisc.appproject.R;
import lisc.appproject.tvfragment.otherFragment.bean.Bean_other;
import lisc.lilibrary.imageloader.ImageUtils;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/11 18:59
 */
public class OtherAdapter extends RecyclerView.Adapter<OtherAdapter.MyOtherViewHolder> {
    private final Context context;
    private final Bean_other beanOther;
    private OnOtheritemListener otheritemListener;

    public OtherAdapter(Context context, Bean_other beanOther) {
        this.context = context;
        this.beanOther = beanOther;
    }


    @Override
    public MyOtherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyOtherViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.fragment_other_item,parent,false),otheritemListener);
    }

    @Override
    public void onBindViewHolder(MyOtherViewHolder holder, int position) {
        ImageUtils.getInstance().displayRoundImg(holder.thumb,beanOther.data.get(position).thumb);
        ImageUtils.getInstance().displayCircleImg(holder.avatar,beanOther.data.get(position).avatar);
        holder.nick.setText(beanOther.data.get(position).nick);
        holder.title.setText(beanOther.data.get(position).title);

    }

    @Override
    public int getItemCount() {
        return beanOther.data.size();
    }

    class MyOtherViewHolder extends RecyclerView.ViewHolder{

        ImageView thumb;
        ImageView avatar;
        TextView nick;
        TextView title;
        private final PLVideoView video;

        public MyOtherViewHolder(View itemView, final OnOtheritemListener listener) {
            super(itemView);
            thumb = (ImageView) itemView.findViewById(R.id.other_thumb);
            video = (PLVideoView) itemView.findViewById(R.id.videoview);
            avatar=  (ImageView) itemView.findViewById(R.id.other_avatar);
            nick = (TextView) itemView.findViewById(R.id.other_nick);
            title = (TextView) itemView.findViewById(R.id.other_title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null){
                       listener.setOtheritemListener(v,getPosition(),thumb,video);
                    }
                }
            });
        }
    }

    //接口回调
    public interface OnOtheritemListener{
        void setOtheritemListener(View v,int position,ImageView thumb,PLVideoView video);
    }

    public void setOnOtheritemlistener(OnOtheritemListener listener){
        this.otheritemListener=listener;
    }
}
