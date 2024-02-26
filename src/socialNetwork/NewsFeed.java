package socialNetwork;

import java.util.ArrayList;
import java.util.UUID;

public class NewsFeed {

	public ArrayList<Post> feed;
	
	//Constructor
	public NewsFeed() {
		this.feed = new ArrayList<Post>();
	}

	//getter, setter
	public ArrayList<Post> getFeed() {
		return feed;
	}

	public void setFeed(ArrayList<Post> feed) {
		this.feed = feed;
	}

	//Methods
	
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