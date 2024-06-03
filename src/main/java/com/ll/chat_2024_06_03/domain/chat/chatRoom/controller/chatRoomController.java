package com.ll.chat_2024_06_03.domain.chat.chatRoom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat/room")
public class chatRoomController {
    @GetMapping("/{roomId}")
    @ResponseBody
    public String showRoom(
            @PathVariable("roomId") final long roomId,
            @RequestParam(value="writerName", defaultValue = "NoName") final String writerName
    ) {

        return "%d번 채팅방 입니다. 작성자 : %s".formatted(roomId, writerName);
    }

    @GetMapping("/make")
    public String showMake() {
        return "domain/chat/chatRoom/make";
    }
}
