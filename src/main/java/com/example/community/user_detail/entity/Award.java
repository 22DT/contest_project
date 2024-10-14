package com.example.community.user_detail.entity;

import com.example.community.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
@Builder
@AllArgsConstructor(access = PROTECTED)
public class Award {
    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(name="award_id")
    private Long id;

    private String awardName;

    @ManyToOne(fetch=LAZY)
    @JoinColumn(name="user_id")
    private User user;

    
}
