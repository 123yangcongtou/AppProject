package lisc.appproject.shouyefragment.newsFragment.bean;

import java.util.List;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/3 15:40
 * http://news-at.zhihu.com/api/4/news/latest
 */

public class Bean_news {

    /**
     * date : 20170103
     * stories : [{"ga_prefix":"010313","id":9118033,"images":["http://pic4.zhimg.com/26559413c8267d5077ba1a75985c1f8b.jpg"],"title":"为什么任意门应该做成球形？","type":0},{"ga_prefix":"010312","id":9116405,"images":["http://pic1.zhimg.com/3222f39add29ec446da0a23b20c72200.jpg"],"title":"大误 · 抽 SSR 是玄学","type":0},{"ga_prefix":"010311","id":9115115,"images":["http://pic3.zhimg.com/88dfefc31c598621126947d6aaed416a.jpg"],"title":"孩子自尊心最脆弱的部分，别让最爱他们的家人伤害","type":0},{"ga_prefix":"010310","id":9115328,"images":["http://pic1.zhimg.com/827de756a51a5fddc15f1d5727822e98.jpg"],"title":"手机支付的未来，是 NFC 还是二维码？","type":0},{"ga_prefix":"010309","id":9115215,"images":["http://pic3.zhimg.com/9ac068d081db9a1fabb3c715d28afd82.jpg"],"title":"如果有一个「快乐按钮」，一摁就会有无与伦比的满足感","type":0},{"ga_prefix":"010308","id":9117233,"images":["http://pic2.zhimg.com/569beaf58b2170a20a2106d0b4689e21.jpg"],"title":"企业文化到底是什么呢？","type":0},{"ga_prefix":"010307","id":9112602,"images":["http://pic2.zhimg.com/ab771f4069b58780abfbe2d3a3fd28c5.jpg"],"multipic":true,"title":"新的一年，试试这些简单营养的西式早餐","type":0},{"ga_prefix":"010307","id":9117424,"images":["http://pic1.zhimg.com/14883948fc305c7413dc877da9ff5dbc.jpg"],"title":"先别急着掏钱，看起来神奇的洗脸刷不一定适合你","type":0},{"ga_prefix":"010307","id":9117444,"images":["http://pic3.zhimg.com/ecce3489d8f8ea124948e15033f20822.jpg"],"title":"如何在无领导小组面试中脱颖而出？","type":0},{"ga_prefix":"010306","id":9108463,"images":["http://pic2.zhimg.com/3f95089e27191e0535bd03921e0e0df1.jpg"],"title":"瞎扯 · 如何正确地吐槽","type":0}]
     * top_stories : [{"ga_prefix":"010307","id":9117444,"image":"http://pic2.zhimg.com/07823621d12a90c16acb51caa291f3b9.jpg","title":"如何在无领导小组面试中脱颖而出？","type":0},{"ga_prefix":"010310","id":9115328,"image":"http://pic1.zhimg.com/ab88987a9e0af72a768f9c68bbfdb3c4.jpg","title":"手机支付的未来，是 NFC 还是二维码？","type":0},{"ga_prefix":"010307","id":9112602,"image":"http://pic1.zhimg.com/a9eb2560fd255dc4e848131ebf037da4.jpg","title":"新的一年，试试这些简单营养的西式早餐","type":0},{"ga_prefix":"010219","id":9116372,"image":"http://pic2.zhimg.com/69666b4a7f0d6accbd9a2e641de8bde9.jpg","title":"单身独居，越来越多人打算就这样过下去","type":0},{"ga_prefix":"010217","id":9116662,"image":"http://pic4.zhimg.com/f619e4420ac09ab6b755892d73d35f77.jpg","title":"知乎好问题 · 思维和语言的关系是什么？","type":0}]
     */

    public String date;
    /**
     * ga_prefix : 010313
     * id : 9118033
     * images : ["http://pic4.zhimg.com/26559413c8267d5077ba1a75985c1f8b.jpg"]
     * title : 为什么任意门应该做成球形？
     * type : 0
     */

    public List<StoriesBean> stories;
    /**
     * ga_prefix : 010307
     * id : 9117444
     * image : http://pic2.zhimg.com/07823621d12a90c16acb51caa291f3b9.jpg
     * title : 如何在无领导小组面试中脱颖而出？
     * type : 0
     */

    public List<TopStoriesBean> top_stories;

    public static class StoriesBean {
        public String ga_prefix;
        public int id;
        public String title;
        public int type;
        public List<String> images;
    }

    public static class TopStoriesBean {
        public String ga_prefix;
        public int id;
        public String image;
        public String title;
        public int type;
    }
}
