package desafiocarro;

public class CarroClass {

    String marca;
    String modelo;
    int ano;
    double combustivel;
    double KmInicial;
    double KmFinal;

    String detalhes (){
        return String.format("Novo carro adcionado: " + marca + "//" + modelo + "//" + ano +
                "//" + combustivel + " Litros de combustível" + "//" + KmInicial + " Quilomêtros rodados");
    }

}