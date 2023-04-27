package com.ssafy.yut.controller;

import com.ssafy.yut.dto.YutDto;
import com.ssafy.yut.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 게임 관련 Controller
 *
 * @author 김정은
 */
@RestController
@RequiredArgsConstructor
@MessageMapping("/game")
public class GameController {

    private final GameService gameService;

    /**
     * 윷 던지기
     *
     * @param request
     */
    @MessageMapping("/stick")
    public void throwYut(YutDto.Request request){
        gameService.yut(request);
    }
}
