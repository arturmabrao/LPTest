
package model.promocao; 


import java.util.GregorianCalendar;
import model.Consumidor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import junit.framework.*;

/**
 *
 * @author Artur
 */
public class PromocaoSortidaTest extends TestCase{
   
    
    public PromocaoSortidaTest() {
        
    }
    
    GregorianCalendar calendar = new GregorianCalendar();
    
    private Consumidor consumidor; 
    private PromocaoSortida promo;   
    int dia;
    
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

/*
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
    public void testGetDesconto_0args() {
        PromocaoSortida instance = new PromocaoSortida();
        float expResult = 5.0F;
        float result = instance.getDesconto();
        assertEquals(expResult, result, 0.0);
    }
*/

    @org.junit.Test
    public void testGetDesconto_ConsumidorIdMenorDia() {
        consumidor.setId(1);
        dia = 1;
        
        float expResult = dia*2;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }
    

    @org.junit.Test
    public void testGetDesconto_ConsumidorIdMaiorDia() {
        //Arrage
        consumidor.setId(31);
        dia = 31;
        //Act
        float expResult = dia;
        float result = promo.getDesconto(consumidor, dia);
        //Assert
        assertEquals(expResult, result);
    }

@org.junit.Test
    public void testGetDesconto_ConsumidorIdMaiorQueDiaResto0() {
        //Arrage
        consumidor.setId(32);
        dia = 16;
        //Act
        float expResult = 23;
        float result = promo.getDesconto(consumidor, dia);
        //Assert
        assertEquals(expResult, result);
    }
    
@org.junit.Test
    public void testGetDesconto_ConsumidorIdMaiorQueDiaRestoMenor6() {
        consumidor.setId(32);
        dia = 27;
        
        float expResult = 28;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }
    
@org.junit.Test
    public void testGetDesconto_ConsumidorIdMaiorQueDiaRestoMenor11() {
        consumidor.setId(32);
        dia = 22;
        
        float expResult = 33;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }
    
@org.junit.Test
    public void testGetDesconto_ConsumidorIdMaiorQueDiaRestoMenor16() {
        consumidor.setId(32);
        dia = 17;
        
        float expResult = 38;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }
    
@org.junit.Test
    public void testGetDesconto_ConsumidorIdMaiorQueDiaRestoMenor21() {
        consumidor.setId(42);
        dia = 22;
        
        float expResult = 43;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testGetDesconto_ConsumidorIdMaiorQueDiaRestoMenor26() {
        consumidor.setId(43);
        dia = 22;
        
        float expResult = 48;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testGetDesconto_ConsumidorIdMaiorQueDiaRestoMenor31() {
        consumidor.setId(61);
        dia = 31;
        
        float expResult = 51;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testGetDesconto_ConsumidorIdMaiorQueDiaRestoMenor() {
        consumidor.setId(63);
        dia = 32;
        
        float expResult = 0;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testGetDesconto_ConsumidorIdZero() {
        consumidor.setId(0);
        dia = 16;
        
        float expResult = 16;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }
    
    @org.junit.Test
    public void testGetDesconto_ConsumidorIdZeroDiaMaior15() {
        consumidor.setId(0);
        dia = 14;
        
        float expResult = 28;
        float result = promo.getDesconto(consumidor, dia);
        
        assertEquals(expResult, result);
    }    
}
