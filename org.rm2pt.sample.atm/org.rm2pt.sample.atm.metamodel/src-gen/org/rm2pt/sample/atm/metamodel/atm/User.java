/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.User#getName <em>Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.User#getAddress <em>Address</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.User#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.User#getAge <em>Age</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.User#getPhone <em>Phone</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.User#getBank <em>Bank</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getUser()
 * @model abstract="true"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getUser_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.User#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getUser_UserID()
	 * @model id="true"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.User#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getUser_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.User#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getUser_Phone()
	 * @model
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.User#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' reference.
	 * @see #setBank(Bank)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getUser_Bank()
	 * @model
	 * @generated
	 */
	Bank getBank();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.User#getBank <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' reference.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(Bank value);

} // User
