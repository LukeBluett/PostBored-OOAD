package PostBored;

import java.util.Date;


abstract class PostData {

    private int id;
    private String text;
    private Date postTime;
    private Member member;

    PostData(int id, Member member, String text, Date postTime) {
        this.id = id;
        this.member = member;
        this.text = text;
        this.postTime = postTime;
    }

    PostData() {

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

    public void setText(String text) {
        this.text = text;
    }

    public Date getPostTime() {
        return postTime;
    }
}
