package lisc.appproject.tvfragment.atNowvideo.bean;

import com.google.gson.annotations.SerializedName;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/12 19:31
 */

public class Bean_video {

    /**
     * admins : []
     * announcement :
     * avatar : http://image.quanmin.tv/avatar/a936183502c851f5e11d583b885a6e68jpg?imageView2/2/w/300/
     * category_id : 4
     * category_name : 全民星秀
     * follow : 5
     * forbid_status : false
     * hidden : false
     * hot_word : []
     * intro :
     * is_star : false
     * last_play_at :
     * live : {"ws":{"def_mobile":"flv","def_pc":"flv","flv":{"5":{"name":"超清","src":"http://flv2.quanmin.tv/live/1315439.flv"},"main_mobile":5,"main_pc":5},"hls":{"5":{"name":"超清","src":"http://hls2.quanmin.tv/live/1315439.m3u8"},"main_mobile":5,"main_pc":5},"name":"bd","v":"1"}}
     * nick : 终究还爱你
     * no : 1315439
     * notice : []
     * play_at : 2017-01-10 16:23:37
     * play_status : false
     * police_forbid : false
     * rank_curr : []
     * rank_total : [{"avatar":"http://a.img.shouyintv.cn/781U101-normal","icon":"/static/images/lv/3.png?v=2","rank":3,"score":350,"send_nick":"一饮T忘忧","send_uid":"1315439"}]
     * rank_week : [{"avatar":"http://a.img.shouyintv.cn/781U101-normal","icon":"/static/images/lv/3.png?v=2","rank":3,"score":350,"send_nick":"一饮T忘忧","send_uid":"1315439"}]
     * room_lines : [{"def_mobile":"flv","def_pc":"flv","flv":{"5":{"name":"超清","src":"http://flv2.quanmin.tv/live/1315439.flv"},"main_mobile":5,"main_pc":5},"hls":{"5":{"name":"超清","src":"http://hls2.quanmin.tv/live/1315439.m3u8"},"main_mobile":5,"main_pc":5},"name":"bd","v":"1"},{"def_mobile":"flv","def_pc":"flv","flv":{"5":{"name":"超清","src":"http://flv.quanmin.tv/live/1315439.flv"},"main_mobile":5,"main_pc":5},"hls":{"5":{"name":"超清","src":"http://hls.quanmin.tv/live/1315439/playlist.m3u8"},"main_mobile":5,"main_pc":5},"name":"ws","v":"1"},{"def_mobile":"flv","def_pc":"flv","flv":{"5":{"name":"超清","src":"http://flv3.quanmin.tv/live/3766_1315439.flv"},"main_mobile":5,"main_pc":5},"hls":{"5":{"name":"超清","src":"http://hls3.quanmin.tv/live/3766_1315439.m3u8"},"main_mobile":5,"main_pc":5},"name":"tx","v":"1"},{"def_mobile":"flv","def_pc":"flv","flv":{"5":{"name":"超清","src":"http://liveal.quanmin.tv/live/1315439.flv"},"main_mobile":5,"main_pc":5},"hls":{"5":{"name":"超清","src":"http://liveal.quanmin.tv/live/1315439.m3u8"},"main_mobile":5,"main_pc":5},"name":"ali","v":"1"}]
     * screen : 0
     * slug :
     * status : 0
     * tab : []
     * thumb : http://image.quanmin.tv/love/71ca669aa4658cf9a9c35fe10e7dafbdjpg?imageView2/2/w/500/
     * title : 手机关机，可怜
     * uid : 1315439
     * video_quality :
     * view : 0
     * watermark : 1
     * watermark_pic :
     * weight : 0
     */

    public String announcement;
    public String avatar;
    public String category_id;
    public String category_name;
    public int follow;
    public boolean forbid_status;
    public boolean hidden;
    public String intro;
    public boolean is_star;
    public String last_play_at;
    public LiveBean live;
    public String nick;
    public int no;
    public String play_at;
    public boolean play_status;
    public boolean police_forbid;
    public int screen;
    public String slug;
    public String status;
    public String thumb;
    public String title;
    public int uid;
    public String video_quality;
    public int view;
    public int watermark;
    public String watermark_pic;
    public int weight;
    public java.util.List<?> admins;
    public java.util.List<?> hot_word;
    public java.util.List<?> notice;
    public java.util.List<?> rank_curr;
    public java.util.List<RankTotalBean> rank_total;
    public java.util.List<RankWeekBean> rank_week;
    public java.util.List<RoomLinesBean> room_lines;
    public java.util.List<?> tab;
    public class RankTotalBean{

    }
    public class RankWeekBean{}
    public class RoomLinesBean{}
    public class LiveBean{
        public Ws ws;


    }
    public class Ws{
        public Flv flv;

    }
    public class Flv{
        @SerializedName("5")
        public  Mdata five;
        @SerializedName("4")
        public  Mdata four;
        @SerializedName("3")
        public  Mdata three;

    }
    public class Mdata{
        public String name;
        public String src;


    }

}
