package com.japik.services.usersdatabase.shared.req;

import com.japik.utils.ConsumerThrow;

public interface IGetFieldRequest<T> {
    boolean isResolved();
    IGetFieldRequest<T> onResolve(ConsumerThrow<IGetFieldRequest<T>> consumer) throws Throwable;
    T getValue();
}
