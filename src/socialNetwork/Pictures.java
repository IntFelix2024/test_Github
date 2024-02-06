package socialNetwork;

import java.util.ArrayList;
import java.util.UUID;

public class Pictures extends Post{

	public Pictures(UUID id, String userName, long timeStamp, int likeCount, ArrayList<String> comments) {
		super(id, userName, timeStamp, likeCount, comments);
	}
	public String toString(){
		return 	"Post ID: " + this.id +
				"\n Username: " + this.userName +
				"\nTimestamp: " + this.timeStamp +
				"\nLike Counter: " + this.likeCount;
				}
}
