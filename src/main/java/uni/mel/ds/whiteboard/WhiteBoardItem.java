package uni.mel.ds.whiteboard; /**
 * Created by hannah on 27/9/17.
 */

import java.util.Date;

public class WhiteBoardItem {
    int id;
    String managerUsername;
    //Date createTime;
    Boolean status;

    public WhiteBoardItem(int id, String managerUsername, Boolean status) {
        this.id = id;
        this.managerUsername = managerUsername;
        //this.createTime = createTime;
        this.status = status;
    }
    public WhiteBoardItem(String managerUsername) {

        this.managerUsername = managerUsername;

        this.status = true;
    }

    public int getId() {
        return id;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    //public Date getCreateTime() {return createTime;}

    public Boolean getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

   // public void setCreateTime(Date createTime) {this.createTime = createTime;}

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
