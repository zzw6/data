package com.javalei.data.entity;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Html;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

import java.util.List;

/**
 * User: zzw
 * Date: 2019-05-22-21:48
 * Description: 1
 */
@Gecco(matchUrl="http://www.zuanke8.com/forum-15-1.html", pipelines="consolePipeline")
public class zuanke implements HtmlBean {

      @HtmlField(cssPath = "[id^=normalthread]")
     private List<Post> postList;

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }


}
