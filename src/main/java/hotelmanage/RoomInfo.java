package hotelmanage;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.*;

@Entity
@Table(name="RoomInfo_table")
@Qualifier("room")
public class RoomInfo {

    @Id @GeneratedValue
    private Integer roomNumber;
    private String roomStatus;


    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }
    /*public Integer getRoomScore() {
        return roomScore;
    }
    public void setRoomScore(Integer roomScore) {
        this.roomScore = roomScore;
    }
    public Integer getRoomScoreCnt() {
        return roomScoreCnt;
    }
    public void setRoomScoreCnt(Integer roomScoreCnt) {
        this.roomScoreCnt = roomScoreCnt;
    }*/

}
