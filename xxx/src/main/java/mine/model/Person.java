package mine.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "PERSON")
public class Person {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn(name="pid")
    public List<Address> addresses = new ArrayList<>();
}
