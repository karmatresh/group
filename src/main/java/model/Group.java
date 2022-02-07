package model;

import javax.persistence.*;

@Entity(name = "groupnew")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    //@Column(name = "idgroup")
    private Integer id;

  //  @Column(name = "groupname")
    private String name;

   // @Column(name = "groupquantity")
    private Integer number;

    public Group() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Group(Integer id, String name, Integer number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
}
