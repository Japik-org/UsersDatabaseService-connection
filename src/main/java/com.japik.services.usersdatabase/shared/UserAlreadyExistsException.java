package com.japik.services.usersdatabase.shared;

import com.japik.utils.databasequery.req.ObjectAlreadyExistsException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserAlreadyExistsException extends ObjectAlreadyExistsException {
    private final long id;
}
