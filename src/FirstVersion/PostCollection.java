package FirstVersion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class PostCollection {

    private List<Post> Posts;

    public PostCollection() {
        Posts = new ArrayList<Post>();
    }

    public Post getPost(int i) {
        return Posts.get(i);
    }

    public void addPost(Post post) {
        Posts.add(post);
    }
}
