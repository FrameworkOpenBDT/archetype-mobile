#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.steps.business;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

import ${package}.pages.AppObjectClass;
import io.openbdt.element.MobileScreenElement;

@ContextConfiguration("/context.xml")
@Component
public class StepBusiness {

	@Autowired
	private AppObjectClass appObject;
	
	@Autowired
	private MobileScreenElement mobileElement;
	
	private Logger LOG = Logger.getLogger(StepBusiness.class);
	
	public void addNewCoin(){
		mobileElement.click(appObject.getAddNewCoin());
	}
	
	public void closeTutorialDialog() {
		mobileElement.click(appObject.getTutorialDialogButton());
	}
	
	public void searchCryptoCoin(String cryptoCurrency){
		mobileElement.click(appObject.getSearchButton());
		mobileElement.sendText(appObject.getSearchBar(), cryptoCurrency);
		mobileElement.swipeUntilElementIsvisible(appObject.getCurrencyListItem());
	}
	
	public void escolherItem() {
		mobileElement.click(appObject.getCurrencyListItem());
	}
	
	public void verifyCryptoCoinPrice(){
		LOG.info(String.format("Price: %s\n", mobileElement.getText(appObject.getCoinCurrentPrice())));
	}
	
	public void validarTelaInicial(){
		assertTrue(mobileElement.isDisplayed(appObject.getIdentificadorTelaInicial()));
	}
}