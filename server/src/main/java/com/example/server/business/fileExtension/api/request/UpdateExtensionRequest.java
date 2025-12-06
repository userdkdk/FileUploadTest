package com.example.server.business.fileExtension.api.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UpdateExtensionRequest {
    @NotBlank
    private final String extension;

    @NotNull
    private final boolean enabled;
}
