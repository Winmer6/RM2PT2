/*
 * generated by Xtext 2.25.0
 */
package org.rm2pt.sample.atm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.rm2pt.sample.atm.ide.contentassist.antlr.internal.InternalDslParser;
import org.rm2pt.sample.atm.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getCardCatalogAccess().getAlternatives(), "rule__CardCatalog__Alternatives");
			builder.put(grammarAccess.getATMAccess().getGroup(), "rule__ATM__Group__0");
			builder.put(grammarAccess.getATMAccess().getGroup_3(), "rule__ATM__Group_3__0");
			builder.put(grammarAccess.getATMAccess().getGroup_4(), "rule__ATM__Group_4__0");
			builder.put(grammarAccess.getBankClerkAccess().getGroup(), "rule__BankClerk__Group__0");
			builder.put(grammarAccess.getBankClerkAccess().getGroup_4(), "rule__BankClerk__Group_4__0");
			builder.put(grammarAccess.getBankClerkAccess().getGroup_5(), "rule__BankClerk__Group_5__0");
			builder.put(grammarAccess.getBankClerkAccess().getGroup_6(), "rule__BankClerk__Group_6__0");
			builder.put(grammarAccess.getBankClerkAccess().getGroup_7(), "rule__BankClerk__Group_7__0");
			builder.put(grammarAccess.getBankClerkAccess().getGroup_8(), "rule__BankClerk__Group_8__0");
			builder.put(grammarAccess.getBankClerkAccess().getGroup_9(), "rule__BankClerk__Group_9__0");
			builder.put(grammarAccess.getBankClerkAccess().getGroup_10(), "rule__BankClerk__Group_10__0");
			builder.put(grammarAccess.getBankClerkAccess().getGroup_11(), "rule__BankClerk__Group_11__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup(), "rule__Customer__Group__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_4(), "rule__Customer__Group_4__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_5(), "rule__Customer__Group_5__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_6(), "rule__Customer__Group_6__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_7(), "rule__Customer__Group_7__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_8(), "rule__Customer__Group_8__0");
			builder.put(grammarAccess.getCustomerAccess().getGroup_9(), "rule__Customer__Group_9__0");
			builder.put(grammarAccess.getBankCardAccess().getGroup(), "rule__BankCard__Group__0");
			builder.put(grammarAccess.getBankCardAccess().getGroup_4(), "rule__BankCard__Group_4__0");
			builder.put(grammarAccess.getBankCardAccess().getGroup_5(), "rule__BankCard__Group_5__0");
			builder.put(grammarAccess.getBankCardAccess().getGroup_6(), "rule__BankCard__Group_6__0");
			builder.put(grammarAccess.getBankCardAccess().getGroup_7(), "rule__BankCard__Group_7__0");
			builder.put(grammarAccess.getBankCardAccess().getGroup_8(), "rule__BankCard__Group_8__0");
			builder.put(grammarAccess.getBankAccess().getGroup(), "rule__Bank__Group__0");
			builder.put(grammarAccess.getBankAccess().getGroup_2(), "rule__Bank__Group_2__0");
			builder.put(grammarAccess.getBankAccess().getGroup_3(), "rule__Bank__Group_3__0");
			builder.put(grammarAccess.getBankAccess().getGroup_7(), "rule__Bank__Group_7__0");
			builder.put(grammarAccess.getReceiptAccess().getGroup(), "rule__Receipt__Group__0");
			builder.put(grammarAccess.getReceiptAccess().getGroup_3(), "rule__Receipt__Group_3__0");
			builder.put(grammarAccess.getReceiptAccess().getGroup_4(), "rule__Receipt__Group_4__0");
			builder.put(grammarAccess.getReceiptAccess().getGroup_5(), "rule__Receipt__Group_5__0");
			builder.put(grammarAccess.getReceiptAccess().getGroup_6(), "rule__Receipt__Group_6__0");
			builder.put(grammarAccess.getReceiptAccess().getGroup_7(), "rule__Receipt__Group_7__0");
			builder.put(grammarAccess.getReceiptAccess().getGroup_8(), "rule__Receipt__Group_8__0");
			builder.put(grammarAccess.getReceiptAccess().getGroup_9(), "rule__Receipt__Group_9__0");
			builder.put(grammarAccess.getReceiptAccess().getGroup_10(), "rule__Receipt__Group_10__0");
			builder.put(grammarAccess.getATMAccess().getAtmIDAssignment_3_1(), "rule__ATM__AtmIDAssignment_3_1");
			builder.put(grammarAccess.getATMAccess().getAddressAssignment_4_1(), "rule__ATM__AddressAssignment_4_1");
			builder.put(grammarAccess.getBankClerkAccess().getUserIDAssignment_2(), "rule__BankClerk__UserIDAssignment_2");
			builder.put(grammarAccess.getBankClerkAccess().getNameAssignment_4_1(), "rule__BankClerk__NameAssignment_4_1");
			builder.put(grammarAccess.getBankClerkAccess().getAddressAssignment_5_1(), "rule__BankClerk__AddressAssignment_5_1");
			builder.put(grammarAccess.getBankClerkAccess().getAgeAssignment_6_1(), "rule__BankClerk__AgeAssignment_6_1");
			builder.put(grammarAccess.getBankClerkAccess().getPhoneAssignment_7_1(), "rule__BankClerk__PhoneAssignment_7_1");
			builder.put(grammarAccess.getBankClerkAccess().getPostAssignment_8_1(), "rule__BankClerk__PostAssignment_8_1");
			builder.put(grammarAccess.getBankClerkAccess().getPinAssignment_9_1(), "rule__BankClerk__PinAssignment_9_1");
			builder.put(grammarAccess.getBankClerkAccess().getUesr2bankAssignment_10_1(), "rule__BankClerk__Uesr2bankAssignment_10_1");
			builder.put(grammarAccess.getBankClerkAccess().getAtmUserAssignment_11_1(), "rule__BankClerk__AtmUserAssignment_11_1");
			builder.put(grammarAccess.getCustomerAccess().getUserIDAssignment_2(), "rule__Customer__UserIDAssignment_2");
			builder.put(grammarAccess.getCustomerAccess().getNameAssignment_4_1(), "rule__Customer__NameAssignment_4_1");
			builder.put(grammarAccess.getCustomerAccess().getAddressAssignment_5_1(), "rule__Customer__AddressAssignment_5_1");
			builder.put(grammarAccess.getCustomerAccess().getAgeAssignment_6_1(), "rule__Customer__AgeAssignment_6_1");
			builder.put(grammarAccess.getCustomerAccess().getPhoneAssignment_7_1(), "rule__Customer__PhoneAssignment_7_1");
			builder.put(grammarAccess.getCustomerAccess().getUesr2bankAssignment_8_1(), "rule__Customer__Uesr2bankAssignment_8_1");
			builder.put(grammarAccess.getCustomerAccess().getAtmUserAssignment_9_1(), "rule__Customer__AtmUserAssignment_9_1");
			builder.put(grammarAccess.getBankCardAccess().getCardIDAssignment_2(), "rule__BankCard__CardIDAssignment_2");
			builder.put(grammarAccess.getBankCardAccess().getBalanceAssignment_4_1(), "rule__BankCard__BalanceAssignment_4_1");
			builder.put(grammarAccess.getBankCardAccess().getCatalogAssignment_5_1(), "rule__BankCard__CatalogAssignment_5_1");
			builder.put(grammarAccess.getBankCardAccess().getPasswordAssignment_6_1(), "rule__BankCard__PasswordAssignment_6_1");
			builder.put(grammarAccess.getBankCardAccess().getCard2bankAssignment_7_1(), "rule__BankCard__Card2bankAssignment_7_1");
			builder.put(grammarAccess.getBankCardAccess().getBc2customerAssignment_8_1(), "rule__BankCard__Bc2customerAssignment_8_1");
			builder.put(grammarAccess.getBankAccess().getBankNameAssignment_2_1(), "rule__Bank__BankNameAssignment_2_1");
			builder.put(grammarAccess.getBankAccess().getAddressAssignment_3_1(), "rule__Bank__AddressAssignment_3_1");
			builder.put(grammarAccess.getBankAccess().getAtmFromAssignment_6(), "rule__Bank__AtmFromAssignment_6");
			builder.put(grammarAccess.getBankAccess().getAtmFromAssignment_7_1(), "rule__Bank__AtmFromAssignment_7_1");
			builder.put(grammarAccess.getReceiptAccess().getTimeAssignment_3_1(), "rule__Receipt__TimeAssignment_3_1");
			builder.put(grammarAccess.getReceiptAccess().getOperationNameAssignment_4_1(), "rule__Receipt__OperationNameAssignment_4_1");
			builder.put(grammarAccess.getReceiptAccess().getBalanceChangedAssignment_5_1(), "rule__Receipt__BalanceChangedAssignment_5_1");
			builder.put(grammarAccess.getReceiptAccess().getBalanceRemainAssignment_6_1(), "rule__Receipt__BalanceRemainAssignment_6_1");
			builder.put(grammarAccess.getReceiptAccess().getBankAssignment_7_1(), "rule__Receipt__BankAssignment_7_1");
			builder.put(grammarAccess.getReceiptAccess().getAtmAssignment_8_1(), "rule__Receipt__AtmAssignment_8_1");
			builder.put(grammarAccess.getReceiptAccess().getBankcardAssignment_9_1(), "rule__Receipt__BankcardAssignment_9_1");
			builder.put(grammarAccess.getReceiptAccess().getR2customerAssignment_10_1(), "rule__Receipt__R2customerAssignment_10_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
