/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getCardID <em>Card ID</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getPassword <em>Password</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getCard2bank <em>Card2bank</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBankCard()
 * @model
 * @generated
 */
public interface BankCard extends EObject {
	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBankCard_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Card2bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card2bank</em>' reference.
	 * @see #setCard2bank(Bank)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBankCard_Card2bank()
	 * @model
	 * @generated
	 */
	Bank getCard2bank();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getCard2bank <em>Card2bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card2bank</em>' reference.
	 * @see #getCard2bank()
	 * @generated
	 */
	void setCard2bank(Bank value);

	/**
	 * Returns the value of the '<em><b>Card ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card ID</em>' attribute.
	 * @see #setCardID(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBankCard_CardID()
	 * @model id="true"
	 * @generated
	 */
	String getCardID();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getCardID <em>Card ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card ID</em>' attribute.
	 * @see #getCardID()
	 * @generated
	 */
	void setCardID(String value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(double)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBankCard_Balance()
	 * @model
	 * @generated
	 */
	double getBalance();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(double value);

	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' attribute.
	 * The literals are from the enumeration {@link org.rm2pt.sample.atm.metamodel.atm.CardCatalog}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' attribute.
	 * @see org.rm2pt.sample.atm.metamodel.atm.CardCatalog
	 * @see #setCatalog(CardCatalog)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBankCard_Catalog()
	 * @model
	 * @generated
	 */
	CardCatalog getCatalog();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getCatalog <em>Catalog</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' attribute.
	 * @see org.rm2pt.sample.atm.metamodel.atm.CardCatalog
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(CardCatalog value);

} // BankCard
