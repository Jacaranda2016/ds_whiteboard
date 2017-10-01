package uni.mel.ds.whiteboard;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by hannah on 1/10/17.
 */
public class DatabaseRepositoryTest {
    private DatabaseRepository subject;
    private String managerName = "admin";
    private String canvasName = "canvas";
    private String canvasPath = "/test";
    private String action = "draw";
    private String kickedName = "kicked";
    private String username = "username";


    @Before
    public void setUp() throws Exception {
        subject = new DatabaseRepository();
    }

    @Test
    public void getNamelist() throws Exception {
        int whiteBoardId = subject.addWhiteBoardItem(managerName);
        People people = new People(whiteBoardId, managerName, true, true);
        subject.addPeople(people);
        People kickedPeople = new People(whiteBoardId, kickedName, false, true);
        subject.addPeople(kickedPeople);
        Assert.assertTrue(subject.kickPeople(kickedName));
        People manager = subject.getPeople(managerName);
        Assert.assertNotNull(manager);
        ArrayList list = subject.getNamelist();
        Assert.assertEquals(list.get(0), managerName);
        WhiteBoardItem whiteBoardItem = subject.getWhiteboardItem(whiteBoardId);
        Assert.assertNotNull(whiteBoardItem);
        Assert.assertTrue(subject.setWhiteboardStatus(whiteBoardId));
    }

    @Test
    public void getActiveWhiteboardId() throws Exception {
        subject.addWhiteBoardItem(managerName);
        int whiteboardId = subject.getActiveWhiteboardId();
        Assert.assertTrue(whiteboardId > 0);
    }

    @Test
    public void addCanvasItem() throws Exception {
        //tested elsewhere
    }

    @Test
    public void getCanvasItem() throws Exception {
        int canvasId = subject.addCanvasItem(managerName, canvasName, canvasPath);
        DrawItem drawItem = new DrawItem(canvasId,action);
        Assert.assertTrue(subject.addDrawItem(drawItem));
        ArrayList list = subject.getDrawItem(canvasId);
        Assert.assertNotNull(list);
    }

    @Test
    public void getChatItem() throws Exception {
        ChatItem chatItem = new ChatItem(managerName, "Non sense");
        Assert.assertTrue(subject.addChatItem(chatItem));
        ArrayList list = subject.getChatItem();
        Assert.assertNotNull(list);
    }

    @Test
    public void addChatItem() throws Exception {
        ChatItem chatItem = new ChatItem(managerName, "Non sense");
        Assert.assertTrue(subject.addChatItem(chatItem));
    }

    @Test
    public void getDrawItem() throws Exception {
        //tested elsewhere


    }

    @Test
    public void addDrawItem() throws Exception {
        //tested elsewhere

    }

    @Test
    public void getPeople() throws Exception {
        //tested elsewhere
    }

    @Test
    public void kickPeople() throws Exception {
        //tested elsewhere

    }

    @Test
    public void addPeople() throws Exception {
        //tested elsewhere
    }

    @Test
    public void getWhiteboardItem() throws Exception {
        //tested elsewhere

    }

    @Test
    public void addWhiteBoardItem() throws Exception {
        //tested elsewhere

    }

    @Test
    public void setWhiteboardStatus() throws Exception {
        //tested elsewhere

    }

    @After
    public void cleanUp() {
        subject.cleanUp();

    }


}