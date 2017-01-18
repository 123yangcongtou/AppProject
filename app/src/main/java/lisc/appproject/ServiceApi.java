package lisc.appproject;

import java.util.List;

import lisc.appproject.shouyefragment.newsFragment.bean.Bean_news;
import lisc.appproject.shouyefragment.newscontentActivity.bean.Bean_News_Content;
import lisc.appproject.shouyefragment.specialFragment.bean.Bean_Special;
import lisc.appproject.shouyefragment.specialcontentActivity.bean.Bean_Special_Content;
import lisc.appproject.shouyefragment.specialitemActivity.bean.Bean_Special_item;
import lisc.appproject.shouyefragment.weixinFragment.bean.Bean_Weixin;
import lisc.appproject.tvActivityTitle.bean.Bean_Title;
import lisc.appproject.tvfragment.atNowvideo.bean.Bean_video;
import lisc.appproject.tvfragment.otherFragment.bean.Bean_other;
import lisc.appproject.tvfragment.yanzhikongFragment.bean.Bean_Yanzhikong;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;


/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 16:04
 * http://news-at.zhihu.com/api/4/news/latest
 * http://news-at.zhihu.com/api/4/sections
 * http://api.tianapi.com/wxnew?key=09691a96d0c41d30215a888632e1b96e&num=10&page=1
 * http://www.quanmin.tv/json/app/index/category/info-android.json?v=2.2.4&os=1&ver=4
 * http://www.quanmin.tv/json/app/index/recommend/list-android.json?11241742&v=2.2.4&os=1&ver=4
 * http://news-at.zhihu.com/api/4/section/1
 * http://news-at.zhihu.com/api/4/news/9130653
 * http://www.quanmin.tv/json%2Fcategories%2Flol%2Flist.json?11211639&os=1&v=2.2.4&os=1&ver=4
 * http://www.quanmin.tv/json/rooms/8962848/info1.json?11241653&v=2.2.4&os=1&ver=4
 */

public interface ServiceApi {
    //日报
    @GET("latest")
    Observable<Bean_news> newsBean();

    //日报详情
    @GET("{id}")
    Observable<Bean_News_Content> contentNewsBean(@Path("id") String id);

    //专栏
    @GET("sections")
    Observable<Bean_Special> specialBean();

    //专栏条目
    @GET("{id}")
    Observable<Bean_Special_item> itemSpecialBean(@Path("id") String id);

    //专栏详情
    @GET("{id}")
    Observable<Bean_Special_Content> contentSpecialBean(@Path("id") String id);


   //微信
    @GET("wxnew")
    Observable<Bean_Weixin> weixinBean(@Query("key") String key
            , @Query("num") String num
            , @Query("page") int page);

    //全民TV
    @GET("info-android.json?v=2.2.4&os=1&ver=4")
    Observable<List<Bean_Title>> titleBean();

    //颜值控
    @GET("list-android.json?11241742&v=2.2.4&os=1&ver=4")
    Observable<Bean_Yanzhikong> yanzhikongBean();

    //其余
    @GET("json%2Fcategories%{name}%2Flist.json?11211639&os=1&v=2.2.4&os=1&ver=4")
    Observable<Bean_other> otherBean(@Path("name") String name);

    //直播
    @GET("{uid}/info1.json?11241653&v=2.2.4&os=1&ver=4")
    Observable<Bean_video> videoBean(@Path("uid") String uid);



}
