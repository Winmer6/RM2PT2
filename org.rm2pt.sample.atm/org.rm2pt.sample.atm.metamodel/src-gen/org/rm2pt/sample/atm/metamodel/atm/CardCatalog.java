/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Card Catalog</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmPackage#getCardCatalog()
 * @model
 * @generated
 */
public enum CardCatalog implements Enumerator {
	/**
	 * The '<em><b>CREDIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDIT_VALUE
	 * @generated
	 * @ordered
	 */
	CREDIT(0, "CREDIT", "CREDIT"),

	/**
	 * The '<em><b>DEBIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIT_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIT(1, "DEBIT", "DEBIT");

	/**
	 * The '<em><b>CREDIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREDIT_VALUE = 0;

	/**
	 * The '<em><b>DEBIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEBIT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Card Catalog</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CardCatalog[] VALUES_ARRAY = new CardCatalog[] { CREDIT, DEBIT, };

	/**
	 * A public read-only list of all the '<em><b>Card Catalog</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CardCatalog> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Card Catalog</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CardCatalog get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardCatalog result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Card Catalog</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CardCatalog getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CardCatalog result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Card Catalog</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CardCatalog get(int value) {
		switch (value) {
		case CREDIT_VALUE:
			return CREDIT;
		case DEBIT_VALUE:
			return DEBIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CardCatalog(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //CardCatalog
