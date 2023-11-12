/**
 */
package org.rm2pt.sample.atm.metamodel.atm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.rm2pt.sample.atm.metamodel.atm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage
 * @generated
 */
public class AtmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AtmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtmSwitch<Adapter> modelSwitch = new AtmSwitch<Adapter>() {
		@Override
		public Adapter caseATM(ATM object) {
			return createATMAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseBankClerk(BankClerk object) {
			return createBankClerkAdapter();
		}

		@Override
		public Adapter caseCustomer(Customer object) {
			return createCustomerAdapter();
		}

		@Override
		public Adapter caseBankCard(BankCard object) {
			return createBankCardAdapter();
		}

		@Override
		public Adapter caseBank(Bank object) {
			return createBankAdapter();
		}

		@Override
		public Adapter caseReceipt(Receipt object) {
			return createReceiptAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.atm.metamodel.atm.ATM <em>ATM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.atm.metamodel.atm.ATM
	 * @generated
	 */
	public Adapter createATMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.atm.metamodel.atm.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.atm.metamodel.atm.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.atm.metamodel.atm.BankClerk <em>Bank Clerk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankClerk
	 * @generated
	 */
	public Adapter createBankClerkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.atm.metamodel.atm.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard <em>Bank Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankCard
	 * @generated
	 */
	public Adapter createBankCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.atm.metamodel.atm.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Bank
	 * @generated
	 */
	public Adapter createBankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Receipt
	 * @generated
	 */
	public Adapter createReceiptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AtmAdapterFactory
