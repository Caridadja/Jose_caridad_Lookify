package com.caridadja.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.caridadja.lookify.models.Song;
@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
	List<Song> findByArtist(String artist);
	List<Song> findTop10ByOrderByRatingDesc();
}
