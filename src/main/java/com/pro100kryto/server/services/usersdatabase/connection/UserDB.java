package com.pro100kryto.server.services.usersdatabase.connection;

public abstract class UserDB {
    protected final long userId;

    public UserDB(long userId) {
        this.userId = userId;
    }

    public final long getUserId() {
        return userId;
    }

    public abstract Object getValue(String key);
}
