package PostBored;

import java.util.Date;

/**
 *
 */
public class PostTest {

    public static void main(String[] args) {

        Date date = new Date();

        PostCollection pc = new PostCollection();

        Post post1 = new Post(0, "My cat", "This post is about my cat", "Cat", date);
        Post post2 = new Post(1, "My Dog", "This post is about my dog", "Dog", date);
        Post post3 = new Post(2, "Sam for president", "Vote Sam Dowling for president of Wales", "Sam", date);
        Post post4 = new Post(3, "His cat", "This post is about That other Guy's cat", "Cat", date);

        pc.addPost(post1);
        pc.addPost(post2);
        pc.addPost(post3);
        pc.addPost(post4);

        //for (int i = 0; i < 4; i++)
        //    System.out.println(pc.getPost(i).getTitle());


        PostCollection results = pc.search("#cat");

        for (int i = 0; i < results.size(); i++)
            System.out.println(results.getPost(i).getId());

        Post memes = pc.getPost(10);


        Post stuff = new Post();
        Member mem = new Member();

        //needs member to inherit from members to work
        //mem.addpost(stuff);

    }
}
