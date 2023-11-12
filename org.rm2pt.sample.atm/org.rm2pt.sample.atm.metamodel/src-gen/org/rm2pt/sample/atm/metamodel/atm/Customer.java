/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Customer#getBankcardOf <em>Bankcard Of</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Customer#getReceiptOf <em>Receipt Of</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends User {
	/**
	 * Returns the value of the '<em><b>Bankcard Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.sample.atm.metamodel.atm.BankCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bankcard Of</em>' containment reference list.
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getCustomer_BankcardOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<BankCard> getBankcardOf();

	/**
	 * Returns the value of the '<em><b>Receipt Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Of</em>' containment reference.
	 * @see #setReceiptOf(Receipt)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getCustomer_ReceiptOf()
	 * @model containment="true"
	 * @generated
	 */
	Receipt getReceiptOf();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Customer#getReceiptOf <em>Receipt Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt Of</em>' containment reference.
	 * @see #getReceiptOf()
	 * @generated
	 */
	void setReceiptOf(Receipt value);

} // Customer
