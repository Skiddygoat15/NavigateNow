package com.navigatenow.navigatenowproject.Model.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "trip_groups")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Where(clause = "deleted_at is null")
public class TripGroupEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_group_id")
    private Integer tripGroupId;
    @Column(name = "group_name")
    private String GroupName;
    @Column(name = "group_description")
    private String groupDescription;
    @Column(name = "number_of_tourists")
    private Integer NumberOfTourists;
    @Column(name = "group_number_lemit")
    private Integer groupNumberLemit;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "tripplan_id", insertable = false,updatable = false)
    private TripPlanEntity tripPlanEntity;
}
