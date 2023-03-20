package google.drive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "View_table")
@Data
public class View {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private Long filesize;
    private String filename;
    private Boolean isindexed;
    private Boolean isupload;
    private String videourl;
}
