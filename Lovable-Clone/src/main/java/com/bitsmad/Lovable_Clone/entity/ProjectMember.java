package com.bitsmad.Lovable_Clone.entity;

import java.time.Instant;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import com.bitsmad.Lovable_Clone.enums.ProjectRole;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "project_members")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    ProjectMemberId id;
    Project project;
    User user;
    ProjectRole role;
    Instant invitedAt;
    Instant accpetedAt;
}
