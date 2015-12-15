package PostBored;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 */
class MainPost extends Post {

    private String title;
    private String tag;
    private final CommentCollection collection = new CommentCollection(new ArrayList<>());

    public MainPost(int id, Member member, String title, String text, String tag) {
        super(id, member, text, new Date());
        this.title = title;
        this.tag = tag;
    }

    public MainPost(MainPost mainPost) {
        super(mainPost.getId(), mainPost.getMember(), mainPost.getText(), mainPost.getPostTime());
        this.title = mainPost.getTitle();
        this.tag = mainPost.getTag();
    }

    public void addComment(Comment comment) {
        collection.add(comment);
    }

    public Comment getComment(int index) {
        return new Comment(collection.get(index));
    }

    public Comment getCommentById(int ID) {
        return new Comment(collection.getById(ID));
    }

    public String getTitle() {
        return title;
    }

    public String getTag() {
        return tag;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
