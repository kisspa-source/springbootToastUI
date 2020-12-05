package com.tistory.kisspa.springboot.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/board/")
public class BoardController {

    @Inject
    private BoardService boardService;

    final private Logger LOG = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "test.do")
    public @ResponseBody List test() {
        System.out.println("test.do");
        return boardService.findBoardList(null);
    }

    @RequestMapping(value = "findBoardList.do")
    public @ResponseBody List findBoardList(@RequestBody Map param) {
        LOG.info("param"+ param);
        return boardService.findBoardList(param);
    }

    @RequestMapping(value = "findBoard.do")
    public @ResponseBody Map<String, Object> findBoard(@RequestBody Map param) {
        return boardService.findBoard(param);
    }

    @RequestMapping(value = "insertModifyBoard.do")
    public @ResponseBody void insertModifyBoard(@RequestBody Map param) {
        LOG.info("param : "+param);
        boardService.insertModifyBoard(param);
    }
}
