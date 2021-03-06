/**
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.mDML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ox.cs.mDML.DataItem#getDataitem <em>Dataitem</em>}</li>
 * </ul>
 *
 * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataItem()
 * @model
 * @generated
 */
public interface DataItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Dataitem</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataitem</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataitem</em>' containment reference.
   * @see #setDataitem(EObject)
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataItem_Dataitem()
   * @model containment="true"
   * @generated
   */
  EObject getDataitem();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.mDML.DataItem#getDataitem <em>Dataitem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataitem</em>' containment reference.
   * @see #getDataitem()
   * @generated
   */
  void setDataitem(EObject value);

} // DataItem
