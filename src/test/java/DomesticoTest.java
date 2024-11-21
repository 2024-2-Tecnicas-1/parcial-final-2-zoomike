import logicaNegocio.Domestico;
import logicaNegocio.Perro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DomesticoTest {

    @Test
    void testInteraccionConHumano() {
        Domestico perro = new Perro();
        assertEquals("El perro mueve la cola y ladra de felicidad", perro.interactuarConHumano());
    }
}
