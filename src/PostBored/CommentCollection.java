package PostBored;

import java.util.List;

/**
 *
 */
public class CommentCollection extends Collection<Comment> {

    public CommentCollection(List<Comment> comments) {

        this.collection = comments;
    }

    public Comment getById(int id) {
        for (Comment comment : collection) {
            if (comment.getId() == id) {
                return comment;
            }
        }
        return null;
    }

}
