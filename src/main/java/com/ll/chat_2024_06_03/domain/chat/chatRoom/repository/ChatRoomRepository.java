package com.ll.chat_2024_06_03.domain.chat.chatRoom.repository;

import com.ll.chat_2024_06_03.domain.chat.chatRoom.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {

}
