package no.nav.syfo.kafka.sykepengesoknad.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class SvarDTO {
    String verdi;
}
