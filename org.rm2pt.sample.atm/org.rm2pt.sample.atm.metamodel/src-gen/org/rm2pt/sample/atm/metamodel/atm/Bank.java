/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Bank#getAtmFrom <em>Atm From</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Bank#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Bank#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBank()
 * @model
 * @generated
 */
public interface Bank extends EObject {
	/**
	 * Returns the value of the '<em><b>Atm From</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.sample.atm.metamodel.atm.ATM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atm From</em>' containment reference list.
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBank_AtmFrom()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ATM> getAtmFrom();

	/**
	 * Returns the value of the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank Name</em>' attribute.
	 * @see #setBankName(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBank_BankName()
	 * @model
	 * @generated
	 */
	String getBankName();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Bank#getBankName <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Name</em>' attribute.
	 * @see #getBankName()
	 * @generated
	 */
	void setBankName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBank_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Bank#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // Bank
