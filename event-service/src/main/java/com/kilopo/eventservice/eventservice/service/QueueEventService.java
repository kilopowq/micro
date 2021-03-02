package com.kilopo.eventservice.eventservice.service;

import com.kilopo.eventservice.eventservice.dto.EventDTO;

public interface QueueEventService {
    void consume(EventDTO dto);
}
