package com.navigatenow.navigatenowproject.Model.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_userintrest")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User_UserIntrest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_userintrest_id")
    private Integer userUserintrestId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "userintrest_Id ")
    private Integer userintrestId;


    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id",insertable = false,updatable = false)
    private UserEntity userEntity;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "userintrest_id",insertable = false,updatable = false)
    private UserIntrestEntity userIntrestEntity;
}
