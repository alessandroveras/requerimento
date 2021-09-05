import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RequerimentoTest {
    @Test
    public void name() {

            Requerimento req = new Requerimento();
            req.setId(1);
            req.setNome("req1");

            assertEquals(req.getId(), new Integer(1));
            assertEquals(req.getNome(), "req1");


    }
}
