package PostBored;


import java.util.Date;


class Comment extends Post {

    public Comment(int id, String text, Member member) {
        super(id, member, text, new Date());
    }

    public Comment(Comment comment) {
        super(comment.getId(), comment.getMember(), comment.getText(), comment.getPostTime());
    }
}
