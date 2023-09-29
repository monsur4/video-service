package com.mon.videoservice.repository;

import com.mon.videoservice.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    Video findByName(String name);

    boolean existsByName(String name);

    @Query(nativeQuery = true, value = "SELECT name FROM video ORDER BY name")
    List<String> fetchAllVideoNames();

    void deleteByName(String name);
}
