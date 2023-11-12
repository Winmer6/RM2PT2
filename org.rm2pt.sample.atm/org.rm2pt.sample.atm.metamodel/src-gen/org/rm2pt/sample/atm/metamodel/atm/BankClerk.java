/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Clerk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.BankClerk#getPost <em>Post</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.BankClerk#getPin <em>Pin</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBankClerk()
 * @model
 * @generated
 */
public interface BankClerk extends User {
	/**
	 * Returns the value of the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' attribute.
	 * @see #setPost(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBankClerk_Post()
	 * @model
	 * @generated
	 */
	String getPost();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.BankClerk#getPost <em>Post</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' attribute.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(String value);

	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(int)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getBankClerk_Pin()
	 * @model
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.BankClerk#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

} // BankClerk
