package t1904e.com.example.office.model;

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
public class Customer extends DateAudit{

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String phone;
    private String password;
    private String username;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<Contract> contracts;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<Rating> ratings;
}
