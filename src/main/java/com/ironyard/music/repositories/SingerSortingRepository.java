package com.ironyard.music.repositories;

import com.ironyard.music.data.Singer;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by favianalopez on 10/25/16.
 */
public interface SingerSortingRepository extends PagingAndSortingRepository<Singer, Long> {
}
