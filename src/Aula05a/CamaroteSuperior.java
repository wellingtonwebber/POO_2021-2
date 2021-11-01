package Aula05a;

public class CamaroteSuperior extends IngressoVIP{

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

    @Override
    public void imprimeValor() {
        System.out.println("Valor do camarote superior R$ " + getValor());
    }

    @Override
    public float getValor() {
        return super.getValor() + 100.0f;
    }
}
