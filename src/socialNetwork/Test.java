package socialNetwork;

public class Test {

	


	public static void main(String[] args) {
		NewsFeed feed = new NewsFeed();
		Messages m1 =  new Messages(null, "Testuser", 0, 0, null, "test");
		feed.addPost(m1);
		}
}
