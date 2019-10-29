package no.nav.syfo.kafka.sykepengesoknadarbeidsledig.dto

import no.nav.syfo.kafka.interfaces.Soknad
import java.time.LocalDate
import java.time.LocalDateTime

data class SykepengesoknadArbeidsledigDTO(
        val id: String? = null,
        val status: SoknadsstatusDTO? = null,
        val aktorId: String? = null,
        val sykmeldingId: String? = null,
        val korrigerer: String? = null,
        val korrigertAv: String? = null,
        val soktUtenlandsopphold: Boolean? = null,
        val fom: LocalDate? = null,
        val tom: LocalDate? = null,
        val startSyketilfelle: LocalDate? = null,
        val sykmeldingSkrevet: LocalDateTime? = null,
        val opprettet: LocalDateTime? = null,
        val sendtNav: LocalDateTime? = null,
        val fravar: List<FravarDTO>? = null,
        val andreInntektskilder: List<InntektskildeDTO>? = null,
        val soknadsperioder: List<SoknadsperiodeDTO>? = null,
        val sporsmal: List<SporsmalDTO>? = null,
        val avsendertype: AvsendertypeDTO? = null
) : Soknad