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
@Table(name = "previews")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {
   Long id;
   Project project;
   String nameSpace;
   String podName;
   String preViewUrl;
   PreviewStatus status;
   Instant startedAt;
   Instant terminatedAt;
   Instant createdAt;
}
