package Aula05b;

public class Aula05b {
    public static void main(String[] args) {

        Animal[] v1 = new Animal[10];

        v1[0] = new Cachorro();
        v1[1] = new Cavalo();
        v1[2] = new Preguica();
        v1[3] = new Cachorro();
        v1[4] = new Cavalo();
        v1[5] = new Preguica();
        v1[6] = new Cachorro();
        v1[7] = new Cavalo();
        v1[8] = new Preguica();
        v1[9] = new Cachorro();

        for(int x = 0; x < 10; x++){
            v1[x].emitirSom();
        }

    }
}
