/**
 */
package composition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link composition.ComponentInstance#getType <em>Type</em>}</li>
 *   <li>{@link composition.ComponentInstance#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see composition.CompositionPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Component)
	 * @see composition.CompositionPackage#getComponentInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	Component getType();

	/**
	 * Sets the value of the '{@link composition.ComponentInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Component value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link composition.ParameterInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see composition.CompositionPackage#getComponentInstance_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterInstance> getParameters();

} // ComponentInstance
