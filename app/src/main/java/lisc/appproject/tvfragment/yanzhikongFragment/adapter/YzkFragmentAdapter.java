package lisc.appproject.tvfragment.yanzhikongFragment.adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.newsFragment.dapter.BaseViewHolder;
import lisc.appproject.shouyefragment.newsFragment.dapter.viewholder.Type1Holder;
import lisc.appproject.tvfragment.yanzhikongFragment.bean.Bean_Yanzhikong;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/6 19:49
 */
public class YzkFragmentAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private final Context context;
    private final Bean_Yanzhikong beanYanzhikong;
    private static final int TYPE0=0;
    private static final int TYPE1=1;
    private final LayoutInflater inflater;

    public YzkFragmentAdapter(Context context, Bean_Yanzhikong beanYanzhikong) {
        this.context = context;
        this.beanYanzhikong = beanYanzhikong;
        inflater = LayoutInflater.from(context);
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
        switch (viewType){
            case 0:
                return new Type0ViewHolder(inflater
                        .inflate(R.layout.item_yzk_1,parent,false));
            case 1:
                return new Type1ViewHolder(inflater
                        .inflate(R.layout.item_yzk_2,parent,false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(context,beanYanzhikong.room.get(position));
    }

    @Override
    public int getItemCount() {
        return beanYanzhikong.room.size();
    }
}
