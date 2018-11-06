/**
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.mDML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ox.cs.mDML.PrimitiveType#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.PrimitiveType#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see uk.ac.ox.cs.mDML.MDMLPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends DataType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Basic)
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getPrimitiveType_Type()
   * @model containment="true"
   * @generated
   */
  Basic getType();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.mDML.PrimitiveType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Basic value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' reference.
   * @see #setRule(Constraint)
   * @see uk.ac.ox.cs.mDML.MDMLPackage#getPrimitiveType_Rule()
   * @model
   * @generated
   */
  Constraint getRule();

  /**
   * Sets the value of the '{@link uk.ac.ox.cs.mDML.PrimitiveType#getRule <em>Rule</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' reference.
   * @see #getRule()
   * @generated
   */
  void setRule(Constraint value);

} // PrimitiveType