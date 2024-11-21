import logicaNegocio.Animal;
import logicaNegocio.Delfin;
import logicaNegocio.Domestico;
import logicaNegocio.Leon;
import logicaNegocio.Perro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalHerenciaTest {
    @Test
    void testLeonIsAnimal() {
        Animal leon = new Leon();
        assertTrue(leon instanceof Animal);
    }

    @Test
    void testDelfinIsAnimal() {
        Animal delfin = new Delfin();
        assertTrue(delfin instanceof Animal);
    }

    @Test
    void testPerroIsAnimalAndDomestico() {
        Animal perro = new Perro();
        assertTrue(perro instanceof Animal);
        assertTrue(perro instanceof Domestico);
    }
}
