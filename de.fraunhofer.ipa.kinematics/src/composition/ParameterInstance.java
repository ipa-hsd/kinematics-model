/**
 */
package composition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link composition.ParameterInstance#getParameter <em>Parameter</em>}</li>
 *   <li>{@link composition.ParameterInstance#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see composition.CompositionPackage#getParameterInstance()
 * @model
 * @generated
 */
public interface ParameterInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see composition.CompositionPackage#getParameterInstance_Parameter()
	 * @model required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link composition.ParameterInstance#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ParameterValue)
	 * @see composition.CompositionPackage#getParameterInstance_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterValue getValue();

	/**
	 * Sets the value of the '{@link composition.ParameterInstance#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ParameterValue value);

} // ParameterInstance
