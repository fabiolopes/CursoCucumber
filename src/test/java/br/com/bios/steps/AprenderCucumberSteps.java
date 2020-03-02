package br.com.bios.steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.com.bios.converters.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumberSteps {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {

	}

	@Quando("^executá-lo$")
	public void executáLo() throws Throwable {

	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {

	}
	
	private int contador = 0;
	
	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^eu incrementar (\\d+)$")
	public void euIncrementar(int arg1) throws Throwable {
		contador += arg1;
	}

	@Então("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);
	}
	
	Date entrega = new Date();
	
	@Dado("^que a entrega é dia (.*)$")
	public void queAEntregaEDia(@Transform(DateConverter.class) Date data) throws Throwable {
	    entrega = data;
	    System.out.println(entrega);
	}

	@Quando("^a entrega atrasar (\\d+) (dias|dias|mes|meses)$")
	public void aEntregaAtrasarDias(int arg1, String tempo) throws Throwable {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(entrega);
	    if(tempo.equals("dias")) {
	    	cal.add(Calendar.DAY_OF_MONTH, arg1);
	    }
	    if(tempo.equals("meses")) {
	    	cal.add(Calendar.MONTH, arg1);
	    }	    
	    entrega = cal.getTime();
	}

	@Então("^a entrega será efetuada em (\\d{2}/\\d{2}/\\d{4})$")
	public void aEntregaSeráEfetuadaEm(String data) throws Throwable {
	    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	    String dataFormatada = format.format(entrega);
	    Assert.assertEquals(data, dataFormatada);
	}
	
	@Dado("^que o ticket( especial)? é A.(\\d+)$")
	public void queOTicketÉAF(String tipo, int arg1) throws Throwable {
	}

	@Quando("^criar os steps$")
	public void criarOsSteps() throws Throwable {
	
	}

	@Entao("^o teste vai passar$")
	public void oTesteVaiPassar() throws Throwable {
	}
	
	@Dado("^que o nome do passageiro é \"(.*)\"$")
	public void queONomeDoPassageiroÉ(String arg1) throws Throwable {
	    
	}
	
	@Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagemÉR$(int arg1, int arg2) throws Throwable {
	   
	}
	
	@Dado("^que o telefone do passageiro é (9\\d{3})-(\\d{4})$")
	public void queOTelefoneDoPassageiroÉ(int arg1, int arg2) throws Throwable {

	}
	

}
