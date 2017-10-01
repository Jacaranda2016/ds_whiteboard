package uni.mel.ds.whiteboard; /**
 * Created by hannah on 27/9/17.
 */

import java.util.ArrayList;

public interface RepositoryInterface {

    CanvasItem getCanvasItem(int canvasId);
    boolean addCanvasItem(CanvasItem canvasItem);

    ArrayList<ChatItem> getChatItem();
    boolean addChatItem(ChatItem chatItem);






    ArrayList<DrawItem>  getDrawItem(int canvasId);
    boolean addDrawItem(DrawItem drawItem);


    People getPeople(int userId);//TODO 如果是数据库提供id，如何query？
    boolean addPeople(People people);




    WhiteBoardItem getWhiteboardItem(int whiteBoardId);
    boolean addWhiteBoardItem(WhiteBoardItem whiteBoardItem);


}
