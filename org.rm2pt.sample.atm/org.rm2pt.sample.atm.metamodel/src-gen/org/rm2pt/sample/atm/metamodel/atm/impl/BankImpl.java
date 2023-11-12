/**
 */
package org.rm2pt.sample.atm.metamodel.atm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rm2pt.sample.atm.metamodel.atm.ATM;
import org.rm2pt.sample.atm.metamodel.atm.AtmPackage;
import org.rm2pt.sample.atm.metamodel.atm.Bank;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankImpl#getAtmFrom <em>Atm From</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankImpl#getBankName <em>Bank Name</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankImpl extends MinimalEObjectImpl.Container implements Bank {
	/**
	 * The cached value of the '{@link #getAtmFrom() <em>Atm From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtmFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<ATM> atmFrom;

	/**
	 * The default value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBankName() <em>Bank Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankName()
	 * @generated
	 * @ordered
	 */
	protected String bankName = BANK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtmPackage.Literals.BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATM> getAtmFrom() {
		if (atmFrom == null) {
			atmFrom = new EObjectContainmentEList<ATM>(ATM.class, this, AtmPackage.BANK__ATM_FROM);
		}
		return atmFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBankName(String newBankName) {
		String oldBankName = bankName;
		bankName = newBankName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.BANK__BANK_NAME, oldBankName, bankName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.BANK__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtmPackage.BANK__ATM_FROM:
			return ((InternalEList<?>) getAtmFrom()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AtmPackage.BANK__ATM_FROM:
			return getAtmFrom();
		case AtmPackage.BANK__BANK_NAME:
			return getBankName();
		case AtmPackage.BANK__ADDRESS:
			return getAddress();
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
		case AtmPackage.BANK__ATM_FROM:
			getAtmFrom().clear();
			getAtmFrom().addAll((Collection<? extends ATM>) newValue);
			return;
		case AtmPackage.BANK__BANK_NAME:
			setBankName((String) newValue);
			return;
		case AtmPackage.BANK__ADDRESS:
			setAddress((String) newValue);
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
		case AtmPackage.BANK__ATM_FROM:
			getAtmFrom().clear();
			return;
		case AtmPackage.BANK__BANK_NAME:
			setBankName(BANK_NAME_EDEFAULT);
			return;
		case AtmPackage.BANK__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
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
		case AtmPackage.BANK__ATM_FROM:
			return atmFrom != null && !atmFrom.isEmpty();
		case AtmPackage.BANK__BANK_NAME:
			return BANK_NAME_EDEFAULT == null ? bankName != null : !BANK_NAME_EDEFAULT.equals(bankName);
		case AtmPackage.BANK__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
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
		result.append(" (bankName: ");
		result.append(bankName);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //BankImpl
