package ${package}.steps.definition;

import org.apache.log4j.Logger;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import ${package}.steps.business.StepBusiness;

@ContextConfiguration("/context.xml")
public class StepDefinition {

	@Steps
	StepBusiness step;
	
	static Logger LOG = Logger.getLogger(StepDefinition.class);
	
	@Given("^estou na tela inicial$")
	public void estouTelaInicial() throws Throwable {
		step.validarTelaInicial();
	}
	
	@And("^busco pelo item \"([^\"]*)\" na lista$")
	public void buscarDadosCriptomoeda(String cryptoCurrency) throws Throwable {
		step.searchCryptoCoin(cryptoCurrency);
	}
	
	@And("^clico no item$")
	public void clicarNoItem() {
		step.escolherItem();
	}
	
	@Then("^verificar cotacao da criptomoeda$")
	public void verificarCotacaoCriptomoeda() throws Throwable {
		step.verifyCryptoCoinPrice();
	}
}
