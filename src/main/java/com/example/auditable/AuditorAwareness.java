package com.example.auditable;

import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

public class AuditorAwareness implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.ofNullable("BirceEmineErol");
    }
}
