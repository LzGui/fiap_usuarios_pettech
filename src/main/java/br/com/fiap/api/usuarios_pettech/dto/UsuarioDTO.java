package br.com.fiap.api.usuarios_pettech.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record UsuarioDTO(
        Long id,

        @NotBlank(message = "O campo do NOME não pode ser em branco")
        String nome,

        @NotBlank(message = "O campo do E-MAIL não pode ser em branco")
        @Email(message = "Digite um e-mail válido")
        String email,

        @NotBlank(message = "O campo do CPF não pode ser em branco")
        @CPF(message = "Digite um cpf válido")
        String cpf,
        LocalDate dataNascimento
) {


}
