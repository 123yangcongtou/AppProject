package lisc.appproject.tvfragment.yanzhikongFragment.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.newsFragment.dapter.BaseViewHolder;
import lisc.appproject.tvfragment.yanzhikongFragment.bean.Bean_Yanzhikong;
import lisc.lilibrary.imageloader.ImageUtils;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 20:00
 */
public class Type1ViewHolder extends BaseViewHolder<Bean_Yanzhikong.RoomBean> {

    private final TextView tv;
    private final RecyclerView rv;


    public Type1ViewHolder(View itemView) {
        super(itemView);
        tv = (TextView) itemView.findViewById(R.id.textview_yzk_item);
        rv = (RecyclerView) itemView.findViewById(R.id.recycleview_yzk_item);
    }

    @Override
    public void setData(final Context context, final Bean_Yanzhikong.RoomBean roomBean) {
        tv.setText(roomBean.name);
        rv.setLayoutManager(new GridLayoutManager(context,2));
        rv.setAdapter(new RecyclerView.Adapter<ItenHolder>() {

            @Override
            public ItenHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ItenHolder(LayoutInflater.from(context)
                        .inflate(R.layout.item_yzk_item,parent,false));
            }

            @Override
            public void onBindViewHolder(ItenHolder holder, int position) {
                holder.setData(context,roomBean.list.get(position));
            }

            @Override
            public int getItemCount() {
                return roomBean.list.size();
            }
        });
    }

    class ItenHolder extends BaseViewHolder<Bean_Yanzhikong.RoomBean.ListBean>{
        private final ImageView thumb;
        private final ImageView avatar;
        private final TextView nick;
        private final TextView title;

        public ItenHolder(View itemView) {
            super(itemView);
            thumb = (ImageView) itemView.findViewById(R.id.thumb);
            avatar = (ImageView) itemView.findViewById(R.id.avatar);
            nick = (TextView) itemView.findViewById(R.id.nick);
            title = (TextView) itemView.findViewById(R.id.yzk_title);
        }

        @Override
        public void setData(Context context, Bean_Yanzhikong.RoomBean.ListBean listBean) {
            ImageUtils.getInstance().displayRoundImg(thumb,listBean.thumb);
            ImageUtils.getInstance().displayCircleImg(avatar,listBean.avatar);

//            Glide.with(context)
//                    .load(listBean.thumb)
//                    .into(thumb);
//            Glide.with(context)
//                    .load(listBean.avatar)
//                    .into(avatar);
            nick.setText(listBean.nick);
            title.setText(listBean.title);
        }
    }
}









