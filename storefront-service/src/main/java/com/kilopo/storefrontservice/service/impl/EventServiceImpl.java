package com.kilopo.storefrontservice.service.impl;

import com.kilopo.storefrontservice.dto.EventDTO;
import com.kilopo.storefrontservice.service.EventService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class EventServiceImpl implements EventService {
    private final KafkaTemplate<Long, EventDTO> kafkaEventTemplate;

    @Override
    public void send(EventDTO dto) {
        kafkaEventTemplate.send("server.event", dto);
    }
}