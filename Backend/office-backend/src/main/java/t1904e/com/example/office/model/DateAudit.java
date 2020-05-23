package t1904e.com.example.office.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class DateAudit implements Serializable {

    private Date createdAt;
    private Date updatedAt;
    private int status;
}
