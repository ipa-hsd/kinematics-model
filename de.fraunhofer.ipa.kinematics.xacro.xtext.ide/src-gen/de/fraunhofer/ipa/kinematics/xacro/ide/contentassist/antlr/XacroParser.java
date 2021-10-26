/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.xacro.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fraunhofer.ipa.kinematics.xacro.ide.contentassist.antlr.internal.InternalXacroParser;
import de.fraunhofer.ipa.kinematics.xacro.services.XacroGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class XacroParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(XacroGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, XacroGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getRobotAccess().getGroup(), "rule__Robot__Group__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_5(), "rule__Robot__Group_5__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_6(), "rule__Robot__Group_6__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_6_3(), "rule__Robot__Group_6_3__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_7(), "rule__Robot__Group_7__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_8(), "rule__Robot__Group_8__0");
			builder.put(grammarAccess.getRobotAccess().getGroup_8_3(), "rule__Robot__Group_8_3__0");
			builder.put(grammarAccess.getMacroAccess().getGroup(), "rule__Macro__Group__0");
			builder.put(grammarAccess.getMacroAccess().getGroup_4(), "rule__Macro__Group_4__0");
			builder.put(grammarAccess.getMacroAccess().getGroup_4_3(), "rule__Macro__Group_4_3__0");
			builder.put(grammarAccess.getMacroAccess().getGroup_5(), "rule__Macro__Group_5__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_4(), "rule__Parameter__Group_4__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_5(), "rule__Parameter__Group_5__0");
			builder.put(grammarAccess.getBodyAccess().getGroup(), "rule__Body__Group__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_3(), "rule__Body__Group_3__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_3_3(), "rule__Body__Group_3_3__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_4(), "rule__Body__Group_4__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_4_3(), "rule__Body__Group_4_3__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_5(), "rule__Body__Group_5__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_5_3(), "rule__Body__Group_5_3__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_6(), "rule__Body__Group_6__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_6_3(), "rule__Body__Group_6_3__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_7(), "rule__Body__Group_7__0");
			builder.put(grammarAccess.getBodyAccess().getGroup_7_3(), "rule__Body__Group_7_3__0");
			builder.put(grammarAccess.getMacroCallAccess().getGroup(), "rule__MacroCall__Group__0");
			builder.put(grammarAccess.getMacroCallAccess().getGroup_3(), "rule__MacroCall__Group_3__0");
			builder.put(grammarAccess.getMacroCallAccess().getGroup_3_2(), "rule__MacroCall__Group_3_2__0");
			builder.put(grammarAccess.getMacroCallAccess().getGroup_4(), "rule__MacroCall__Group_4__0");
			builder.put(grammarAccess.getMacroCallAccess().getGroup_4_3(), "rule__MacroCall__Group_4_3__0");
			builder.put(grammarAccess.getParameterCallAccess().getGroup(), "rule__ParameterCall__Group__0");
			builder.put(grammarAccess.getJointAccess().getGroup(), "rule__Joint__Group__0");
			builder.put(grammarAccess.getJointAccess().getGroup_10(), "rule__Joint__Group_10__0");
			builder.put(grammarAccess.getJointAccess().getGroup_11(), "rule__Joint__Group_11__0");
			builder.put(grammarAccess.getJointAccess().getGroup_12(), "rule__Joint__Group_12__0");
			builder.put(grammarAccess.getJointAccess().getGroup_13(), "rule__Joint__Group_13__0");
			builder.put(grammarAccess.getJointAccess().getGroup_14(), "rule__Joint__Group_14__0");
			builder.put(grammarAccess.getJointAccess().getGroup_15(), "rule__Joint__Group_15__0");
			builder.put(grammarAccess.getJointAccess().getGroup_16(), "rule__Joint__Group_16__0");
			builder.put(grammarAccess.getLinkAccess().getGroup(), "rule__Link__Group__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_4(), "rule__Link__Group_4__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_5(), "rule__Link__Group_5__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_6(), "rule__Link__Group_6__0");
			builder.put(grammarAccess.getLinkAccess().getGroup_7(), "rule__Link__Group_7__0");
			builder.put(grammarAccess.getMaterialGlobalAccess().getGroup(), "rule__MaterialGlobal__Group__0");
			builder.put(grammarAccess.getMaterialGlobalAccess().getGroup_4(), "rule__MaterialGlobal__Group_4__0");
			builder.put(grammarAccess.getMaterialGlobalAccess().getGroup_5(), "rule__MaterialGlobal__Group_5__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup(), "rule__Transmission__Group__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_2(), "rule__Transmission__Group_2__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_2_3(), "rule__Transmission__Group_2_3__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_7(), "rule__Transmission__Group_7__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_7_3(), "rule__Transmission__Group_7_3__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_8(), "rule__Transmission__Group_8__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_8_3(), "rule__Transmission__Group_8_3__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_9(), "rule__Transmission__Group_9__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_9_3(), "rule__Transmission__Group_9_3__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_10(), "rule__Transmission__Group_10__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_10_3(), "rule__Transmission__Group_10_3__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_11(), "rule__Transmission__Group_11__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_11_3(), "rule__Transmission__Group_11_3__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_12(), "rule__Transmission__Group_12__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_12_3(), "rule__Transmission__Group_12_3__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_13(), "rule__Transmission__Group_13__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_13_3(), "rule__Transmission__Group_13_3__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_14(), "rule__Transmission__Group_14__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_14_3(), "rule__Transmission__Group_14_3__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_15(), "rule__Transmission__Group_15__0");
			builder.put(grammarAccess.getTransmissionAccess().getGroup_15_3(), "rule__Transmission__Group_15_3__0");
			builder.put(grammarAccess.getPoseAccess().getGroup(), "rule__Pose__Group__0");
			builder.put(grammarAccess.getPoseAccess().getGroup_3(), "rule__Pose__Group_3__0");
			builder.put(grammarAccess.getPoseAccess().getGroup_4(), "rule__Pose__Group_4__0");
			builder.put(grammarAccess.getAxisAccess().getGroup(), "rule__Axis__Group__0");
			builder.put(grammarAccess.getAxisAccess().getGroup_3(), "rule__Axis__Group_3__0");
			builder.put(grammarAccess.getCalibrationAccess().getGroup(), "rule__Calibration__Group__0");
			builder.put(grammarAccess.getCalibrationAccess().getGroup_3(), "rule__Calibration__Group_3__0");
			builder.put(grammarAccess.getCalibrationAccess().getGroup_4(), "rule__Calibration__Group_4__0");
			builder.put(grammarAccess.getCalibrationAccess().getGroup_5(), "rule__Calibration__Group_5__0");
			builder.put(grammarAccess.getDynamicsAccess().getGroup(), "rule__Dynamics__Group__0");
			builder.put(grammarAccess.getDynamicsAccess().getGroup_3(), "rule__Dynamics__Group_3__0");
			builder.put(grammarAccess.getDynamicsAccess().getGroup_4(), "rule__Dynamics__Group_4__0");
			builder.put(grammarAccess.getLimitAccess().getGroup(), "rule__Limit__Group__0");
			builder.put(grammarAccess.getLimitAccess().getGroup_3(), "rule__Limit__Group_3__0");
			builder.put(grammarAccess.getLimitAccess().getGroup_4(), "rule__Limit__Group_4__0");
			builder.put(grammarAccess.getLimitAccess().getGroup_5(), "rule__Limit__Group_5__0");
			builder.put(grammarAccess.getLimitAccess().getGroup_6(), "rule__Limit__Group_6__0");
			builder.put(grammarAccess.getSafetyControllerAccess().getGroup(), "rule__SafetyController__Group__0");
			builder.put(grammarAccess.getSafetyControllerAccess().getGroup_2(), "rule__SafetyController__Group_2__0");
			builder.put(grammarAccess.getSafetyControllerAccess().getGroup_5(), "rule__SafetyController__Group_5__0");
			builder.put(grammarAccess.getSafetyControllerAccess().getGroup_6(), "rule__SafetyController__Group_6__0");
			builder.put(grammarAccess.getMimicAccess().getGroup(), "rule__Mimic__Group__0");
			builder.put(grammarAccess.getMimicAccess().getGroup_4(), "rule__Mimic__Group_4__0");
			builder.put(grammarAccess.getMimicAccess().getGroup_5(), "rule__Mimic__Group_5__0");
			builder.put(grammarAccess.getInertialAccess().getGroup(), "rule__Inertial__Group__0");
			builder.put(grammarAccess.getInertialAccess().getGroup_3(), "rule__Inertial__Group_3__0");
			builder.put(grammarAccess.getInertialAccess().getGroup_4(), "rule__Inertial__Group_4__0");
			builder.put(grammarAccess.getInertialAccess().getGroup_5(), "rule__Inertial__Group_5__0");
			builder.put(grammarAccess.getVisualAccess().getGroup(), "rule__Visual__Group__0");
			builder.put(grammarAccess.getVisualAccess().getGroup_2(), "rule__Visual__Group_2__0");
			builder.put(grammarAccess.getVisualAccess().getGroup_5(), "rule__Visual__Group_5__0");
			builder.put(grammarAccess.getCollisionAccess().getGroup(), "rule__Collision__Group__0");
			builder.put(grammarAccess.getCollisionAccess().getGroup_2(), "rule__Collision__Group_2__0");
			builder.put(grammarAccess.getCollisionAccess().getGroup_3(), "rule__Collision__Group_3__0");
			builder.put(grammarAccess.getCollisionAccess().getGroup_6(), "rule__Collision__Group_6__0");
			builder.put(grammarAccess.getMassAccess().getGroup(), "rule__Mass__Group__0");
			builder.put(grammarAccess.getMassAccess().getGroup_3(), "rule__Mass__Group_3__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup(), "rule__Inertia__Group__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_3(), "rule__Inertia__Group_3__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_4(), "rule__Inertia__Group_4__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_5(), "rule__Inertia__Group_5__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_6(), "rule__Inertia__Group_6__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_7(), "rule__Inertia__Group_7__0");
			builder.put(grammarAccess.getInertiaAccess().getGroup_8(), "rule__Inertia__Group_8__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup(), "rule__Geometry__Group__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup_3(), "rule__Geometry__Group_3__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup_4(), "rule__Geometry__Group_4__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup_5(), "rule__Geometry__Group_5__0");
			builder.put(grammarAccess.getGeometryAccess().getGroup_6(), "rule__Geometry__Group_6__0");
			builder.put(grammarAccess.getMaterialAccess().getGroup(), "rule__Material__Group__0");
			builder.put(grammarAccess.getMaterialAccess().getGroup_3(), "rule__Material__Group_3__0");
			builder.put(grammarAccess.getMaterialAccess().getGroup_4(), "rule__Material__Group_4__0");
			builder.put(grammarAccess.getMaterialAccess().getGroup_5(), "rule__Material__Group_5__0");
			builder.put(grammarAccess.getBoxAccess().getGroup(), "rule__Box__Group__0");
			builder.put(grammarAccess.getBoxAccess().getGroup_3(), "rule__Box__Group_3__0");
			builder.put(grammarAccess.getCylinderAccess().getGroup(), "rule__Cylinder__Group__0");
			builder.put(grammarAccess.getSphereAccess().getGroup(), "rule__Sphere__Group__0");
			builder.put(grammarAccess.getMeshAccess().getGroup(), "rule__Mesh__Group__0");
			builder.put(grammarAccess.getMeshAccess().getGroup_4(), "rule__Mesh__Group_4__0");
			builder.put(grammarAccess.getColorAccess().getGroup(), "rule__Color__Group__0");
			builder.put(grammarAccess.getColorAccess().getGroup_3(), "rule__Color__Group_3__0");
			builder.put(grammarAccess.getTextureAccess().getGroup(), "rule__Texture__Group__0");
			builder.put(grammarAccess.getTextureAccess().getGroup_3(), "rule__Texture__Group_3__0");
			builder.put(grammarAccess.getVerboseAccess().getGroup(), "rule__Verbose__Group__0");
			builder.put(grammarAccess.getVerboseAccess().getGroup_3(), "rule__Verbose__Group_3__0");
			builder.put(grammarAccess.getActuatorTransmissionAccess().getGroup(), "rule__ActuatorTransmission__Group__0");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getGroup(), "rule__GapJointTransmission__Group__0");
			builder.put(grammarAccess.getPassiveJointTransmissionAccess().getGroup(), "rule__PassiveJointTransmission__Group__0");
			builder.put(grammarAccess.getUseSimulatedGripperJointTypeAccess().getGroup(), "rule__UseSimulatedGripperJointType__Group__0");
			builder.put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
			builder.put(grammarAccess.getNameAccess().getGroup_3(), "rule__Name__Group_3__0");
			builder.put(grammarAccess.getRobotAccess().getNameAssignment_4(), "rule__Robot__NameAssignment_4");
			builder.put(grammarAccess.getRobotAccess().getVersionAssignment_5_1(), "rule__Robot__VersionAssignment_5_1");
			builder.put(grammarAccess.getRobotAccess().getMacroAssignment_6_2(), "rule__Robot__MacroAssignment_6_2");
			builder.put(grammarAccess.getRobotAccess().getMacroAssignment_6_3_1(), "rule__Robot__MacroAssignment_6_3_1");
			builder.put(grammarAccess.getRobotAccess().getBodyAssignment_7_1(), "rule__Robot__BodyAssignment_7_1");
			builder.put(grammarAccess.getRobotAccess().getMacroCallAssignment_8_2(), "rule__Robot__MacroCallAssignment_8_2");
			builder.put(grammarAccess.getRobotAccess().getMacroCallAssignment_8_3_1(), "rule__Robot__MacroCallAssignment_8_3_1");
			builder.put(grammarAccess.getMacroAccess().getNameAssignment_3(), "rule__Macro__NameAssignment_3");
			builder.put(grammarAccess.getMacroAccess().getParameterAssignment_4_2(), "rule__Macro__ParameterAssignment_4_2");
			builder.put(grammarAccess.getMacroAccess().getParameterAssignment_4_3_1(), "rule__Macro__ParameterAssignment_4_3_1");
			builder.put(grammarAccess.getMacroAccess().getBodyAssignment_5_1(), "rule__Macro__BodyAssignment_5_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
			builder.put(grammarAccess.getParameterAccess().getDefaultAssignment_4_1(), "rule__Parameter__DefaultAssignment_4_1");
			builder.put(grammarAccess.getParameterAccess().getValueAssignment_5_1(), "rule__Parameter__ValueAssignment_5_1");
			builder.put(grammarAccess.getBodyAccess().getLinkAssignment_3_2(), "rule__Body__LinkAssignment_3_2");
			builder.put(grammarAccess.getBodyAccess().getLinkAssignment_3_3_1(), "rule__Body__LinkAssignment_3_3_1");
			builder.put(grammarAccess.getBodyAccess().getJointAssignment_4_2(), "rule__Body__JointAssignment_4_2");
			builder.put(grammarAccess.getBodyAccess().getJointAssignment_4_3_1(), "rule__Body__JointAssignment_4_3_1");
			builder.put(grammarAccess.getBodyAccess().getLinkAssignment_5_2(), "rule__Body__LinkAssignment_5_2");
			builder.put(grammarAccess.getBodyAccess().getLinkAssignment_5_3_1(), "rule__Body__LinkAssignment_5_3_1");
			builder.put(grammarAccess.getBodyAccess().getMaterialAssignment_6_2(), "rule__Body__MaterialAssignment_6_2");
			builder.put(grammarAccess.getBodyAccess().getMaterialAssignment_6_3_1(), "rule__Body__MaterialAssignment_6_3_1");
			builder.put(grammarAccess.getBodyAccess().getTransmissionAssignment_7_2(), "rule__Body__TransmissionAssignment_7_2");
			builder.put(grammarAccess.getBodyAccess().getTransmissionAssignment_7_3_1(), "rule__Body__TransmissionAssignment_7_3_1");
			builder.put(grammarAccess.getMacroCallAccess().getMacroAssignment_3_1(), "rule__MacroCall__MacroAssignment_3_1");
			builder.put(grammarAccess.getMacroCallAccess().getMacroAssignment_3_2_1(), "rule__MacroCall__MacroAssignment_3_2_1");
			builder.put(grammarAccess.getMacroCallAccess().getParameterCallAssignment_4_2(), "rule__MacroCall__ParameterCallAssignment_4_2");
			builder.put(grammarAccess.getMacroCallAccess().getParameterCallAssignment_4_3_1(), "rule__MacroCall__ParameterCallAssignment_4_3_1");
			builder.put(grammarAccess.getParameterCallAccess().getParameterAssignment_4(), "rule__ParameterCall__ParameterAssignment_4");
			builder.put(grammarAccess.getParameterCallAccess().getValueAssignment_6(), "rule__ParameterCall__ValueAssignment_6");
			builder.put(grammarAccess.getJointAccess().getNameAssignment_3(), "rule__Joint__NameAssignment_3");
			builder.put(grammarAccess.getJointAccess().getTypeAssignment_5(), "rule__Joint__TypeAssignment_5");
			builder.put(grammarAccess.getJointAccess().getParentAssignment_7(), "rule__Joint__ParentAssignment_7");
			builder.put(grammarAccess.getJointAccess().getChildAssignment_9(), "rule__Joint__ChildAssignment_9");
			builder.put(grammarAccess.getJointAccess().getOriginAssignment_10_1(), "rule__Joint__OriginAssignment_10_1");
			builder.put(grammarAccess.getJointAccess().getAxisAssignment_11_1(), "rule__Joint__AxisAssignment_11_1");
			builder.put(grammarAccess.getJointAccess().getCalibrationAssignment_12_1(), "rule__Joint__CalibrationAssignment_12_1");
			builder.put(grammarAccess.getJointAccess().getDynamicsAssignment_13_1(), "rule__Joint__DynamicsAssignment_13_1");
			builder.put(grammarAccess.getJointAccess().getLimitAssignment_14_1(), "rule__Joint__LimitAssignment_14_1");
			builder.put(grammarAccess.getJointAccess().getSafetyControllerAssignment_15_1(), "rule__Joint__SafetyControllerAssignment_15_1");
			builder.put(grammarAccess.getJointAccess().getMimicAssignment_16_1(), "rule__Joint__MimicAssignment_16_1");
			builder.put(grammarAccess.getLinkAccess().getNameAssignment_3(), "rule__Link__NameAssignment_3");
			builder.put(grammarAccess.getLinkAccess().getTypeAssignment_4_1(), "rule__Link__TypeAssignment_4_1");
			builder.put(grammarAccess.getLinkAccess().getInertialAssignment_5_1(), "rule__Link__InertialAssignment_5_1");
			builder.put(grammarAccess.getLinkAccess().getVisualAssignment_6_1(), "rule__Link__VisualAssignment_6_1");
			builder.put(grammarAccess.getLinkAccess().getCollisionAssignment_7_1(), "rule__Link__CollisionAssignment_7_1");
			builder.put(grammarAccess.getMaterialGlobalAccess().getNameAssignment_3(), "rule__MaterialGlobal__NameAssignment_3");
			builder.put(grammarAccess.getMaterialGlobalAccess().getColorAssignment_4_1(), "rule__MaterialGlobal__ColorAssignment_4_1");
			builder.put(grammarAccess.getMaterialGlobalAccess().getTextureAssignment_5_1(), "rule__MaterialGlobal__TextureAssignment_5_1");
			builder.put(grammarAccess.getTransmissionAccess().getMechanicalReductionAssignment_2_2(), "rule__Transmission__MechanicalReductionAssignment_2_2");
			builder.put(grammarAccess.getTransmissionAccess().getMechanicalReductionAssignment_2_3_1(), "rule__Transmission__MechanicalReductionAssignment_2_3_1");
			builder.put(grammarAccess.getTransmissionAccess().getNameAssignment_4(), "rule__Transmission__NameAssignment_4");
			builder.put(grammarAccess.getTransmissionAccess().getTypeAssignment_6(), "rule__Transmission__TypeAssignment_6");
			builder.put(grammarAccess.getTransmissionAccess().getLeftActuatorAssignment_7_2(), "rule__Transmission__LeftActuatorAssignment_7_2");
			builder.put(grammarAccess.getTransmissionAccess().getLeftActuatorAssignment_7_3_1(), "rule__Transmission__LeftActuatorAssignment_7_3_1");
			builder.put(grammarAccess.getTransmissionAccess().getRightActuatorAssignment_8_2(), "rule__Transmission__RightActuatorAssignment_8_2");
			builder.put(grammarAccess.getTransmissionAccess().getRightActuatorAssignment_8_3_1(), "rule__Transmission__RightActuatorAssignment_8_3_1");
			builder.put(grammarAccess.getTransmissionAccess().getFlexJointAssignment_9_2(), "rule__Transmission__FlexJointAssignment_9_2");
			builder.put(grammarAccess.getTransmissionAccess().getFlexJointAssignment_9_3_1(), "rule__Transmission__FlexJointAssignment_9_3_1");
			builder.put(grammarAccess.getTransmissionAccess().getRollJointAssignment_10_2(), "rule__Transmission__RollJointAssignment_10_2");
			builder.put(grammarAccess.getTransmissionAccess().getRollJointAssignment_10_3_1(), "rule__Transmission__RollJointAssignment_10_3_1");
			builder.put(grammarAccess.getTransmissionAccess().getGapJointAssignment_11_2(), "rule__Transmission__GapJointAssignment_11_2");
			builder.put(grammarAccess.getTransmissionAccess().getGapJointAssignment_11_3_1(), "rule__Transmission__GapJointAssignment_11_3_1");
			builder.put(grammarAccess.getTransmissionAccess().getPassiveJointAssignment_12_2(), "rule__Transmission__PassiveJointAssignment_12_2");
			builder.put(grammarAccess.getTransmissionAccess().getPassiveJointAssignment_12_3_1(), "rule__Transmission__PassiveJointAssignment_12_3_1");
			builder.put(grammarAccess.getTransmissionAccess().getUseSimulatedGripperJointAssignment_13_2(), "rule__Transmission__UseSimulatedGripperJointAssignment_13_2");
			builder.put(grammarAccess.getTransmissionAccess().getUseSimulatedGripperJointAssignment_13_3_1(), "rule__Transmission__UseSimulatedGripperJointAssignment_13_3_1");
			builder.put(grammarAccess.getTransmissionAccess().getActuatorAssignment_14_2(), "rule__Transmission__ActuatorAssignment_14_2");
			builder.put(grammarAccess.getTransmissionAccess().getActuatorAssignment_14_3_1(), "rule__Transmission__ActuatorAssignment_14_3_1");
			builder.put(grammarAccess.getTransmissionAccess().getJointAssignment_15_2(), "rule__Transmission__JointAssignment_15_2");
			builder.put(grammarAccess.getTransmissionAccess().getJointAssignment_15_3_1(), "rule__Transmission__JointAssignment_15_3_1");
			builder.put(grammarAccess.getPoseAccess().getRpyAssignment_3_1(), "rule__Pose__RpyAssignment_3_1");
			builder.put(grammarAccess.getPoseAccess().getXyzAssignment_4_1(), "rule__Pose__XyzAssignment_4_1");
			builder.put(grammarAccess.getAxisAccess().getXyzAssignment_3_1(), "rule__Axis__XyzAssignment_3_1");
			builder.put(grammarAccess.getCalibrationAccess().getFallingAssignment_3_1(), "rule__Calibration__FallingAssignment_3_1");
			builder.put(grammarAccess.getCalibrationAccess().getReferencePositionAssignment_4_1(), "rule__Calibration__ReferencePositionAssignment_4_1");
			builder.put(grammarAccess.getCalibrationAccess().getRisingAssignment_5_1(), "rule__Calibration__RisingAssignment_5_1");
			builder.put(grammarAccess.getDynamicsAccess().getDampingAssignment_3_1(), "rule__Dynamics__DampingAssignment_3_1");
			builder.put(grammarAccess.getDynamicsAccess().getFrictionAssignment_4_1(), "rule__Dynamics__FrictionAssignment_4_1");
			builder.put(grammarAccess.getLimitAccess().getEffortAssignment_3_1(), "rule__Limit__EffortAssignment_3_1");
			builder.put(grammarAccess.getLimitAccess().getLowerAssignment_4_1(), "rule__Limit__LowerAssignment_4_1");
			builder.put(grammarAccess.getLimitAccess().getUpperAssignment_5_1(), "rule__Limit__UpperAssignment_5_1");
			builder.put(grammarAccess.getLimitAccess().getVelocityAssignment_6_1(), "rule__Limit__VelocityAssignment_6_1");
			builder.put(grammarAccess.getSafetyControllerAccess().getKPositionAssignment_2_1(), "rule__SafetyController__KPositionAssignment_2_1");
			builder.put(grammarAccess.getSafetyControllerAccess().getKVelocityAssignment_4(), "rule__SafetyController__KVelocityAssignment_4");
			builder.put(grammarAccess.getSafetyControllerAccess().getSoftLowerLimitAssignment_5_1(), "rule__SafetyController__SoftLowerLimitAssignment_5_1");
			builder.put(grammarAccess.getSafetyControllerAccess().getSoftUpperLimitAssignment_6_1(), "rule__SafetyController__SoftUpperLimitAssignment_6_1");
			builder.put(grammarAccess.getMimicAccess().getJointAssignment_3(), "rule__Mimic__JointAssignment_3");
			builder.put(grammarAccess.getMimicAccess().getMultiplierAssignment_4_1(), "rule__Mimic__MultiplierAssignment_4_1");
			builder.put(grammarAccess.getMimicAccess().getOffsetAssignment_5_1(), "rule__Mimic__OffsetAssignment_5_1");
			builder.put(grammarAccess.getInertialAccess().getOriginAssignment_3_1(), "rule__Inertial__OriginAssignment_3_1");
			builder.put(grammarAccess.getInertialAccess().getMassAssignment_4_1(), "rule__Inertial__MassAssignment_4_1");
			builder.put(grammarAccess.getInertialAccess().getInertiaAssignment_5_1(), "rule__Inertial__InertiaAssignment_5_1");
			builder.put(grammarAccess.getVisualAccess().getOriginAssignment_2_1(), "rule__Visual__OriginAssignment_2_1");
			builder.put(grammarAccess.getVisualAccess().getGeometryAssignment_4(), "rule__Visual__GeometryAssignment_4");
			builder.put(grammarAccess.getVisualAccess().getMaterialAssignment_5_1(), "rule__Visual__MaterialAssignment_5_1");
			builder.put(grammarAccess.getCollisionAccess().getNameAssignment_2_1(), "rule__Collision__NameAssignment_2_1");
			builder.put(grammarAccess.getCollisionAccess().getOriginAssignment_3_1(), "rule__Collision__OriginAssignment_3_1");
			builder.put(grammarAccess.getCollisionAccess().getGeometryAssignment_5(), "rule__Collision__GeometryAssignment_5");
			builder.put(grammarAccess.getCollisionAccess().getVerboseAssignment_6_1(), "rule__Collision__VerboseAssignment_6_1");
			builder.put(grammarAccess.getMassAccess().getValueAssignment_3_1(), "rule__Mass__ValueAssignment_3_1");
			builder.put(grammarAccess.getInertiaAccess().getIxxAssignment_3_1(), "rule__Inertia__IxxAssignment_3_1");
			builder.put(grammarAccess.getInertiaAccess().getIxyAssignment_4_1(), "rule__Inertia__IxyAssignment_4_1");
			builder.put(grammarAccess.getInertiaAccess().getIxzAssignment_5_1(), "rule__Inertia__IxzAssignment_5_1");
			builder.put(grammarAccess.getInertiaAccess().getIyyAssignment_6_1(), "rule__Inertia__IyyAssignment_6_1");
			builder.put(grammarAccess.getInertiaAccess().getIyzAssignment_7_1(), "rule__Inertia__IyzAssignment_7_1");
			builder.put(grammarAccess.getInertiaAccess().getIzzAssignment_8_1(), "rule__Inertia__IzzAssignment_8_1");
			builder.put(grammarAccess.getGeometryAccess().getBoxAssignment_3_1(), "rule__Geometry__BoxAssignment_3_1");
			builder.put(grammarAccess.getGeometryAccess().getCylinderAssignment_4_1(), "rule__Geometry__CylinderAssignment_4_1");
			builder.put(grammarAccess.getGeometryAccess().getSphereAssignment_5_1(), "rule__Geometry__SphereAssignment_5_1");
			builder.put(grammarAccess.getGeometryAccess().getMeshAssignment_6_1(), "rule__Geometry__MeshAssignment_6_1");
			builder.put(grammarAccess.getMaterialAccess().getNameAssignment_3_1(), "rule__Material__NameAssignment_3_1");
			builder.put(grammarAccess.getMaterialAccess().getColorAssignment_4_1(), "rule__Material__ColorAssignment_4_1");
			builder.put(grammarAccess.getMaterialAccess().getTextureAssignment_5_1(), "rule__Material__TextureAssignment_5_1");
			builder.put(grammarAccess.getBoxAccess().getSizeAssignment_3_1(), "rule__Box__SizeAssignment_3_1");
			builder.put(grammarAccess.getCylinderAccess().getLengthAssignment_3(), "rule__Cylinder__LengthAssignment_3");
			builder.put(grammarAccess.getCylinderAccess().getRadiusAssignment_5(), "rule__Cylinder__RadiusAssignment_5");
			builder.put(grammarAccess.getSphereAccess().getRadiusAssignment_3(), "rule__Sphere__RadiusAssignment_3");
			builder.put(grammarAccess.getMeshAccess().getFilenameAssignment_3(), "rule__Mesh__FilenameAssignment_3");
			builder.put(grammarAccess.getMeshAccess().getScaleAssignment_4_1(), "rule__Mesh__ScaleAssignment_4_1");
			builder.put(grammarAccess.getColorAccess().getRgbaAssignment_3_1(), "rule__Color__RgbaAssignment_3_1");
			builder.put(grammarAccess.getTextureAccess().getFilenameAssignment_3_1(), "rule__Texture__FilenameAssignment_3_1");
			builder.put(grammarAccess.getVerboseAccess().getValueAssignment_3_1(), "rule__Verbose__ValueAssignment_3_1");
			builder.put(grammarAccess.getActuatorTransmissionAccess().getMechanicalReductionAssignment_3(), "rule__ActuatorTransmission__MechanicalReductionAssignment_3");
			builder.put(grammarAccess.getActuatorTransmissionAccess().getNameAssignment_5(), "rule__ActuatorTransmission__NameAssignment_5");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getAAssignment_3(), "rule__GapJointTransmission__AAssignment_3");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getBAssignment_5(), "rule__GapJointTransmission__BAssignment_5");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getGearRatioAssignment_7(), "rule__GapJointTransmission__GearRatioAssignment_7");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getHAssignment_9(), "rule__GapJointTransmission__HAssignment_9");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getL0Assignment_11(), "rule__GapJointTransmission__L0Assignment_11");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getMechanicalReductionAssignment_13(), "rule__GapJointTransmission__MechanicalReductionAssignment_13");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getNameAssignment_15(), "rule__GapJointTransmission__NameAssignment_15");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getPhi0Assignment_17(), "rule__GapJointTransmission__Phi0Assignment_17");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getRAssignment_19(), "rule__GapJointTransmission__RAssignment_19");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getScrewReductionAssignment_21(), "rule__GapJointTransmission__ScrewReductionAssignment_21");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getT0Assignment_23(), "rule__GapJointTransmission__T0Assignment_23");
			builder.put(grammarAccess.getGapJointTransmissionAccess().getTheta0Assignment_25(), "rule__GapJointTransmission__Theta0Assignment_25");
			builder.put(grammarAccess.getPassiveJointTransmissionAccess().getNameAssignment_3(), "rule__PassiveJointTransmission__NameAssignment_3");
			builder.put(grammarAccess.getNameAccess().getNameAssignment_3_1(), "rule__Name__NameAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private XacroGrammarAccess grammarAccess;

	@Override
	protected InternalXacroParser createParser() {
		InternalXacroParser result = new InternalXacroParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public XacroGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XacroGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
