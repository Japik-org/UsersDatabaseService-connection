package com.pro100kryto.server.services.usersdatabase.connection;

public class UserDB {
    protected final long userId;
    protected final String name;

    public UserDB(long userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
