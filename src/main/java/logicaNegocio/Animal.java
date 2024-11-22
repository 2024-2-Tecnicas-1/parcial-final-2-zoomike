package logicaNegocio;

public abstract class Animal {

    private String nombreAnimal;
    private String dieta;
    private TipoHabitat[] tipoHabitat = new TipoHabitat[1];

    public Animal(String nombreAnimal, String dieta, TipoHabitat[] tipoHabitat) {
        this.nombreAnimal = nombreAnimal;
        this.dieta = dieta;
        this.tipoHabitat = tipoHabitat;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public String getDieta() {
        return dieta;
    }
    
    public TipoHabitat[] getTipoHabitat() {
        return tipoHabitat;
    }

    public abstract String emitirSonido();

    public abstract String obtenerDieta();

}
