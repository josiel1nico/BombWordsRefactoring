package test;

import static org.junit.Assert.*;

import java.util.Random;

import main.java.dao.ConcreteDAOPalavrasDeListaArquivos;
import main.java.dao.DAOListaDePalavras;
import main.java.fachadaparadao.FachadaDAO;

import org.junit.Before;
import org.junit.Test;

public class TestFachadaDAO {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetFachadaDAO() {
		assertNotNull(FachadaDAO.getFachadaDAO());
	}

	@Test
	public void testLerConfiguracoesJogo() {
		String[] esperado = {"10", "20"};
		assertArrayEquals("Sucesso", esperado, FachadaDAO.getFachadaDAO().lerConfiguracoesJogo());
	}

	@Test
	public void testSetarNovasConfiguracoesJogo() {
		String[] esperado = {"10", "20"};
		FachadaDAO.getFachadaDAO().setarNovasConfiguracoesJogo(10, 20);
		assertArrayEquals("Sucesso", esperado, FachadaDAO.getFachadaDAO().lerConfiguracoesJogo());
	}

	@Test
	public void testCriarNovaListaPalavras() {
		Random r = new Random();
		String nome = "novaLista" + r.nextInt(100);
		System.out.println(nome);
		assertTrue(FachadaDAO.getFachadaDAO().criarNovaListaPalavras(nome));
	}

	@Test
	public void testRemoverListaPalavras() {
		assertFalse(FachadaDAO.getFachadaDAO().removerListaPalavras("naoExiste"));
	}
/*	
	@Test
	public void testLimparListaPalavras() {
		assertTrue(FachadaDAO.getFachadaDAO().limparListaPalavras("limparLista"));
	}
*/
	@Test
	public void testExtrairNomesDeTodasAsListasDePalavras() {

	}

	@Test
	public void testListaDePalavrasJahExiste() {
		assertFalse(FachadaDAO.getFachadaDAO().listaDePalavrasJahExiste("naoExiste"));
	}

	@Test
	public void testMudarListaASerUsadaNoJogo() {
		assertTrue(FachadaDAO.getFachadaDAO().mudarListaASerUsadaNoJogo("mudarLista"));
	}

	@Test
	public void testPegarNomeListaASerUsadaNoJogo() {
		FachadaDAO.getFachadaDAO().mudarListaASerUsadaNoJogo("pegarLista");
		assertEquals("pegarLista",FachadaDAO.getFachadaDAO().pegarNomeListaASerUsadaNoJogo());
	}

	@Test
	public void testExtrairPalavrasETraducoes() {
		
	}

	@Test
	public void testAdicionarNovaPalavraNaLista() {
		FachadaDAO.getFachadaDAO().adicionarNovaPalavraNaLista("novaLista", "Vasco da Gama", "Maior do Mundo");
	}

	@Test
	public void testRemoverPalavraDaLista() {
		
	}

	@Test
	public void testInserirJogadorRanking() {
		FachadaDAO.getFachadaDAO().inserirJogadorRanking("Ezequely", 10);
		String[] esperado = {"phi;4300;5;9", "j;2300;10;20", "pi;800;10;20", "phi;600;5;5", "Phi;600;5;5", "Josiel;400;10;20", "pablo;400;10;20", "Ezequely;10;10;20"};
		assertArrayEquals("Sucesso", esperado, FachadaDAO.getFachadaDAO().lerRanking());
	}

	@Test
	public void testLerRanking() {
		
	}

}