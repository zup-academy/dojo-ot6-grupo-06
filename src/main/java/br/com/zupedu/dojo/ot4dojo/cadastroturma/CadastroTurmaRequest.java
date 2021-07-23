package br.com.zupedu.dojo.ot4dojo.cadastroturma;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class CadastroTurmaRequest {

    @NotBlank
    @Size(max = 50)
    private String nome;

    @FutureOrPresent
    private LocalDate iniciadaEm;

    @FutureOrPresent
    private LocalDate terminaEm;

    public CadastroTurmaRequest(String nome, LocalDate iniciadaEm, LocalDate terminaEm) {
        this.nome = nome;
        this.iniciadaEm = iniciadaEm;
        this.terminaEm = terminaEm;
    }

    @Override
    public String toString() {
        return "CadastroTurmaRequest{" +
                "nome='" + nome + '\'' +
                ", iniciadaEm=" + iniciadaEm +
                ", terminaEm=" + terminaEm +
                '}';
    }
    
    public TurmaEntity toModel() {
    	return new TurmaEntity(this.nome, this.iniciadaEm, this.terminaEm);
    }
}
