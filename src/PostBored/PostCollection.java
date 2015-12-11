package PostBored;

import java.util.List;

/**
 *
 */
public class PostCollection {

    private List<Post> posts;

    public PostCollection(List<Post> posts) {
    }

    public Post getPost(int i) {

        return posts.get(i);
    }

    public void addPost(Post post) {
        posts.add(post);
    }
}
