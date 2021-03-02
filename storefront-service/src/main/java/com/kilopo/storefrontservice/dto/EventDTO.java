package com.kilopo.storefrontservice.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.UUID;

@Data
@ToString
public class EventDTO {
    private String id;
    private Object object;
    private Date date;

    public EventDTO(Object object) {
        this.object = object;
        this.date = new Date();
        this.id = UUID.randomUUID().toString();
    }
}