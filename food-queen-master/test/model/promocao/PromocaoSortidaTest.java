
package model.promocao; 


import java.util.GregorianCalendar;
import static javax.swing.UIManager.get;
import org.junit.*;
import model.Consumidor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;
import org.easymock.*;

/**
 *
 * @author Artur
 */
public class PromocaoSortidaTest extends TestCase{
    
    public PromocaoSortidaTest() {
        
    }
    
    private Consumidor consumidor; 
    private PromocaoSortida promo;   
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        consumidor = new Consumidor();
        promo = new PromocaoSortida();
    }
    
    @After
    public void tearDown() {
    }


    @org.junit.Test
    public void testGetNome() {
        PromocaoSortida instance = new PromocaoSortida();
        String expResult = "Sortida";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }


    @org.junit.Test
    public void testGetId() {
        PromocaoSortida instance = new PromocaoSortida();
        int expResult = 5;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }


    @org.junit.Test
    public void testGetDesconto_ConsumidorDiaMenor() {
        consumidor.setId(1);
        
        float expResult = (float)get(GregorianCalendar.DAY_OF_MONTH)*2;
        float result = promo.getDesconto(consumidor);
        
        assertEquals(expResult, result);
    }
    

    @org.junit.Test
    public void testGetDesconto_ConsumidorDiaMaior() {
        consumidor.setId(31);
        
        float expResult = (float)get(GregorianCalendar.DAY_OF_MONTH);
        float result = promo.getDesconto(consumidor);
        
        assertEquals(expResult, result);
    }


    @org.junit.Test
    public void testGetDesconto_0args() {
        PromocaoSortida instance = new PromocaoSortida();
        float expResult = 5.0F;
        float result = instance.getDesconto();
        assertEquals(expResult, result, 0.0);
    }
    
}
