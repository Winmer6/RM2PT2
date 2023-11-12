/**
 */
package org.rm2pt.sample.atm.metamodel.atm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.rm2pt.sample.atm.metamodel.atm.AtmPackage;
import org.rm2pt.sample.atm.metamodel.atm.Bank;
import org.rm2pt.sample.atm.metamodel.atm.BankCard;
import org.rm2pt.sample.atm.metamodel.atm.CardCatalog;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankCardImpl#getCardID <em>Card ID</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankCardImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankCardImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankCardImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankCardImpl#getCard2bank <em>Card2bank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankCardImpl extends MinimalEObjectImpl.Container implements BankCard {
	/**
	 * The default value of the '{@link #getCardID() <em>Card ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardID()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardID() <em>Card ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardID()
	 * @generated
	 * @ordered
	 */
	protected String cardID = CARD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final double BALANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected double balance = BALANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected static final CardCatalog CATALOG_EDEFAULT = CardCatalog.CREDIT;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected CardCatalog catalog = CATALOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCard2bank() <em>Card2bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard2bank()
	 * @generated
	 * @ordered
	 */
	protected Bank card2bank;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtmPackage.Literals.BANK_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.BANK_CARD__PASSWORD, oldPassword,
					password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank getCard2bank() {
		if (card2bank != null && card2bank.eIsProxy()) {
			InternalEObject oldCard2bank = (InternalEObject) card2bank;
			card2bank = (Bank) eResolveProxy(oldCard2bank);
			if (card2bank != oldCard2bank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtmPackage.BANK_CARD__CARD2BANK,
							oldCard2bank, card2bank));
			}
		}
		return card2bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank basicGetCard2bank() {
		return card2bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCard2bank(Bank newCard2bank) {
		Bank oldCard2bank = card2bank;
		card2bank = newCard2bank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.BANK_CARD__CARD2BANK, oldCard2bank,
					card2bank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardID() {
		return cardID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardID(String newCardID) {
		String oldCardID = cardID;
		cardID = newCardID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.BANK_CARD__CARD_ID, oldCardID, cardID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(double newBalance) {
		double oldBalance = balance;
		balance = newBalance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.BANK_CARD__BALANCE, oldBalance, balance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardCatalog getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(CardCatalog newCatalog) {
		CardCatalog oldCatalog = catalog;
		catalog = newCatalog == null ? CATALOG_EDEFAULT : newCatalog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.BANK_CARD__CATALOG, oldCatalog, catalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtmPackage.BANK_CARD__CARD_ID:
			return getCardID();
		case AtmPackage.BANK_CARD__BALANCE:
			return getBalance();
		case AtmPackage.BANK_CARD__CATALOG:
			return getCatalog();
		case AtmPackage.BANK_CARD__PASSWORD:
			return getPassword();
		case AtmPackage.BANK_CARD__CARD2BANK:
			if (resolve)
				return getCard2bank();
			return basicGetCard2bank();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AtmPackage.BANK_CARD__CARD_ID:
			setCardID((String) newValue);
			return;
		case AtmPackage.BANK_CARD__BALANCE:
			setBalance((Double) newValue);
			return;
		case AtmPackage.BANK_CARD__CATALOG:
			setCatalog((CardCatalog) newValue);
			return;
		case AtmPackage.BANK_CARD__PASSWORD:
			setPassword((String) newValue);
			return;
		case AtmPackage.BANK_CARD__CARD2BANK:
			setCard2bank((Bank) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AtmPackage.BANK_CARD__CARD_ID:
			setCardID(CARD_ID_EDEFAULT);
			return;
		case AtmPackage.BANK_CARD__BALANCE:
			setBalance(BALANCE_EDEFAULT);
			return;
		case AtmPackage.BANK_CARD__CATALOG:
			setCatalog(CATALOG_EDEFAULT);
			return;
		case AtmPackage.BANK_CARD__PASSWORD:
			setPassword(PASSWORD_EDEFAULT);
			return;
		case AtmPackage.BANK_CARD__CARD2BANK:
			setCard2bank((Bank) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AtmPackage.BANK_CARD__CARD_ID:
			return CARD_ID_EDEFAULT == null ? cardID != null : !CARD_ID_EDEFAULT.equals(cardID);
		case AtmPackage.BANK_CARD__BALANCE:
			return balance != BALANCE_EDEFAULT;
		case AtmPackage.BANK_CARD__CATALOG:
			return catalog != CATALOG_EDEFAULT;
		case AtmPackage.BANK_CARD__PASSWORD:
			return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		case AtmPackage.BANK_CARD__CARD2BANK:
			return card2bank != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cardID: ");
		result.append(cardID);
		result.append(", balance: ");
		result.append(balance);
		result.append(", catalog: ");
		result.append(catalog);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //BankCardImpl
