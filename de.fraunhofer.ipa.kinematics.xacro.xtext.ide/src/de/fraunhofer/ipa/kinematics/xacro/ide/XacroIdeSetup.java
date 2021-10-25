/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.kinematics.xacro.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fraunhofer.ipa.kinematics.xacro.XacroRuntimeModule;
import de.fraunhofer.ipa.kinematics.xacro.XacroStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class XacroIdeSetup extends XacroStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new XacroRuntimeModule(), new XacroIdeModule()));
	}
	
}
