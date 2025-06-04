package br.com.rafaela.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException(){
        super("Usúario já existe");
    }
}
