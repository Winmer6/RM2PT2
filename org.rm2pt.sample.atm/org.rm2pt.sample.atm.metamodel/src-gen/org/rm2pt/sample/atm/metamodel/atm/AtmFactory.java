/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage
 * @generated
 */
public interface AtmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtmFactory eINSTANCE = org.rm2pt.sample.atm.metamodel.atm.impl.AtmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ATM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATM</em>'.
	 * @generated
	 */
	ATM createATM();

	/**
	 * Returns a new object of class '<em>Bank Clerk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Clerk</em>'.
	 * @generated
	 */
	BankClerk createBankClerk();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Bank Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Card</em>'.
	 * @generated
	 */
	BankCard createBankCard();

	/**
	 * Returns a new object of class '<em>Bank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank</em>'.
	 * @generated
	 */
	Bank createBank();

	/**
	 * Returns a new object of class '<em>Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receipt</em>'.
	 * @generated
	 */
	Receipt createReceipt();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtmPackage getAtmPackage();

} //AtmFactory
