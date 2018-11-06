/**
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.ac.ox.cs.mDML.DomainRegistry;
import uk.ac.ox.cs.tests.MDMLInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(MDMLInjectorProvider.class)
@SuppressWarnings("all")
public class MDMLParsingTest {
  @Inject
  private ParseHelper<DomainRegistry> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final DomainRegistry result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
