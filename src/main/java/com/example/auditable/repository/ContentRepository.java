package com.example.auditable.repository;

import com.example.auditable.model.Content;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ContentRepository extends CrudRepository<Content, Long> {

    @Transactional
    @Modifying
    @Query(value = "update content set status = 'INACTIVE'", nativeQuery = true)
    int updateStatus();
}
