package com.karmasoftonline.tm.entity;

import com.karmasoftonline.tm.exceptions.UnauthorizedAccessException;

public interface AuthorizedEntity {
    public void verifyAuthority(AccessTypes...accessTypes) throws UnauthorizedAccessException;
}
