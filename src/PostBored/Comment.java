package PostBored;


import java.util.Date;


class Comment extends PostData {

    public Comment() {

    }

    public Comment(int id, String text, Member member) {
        super(id, member, text, new Date());
    }
}
