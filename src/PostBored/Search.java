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

    private Post searchByTag(String searchString) {

        return null;
    }

    private Post searchByTitle(String searchString) {

        return null;
    }
}
