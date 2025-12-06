package com.example.server.business.fileExtension.api.response;

import com.example.server.business.fileExtension.domain.FileExtension;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ExtensionResponse {

    private final String extension;
    private final boolean enabled;

    public static ExtensionResponse of(FileExtension ext) {
        return ExtensionResponse.builder()
                .extension(ext.getExtension())
                .enabled(ext.isEnabled())
                .build();
    }
}
