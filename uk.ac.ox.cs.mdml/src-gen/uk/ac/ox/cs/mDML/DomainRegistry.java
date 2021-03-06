/**
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.mDML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ox.cs.mDML.DomainRegistry#getRegisteredItems <em>Registered Items</em>}</li>
 * </ul>
 *
 * @see uk.ac.ox.cs.mDML.MDMLPackage#getDomainRegistry()
 * @model
 * @generated
 */
public interface DomainRegistry extends EObject
{
  /**
   * Returns the value of the '<em><b>Registered Items</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.ox.cs.mDML.DataModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Registered Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Registered Items</em>' containment reference list.
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDomainRegistry_RegisteredItems()
   * @model containment="true"
   * @generated
   */
  EList<DataModel> getRegisteredItems();

} // DomainRegistry
