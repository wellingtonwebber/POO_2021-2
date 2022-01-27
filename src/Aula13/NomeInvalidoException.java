package Aula13;

public class NomeInvalidoException extends Exception {
    @Override
    public String getMessage(){
        return "Esse nome de arquivo é inválido";
    }
}
