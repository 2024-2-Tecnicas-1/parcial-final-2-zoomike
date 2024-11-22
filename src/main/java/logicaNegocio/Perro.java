package logicaNegocio;

public class Perro extends Animal {

    private String interaccion = "El perro mueve la cola y ladra de felicidad";

    public Perro() {
        super("Perro", "Omnivoro", new TipoHabitat[]{TipoHabitat.TERRESTRE});
    }

    @Override
    public String emitirSonido() {
        String sonido = "Ladrido";
        return sonido;
    }

    @Override
    public String obtenerDieta() {
        return Perro.super.getDieta();
    }

    public String interactuarConHumano() {
        return interaccion;
    }
}
