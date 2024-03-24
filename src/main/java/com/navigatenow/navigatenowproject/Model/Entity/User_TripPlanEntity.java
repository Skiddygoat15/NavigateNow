package com.navigatenow.navigatenowproject.Model.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_tripplan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_TripPlanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_tripplan_id")
    private Integer user_TripPlanId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "tripplan_id")
    private Integer tripPlanId;



    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private UserEntity userEntity;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "tripplan_id",insertable = false,updatable = false)
    private TripPlanEntity tripPlanEntity;
}
