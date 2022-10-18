package pl.milypol.dailyhelper.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class IncomingOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double price;
    private Double weight;
    private String producer;
    private String provider;
    @Column(updatable = false)
    @CreationTimestamp
    private Date createdAt;


}
