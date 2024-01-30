package socialNetwork;

import java.util.ArrayList;
import java.util.UUID;

public abstract class Post {
	UUID id;
	String userName;
	long timeStamp;
	int likeCount;
	ArrayList<String>comments = new ArrayList<String>();
	
	public Post(UUID id, String userName, long timeStamp, int likeCount, ArrayList<String> comments) {
		this.id = id;
		this.userName = userName;
		this.timeStamp = timeStamp;
		this.likeCount = likeCount;
		this.comments = comments;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	public ArrayList<String> getComments() {
		return comments;
	}
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}
	public UUID getId() {
		return id;
	}

}
