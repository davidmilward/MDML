/*
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.ox.cs.mdml.ui.internal.MdmlActivator;

public class MDMLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MdmlActivator.getInstance().getInjector("uk.ac.ox.cs.MDML");
	}

}
