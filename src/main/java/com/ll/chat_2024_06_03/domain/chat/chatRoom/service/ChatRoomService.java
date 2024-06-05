package com.ll.chat_2024_06_03.domain.chat.chatRoom.service;

import com.ll.chat_2024_06_03.domain.chat.chatMessage.entity.ChatMessage;
import com.ll.chat_2024_06_03.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.chat_2024_06_03.domain.chat.chatRoom.repository.ChatRoomRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;

    @Transactional
    public ChatRoom make(String name) {
        ChatRoom chatRoom = ChatRoom.builder()
                .name(name)
                .build();

        chatRoomRepository.save(chatRoom);

        return chatRoom;
    }

    public List<ChatRoom> findAll() {
        return chatRoomRepository.findAll();
    }

    public Optional<ChatRoom> findById(long roomId) {
        return chatRoomRepository.findById(roomId);
    }

    @Transactional
    public ChatMessage write(long roomId, String writerName, String content) {
        ChatRoom chatRoom = chatRoomRepository.findById(roomId).get();

        ChatMessage chatMessage = chatRoom.writeMessage(writerName, content);

        return chatMessage;
    }
}