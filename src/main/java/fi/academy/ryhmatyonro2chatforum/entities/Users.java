package fi.academy.ryhmatyonro2chatforum.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Users {

    @Id
    private Integer id;
    private String username;

    @OneToMany(mappedBy = "users1", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Messages> msglist = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Users() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Messages> getMsglist() {
        return msglist;
    }

    public void setMsglist(List<Messages> msglist) {
        this.msglist = msglist;
    }
}