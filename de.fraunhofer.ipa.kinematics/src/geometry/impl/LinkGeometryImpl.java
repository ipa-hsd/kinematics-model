/**
 */
package geometry.impl;

import geometry.Collision;
import geometry.GeometryPackage;
import geometry.LinkGeometry;
import geometry.Visual;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xacro.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link geometry.impl.LinkGeometryImpl#getVisual <em>Visual</em>}</li>
 *   <li>{@link geometry.impl.LinkGeometryImpl#getCollision <em>Collision</em>}</li>
 *   <li>{@link geometry.impl.LinkGeometryImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkGeometryImpl extends MinimalEObjectImpl.Container implements LinkGeometry {
	/**
	 * The cached value of the '{@link #getVisual() <em>Visual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisual()
	 * @generated
	 * @ordered
	 */
	protected Visual visual;

	/**
	 * The cached value of the '{@link #getCollision() <em>Collision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollision()
	 * @generated
	 * @ordered
	 */
	protected Collision collision;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected Link ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.LINK_GEOMETRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visual getVisual() {
		return visual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisual(Visual newVisual, NotificationChain msgs) {
		Visual oldVisual = visual;
		visual = newVisual;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeometryPackage.LINK_GEOMETRY__VISUAL, oldVisual, newVisual);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisual(Visual newVisual) {
		if (newVisual != visual) {
			NotificationChain msgs = null;
			if (visual != null)
				msgs = ((InternalEObject)visual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeometryPackage.LINK_GEOMETRY__VISUAL, null, msgs);
			if (newVisual != null)
				msgs = ((InternalEObject)newVisual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeometryPackage.LINK_GEOMETRY__VISUAL, null, msgs);
			msgs = basicSetVisual(newVisual, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.LINK_GEOMETRY__VISUAL, newVisual, newVisual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collision getCollision() {
		return collision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollision(Collision newCollision, NotificationChain msgs) {
		Collision oldCollision = collision;
		collision = newCollision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeometryPackage.LINK_GEOMETRY__COLLISION, oldCollision, newCollision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollision(Collision newCollision) {
		if (newCollision != collision) {
			NotificationChain msgs = null;
			if (collision != null)
				msgs = ((InternalEObject)collision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeometryPackage.LINK_GEOMETRY__COLLISION, null, msgs);
			if (newCollision != null)
				msgs = ((InternalEObject)newCollision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeometryPackage.LINK_GEOMETRY__COLLISION, null, msgs);
			msgs = basicSetCollision(newCollision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.LINK_GEOMETRY__COLLISION, newCollision, newCollision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (Link)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeometryPackage.LINK_GEOMETRY__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(Link newRef) {
		Link oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometryPackage.LINK_GEOMETRY__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeometryPackage.LINK_GEOMETRY__VISUAL:
				return basicSetVisual(null, msgs);
			case GeometryPackage.LINK_GEOMETRY__COLLISION:
				return basicSetCollision(null, msgs);
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
			case GeometryPackage.LINK_GEOMETRY__VISUAL:
				return getVisual();
			case GeometryPackage.LINK_GEOMETRY__COLLISION:
				return getCollision();
			case GeometryPackage.LINK_GEOMETRY__REF:
				if (resolve) return getRef();
				return basicGetRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeometryPackage.LINK_GEOMETRY__VISUAL:
				setVisual((Visual)newValue);
				return;
			case GeometryPackage.LINK_GEOMETRY__COLLISION:
				setCollision((Collision)newValue);
				return;
			case GeometryPackage.LINK_GEOMETRY__REF:
				setRef((Link)newValue);
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
			case GeometryPackage.LINK_GEOMETRY__VISUAL:
				setVisual((Visual)null);
				return;
			case GeometryPackage.LINK_GEOMETRY__COLLISION:
				setCollision((Collision)null);
				return;
			case GeometryPackage.LINK_GEOMETRY__REF:
				setRef((Link)null);
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
			case GeometryPackage.LINK_GEOMETRY__VISUAL:
				return visual != null;
			case GeometryPackage.LINK_GEOMETRY__COLLISION:
				return collision != null;
			case GeometryPackage.LINK_GEOMETRY__REF:
				return ref != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkGeometryImpl
