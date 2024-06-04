package com.ll.chat_2024_06_03.domain.chat.chatRoom.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter
    private Long id;

    @CreatedDate
    @Getter
    private LocalDateTime createDate;

    @LastModifiedDate
    @Getter
    private LocalDateTime modifyDate;

    @Getter
    private String name;

    public ChatRoom(String name) {
        this.name = name;
    }
}
