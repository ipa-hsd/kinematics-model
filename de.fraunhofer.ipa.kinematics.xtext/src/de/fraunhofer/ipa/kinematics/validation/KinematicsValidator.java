/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.validation;

import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.validation.Check;
import urdf.Joint;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class KinematicsValidator extends AbstractKinematicsValidator {
	
	public static final String INVALID_TYPE = "invalidType";

	@Check
	public void checkJointType(Joint joint) {
		List<String> joint_types = Arrays.asList("revolute","continuous","prismatic","fixed","floating","planar");
		if (!joint_types.contains(joint.getType())) {
			error("Joint has an invalid type, only the following types are allowed: "+joint_types.toString(), null, INVALID_TYPE);
		}
	}
	
}
