package com.bitsmad.Lovable_Clone.entity;

import java.time.Instant;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import com.bitsmad.Lovable_Clone.enums.MessageRole;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chat_messages")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;
    ChatSession chatSession;
    User user;
    String content;
    String toolCalls;       // JSON array of tools called
    Integer tokensUsed;
    MessageRole role;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;

}
