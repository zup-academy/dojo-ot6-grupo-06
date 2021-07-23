package br.com.zupedu.dojo.ot4dojo.cadastroturma;

public class ErroResponse {
    private String nome;
    private String mensagem;

    public ErroResponse(String nome, String mensagem) {
        this.nome = nome;
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public String mensagem() {
        return mensagem;
    }
}
