package socialNetwork;

import java.util.ArrayList;
import java.util.UUID;

public class Pictures extends Post{
	
	public String headline;
	public String dataName;	
	
	public Pictures(UUID id, String userName, long timeStamp, int likeCount, ArrayList<String> comments,
			String headline, String dataName) {
		super(id, userName, timeStamp, likeCount, comments);
		this.headline = headline;
		this.dataName = dataName;
	}

	public String toString(){
		return 	"Post ID: " + this.id +
				"\n Username: " + this.userName +
				"\nHeadline: " + this.headline +
				"\nTimestamp: " + this.timeStamp +
				"\nLike Counter: " + this.likeCount +
				"\nDataname: " + this.dataName;
				}
}
