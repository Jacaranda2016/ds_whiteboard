package uni.mel.ds.whiteboard; /**
 * Created by hannah on 27/9/17.
 */

public class People {

    int whiteboardId;
    String username;
    Boolean isManager;
    Boolean status;//kicked out or not

    public People(int whiteboardId, String username, Boolean isManager, Boolean status) {
        this.whiteboardId = whiteboardId;
        this.username = username;
        this.isManager = isManager;
        this.status = status;
    }

    public int getWhiteboardId() {
        return whiteboardId;
    }

    public String getUsername() {
        return username;
    }

    public Boolean getManager() {
        return isManager;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setWhiteboardId(int whiteboardId) {
        this.whiteboardId = whiteboardId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setManager(Boolean manager) {
        isManager = manager;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
