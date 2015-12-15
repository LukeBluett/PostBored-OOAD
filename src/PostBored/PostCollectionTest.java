package PostBored;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by t00171832 on 15/12/2015.
 */
public class PostCollectionTest {


    @Test
    public void testCreateMember() throws Exception {
        Member member0 = new Member(0, "USERNAME0", "MEMBER0@USERNAME.COM", "PASSWORD0");
        assertEquals("MEMBER0@USERNAME.COM", member0.getEmail());
    }

    @Test
    public void testCreatePost() throws Exception {
        Member member0 = new Member(0, "USERNAME0", "MEMBER0@USERNAME.COM", "PASSWORD0");

        MainPost mainPost1 = new MainPost(0, member0, "My cat", "This post is about my cat", "Cat");
        assertEquals("My cat", mainPost1.getTitle());
    }


    @Test
    public void testCreatePostCollection() throws Exception {
        Member member0 = new Member(0, "USERNAME0", "MEMBER0@USERNAME.COM", "PASSWORD0");
        MainPost mainPost1 = new MainPost(0, member0, "My cat", "This post is about my cat", "Cat");

        PostCollection postCollection = new PostCollection(new ArrayList<>());

        postCollection.add(mainPost1);

        assertEquals("My cat", postCollection.getById(0).getTitle());
    }


    @Test
    public void testCreateComment() throws Exception {
        Member member0 = new Member(0, "USERNAME0", "MEMBER0@USERNAME.COM", "PASSWORD0");

        Comment comment1 = new Comment(0, "That's a really nice Dog", member0);

        assertEquals("That's a really nice Dog", comment1.getText());
    }

    @Test
    public void testCreateCommentCollection() throws Exception {
        PostCollection postCollection = new PostCollection(new ArrayList<>());

        Member member0 = new Member(0, "USERNAME0", "MEMBER0@USERNAME.COM", "PASSWORD0");

        MainPost mainPost1 = new MainPost(0, member0, "My cat", "This post is about my cat", "Cat");
        Comment comment1 = new Comment(0, "That's a really nice Dog", member0);

        postCollection.add(mainPost1);
        postCollection.getById(0).addComment(comment1);


        assertEquals("That's a really nice Dog", postCollection.getById(0).getCommentById(0).getText());
    }

    @Test
    public void testSearch() throws Exception {
        PostCollection postCollection = new PostCollection(new ArrayList<>());

        Member member0 = new Member(0, "USERNAME0", "MEMBER0@USERNAME.COM", "PASSWORD0");

        MainPost mainPost1 = new MainPost(0, member0, "My cat", "This post is about my cat", "Cat");
        Comment comment1 = new Comment(0, "That's a really nice Dog", member0);

        postCollection.add(mainPost1);
        postCollection.getById(0).addComment(comment1);


        PostCollection searchResults = postCollection.searchTitle("cat");

        assertEquals("My cat", searchResults.getById(0).getTitle());
    }
}