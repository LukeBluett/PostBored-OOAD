package PostBored;

/**
 *
 */
public class Search {

    private String searchString;

    public Search(String searchString) {

        this.searchString = searchString;

        if (this.searchString.charAt(0) == '#') {
            searchByTag(this.searchString);
        }
        else {
            searchByTitle(this.searchString);
        }
    }

    public Post searchByTag(String searchString) {

        return null;
    }

    public Post searchByTitle(String searchString) {

        return null;
    }
}
