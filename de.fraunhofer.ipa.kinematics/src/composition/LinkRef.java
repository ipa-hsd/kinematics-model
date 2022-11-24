/**
 */
package composition;

import kinematics.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link composition.LinkRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see composition.CompositionPackage#getLinkRef()
 * @model
 * @generated
 */
public interface LinkRef extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Link)
	 * @see composition.CompositionPackage#getLinkRef_Ref()
	 * @model
	 * @generated
	 */
	Link getRef();

	/**
	 * Sets the value of the '{@link composition.LinkRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Link value);

} // LinkRef
