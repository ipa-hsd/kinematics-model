/*
 * generated by Xtext 2.26.0
 */
package de.fraunhofer.ipa.composition;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class CompositionStandaloneSetup extends CompositionStandaloneSetupGenerated {

	public static void doSetup() {
		new CompositionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
