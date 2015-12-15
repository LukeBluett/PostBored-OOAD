package PostBored;

import java.util.Date;


abstract class Post {

    private int id;
    private String text;
    private Date postTime;
    private Member member;

    Post(int id, Member member, String text, Date postTime) {
        this.id = id;
        this.member = member;
        this.text = text;
        this.postTime = postTime;
    }

    public int getId() {
        return id;
    }

    Member getMember() {
        return member;
    }

    String getText() {
        return text;
    }

    Date getPostTime() {
        return postTime;
    }

    public void setText(String text) {
        this.text = text;
    }

}
