package com.tistory.kisspa.springboot.board;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class BoardService {

    private static final String namespace = "board.";

    @Inject
    private SqlSession sqlSession;

    public List findBoardList(Map<String, Object> param) {
        return sqlSession.selectList(namespace+"findBoardList", param);
    }

    public Map<String, Object> findBoard(Map param) {
        return sqlSession.selectOne(namespace+"findBoard", param);
    }
}
