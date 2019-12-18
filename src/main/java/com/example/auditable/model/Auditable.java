package com.example.auditable.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter
public class Auditable {
    @CreatedBy
    protected String createdBy;

    @CreatedDate
    @Column(columnDefinition = "TIMESTAMP")
    protected LocalDateTime createdDate;

    @LastModifiedBy
    protected String lastModifiedBy;

    @LastModifiedDate
    @Column(columnDefinition = "TIMESTAMP")
    protected LocalDateTime lastModifiedDate;

    protected String createdByName;

    protected String lastUpdateByName;
}
