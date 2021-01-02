package com.pro100kryto.server.services.usersdatabase.connection;

import java.util.Map;

public class UserDBExt extends UserDB{
    private final Map<String, Object> keyValMap;

    public UserDBExt(long userId, String name, Map<String, Object> keyValMap) {
        super(userId, name);
        this.keyValMap = keyValMap;
    }

    public Map<String, Object> getKeyValMap() {
        return keyValMap;
    }
}
