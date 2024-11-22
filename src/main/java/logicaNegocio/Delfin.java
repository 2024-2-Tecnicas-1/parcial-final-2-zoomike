package logicaNegocio;

public class Delfin extends Animal {

    public Delfin() {
        super("Delfin", "Chirrido", new TipoHabitat[]{TipoHabitat.TERRESTRE});
    }

    @Override
    public String emitirSonido() {
        String sonido = "Silbidos y chasquidos";
        return sonido;
    }

    @Override
    public String obtenerDieta() {
        return Delfin.super.getDieta();

    }
}
