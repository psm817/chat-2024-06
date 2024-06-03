package com.ll.chat_2024_06_03.domain.chat.chatRoom.entity;

import lombok.Getter;
import lombok.Setter;

public class ChatRoom {
    @Getter
    @Setter
    private long id;

    @Getter
    private String name;

    public ChatRoom(String name) {
        this.name = name;
    }
}
