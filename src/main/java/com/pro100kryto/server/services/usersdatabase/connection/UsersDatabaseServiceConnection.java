package com.pro100kryto.server.services.usersdatabase.connection;

import com.pro100kryto.server.service.IServiceConnection;
import com.sun.istack.Nullable;

import java.util.Map;

public interface UsersDatabaseServiceConnection extends IServiceConnection {
    boolean userExistsById(long userId);
    boolean userExistsByName(String name);

    long createUser(String name, Map<String, Object> keyValMap);

    @Nullable UserDB getUser(long userId);
    @Nullable UserDB getUser(String name);

    @Nullable UserDBExt geUserExt(long userId);
    @Nullable UserDBExt getUserExt(String name);

    @Nullable Object getUserVal(long userId, String key);
    @Nullable Object getUserVal(String name, String key);
}
