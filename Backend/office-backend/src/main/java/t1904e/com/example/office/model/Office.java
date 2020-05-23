package t1904e.com.example.office.model;

import com.sun.xml.bind.v2.model.core.ID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Office extends DateAudit {

    @Id
    @Column(name = "office_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Long price;
    private String address;
    private float acreage;
    private String description;
    private String image;

    @OneToMany(mappedBy = "office", fetch = FetchType.LAZY)
    private Set<Rating> ratings;

    @OneToMany(mappedBy = "office", fetch = FetchType.LAZY)
    private Set<Contract> contracts;
}

