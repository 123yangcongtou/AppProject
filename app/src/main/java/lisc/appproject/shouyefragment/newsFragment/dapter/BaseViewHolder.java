package lisc.appproject.shouyefragment.newsFragment.dapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 21:04
 */
public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {
    public BaseViewHolder(View itemView) {
        super(itemView);
    }

//    public abstract void setData(Context context, T t,int i);
    public abstract void setData(Context context, T t);
}
