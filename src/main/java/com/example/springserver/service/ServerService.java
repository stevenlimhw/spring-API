package com.example.springserver.service;

import java.io.IOException;
import java.util.Collection;

import com.example.springserver.model.Server;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
