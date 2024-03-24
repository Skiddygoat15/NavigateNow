package com.navigatenow.navigatenowproject.Model.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
import java.util.Date;
import java.util.List;
import java.util.Set;

@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Where(clause = "deleted_at is null")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String LastName;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private Integer age;
    @Column(name = "contact_number")
    private String contactNumber;
    @Column(name = "gender")
    private Integer gender;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @JsonManagedReference
    @OneToMany(mappedBy = "userEntity")
    private List<FeedbackEntity> feedbackEntity;

    @JsonManagedReference
    @OneToMany(mappedBy = "userEntity")
    private List<User_UserIntrest> user_userIntrests;

    @JsonManagedReference
    @OneToMany(mappedBy = "userEntity")
    private List<User_TripPlanEntity> user_tripPlanEntities;
}