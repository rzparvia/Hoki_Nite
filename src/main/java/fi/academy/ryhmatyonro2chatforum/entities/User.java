package fi.academy.ryhmatyonro2chatforum.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    private Integer id;
    private String favouriteTeam;
    private String userName;

    @OneToMany(mappedBy = "user") //tarkastettu
    private List<Message> msglist = new ArrayList<>();

    @OneToMany(mappedBy = "topic") //tarkastettu
    private List<Topic> topicList = new ArrayList<>();

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    public List<Message> getMsglist() {
        return msglist;
    }

    public void setMsglist(List<Message> msglist) {
        this.msglist = msglist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}