package fi.academy.ryhmatyonro2chatforum.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Topics {
    @Id
    private Integer id;
    private String title;
    private String content;
    private Date creationdate;

    @OneToMany(mappedBy = "topics") //tarkastettu2
    private List<Messages> msglist = new ArrayList<>();

    @ManyToOne //tarkastettu
    @JoinColumn(name = "idSections")
    private Sections sections;

    @ManyToOne //tarkastettu
    @JoinColumn(name = "idUser")
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Sections getSections() {
        return sections;
    }

    public void setSections(Sections sections) {
        this.sections = sections;
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

     public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }
}
