/**
 */
package composition.impl;

import composition.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositionFactoryImpl extends EFactoryImpl implements CompositionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompositionFactory init() {
		try {
			CompositionFactory theCompositionFactory = (CompositionFactory)EPackage.Registry.INSTANCE.getEFactory(CompositionPackage.eNS_URI);
			if (theCompositionFactory != null) {
				return theCompositionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompositionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CompositionPackage.PARAMETER: return createParameter();
			case CompositionPackage.PARAMETER_STRING: return createParameterString();
			case CompositionPackage.PARAMETER_POSE: return createParameterPose();
			case CompositionPackage.PARAMETER_VALUE: return createParameterValue();
			case CompositionPackage.PARAMETER_LINK: return createParameterLink();
			case CompositionPackage.LINK_REF: return createLinkRef();
			case CompositionPackage.PARAMETER_TYPE: return createParameterType();
			case CompositionPackage.PARAMETER_POSE_TYPE: return createParameterPoseType();
			case CompositionPackage.PARAMETER_STRING_TYPE: return createParameterStringType();
			case CompositionPackage.PARAMETER_LINK_REF_TYPE: return createParameterLinkRefType();
			case CompositionPackage.COMPONENT: return createComponent();
			case CompositionPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case CompositionPackage.PARAMETER_INSTANCE: return createParameterInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterString createParameterString() {
		ParameterStringImpl parameterString = new ParameterStringImpl();
		return parameterString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterPose createParameterPose() {
		ParameterPoseImpl parameterPose = new ParameterPoseImpl();
		return parameterPose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLink createParameterLink() {
		ParameterLinkImpl parameterLink = new ParameterLinkImpl();
		return parameterLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkRef createLinkRef() {
		LinkRefImpl linkRef = new LinkRefImpl();
		return linkRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterPoseType createParameterPoseType() {
		ParameterPoseTypeImpl parameterPoseType = new ParameterPoseTypeImpl();
		return parameterPoseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterStringType createParameterStringType() {
		ParameterStringTypeImpl parameterStringType = new ParameterStringTypeImpl();
		return parameterStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLinkRefType createParameterLinkRefType() {
		ParameterLinkRefTypeImpl parameterLinkRefType = new ParameterLinkRefTypeImpl();
		return parameterLinkRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstance createParameterInstance() {
		ParameterInstanceImpl parameterInstance = new ParameterInstanceImpl();
		return parameterInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositionPackage getCompositionPackage() {
		return (CompositionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompositionPackage getPackage() {
		return CompositionPackage.eINSTANCE;
	}

} //CompositionFactoryImpl
