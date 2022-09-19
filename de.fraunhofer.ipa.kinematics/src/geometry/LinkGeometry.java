/**
 */
package geometry;

import org.eclipse.emf.ecore.EObject;

import xacro.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link geometry.LinkGeometry#getVisual <em>Visual</em>}</li>
 *   <li>{@link geometry.LinkGeometry#getCollision <em>Collision</em>}</li>
 *   <li>{@link geometry.LinkGeometry#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see geometry.GeometryPackage#getLinkGeometry()
 * @model
 * @generated
 */
public interface LinkGeometry extends EObject {
	/**
	 * Returns the value of the '<em><b>Visual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual</em>' containment reference.
	 * @see #setVisual(Visual)
	 * @see geometry.GeometryPackage#getLinkGeometry_Visual()
	 * @model containment="true"
	 * @generated
	 */
	Visual getVisual();

	/**
	 * Sets the value of the '{@link geometry.LinkGeometry#getVisual <em>Visual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual</em>' containment reference.
	 * @see #getVisual()
	 * @generated
	 */
	void setVisual(Visual value);

	/**
	 * Returns the value of the '<em><b>Collision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collision</em>' containment reference.
	 * @see #setCollision(Collision)
	 * @see geometry.GeometryPackage#getLinkGeometry_Collision()
	 * @model containment="true"
	 * @generated
	 */
	Collision getCollision();

	/**
	 * Sets the value of the '{@link geometry.LinkGeometry#getCollision <em>Collision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collision</em>' containment reference.
	 * @see #getCollision()
	 * @generated
	 */
	void setCollision(Collision value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Link)
	 * @see geometry.GeometryPackage#getLinkGeometry_Ref()
	 * @model required="true"
	 * @generated
	 */
	Link getRef();

	/**
	 * Sets the value of the '{@link geometry.LinkGeometry#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Link value);

} // LinkGeometry
