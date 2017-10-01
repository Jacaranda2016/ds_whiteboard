package uni.mel.ds.whiteboard; /**
 * Created by hannah on 27/9/17.
 */

import java.util.Date;

public class ChatItem {
    int id;
    String username;
    String content;
    Date time;

    public ChatItem(int id, String username, String content, Date time) {
        this.id = id;
        this.username = username;
        this.content = content;
        this.time = time;
    }
    public ChatItem(String username, String content) {

        this.username = username;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }

    public Date getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
