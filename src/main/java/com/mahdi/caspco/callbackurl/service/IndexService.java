package com.mahdi.caspco.callbackurl.service;

import com.mahdi.caspco.callbackurl.dto.Request;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class IndexService {

    private final static List<Request> requestList = new ArrayList<>();

    public void addRequest(Request request) {
        requestList.add(request);
        log.info("add request to the requestList");
    }

}
