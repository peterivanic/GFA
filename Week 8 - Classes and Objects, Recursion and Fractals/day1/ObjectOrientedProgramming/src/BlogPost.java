public class BlogPost {
//    Create a BlogPost class that has
//            an authorName
//            a title
//            a text
//            a publicationDate
//            Create a few blog post objects:
//            "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//    Lorem ipsum dolor sit amet.
//"Wait but why" titled by Tim Urban posted at "2010.10.10."
//    A popular long-form, stick-figure-illustrated blog about almost everything.
//"One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//    Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.
//    When I asked to take his picture outside one of IBM’s New York City offices, he told me that
//    he wasn’t really into the whole organizer profile thing.

    public String authorName;
    public String title;
    public String text;
    public String publicationDate;


    public static void main(String[] args) {
        BlogPost joePost = new BlogPost();
        BlogPost timPost = new BlogPost();
        BlogPost williamPost = new BlogPost();

        joePost.authorName ="John Doe";
        joePost.title = "Lorem Ipsum";
        joePost.publicationDate ="2000.05.04.";
        joePost.text = "Lorem ipsum dolor sit amet.";

        timPost.authorName = "Tim Urban";
        timPost.title = "Wait but why";
        timPost.publicationDate = "2010.10.10.";
        timPost.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        williamPost.authorName = "William Turton";
        williamPost.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        timPost.publicationDate = "2017.03.28.";
        timPost.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\n" +
                " When I asked to take his picture outside one of IBM’s New York City offices,\n" +
                " he told me that he wasn’t really into the whole organizer profile thing.";

    }
}
