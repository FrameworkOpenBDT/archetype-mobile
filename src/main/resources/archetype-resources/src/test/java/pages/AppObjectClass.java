#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.pages;

import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import io.openbdt.element.MobileElement;
import io.openbdt.element.annotations.AndroidFindBy;
import io.openbdt.mapping.AppObject;

@Component
public class AppObjectClass extends AppObject{

	@AndroidFindBy(how = How.ID, using = "com.zeykit.dev.cryptomarketcap:id/search_src_text")
	public MobileElement searchBar;
	
	@AndroidFindBy(how = How.ID, using="com.zeykit.dev.cryptomarketcap:id/action_search")
	public MobileElement searchButton;
	
	@AndroidFindBy(how = How.ID, using="com.zeykit.dev.cryptomarketcap:id/action_add_favorite")
	public MobileElement addNewCoin;
	
	@AndroidFindBy(how = How.ID, using="android:id/button1")
	public MobileElement tutorialDialogButton;
	
	@AndroidFindBy(how = How.XPATH, using="//android.widget.TextView[@text='Crypto Market Cap']")
	public MobileElement identificadorTelaInicial;

	@AndroidFindBy(how = How.ID, using="com.zeykit.dev.cryptomarketcap:id/selected_coin_chart_price_text_view")
	public MobileElement coinCurrentPrice;
	
	@AndroidFindBy(how = How.XPATH, using="//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='0']")
	public MobileElement currencyListItem;
	
	public MobileElement getSearchBar(){
		return this.searchBar;
	}
	
	public MobileElement getSearchButton(){
		return this.searchButton;
	}
	
	public MobileElement getAddNewCoin(){
		return this.addNewCoin;
	}
	
	public MobileElement getCoinCurrentPrice(){
		return this.coinCurrentPrice;
	}
	
	public MobileElement getIdentificadorTelaInicial(){
		return this.identificadorTelaInicial;
	}
	
	public MobileElement getCurrencyListItem(){
		return this.currencyListItem;
	}
	
	public MobileElement getTutorialDialogButton() {
		return this.tutorialDialogButton;
	}
}
