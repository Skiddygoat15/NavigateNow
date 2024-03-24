package com.navigatenow.navigatenowproject.Model.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "touristyplaces_tripplan")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TouristyPlaces_TripPlanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "touristyplaces_tripplan_id")
    private Integer userUserintrestId;
    @Column(name = "tripplan_id")
    private Integer tripPlanId;
    @Column(name = "touristyplaces_id")
    private Integer touristyPlacesId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "tripplan_id",insertable = false,updatable = false)
    private TripPlanEntity tripPlanEntity;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "touristyplaces_id",insertable = false,updatable = false)
    private TouristyPlacesEntity touristyPlacesEntity;
}
