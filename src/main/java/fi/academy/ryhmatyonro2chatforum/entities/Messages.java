package fi.academy.ryhmatyonro2chatforum.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Messages {
    @Id
    private Integer id;
    private String content;
    private Date creationdate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idusers") //OK
    private Users users1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtopics") //OK
    private Topics topics;


    public Messages() {
    }

    public Topics getTopics() {
        return topics;
    }

    public void setTopics(Topics topics) {
        this.topics = topics;
    }

    public Users getUsers1() {
        return users1;
    }

    public void setUsers1(Users users1) {
        this.users1 = users1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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