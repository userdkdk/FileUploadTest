package com.example.server.business.fileExtension.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActionType {
    CREATED(true),
    ENABLED(true),
    DISABLED(false);

    private final boolean status;
}
