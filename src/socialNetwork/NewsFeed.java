package socialNetwork;

import java.util.ArrayList;

public class NewsFeed {

	public ArrayList<Post> feed = new ArrayList<Post>();
	
	public void deletePost(int id) {	
		for(Post p : feed) {
			if(p.getId().equals(id)) {
				feed.remove(p);
			}
			
		}
	}
}