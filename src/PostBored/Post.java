package PostBored;

import java.util.Date;

/**
 *
 */
class Post extends PostData {

    private String title;
    private String tag;

    public Post() {

    }

    public Post(int id, Member member, String title, String text, String tag) {
        super(id, member, text, new Date());
        this.title = title;
        this.tag = tag;
    }

    public Post(Post post) {
        super(post.getId(), post.getMember(), post.getText(), post.getPostTime());
        this.title = post.getTitle();
        this.tag = post.getTag();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
