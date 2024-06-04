package com.ll.chat_2024_06_03.global.initData;

import com.ll.chat_2024_06_03.domain.chat.chatRoom.entity.ChatRoom;
import com.ll.chat_2024_06_03.domain.chat.chatRoom.service.ChatRoomService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.stream.IntStream;

@Configuration
@Profile("!prod")
public class NotProd {
    @Bean
    public ApplicationRunner initNotProd(ChatRoomService chatRoomService) {
        return args -> {
            ChatRoom chatRoom1 = chatRoomService.make("요리");
            ChatRoom chatRoom2 = chatRoomService.make("운동");
            ChatRoom chatRoom3 = chatRoomService.make("음악");

            IntStream.rangeClosed(1, 30)
                    .forEach(no -> chatRoomService.write(chatRoom1.getId(), "홍길동", "내용" + no));
        };
    }
}
