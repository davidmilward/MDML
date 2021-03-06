/**
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.mDML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ox.cs.mDML.Predicate#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.Predicate#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see uk.ac.ox.cs.mDML.MDMLPackage#getPredicate()
 * @model
 * @generated
 */
public interface Predicate extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getPredicate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.mDML.Predicate#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' attribute.
   * @see #setPredicate(String)
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getPredicate_Predicate()
   * @model
   * @generated
   */
  String getPredicate();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.mDML.Predicate#getPredicate <em>Predicate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predicate</em>' attribute.
   * @see #getPredicate()
   * @generated
   */
  void setPredicate(String value);

} // Predicate
