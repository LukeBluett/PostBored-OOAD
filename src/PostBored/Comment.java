package PostBored;


import java.util.Date;

/**
 *
 *
 *
 */
public class Comment {

    private int id;
    private String text;
    private Date commentTime;
    private Member member;


    public Comment() {

    }

    public Comment(int id, String text,Member member) {
        this.id = id;
        this.text = text;
        this.commentTime = new Date();
        this.member = member;
    }



    public int getId() {
        return id;
    }
    public Member getMemeber(){
        return member;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCommenttTime() {
        return commentTime;
    }


}
