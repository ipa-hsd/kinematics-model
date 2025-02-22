/**
 */
package kinematics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see kinematics.KinematicsFactory
 * @model kind="package"
 * @generated
 */
public interface KinematicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kinematics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ipa.fraunhofer.de/kinematics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kinematics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KinematicsPackage eINSTANCE = kinematics.impl.KinematicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link kinematics.impl.robotImpl <em>robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.robotImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getrobot()
	 * @generated
	 */
	int ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Root link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__ROOT_LINK = 0;

	/**
	 * The feature id for the '<em><b>Joints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__JOINTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = 2;

	/**
	 * The number of structural features of the '<em>robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kinematics.impl.linkImpl <em>link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.linkImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getlink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = 0;

	/**
	 * The number of structural features of the '<em>link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kinematics.impl.jointImpl <em>joint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kinematics.impl.jointImpl
	 * @see kinematics.impl.KinematicsPackageImpl#getjoint()
	 * @generated
	 */
	int JOINT = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__CHILD = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT__NAME = 2;

	/**
	 * The number of structural features of the '<em>joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>joint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link kinematics.robot <em>robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>robot</em>'.
	 * @see kinematics.robot
	 * @generated
	 */
	EClass getrobot();

	/**
	 * Returns the meta object for the containment reference '{@link kinematics.robot#getRoot_link <em>Root link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root link</em>'.
	 * @see kinematics.robot#getRoot_link()
	 * @see #getrobot()
	 * @generated
	 */
	EReference getrobot_Root_link();

	/**
	 * Returns the meta object for the containment reference list '{@link kinematics.robot#getJoints <em>Joints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Joints</em>'.
	 * @see kinematics.robot#getJoints()
	 * @see #getrobot()
	 * @generated
	 */
	EReference getrobot_Joints();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.robot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kinematics.robot#getName()
	 * @see #getrobot()
	 * @generated
	 */
	EAttribute getrobot_Name();

	/**
	 * Returns the meta object for class '{@link kinematics.link <em>link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>link</em>'.
	 * @see kinematics.link
	 * @generated
	 */
	EClass getlink();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kinematics.link#getName()
	 * @see #getlink()
	 * @generated
	 */
	EAttribute getlink_Name();

	/**
	 * Returns the meta object for class '{@link kinematics.joint <em>joint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>joint</em>'.
	 * @see kinematics.joint
	 * @generated
	 */
	EClass getjoint();

	/**
	 * Returns the meta object for the reference '{@link kinematics.joint#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see kinematics.joint#getParent()
	 * @see #getjoint()
	 * @generated
	 */
	EReference getjoint_Parent();

	/**
	 * Returns the meta object for the containment reference '{@link kinematics.joint#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see kinematics.joint#getChild()
	 * @see #getjoint()
	 * @generated
	 */
	EReference getjoint_Child();

	/**
	 * Returns the meta object for the attribute '{@link kinematics.joint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kinematics.joint#getName()
	 * @see #getjoint()
	 * @generated
	 */
	EAttribute getjoint_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KinematicsFactory getKinematicsFactory();

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
		 * The meta object literal for the '{@link kinematics.impl.robotImpl <em>robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.robotImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getrobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getrobot();

		/**
		 * The meta object literal for the '<em><b>Root link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__ROOT_LINK = eINSTANCE.getrobot_Root_link();

		/**
		 * The meta object literal for the '<em><b>Joints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBOT__JOINTS = eINSTANCE.getrobot_Joints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOT__NAME = eINSTANCE.getrobot_Name();

		/**
		 * The meta object literal for the '{@link kinematics.impl.linkImpl <em>link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.linkImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getlink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getlink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__NAME = eINSTANCE.getlink_Name();

		/**
		 * The meta object literal for the '{@link kinematics.impl.jointImpl <em>joint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kinematics.impl.jointImpl
		 * @see kinematics.impl.KinematicsPackageImpl#getjoint()
		 * @generated
		 */
		EClass JOINT = eINSTANCE.getjoint();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__PARENT = eINSTANCE.getjoint_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT__CHILD = eINSTANCE.getjoint_Child();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOINT__NAME = eINSTANCE.getjoint_Name();

	}

} //KinematicsPackage
