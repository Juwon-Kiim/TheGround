package com.ssafy.theground.repository;

import com.ssafy.theground.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Long> {

    Season findByUserSeq(Long userSeq);
}
