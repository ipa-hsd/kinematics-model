/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class UrdfStandaloneSetup extends UrdfStandaloneSetupGenerated {

	public static void doSetup() {
		new UrdfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
