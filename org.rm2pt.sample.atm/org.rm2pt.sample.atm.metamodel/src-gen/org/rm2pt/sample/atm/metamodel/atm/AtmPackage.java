/**
 */
package org.rm2pt.sample.atm.metamodel.atm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.rm2pt.sample.atm.metamodel.atm.AtmFactory
 * @model kind="package"
 * @generated
 */
public interface AtmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rm2pt.com/atm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtmPackage eINSTANCE = org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.ATMImpl <em>ATM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.ATMImpl
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getATM()
	 * @generated
	 */
	int ATM = 0;

	/**
	 * The feature id for the '<em><b>Atm ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM__ATM_ID = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>AT Muser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM__AT_MUSER = 2;

	/**
	 * The number of structural features of the '<em>ATM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>ATM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.UserImpl
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AGE = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PHONE = 4;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BANK = 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankClerkImpl <em>Bank Clerk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.BankClerkImpl
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getBankClerk()
	 * @generated
	 */
	int BANK_CLERK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK__ADDRESS = USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK__AGE = USER__AGE;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK__PHONE = USER__PHONE;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK__BANK = USER__BANK;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK__POST = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK__PIN = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bank Clerk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bank Clerk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CLERK_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.CustomerImpl
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = USER__NAME;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__AGE = USER__AGE;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE = USER__PHONE;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BANK = USER__BANK;

	/**
	 * The feature id for the '<em><b>Bankcard Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BANKCARD_OF = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receipt Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__RECEIPT_OF = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankCardImpl <em>Bank Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.BankCardImpl
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getBankCard()
	 * @generated
	 */
	int BANK_CARD = 4;

	/**
	 * The feature id for the '<em><b>Card ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__CARD_ID = 0;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__BALANCE = 1;

	/**
	 * The feature id for the '<em><b>Catalog</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__CATALOG = 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__PASSWORD = 3;

	/**
	 * The feature id for the '<em><b>Card2bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD__CARD2BANK = 4;

	/**
	 * The number of structural features of the '<em>Bank Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bank Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankImpl <em>Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.BankImpl
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getBank()
	 * @generated
	 */
	int BANK = 5;

	/**
	 * The feature id for the '<em><b>Atm From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ATM_FROM = 0;

	/**
	 * The feature id for the '<em><b>Bank Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__BANK_NAME = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl <em>Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getReceipt()
	 * @generated
	 */
	int RECEIPT = 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__TIME = 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__OPERATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Balance Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__BALANCE_CHANGED = 2;

	/**
	 * The feature id for the '<em><b>Balance Remain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__BALANCE_REMAIN = 3;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__BANK = 4;

	/**
	 * The feature id for the '<em><b>Atm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__ATM = 5;

	/**
	 * The feature id for the '<em><b>Bankcard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT__BANKCARD = 6;

	/**
	 * The number of structural features of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.rm2pt.sample.atm.metamodel.atm.CardCatalog <em>Card Catalog</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rm2pt.sample.atm.metamodel.atm.CardCatalog
	 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getCardCatalog()
	 * @generated
	 */
	int CARD_CATALOG = 7;

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.atm.metamodel.atm.ATM <em>ATM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATM</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.ATM
	 * @generated
	 */
	EClass getATM();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.ATM#getAtmID <em>Atm ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atm ID</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.ATM#getAtmID()
	 * @see #getATM()
	 * @generated
	 */
	EAttribute getATM_AtmID();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.ATM#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.ATM#getAddress()
	 * @see #getATM()
	 * @generated
	 */
	EAttribute getATM_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.atm.metamodel.atm.ATM#getATMuser <em>AT Muser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AT Muser</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.ATM#getATMuser()
	 * @see #getATM()
	 * @generated
	 */
	EReference getATM_ATMuser();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.atm.metamodel.atm.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.User#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.User#getAddress()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.User#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.User#getAge()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Age();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.User#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.User#getPhone()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Phone();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.atm.metamodel.atm.User#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.User#getBank()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Bank();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.atm.metamodel.atm.BankClerk <em>Bank Clerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Clerk</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankClerk
	 * @generated
	 */
	EClass getBankClerk();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.BankClerk#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankClerk#getPost()
	 * @see #getBankClerk()
	 * @generated
	 */
	EAttribute getBankClerk_Post();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.BankClerk#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankClerk#getPin()
	 * @see #getBankClerk()
	 * @generated
	 */
	EAttribute getBankClerk_Pin();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.atm.metamodel.atm.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.atm.metamodel.atm.Customer#getBankcardOf <em>Bankcard Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bankcard Of</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Customer#getBankcardOf()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_BankcardOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.rm2pt.sample.atm.metamodel.atm.Customer#getReceiptOf <em>Receipt Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receipt Of</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Customer#getReceiptOf()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_ReceiptOf();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard <em>Bank Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Card</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankCard
	 * @generated
	 */
	EClass getBankCard();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankCard#getPassword()
	 * @see #getBankCard()
	 * @generated
	 */
	EAttribute getBankCard_Password();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getCard2bank <em>Card2bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Card2bank</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankCard#getCard2bank()
	 * @see #getBankCard()
	 * @generated
	 */
	EReference getBankCard_Card2bank();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getCardID <em>Card ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card ID</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankCard#getCardID()
	 * @see #getBankCard()
	 * @generated
	 */
	EAttribute getBankCard_CardID();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankCard#getBalance()
	 * @see #getBankCard()
	 * @generated
	 */
	EAttribute getBankCard_Balance();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.BankCard#getCatalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catalog</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.BankCard#getCatalog()
	 * @see #getBankCard()
	 * @generated
	 */
	EAttribute getBankCard_Catalog();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.atm.metamodel.atm.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Bank
	 * @generated
	 */
	EClass getBank();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rm2pt.sample.atm.metamodel.atm.Bank#getAtmFrom <em>Atm From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atm From</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Bank#getAtmFrom()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_AtmFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.Bank#getBankName <em>Bank Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bank Name</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Bank#getBankName()
	 * @see #getBank()
	 * @generated
	 */
	EAttribute getBank_BankName();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.Bank#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Bank#getAddress()
	 * @see #getBank()
	 * @generated
	 */
	EAttribute getBank_Address();

	/**
	 * Returns the meta object for class '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Receipt
	 * @generated
	 */
	EClass getReceipt();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Receipt#getTime()
	 * @see #getReceipt()
	 * @generated
	 */
	EAttribute getReceipt_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Receipt#getOperationName()
	 * @see #getReceipt()
	 * @generated
	 */
	EAttribute getReceipt_OperationName();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBalanceChanged <em>Balance Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance Changed</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Receipt#getBalanceChanged()
	 * @see #getReceipt()
	 * @generated
	 */
	EAttribute getReceipt_BalanceChanged();

	/**
	 * Returns the meta object for the attribute '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBalanceRemain <em>Balance Remain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance Remain</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Receipt#getBalanceRemain()
	 * @see #getReceipt()
	 * @generated
	 */
	EAttribute getReceipt_BalanceRemain();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Receipt#getBank()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_Bank();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getAtm <em>Atm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atm</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Receipt#getAtm()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_Atm();

	/**
	 * Returns the meta object for the reference '{@link org.rm2pt.sample.atm.metamodel.atm.Receipt#getBankcard <em>Bankcard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bankcard</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.Receipt#getBankcard()
	 * @see #getReceipt()
	 * @generated
	 */
	EReference getReceipt_Bankcard();

	/**
	 * Returns the meta object for enum '{@link org.rm2pt.sample.atm.metamodel.atm.CardCatalog <em>Card Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Card Catalog</em>'.
	 * @see org.rm2pt.sample.atm.metamodel.atm.CardCatalog
	 * @generated
	 */
	EEnum getCardCatalog();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtmFactory getAtmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.ATMImpl <em>ATM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.ATMImpl
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getATM()
		 * @generated
		 */
		EClass ATM = eINSTANCE.getATM();

		/**
		 * The meta object literal for the '<em><b>Atm ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATM__ATM_ID = eINSTANCE.getATM_AtmID();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATM__ADDRESS = eINSTANCE.getATM_Address();

		/**
		 * The meta object literal for the '<em><b>AT Muser</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATM__AT_MUSER = eINSTANCE.getATM_ATMuser();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.UserImpl
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ADDRESS = eINSTANCE.getUser_Address();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserID();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AGE = eINSTANCE.getUser_Age();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PHONE = eINSTANCE.getUser_Phone();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__BANK = eINSTANCE.getUser_Bank();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankClerkImpl <em>Bank Clerk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.BankClerkImpl
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getBankClerk()
		 * @generated
		 */
		EClass BANK_CLERK = eINSTANCE.getBankClerk();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_CLERK__POST = eINSTANCE.getBankClerk_Post();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_CLERK__PIN = eINSTANCE.getBankClerk_Pin();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.CustomerImpl
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Bankcard Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__BANKCARD_OF = eINSTANCE.getCustomer_BankcardOf();

		/**
		 * The meta object literal for the '<em><b>Receipt Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__RECEIPT_OF = eINSTANCE.getCustomer_ReceiptOf();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankCardImpl <em>Bank Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.BankCardImpl
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getBankCard()
		 * @generated
		 */
		EClass BANK_CARD = eINSTANCE.getBankCard();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_CARD__PASSWORD = eINSTANCE.getBankCard_Password();

		/**
		 * The meta object literal for the '<em><b>Card2bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_CARD__CARD2BANK = eINSTANCE.getBankCard_Card2bank();

		/**
		 * The meta object literal for the '<em><b>Card ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_CARD__CARD_ID = eINSTANCE.getBankCard_CardID();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_CARD__BALANCE = eINSTANCE.getBankCard_Balance();

		/**
		 * The meta object literal for the '<em><b>Catalog</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_CARD__CATALOG = eINSTANCE.getBankCard_Catalog();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.BankImpl <em>Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.BankImpl
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getBank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getBank();

		/**
		 * The meta object literal for the '<em><b>Atm From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__ATM_FROM = eINSTANCE.getBank_AtmFrom();

		/**
		 * The meta object literal for the '<em><b>Bank Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK__BANK_NAME = eINSTANCE.getBank_BankName();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK__ADDRESS = eINSTANCE.getBank_Address();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl <em>Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.ReceiptImpl
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getReceipt()
		 * @generated
		 */
		EClass RECEIPT = eINSTANCE.getReceipt();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIPT__TIME = eINSTANCE.getReceipt_Time();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIPT__OPERATION_NAME = eINSTANCE.getReceipt_OperationName();

		/**
		 * The meta object literal for the '<em><b>Balance Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIPT__BALANCE_CHANGED = eINSTANCE.getReceipt_BalanceChanged();

		/**
		 * The meta object literal for the '<em><b>Balance Remain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIPT__BALANCE_REMAIN = eINSTANCE.getReceipt_BalanceRemain();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__BANK = eINSTANCE.getReceipt_Bank();

		/**
		 * The meta object literal for the '<em><b>Atm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__ATM = eINSTANCE.getReceipt_Atm();

		/**
		 * The meta object literal for the '<em><b>Bankcard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIPT__BANKCARD = eINSTANCE.getReceipt_Bankcard();

		/**
		 * The meta object literal for the '{@link org.rm2pt.sample.atm.metamodel.atm.CardCatalog <em>Card Catalog</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rm2pt.sample.atm.metamodel.atm.CardCatalog
		 * @see org.rm2pt.sample.atm.metamodel.atm.impl.AtmPackageImpl#getCardCatalog()
		 * @generated
		 */
		EEnum CARD_CATALOG = eINSTANCE.getCardCatalog();

	}

} //AtmPackage
