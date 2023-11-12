/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getTime <em>Time</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBalanceChanged <em>Balance Changed</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBalanceRemain <em>Balance Remain</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBank <em>Bank</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getAtm <em>Atm</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBankcard <em>Bankcard</em>}</li>
 * </ul>
 *
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getReceipt()
 * @model
 * @generated
 */
public interface Receipt extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getReceipt_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getReceipt_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Balance Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance Changed</em>' attribute.
	 * @see #setBalanceChanged(double)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getReceipt_BalanceChanged()
	 * @model
	 * @generated
	 */
	double getBalanceChanged();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBalanceChanged <em>Balance Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance Changed</em>' attribute.
	 * @see #getBalanceChanged()
	 * @generated
	 */
	void setBalanceChanged(double value);

	/**
	 * Returns the value of the '<em><b>Balance Remain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance Remain</em>' attribute.
	 * @see #setBalanceRemain(double)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getReceipt_BalanceRemain()
	 * @model
	 * @generated
	 */
	double getBalanceRemain();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBalanceRemain <em>Balance Remain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance Remain</em>' attribute.
	 * @see #getBalanceRemain()
	 * @generated
	 */
	void setBalanceRemain(double value);

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' reference.
	 * @see #setBank(Bank)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getReceipt_Bank()
	 * @model
	 * @generated
	 */
	Bank getBank();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBank <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' reference.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(Bank value);

	/**
	 * Returns the value of the '<em><b>Atm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atm</em>' reference.
	 * @see #setAtm(ATM)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getReceipt_Atm()
	 * @model
	 * @generated
	 */
	ATM getAtm();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getAtm <em>Atm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atm</em>' reference.
	 * @see #getAtm()
	 * @generated
	 */
	void setAtm(ATM value);

	/**
	 * Returns the value of the '<em><b>Bankcard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bankcard</em>' reference.
	 * @see #setBankcard(BankCard)
	 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getReceipt_Bankcard()
	 * @model
	 * @generated
	 */
	BankCard getBankcard();

	/**
	 * Sets the value of the '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBankcard <em>Bankcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bankcard</em>' reference.
	 * @see #getBankcard()
	 * @generated
	 */
	void setBankcard(BankCard value);

} // Receipt
