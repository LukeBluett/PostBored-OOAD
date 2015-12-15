package PostBored;

import java.util.ArrayList;

/**
 *
 */
class PostTest {

    public static void main(String[] args) {


        PostCollection postCollection = new PostCollection(new ArrayList<>());

        Member member1 = new Member(0, "USERNAME", "EMAIL@USERNAME.COM", "PASSWORD");
        Member member2 = new Member(1, "USERNAME", "EMAIL@USERNAME.COM", "PASSWORD");

        MainPost mainPost1 = new MainPost(0, member1, "My cat", "This post is about my cat", "Cat");
        MainPost mainPost2 = new MainPost(1, member1, "My Dog", "This post is about my dog", "Dog");
        MainPost mainPost3 = new MainPost(2, member1, "My Pet", "This post is about my pet", "Pet");
        MainPost mainPost4 = new MainPost(3, member1, "His cat", "This post is about That other Guy's Cat", "Cat");

        postCollection.add(mainPost1);
        postCollection.add(mainPost2);
        postCollection.add(mainPost3);
        postCollection.add(mainPost4);

        Comment comment1 = new Comment(0, "That's a really nice Dog", member2);
        Comment comment2 = new Comment(1, "That's a really nice Cat", member2);

        postCollection.getById(1).addComment(comment1);
        postCollection.getById(3).addComment(comment2);


        System.out.println(postCollection.getById(1).getTitle());
        System.out.println(postCollection.getById(1).getCommentById(0).getText());

        System.out.println(postCollection.getById(3).getTitle());
        System.out.println(postCollection.getById(3).getCommentById(1).getText());

    }
}
