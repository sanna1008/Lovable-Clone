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
@Table(name = "project_files")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Project project;
    String path;
    String minioObjectKey;
    User createdBy;
    Instant createdAt;
    User updatedBy;
    Instant updatedAt;
}
