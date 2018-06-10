package com.ak.example.messaging.service;

import com.ak.example.messaging.model.MessagePostResp;
import com.ak.example.messaging.model.MessageRequest;

public interface MessageService {

    MessagePostResp newMsgResp(MessageRequest messageRequest);
}
