package com.ak.example.messaging.dao;

import com.ak.example.messaging.model.MessagePostResp;
import com.ak.example.messaging.model.MessageRequest;
import com.ak.example.messaging.model.MessageResp;

public interface WriteMessageDetails {

    void writeMessageAsHash(Integer id, String text, String userName,String expireDate );
}
