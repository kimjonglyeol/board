package com.study.board.repository;

//import com.codingrecipe.board.entity.BoardFileEntity;
import com.study.board.entity.BoardFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {
}
