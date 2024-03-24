package com.navigatenow.navigatenowproject.Model.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "trip_plans")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Where(clause = "deleted_at is null")
public class TripPlanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tripplan_id")
    private Integer tripPlanId;
    @Column(name = "plan_name")
    private String planName;
    @Column(name = "plan_description")
    private String planDescription;
    @Column(name = "start_date")
    private LocalDateTime startDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @JsonManagedReference
    @OneToMany(mappedBy = "tripPlanEntity")
    private List<ChecklistEntity> checklistEntities;

    @JsonManagedReference
    @OneToMany(mappedBy = "tripPlanEntity")
    private List<TripGroupEntity> tripGroupEntity;

    @JsonManagedReference
    @OneToMany(mappedBy = "tripPlanEntity")
    private List<TouristyPlaces_TripPlanEntity> touristyPlacesTripPlans;

    @JsonManagedReference
    @OneToMany(mappedBy = "tripPlanEntity")
    private List<User_TripPlanEntity> user_tripPlanEntities;
}
