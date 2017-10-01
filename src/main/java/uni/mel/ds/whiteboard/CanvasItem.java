package uni.mel.ds.whiteboard;

/**
 * Created by hannah on 27/9/17.
 */
//when manager click save or save as, database store the information of Canvas
public class CanvasItem {
    int id;
    String managerUsername;
    String canvasName;
    String pictureURL;

    public CanvasItem(int id, String managerUsername, String canvasName, String pictureURL) {
        this.id = id;
        this.managerUsername = managerUsername;
        this.canvasName = canvasName;
        this.pictureURL = pictureURL;
    }

    public int getId() {
        return id;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public String getCanvasName() {
        return canvasName;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public void setCanvasName(String canvasName) {
        this.canvasName = canvasName;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }
}

