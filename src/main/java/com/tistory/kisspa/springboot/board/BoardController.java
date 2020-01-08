package com.tistory.kisspa.springboot.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/board/")
public class BoardController {

    @Inject
    private BoardService boardService;

    @RequestMapping(value = "findBoardList.do")
    public @ResponseBody List findBoardList(@RequestBody Map param) {
        System.out.println(param);
        return boardService.findBoardList();
    }

    @RequestMapping(value = "test.do")
    public @ResponseBody List test() {
        System.out.println("test.do");
        return boardService.findBoardList();
    }
}
