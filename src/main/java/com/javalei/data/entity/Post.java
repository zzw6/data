package com.javalei.data.entity;

import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

/**
 * User: zzw
 * Date: 2019-05-22-22:32
 * Description:
 * <p>
 * create table 	Post(
 * id int  AUTO_INCREMENT,
 * title_id int,
 * title VARCHAR(500) ,
 * link VARCHAR(1000),
 * author VARCHAR(200),
 * create_time Date ,
 * browse_volume int   DEFAULT '0',
 * primary key(id)
 * )
 */
public class Post implements HtmlBean {


    private int id;
    private int linkId;

    @HtmlField(cssPath = ".new a[target=_blank]")
    @Attr("href")
    private String link;

    @HtmlField(cssPath = ".new a[target=_blank]")
    @Text
    private String title;

    @HtmlField(cssPath = ".by>cite>a:eq(0)")
    private String author;
    @HtmlField(cssPath = ".num>em")
    @Text
    private int browse_volume;


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", linkId=" + linkId +
                ", link='" + link + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", browse_volume=" + browse_volume +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBrowse_volume() {
        return browse_volume;
    }

    public void setBrowse_volume(int browse_volume) {
        this.browse_volume = browse_volume;
    }
}
