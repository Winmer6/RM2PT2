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
import org.rm2pt.sample.atm.metamodel.atm.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ATMImpl#getAtmID <em>Atm ID</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ATMImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.ATMImpl#getATMuser <em>AT Muser</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATMImpl extends MinimalEObjectImpl.Container implements ATM {
	/**
	 * The default value of the '{@link #getAtmID() <em>Atm ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtmID()
	 * @generated
	 * @ordered
	 */
	protected static final String ATM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtmID() <em>Atm ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtmID()
	 * @generated
	 * @ordered
	 */
	protected String atmID = ATM_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getATMuser() <em>AT Muser</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATMuser()
	 * @generated
	 * @ordered
	 */
	protected EList<User> atMuser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtmPackage.Literals.ATM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtmID() {
		return atmID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtmID(String newAtmID) {
		String oldAtmID = atmID;
		atmID = newAtmID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.ATM__ATM_ID, oldAtmID, atmID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.ATM__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getATMuser() {
		if (atMuser == null) {
			atMuser = new EObjectContainmentEList<User>(User.class, this, AtmPackage.ATM__AT_MUSER);
		}
		return atMuser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtmPackage.ATM__AT_MUSER:
			return ((InternalEList<?>) getATMuser()).basicRemove(otherEnd, msgs);
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
		case AtmPackage.ATM__ATM_ID:
			return getAtmID();
		case AtmPackage.ATM__ADDRESS:
			return getAddress();
		case AtmPackage.ATM__AT_MUSER:
			return getATMuser();
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
		case AtmPackage.ATM__ATM_ID:
			setAtmID((String) newValue);
			return;
		case AtmPackage.ATM__ADDRESS:
			setAddress((String) newValue);
			return;
		case AtmPackage.ATM__AT_MUSER:
			getATMuser().clear();
			getATMuser().addAll((Collection<? extends User>) newValue);
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
		case AtmPackage.ATM__ATM_ID:
			setAtmID(ATM_ID_EDEFAULT);
			return;
		case AtmPackage.ATM__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case AtmPackage.ATM__AT_MUSER:
			getATMuser().clear();
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
		case AtmPackage.ATM__ATM_ID:
			return ATM_ID_EDEFAULT == null ? atmID != null : !ATM_ID_EDEFAULT.equals(atmID);
		case AtmPackage.ATM__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case AtmPackage.ATM__AT_MUSER:
			return atMuser != null && !atMuser.isEmpty();
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
		result.append(" (atmID: ");
		result.append(atmID);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //ATMImpl
