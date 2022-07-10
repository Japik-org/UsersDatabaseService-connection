package com.japik.services.usersdatabase.shared;

import com.japik.service.IServiceConnection;

public interface IUsersDatabaseServiceConnection extends IServiceConnection {
    IUsersCollection getUsersCollection();
}
