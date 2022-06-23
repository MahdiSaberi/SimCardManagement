package com.maktabsharif74.simcardmanagement.domain;

import com.maktabsharif74.simcardmanagement.base.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.TimeZone;

@Entity
@Table(name = Event.TABLE_NAME)
public class Event extends BaseEntity<Long> {

    public static final String TABLE_NAME = "event";

    @ManyToOne
    private Customer customer;

    @Column
    private ZonedDateTime createDate;

}
