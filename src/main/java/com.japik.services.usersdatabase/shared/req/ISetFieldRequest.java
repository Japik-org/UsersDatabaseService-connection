package com.japik.services.usersdatabase.shared.req;

import com.japik.utils.ConsumerThrow;

public interface ISetFieldRequest<T> {
    ISetFieldRequest<T> onUpdate(ConsumerThrow<ISetFieldRequest<T>> consumer) throws Throwable;
    void setValue(T value);
    boolean isUpdated();
}
