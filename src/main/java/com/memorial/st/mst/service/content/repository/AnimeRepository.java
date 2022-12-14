package com.memorial.st.mst.service.content.repository;

import com.memorial.st.mst.domain.content.MstSeason;
import com.memorial.st.mst.domain.content.enumType.SeasonType;
import com.memorial.st.mst.domain.content.model.MstAnime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AnimeRepository extends JpaRepository<MstAnime, Long> {
//    List<MstAnime> findAllBySeason(SeasonType season);

    @Query("select a from MstAnime a join fetch a.seasonList sl where sl.season = :seasonType" )
    List<MstAnime> findAllBySeason(SeasonType seasonType);
}
