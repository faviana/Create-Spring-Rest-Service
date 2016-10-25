package com.ironyard.music.repositories;

import com.ironyard.music.data.Music;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by favianalopez on 10/24/16.
 */

public interface MusicRepository extends CrudRepository< Music, Long> {}

