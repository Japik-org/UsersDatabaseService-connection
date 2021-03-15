package com.pro100kryto.server.services.usersdatabase.connection;

import com.pro100kryto.server.service.IServiceConnection;
import org.jetbrains.annotations.Nullable;

import java.rmi.RemoteException;
import java.util.Map;

public interface IUsersDatabaseServiceConnection extends IServiceConnection {
    boolean userExistsById(long userId) throws RemoteException;
    boolean userExistsByKey(String name, Object value) throws RemoteException;

    long createUser(String name, Map<String, Object> keyValMap) throws RemoteException;

    @Nullable UserDB getUser(long userId) throws RemoteException;
    @Nullable UserDB getFirstUser(String key, Object value) throws RemoteException;
    Iterable<UserDB> getAllUsers(String key, Object value) throws RemoteException;

    @Nullable Object getFirstUserVal(long userId, String key) throws RemoteException;
    @Nullable Object getFirstUserVal(String key, Object value, String key2);
}
