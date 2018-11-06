/*
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import uk.ac.ox.cs.mdml.ui.internal.MdmlActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MDMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MdmlActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MdmlActivator.getInstance().getInjector(MdmlActivator.UK_AC_OX_CS_MDML);
	}
	
}