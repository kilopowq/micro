package com.kilopo.storefrontservice.service;

import com.kilopo.storefrontservice.dto.EventDTO;

public interface EventService {

    void send(EventDTO dto);
}
