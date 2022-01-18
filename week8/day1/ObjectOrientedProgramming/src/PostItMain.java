public class PostItMain {
    public static void main(String[] args) {
        PostIt example1 = new PostIt("orange", "Idea 1", "blue");
        PostIt example2 = new PostIt("pink", "Awesome", "black");
        PostIt example3 = new PostIt("yellow", "Superb!", "green");

        System.out.println(example1.backgroundColor + " " + example1.textColor + " " + example1.text);
    }
}
