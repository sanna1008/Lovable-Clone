package com.bitsmad.Lovable_Clone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "projects")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    User owner;
    String description;
    @Builder.Default
    Boolean isPublic=false;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
