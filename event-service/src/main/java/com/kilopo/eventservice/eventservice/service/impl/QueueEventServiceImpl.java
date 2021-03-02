package com.kilopo.eventservice.eventservice.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kilopo.eventservice.eventservice.dto.EventDTO;
import com.kilopo.eventservice.eventservice.service.QueueEventService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class QueueEventServiceImpl implements QueueEventService {
    private final ObjectMapper objectMapper;

    @Override
    @KafkaListener(id = "Event", topics = {"server.event"}, containerFactory = "singleFactory")
    public void consume(EventDTO dto) {
        log.info("=> consumed {}", writeValueAsString(dto));
    }

    private String writeValueAsString(EventDTO dto) {
        try {
            return objectMapper.writeValueAsString(dto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("Writing value to JSON failed: " + dto.toString());
        }
    }
}
