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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rm2pt.sample.atm.metamodel.atm.AtmPackage;
import org.rm2pt.sample.atm.metamodel.atm.BankCard;
import org.rm2pt.sample.atm.metamodel.atm.Customer;
import org.rm2pt.sample.atm.metamodel.atm.Receipt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.CustomerImpl#getBankcardOf <em>Bankcard Of</em>}</li>
 *   <li>{@link org.rm2pt.sample.atm.metamodel.atm.impl.CustomerImpl#getReceiptOf <em>Receipt Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends UserImpl implements Customer {
	/**
	 * The cached value of the '{@link #getBankcardOf() <em>Bankcard Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankcardOf()
	 * @generated
	 * @ordered
	 */
	protected EList<BankCard> bankcardOf;

	/**
	 * The cached value of the '{@link #getReceiptOf() <em>Receipt Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptOf()
	 * @generated
	 * @ordered
	 */
	protected Receipt receiptOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtmPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankCard> getBankcardOf() {
		if (bankcardOf == null) {
			bankcardOf = new EObjectContainmentEList<BankCard>(BankCard.class, this, AtmPackage.CUSTOMER__BANKCARD_OF);
		}
		return bankcardOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt getReceiptOf() {
		return receiptOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiptOf(Receipt newReceiptOf, NotificationChain msgs) {
		Receipt oldReceiptOf = receiptOf;
		receiptOf = newReceiptOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AtmPackage.CUSTOMER__RECEIPT_OF, oldReceiptOf, newReceiptOf);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiptOf(Receipt newReceiptOf) {
		if (newReceiptOf != receiptOf) {
			NotificationChain msgs = null;
			if (receiptOf != null)
				msgs = ((InternalEObject) receiptOf).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AtmPackage.CUSTOMER__RECEIPT_OF, null, msgs);
			if (newReceiptOf != null)
				msgs = ((InternalEObject) newReceiptOf).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AtmPackage.CUSTOMER__RECEIPT_OF, null, msgs);
			msgs = basicSetReceiptOf(newReceiptOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtmPackage.CUSTOMER__RECEIPT_OF, newReceiptOf,
					newReceiptOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AtmPackage.CUSTOMER__BANKCARD_OF:
			return ((InternalEList<?>) getBankcardOf()).basicRemove(otherEnd, msgs);
		case AtmPackage.CUSTOMER__RECEIPT_OF:
			return basicSetReceiptOf(null, msgs);
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
		case AtmPackage.CUSTOMER__BANKCARD_OF:
			return getBankcardOf();
		case AtmPackage.CUSTOMER__RECEIPT_OF:
			return getReceiptOf();
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
		case AtmPackage.CUSTOMER__BANKCARD_OF:
			getBankcardOf().clear();
			getBankcardOf().addAll((Collection<? extends BankCard>) newValue);
			return;
		case AtmPackage.CUSTOMER__RECEIPT_OF:
			setReceiptOf((Receipt) newValue);
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
		case AtmPackage.CUSTOMER__BANKCARD_OF:
			getBankcardOf().clear();
			return;
		case AtmPackage.CUSTOMER__RECEIPT_OF:
			setReceiptOf((Receipt) null);
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
		case AtmPackage.CUSTOMER__BANKCARD_OF:
			return bankcardOf != null && !bankcardOf.isEmpty();
		case AtmPackage.CUSTOMER__RECEIPT_OF:
			return receiptOf != null;
		}
		return super.eIsSet(featureID);
	}

} //CustomerImpl
