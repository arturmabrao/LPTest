package model;

import model.promocao.Promocao;
import model.Loja;
import model.promocao.PromocaoPadrao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;

/**
 *
 * @author Artur
 */
public class ProdutoTest {
    
    private Promocao promo = createMock(Promocao.class);
    
    public ProdutoTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetPrecoDeVendaPromocional() {
        //expect(promo.getId()).andReturn(3);
        //expect(promo.getNome()).andReturn("Padrao");
        expect(promo.getDesconto()).andReturn(15.0f);
        replay(promo);
        
        Produto produto = new Produto(); 
        produto.setPreco("50");
        produto.setPromocao(promo);
        String expResult = "35";
        String result = produto.getPrecoDeVenda();
        assertEquals(expResult, result);
    }
    /*
    @Test
    public void testGetPrecoDeVenda() {
        System.out.println("getPrecoDeVenda");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getPrecoDeVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testGetId() {
        System.out.println("getId");
        Produto instance = new Produto();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Produto instance = new Produto();
        Produto expResult = null;
        Produto result = instance.setId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Produto instance = new Produto();
        Produto expResult = null;
        Produto result = instance.setNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getPreco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        String preco = "";
        Produto instance = new Produto();
        Produto expResult = null;
        Produto result = instance.setPreco(preco);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetDisponivel() {
        System.out.println("getDisponivel");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getDisponivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testSetDisponivel() {
        System.out.println("setDisponivel");
        String disponivel = "";
        Produto instance = new Produto();
        Produto expResult = null;
        Produto result = instance.setDisponivel(disponivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Produto instance = new Produto();
        Produto expResult = null;
        Produto result = instance.setDescricao(descricao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetImagem() {
        System.out.println("getImagem");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getImagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetImagem() {
        System.out.println("setImagem");
        String imagem = "";
        Produto instance = new Produto();
        Produto expResult = null;
        Produto result = instance.setImagem(imagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetLoja() {
        System.out.println("getLoja");
        Produto instance = new Produto();
        Loja expResult = null;
        Loja result = instance.getLoja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testSetLoja() {
        System.out.println("setLoja");
        Loja loja = null;
        Produto instance = new Produto();
        Produto expResult = null;
        Produto result = instance.setLoja(loja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Produto instance = new Produto();
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testUpdate() {
        System.out.println("update");
        Produto instance = new Produto();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testGetPromocao() {
        System.out.println("getPromocao");
        Produto instance = new Produto();
        Promocao expResult = null;
        Promocao result = instance.getPromocao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetPromocao() {
        System.out.println("setPromocao");
        Promocao promocao = null;
        Produto instance = new Produto();
        instance.setPromocao(promocao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 */   
}
