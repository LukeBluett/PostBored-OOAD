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

    public PostCollection search(String searchString) {
        boolean isTag = searchString.charAt(0) == '#';
        searchString = searchString.toLowerCase().substring(1, searchString.length());
        System.out.println(searchString);

        PostCollection searchResults = new PostCollection();

        for (Post post : posts) {
            if (isTag && post.getTag().equalsIgnoreCase(searchString)) {
                searchResults.addPost(post);
            }
            if (!isTag && post.getTitle().equalsIgnoreCase(searchString)) {
                searchResults.addPost(post);
            }
        }
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
