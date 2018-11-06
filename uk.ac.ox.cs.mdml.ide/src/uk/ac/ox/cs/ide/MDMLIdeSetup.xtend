/*
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uk.ac.ox.cs.MDMLRuntimeModule
import uk.ac.ox.cs.MDMLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MDMLIdeSetup extends MDMLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MDMLRuntimeModule, new MDMLIdeModule))
	}
	
}