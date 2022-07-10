package com.japik.services.usersdatabase.shared;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class UserInsert {
    private final String username;
    private final String email;
    private final byte[] pass;
}
