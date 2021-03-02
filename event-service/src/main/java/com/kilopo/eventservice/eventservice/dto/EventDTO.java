package com.kilopo.eventservice.eventservice.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class EventDTO {
    private String id;
    private Object object;
    private Date date;

}
