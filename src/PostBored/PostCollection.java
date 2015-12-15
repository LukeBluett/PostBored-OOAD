package PostBored;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class PostCollection extends Collection<MainPost> implements Iterable<MainPost> {


    public PostCollection(List<MainPost> collection) {
        this.collection = collection;
    }

    private PostCollection() {
        this.collection = new ArrayList<>();
    }

    public PostCollection searchTag(String searchString) {
        PostCollection searchResults = new PostCollection();
        collection.stream().filter(post -> post.getTag().toLowerCase().matches(".*" + searchString.toLowerCase() + ".*")).forEach(searchResults::add);
        return searchResults;
    }

    public PostCollection searchTitle(String searchString) {
        PostCollection searchResults = new PostCollection();
        collection.stream().filter(post -> post.getTitle().toLowerCase().matches(".*" + searchString.toLowerCase() + ".*")).forEach(searchResults::add);
        return searchResults;
    }

    public MainPost getById(int id) {
        for (MainPost mainPost : collection) {
            if (mainPost.getId() == id) {
                return mainPost;
            }
        }
        return null;
    }
}
