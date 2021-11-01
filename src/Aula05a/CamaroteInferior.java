package Aula05a;

public class CamaroteInferior extends IngressoVIP{
    private String localizacao;

    public void imprimirLocalizacao(){
        System.out.println("Localização: " + getLocalizacao());
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
