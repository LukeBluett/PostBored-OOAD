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
    private Member member;

    public Post() {

    }

    public Post(int id, Member member, String title, String text, String tag) {
        this.id = id;
        this.member = member;
        this.title = title;
        this.text = text;
        this.tag = tag;
        this.postTime = new Date();
    }

    public Post(Post post) {
        this.id = post.id;
        this.member = post.member;
        this.title = post.title;
        this.text = post.text;
        this.tag = post.tag;
        this.postTime = post.getPostTime();
    }

    public int getId() {
        return id;
    }

    public Member getMember() {
        return member;
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

}
