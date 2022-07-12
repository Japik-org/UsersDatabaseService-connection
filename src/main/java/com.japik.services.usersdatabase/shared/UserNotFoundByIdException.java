package com.japik.services.usersdatabase.shared;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserNotFoundByIdException extends UserNotFoundException {
    private final long id;
}
