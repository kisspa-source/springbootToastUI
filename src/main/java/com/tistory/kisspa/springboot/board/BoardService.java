package com.tistory.kisspa.springboot.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service
@Transactional
public class BoardService {

    private static final String namespace = "board.";

    @Inject
    private SqlSession sqlSession;

    public List findBoardList() {
        return sqlSession.selectList(namespace+"findBoardList");
    }

}
