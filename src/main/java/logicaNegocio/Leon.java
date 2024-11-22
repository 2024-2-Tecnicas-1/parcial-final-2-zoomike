package logicaNegocio;

public class Leon extends Animal {

    public Leon() {
        super("Leon", "Carnivoro", new TipoHabitat[]{TipoHabitat.TERRESTRE});
    }

    @Override
    public String emitirSonido() {
        String sonido = "Rugido";
        return sonido;
    }

    @Override
    public String obtenerDieta() {
        return Leon.super.getDieta();
    }
}
