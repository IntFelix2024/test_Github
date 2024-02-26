package socialNetwork;

import java.util.ArrayList;
import java.util.UUID;

public class Messages extends Post{
	
	public String text;

	public Messages(UUID id, String userName, long timeStamp, int likeCount, ArrayList<String> comments, String text) {
		super(id, userName, timeStamp, likeCount, comments);
		this.text = text;
	}


	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


	public String toString(){
		return 	"Post ID: " + this.id +
				"\n Username: " + this.userName +
				"\nTimestamp: " + this.timeStamp +
				"\nMessage sent: " + this.text +
				"\nLike Counter: " + this.likeCount;
				}
}