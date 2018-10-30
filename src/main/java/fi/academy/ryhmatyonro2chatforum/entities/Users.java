package fi.academy.ryhmatyonro2chatforum.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Users {

    @Id
    private Integer id;
    private String favouriteTeam;
    private String userName;

    @OneToMany(mappedBy = "users") //tarkastettu
    private List<Messages> msglist = new ArrayList<>();

    @OneToMany(mappedBy = "users") //tarkastettu
    private List<Topics> topicsList = new ArrayList<>();

    public List<Topics> getTopicsList() {
        return topicsList;
    }

    public void setTopicsList(List<Topics> topicsList) {
        this.topicsList = topicsList;
    }

    public List<Messages> getMsglist() {
        return msglist;
    }

    public void setMsglist(List<Messages> msglist) {
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