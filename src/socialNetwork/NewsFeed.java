package socialNetwork;

import java.util.ArrayList;
import java.util.UUID;

public class NewsFeed {

	public ArrayList<Post> feed = new ArrayList<Post>();
	
	public NewsFeed(ArrayList<Post> feed) {
		this.feed = feed;
	}

	public ArrayList<Post> getFeed() {
		return feed;
	}

	public void setFeed(ArrayList<Post> feed) {
		this.feed = feed;
	}

	public void deletePost(UUID id) {	
		for(Post p : feed) {
			if(p.getId().equals(id)) {
				feed.remove(p);
			}	
		}
	}
	
	public void addPost(Post p) {
		this.feed.add(p);
	}
}