package uni.mel.ds.whiteboard;

/**
 * Created by hannah on 27/9/17.
 */
public class DrawItem {
    int id;
    int canvasId;
    String action;

    public DrawItem(int id, int canvasId, String action) {
        this.id = id;
        this.canvasId = canvasId;
        this.action = action;
    }
    public DrawItem(int canvasId, String action) {
        this.id = id;
        this.canvasId = canvasId;
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public int getCanvasId() {
        return canvasId;
    }

    public String getAction() {
        return action;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCanvasId(int canvasId) {
        this.canvasId = canvasId;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
