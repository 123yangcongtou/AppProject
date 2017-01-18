package lisc.appproject.shouyefragment.specialFragment.bean;

import java.util.List;

/**
 * 1.类描述
 * 2.创建人：lisc
 * 3.创建时间：2017/1/4 21:30
 * http://news-at.zhihu.com/api/4/sections
 */

public class Bean_Special {

    /**
     * description : 看别人的经历，理解自己的生活
     * id : 1
     * name : 深夜惊奇
     * thumbnail : http://pic3.zhimg.com/91125c9aebcab1c84f58ce4f8779551e.jpg
     */

    public List<DataBean> data;

    public static class DataBean {
        public String description;
        public int id;
        public String name;
        public String thumbnail;
    }
}
