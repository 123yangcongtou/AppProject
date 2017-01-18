package lisc.appproject.shouyefragment.specialitemActivity.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import lisc.appproject.R;
import lisc.appproject.shouyefragment.specialitemActivity.adapter.SpecialAdapter;
import lisc.appproject.shouyefragment.specialitemActivity.bean.Bean_Special_item;
import lisc.appproject.shouyefragment.specialitemActivity.presenter.Presenter_Special_item;
import lisc.appproject.shouyefragment.specialcontentActivity.view.ContentActivity;
import lisc.lilibrary.mvp.MvpActivity;
import lisc.lilibrary.mvp.ibase.IBaseView;

public class SpecialActivity extends MvpActivity<Presenter_Special_item> implements IView_Special_item {

    private RecyclerView rv;

    @Override
    protected Presenter_Special_item createPresenter(IBaseView view) {
        return new Presenter_Special_item(this);
    }

    @Override
    public void onSpecialItemSuccess(final Bean_Special_item specialItem) {
        rv = (RecyclerView) findViewById(R.id.recycleview_special_item);
        SpecialAdapter adapter = new SpecialAdapter(this,specialItem);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter.setContentClickListener(new SpecialAdapter.OnContentClickListener() {
            @Override
            public void OnContentListener(View v, int position) {
                Intent intent=new Intent(SpecialActivity.this,ContentActivity.class);
                intent.putExtra("id",specialItem.stories.get(position).id+"");
                startActivity(intent);
            }
        });

    }

    @Override
    public void onSpecialItemFail() {
        Toast.makeText(this, "Fail-----", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int bindLayout() {
        return R.layout.activity_special;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        Intent intent=getIntent();
        String id = intent.getStringExtra("id");
        mPresenter.ondata(id);

    }


    @Override
    public void initVariables() {

    }
}
