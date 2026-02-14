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
@Table(name = "chat_sessions")
@FieldDefaults(level = AccessLevel.PRIVATE)

//Class is used to store the chat sessions between the user and the AI
public class ChatSession {
   Project project;
   User user;
   String title;
   Instant createdAt;      // first message time
   Instant updatedAt;      // last message time
   Instant deletedAt;     // soft delete
}
