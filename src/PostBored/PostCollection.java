package PostBored;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class PostCollection {

    private List<Post> posts;

    public PostCollection(List<Post> posts) {
        this.posts = posts;
    }

    public PostCollection() {
        this.posts = new ArrayList();
    }


    public PostCollection searchTag(String searchString) {
        PostCollection searchResults = new PostCollection();
        posts.stream().filter(post -> post.getTag().toLowerCase().matches(".*" + searchString.toLowerCase() + ".*")).forEach(searchResults::addPost);
        return searchResults;
    }

    public PostCollection searchTitle(String searchString) {
        PostCollection searchResults = new PostCollection();
        posts.stream().filter(post -> post.getTitle().toLowerCase().matches(".*" + searchString.toLowerCase() + ".*")).forEach(searchResults::addPost);
        return searchResults;
    }



    public Post getPostById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return new Post(post);
            }
        }
        return null;
    }

    public Post getPost(int index) {
        if (posts.size() > index) {
            return new Post(posts.get(index));
        }
        return null;
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public int size() {
        return posts.size();
    }
}
