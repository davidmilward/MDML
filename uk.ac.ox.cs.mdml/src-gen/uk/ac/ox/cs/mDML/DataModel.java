/**
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.mDML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ox.cs.mDML.DataModel#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.DataModel#getStatus <em>Status</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.DataModel#getGuid <em>Guid</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.DataModel#getRefines <em>Refines</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.DataModel#getElements <em>Elements</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.DataModel#getRelations <em>Relations</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.DataModel#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.DataModel#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends RelationSource, RelationDestination
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
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.mDML.DataModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see #setStatus(String)
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataModel_Status()
   * @model
   * @generated
   */
  String getStatus();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.mDML.DataModel#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(String value);

  /**
   * Returns the value of the '<em><b>Guid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guid</em>' attribute.
   * @see #setGuid(String)
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataModel_Guid()
   * @model
   * @generated
   */
  String getGuid();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.mDML.DataModel#getGuid <em>Guid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guid</em>' attribute.
   * @see #getGuid()
   * @generated
   */
  void setGuid(String value);

  /**
   * Returns the value of the '<em><b>Refines</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refines</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refines</em>' attribute.
   * @see #setRefines(String)
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataModel_Refines()
   * @model
   * @generated
   */
  String getRefines();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.mDML.DataModel#getRefines <em>Refines</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refines</em>' attribute.
   * @see #getRefines()
   * @generated
   */
  void setRefines(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.ox.cs.mDML.DataItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<DataItem> getElements();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.ox.cs.mDML.Relationship}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataModel_Relations()
   * @model containment="true"
   * @generated
   */
  EList<Relationship> getRelations();

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.ox.cs.mDML.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference list.
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataModel_Constraint()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraint();

  /**
   * Returns the value of the '<em><b>Predicate</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.ox.cs.mDML.Predicate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predicate</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predicate</em>' containment reference list.
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getDataModel_Predicate()
   * @model containment="true"
   * @generated
   */
  EList<Predicate> getPredicate();

} // DataModel
