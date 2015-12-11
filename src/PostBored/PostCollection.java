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
        //imutable collection, return all posts? , Check for index out of bounds
        return posts.get(i);
    }

    public void addPost(Post post) {
        posts.add(post);
    }
}
