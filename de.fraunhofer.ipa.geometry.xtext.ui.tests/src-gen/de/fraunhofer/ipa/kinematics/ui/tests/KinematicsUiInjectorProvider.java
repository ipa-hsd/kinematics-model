/*
 * generated by Xtext 2.26.0
 */
package de.fraunhofer.ipa.kinematics.ui.tests;

import com.google.inject.Injector;
import de.fraunhofer.ipa.geometry.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class KinematicsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("de.fraunhofer.ipa.kinematics.Kinematics");
	}

}
