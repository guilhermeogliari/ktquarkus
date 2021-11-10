package br.com.ktquarkus.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@RegisterForReflection
@Data
@ToString
public class User {
    private String name;
    private LocalDate birth;
}
