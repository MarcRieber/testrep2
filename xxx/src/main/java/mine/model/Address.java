package mine.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name="ADDRESS")
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    Long id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="ID")
    Long pid;

    @Column(name = "STREET")
    String Street;

    @Column(name = "ZIP_CODE")
    String Zip;

    @Column(name = "CITY")
    String City;

    boolean processed;
}
