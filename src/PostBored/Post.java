package PostBored;

import java.util.Date;

/**
 *
 */
public class Post {

    private int id;
    private String title;
    private String text;
    private String tag;
    private Date postTime;

    public Post() {

    }

    public Post(int id, String title, String text, String tag, Date postTime) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.tag = tag;
        this.postTime = postTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }
}
