/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.ATM#getAtmID <em>Atm ID</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.ATM#getAddress <em>Address</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.ATM#getATMuser <em>AT Muser</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getATM()
 * @model
 * @generated
 */
public interface ATM extends EObject {
	/**
	 * Returns the value of the '<em><b>Atm ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atm ID</em>' attribute.
	 * @see #setAtmID(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getATM_AtmID()
	 * @model
	 * @generated
	 */
	String getAtmID();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.ATM#getAtmID <em>Atm ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atm ID</em>' attribute.
	 * @see #getAtmID()
	 * @generated
	 */
	void setAtmID(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getATM_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.ATM#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>AT Muser</b></em>' containment reference list.
	 * The list contents are of type {@link org.rm2pt.sample.atm.metamodel.atm.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AT Muser</em>' containment reference list.
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getATM_ATMuser()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getATMuser();

} // ATM
