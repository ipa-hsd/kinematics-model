/**
 */
package xacro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xacro.Link#getName <em>Name</em>}</li>
 *   <li>{@link xacro.Link#getInertial <em>Inertial</em>}</li>
 *   <li>{@link xacro.Link#getResolved <em>Resolved</em>}</li>
 * </ul>
 *
 * @see xacro.XacroPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(ParameterString)
	 * @see xacro.XacroPackage#getLink_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterString getName();

	/**
	 * Sets the value of the '{@link xacro.Link#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(ParameterString value);

	/**
	 * Returns the value of the '<em><b>Inertial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inertial</em>' containment reference.
	 * @see #setInertial(Inertial)
	 * @see xacro.XacroPackage#getLink_Inertial()
	 * @model containment="true"
	 * @generated
	 */
	Inertial getInertial();

	/**
	 * Sets the value of the '{@link xacro.Link#getInertial <em>Inertial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inertial</em>' containment reference.
	 * @see #getInertial()
	 * @generated
	 */
	void setInertial(Inertial value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(String)
	 * @see xacro.XacroPackage#getLink_Resolved()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getResolved();

	/**
	 * Sets the value of the '{@link xacro.Link#getResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #getResolved()
	 * @generated
	 */
	void setResolved(String value);

} // Link
