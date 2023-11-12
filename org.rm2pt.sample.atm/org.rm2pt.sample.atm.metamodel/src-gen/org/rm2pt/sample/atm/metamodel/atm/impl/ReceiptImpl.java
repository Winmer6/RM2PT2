/**
 */
package org.rm2pt.sample.atm.metamodel.atm.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.rm2pt.sample.atm.metamodel.atm.ATM;
import org.rm2pt.sample.atm.metamodel.atm.AtmPackage;
import org.rm2pt.sample.atm.metamodel.atm.Bank;
import org.rm2pt.sample.atm.metamodel.atm.BankCard;
import org.rm2pt.sample.atm.metamodel.atm.Receipt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl#getBalanceChanged <em>Balance Changed</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl#getBalanceRemain <em>Balance Remain</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl#getAtm <em>Atm</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl#getBankcard <em>Bankcard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiptImpl extends MinimalEObjectImpl.Container implements Receipt {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected String operationName = OPERATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBalanceChanged() <em>Balance Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalanceChanged()
	 * @generated
	 * @ordered
	 */
	protected static final double BALANCE_CHANGED_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBalanceChanged() <em>Balance Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalanceChanged()
	 * @generated
	 * @ordered
	 */
	protected double balanceChanged = BALANCE_CHANGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBalanceRemain() <em>Balance Remain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalanceRemain()
	 * @generated
	 * @ordered
	 */
	protected static final double BALANCE_REMAIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBalanceRemain() <em>Balance Remain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalanceRemain()
	 * @generated
	 * @ordered
	 */
	protected double balanceRemain = BALANCE_REMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBank() <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBank()
	 * @generated
	 * @ordered
	 */
	protected Bank bank;

	/**
	 * The cached value of the '{@link #getAtm() <em>Atm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtm()
	 * @generated
	 * @ordered
	 */
	protected ATM atm;

	/**
	 * The cached value of the '{@link #getBankcard() <em>Bankcard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankcard()
	 * @generated
	 * @ordered
	 */
	protected BankCard bankcard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtmPackage.Literals.RECEIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.RECEIPT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		String oldOperationName = operationName;
		operationName = newOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.RECEIPT__OPERATION_NAME, oldOperationName,
					operationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBalanceChanged() {
		return balanceChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalanceChanged(double newBalanceChanged) {
		double oldBalanceChanged = balanceChanged;
		balanceChanged = newBalanceChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.RECEIPT__BALANCE_CHANGED,
					oldBalanceChanged, balanceChanged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBalanceRemain() {
		return balanceRemain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalanceRemain(double newBalanceRemain) {
		double oldBalanceRemain = balanceRemain;
		balanceRemain = newBalanceRemain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.RECEIPT__BALANCE_REMAIN, oldBalanceRemain,
					balanceRemain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank getBank() {
		if (bank != null && bank.eIsProxy()) {
			InternalEObject oldBank = (InternalEObject) bank;
			bank = (Bank) eResolveProxy(oldBank);
			if (bank != oldBank) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtmPackage.RECEIPT__BANK, oldBank, bank));
			}
		}
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank basicGetBank() {
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBank(Bank newBank) {
		Bank oldBank = bank;
		bank = newBank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.RECEIPT__BANK, oldBank, bank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATM getAtm() {
		if (atm != null && atm.eIsProxy()) {
			InternalEObject oldAtm = (InternalEObject) atm;
			atm = (ATM) eResolveProxy(oldAtm);
			if (atm != oldAtm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtmPackage.RECEIPT__ATM, oldAtm, atm));
			}
		}
		return atm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATM basicGetAtm() {
		return atm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtm(ATM newAtm) {
		ATM oldAtm = atm;
		atm = newAtm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.RECEIPT__ATM, oldAtm, atm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankCard getBankcard() {
		if (bankcard != null && bankcard.eIsProxy()) {
			InternalEObject oldBankcard = (InternalEObject) bankcard;
			bankcard = (BankCard) eResolveProxy(oldBankcard);
			if (bankcard != oldBankcard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AtmPackage.RECEIPT__BANKCARD, oldBankcard,
							bankcard));
			}
		}
		return bankcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankCard basicGetBankcard() {
		return bankcard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankcard(BankCard newBankcard) {
		BankCard oldBankcard = bankcard;
		bankcard = newBankcard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.RECEIPT__BANKCARD, oldBankcard, bankcard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtmPackage.RECEIPT__TIME:
			return getTime();
		case AtmPackage.RECEIPT__OPERATION_NAME:
			return getOperationName();
		case AtmPackage.RECEIPT__BALANCE_CHANGED:
			return getBalanceChanged();
		case AtmPackage.RECEIPT__BALANCE_REMAIN:
			return getBalanceRemain();
		case AtmPackage.RECEIPT__BANK:
			if (resolve)
				return getBank();
			return basicGetBank();
		case AtmPackage.RECEIPT__ATM:
			if (resolve)
				return getAtm();
			return basicGetAtm();
		case AtmPackage.RECEIPT__BANKCARD:
			if (resolve)
				return getBankcard();
			return basicGetBankcard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AtmPackage.RECEIPT__TIME:
			setTime((Date) newValue);
			return;
		case AtmPackage.RECEIPT__OPERATION_NAME:
			setOperationName((String) newValue);
			return;
		case AtmPackage.RECEIPT__BALANCE_CHANGED:
			setBalanceChanged((Double) newValue);
			return;
		case AtmPackage.RECEIPT__BALANCE_REMAIN:
			setBalanceRemain((Double) newValue);
			return;
		case AtmPackage.RECEIPT__BANK:
			setBank((Bank) newValue);
			return;
		case AtmPackage.RECEIPT__ATM:
			setAtm((ATM) newValue);
			return;
		case AtmPackage.RECEIPT__BANKCARD:
			setBankcard((BankCard) newValue);
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
		case AtmPackage.RECEIPT__TIME:
			setTime(TIME_EDEFAULT);
			return;
		case AtmPackage.RECEIPT__OPERATION_NAME:
			setOperationName(OPERATION_NAME_EDEFAULT);
			return;
		case AtmPackage.RECEIPT__BALANCE_CHANGED:
			setBalanceChanged(BALANCE_CHANGED_EDEFAULT);
			return;
		case AtmPackage.RECEIPT__BALANCE_REMAIN:
			setBalanceRemain(BALANCE_REMAIN_EDEFAULT);
			return;
		case AtmPackage.RECEIPT__BANK:
			setBank((Bank) null);
			return;
		case AtmPackage.RECEIPT__ATM:
			setAtm((ATM) null);
			return;
		case AtmPackage.RECEIPT__BANKCARD:
			setBankcard((BankCard) null);
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
		case AtmPackage.RECEIPT__TIME:
			return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
		case AtmPackage.RECEIPT__OPERATION_NAME:
			return OPERATION_NAME_EDEFAULT == null ? operationName != null
					: !OPERATION_NAME_EDEFAULT.equals(operationName);
		case AtmPackage.RECEIPT__BALANCE_CHANGED:
			return balanceChanged != BALANCE_CHANGED_EDEFAULT;
		case AtmPackage.RECEIPT__BALANCE_REMAIN:
			return balanceRemain != BALANCE_REMAIN_EDEFAULT;
		case AtmPackage.RECEIPT__BANK:
			return bank != null;
		case AtmPackage.RECEIPT__ATM:
			return atm != null;
		case AtmPackage.RECEIPT__BANKCARD:
			return bankcard != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", operationName: ");
		result.append(operationName);
		result.append(", balanceChanged: ");
		result.append(balanceChanged);
		result.append(", balanceRemain: ");
		result.append(balanceRemain);
		result.append(')');
		return result.toString();
	}

} //ReceiptImpl
