/**
 * generated by Xtext 2.12.0
 */
package uk.ac.ox.cs.mDML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.ox.cs.mDML.Constraint;
import uk.ac.ox.cs.mDML.DataItem;
import uk.ac.ox.cs.mDML.DataModel;
import uk.ac.ox.cs.mDML.MDMLPackage;
import uk.ac.ox.cs.mDML.Predicate;
import uk.ac.ox.cs.mDML.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataModelImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataModelImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataModelImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataModelImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataModelImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataModelImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataModelImpl extends RelationSourceImpl implements DataModel
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final String STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected String status = STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getGuid() <em>Guid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuid()
   * @generated
   * @ordered
   */
  protected static final String GUID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGuid() <em>Guid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuid()
   * @generated
   * @ordered
   */
  protected String guid = GUID_EDEFAULT;

  /**
   * The default value of the '{@link #getRefines() <em>Refines</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefines()
   * @generated
   * @ordered
   */
  protected static final String REFINES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefines() <em>Refines</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefines()
   * @generated
   * @ordered
   */
  protected String refines = REFINES_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<DataItem> elements;

  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<Relationship> relations;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraint;

  /**
   * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredicate()
   * @generated
   * @ordered
   */
  protected EList<Predicate> predicate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MDMLPackage.Literals.DATA_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MDMLPackage.DATA_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(String newStatus)
  {
    String oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MDMLPackage.DATA_MODEL__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGuid()
  {
    return guid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuid(String newGuid)
  {
    String oldGuid = guid;
    guid = newGuid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MDMLPackage.DATA_MODEL__GUID, oldGuid, guid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRefines()
  {
    return refines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefines(String newRefines)
  {
    String oldRefines = refines;
    refines = newRefines;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MDMLPackage.DATA_MODEL__REFINES, oldRefines, refines));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataItem> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<DataItem>(DataItem.class, this, MDMLPackage.DATA_MODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relationship> getRelations()
  {
    if (relations == null)
    {
      relations = new EObjectContainmentEList<Relationship>(Relationship.class, this, MDMLPackage.DATA_MODEL__RELATIONS);
    }
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraint()
  {
    if (constraint == null)
    {
      constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, MDMLPackage.DATA_MODEL__CONSTRAINT);
    }
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Predicate> getPredicate()
  {
    if (predicate == null)
    {
      predicate = new EObjectContainmentEList<Predicate>(Predicate.class, this, MDMLPackage.DATA_MODEL__PREDICATE);
    }
    return predicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MDMLPackage.DATA_MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case MDMLPackage.DATA_MODEL__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
      case MDMLPackage.DATA_MODEL__CONSTRAINT:
        return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
      case MDMLPackage.DATA_MODEL__PREDICATE:
        return ((InternalEList<?>)getPredicate()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MDMLPackage.DATA_MODEL__NAME:
        return getName();
      case MDMLPackage.DATA_MODEL__STATUS:
        return getStatus();
      case MDMLPackage.DATA_MODEL__GUID:
        return getGuid();
      case MDMLPackage.DATA_MODEL__REFINES:
        return getRefines();
      case MDMLPackage.DATA_MODEL__ELEMENTS:
        return getElements();
      case MDMLPackage.DATA_MODEL__RELATIONS:
        return getRelations();
      case MDMLPackage.DATA_MODEL__CONSTRAINT:
        return getConstraint();
      case MDMLPackage.DATA_MODEL__PREDICATE:
        return getPredicate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MDMLPackage.DATA_MODEL__NAME:
        setName((String)newValue);
        return;
      case MDMLPackage.DATA_MODEL__STATUS:
        setStatus((String)newValue);
        return;
      case MDMLPackage.DATA_MODEL__GUID:
        setGuid((String)newValue);
        return;
      case MDMLPackage.DATA_MODEL__REFINES:
        setRefines((String)newValue);
        return;
      case MDMLPackage.DATA_MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends DataItem>)newValue);
        return;
      case MDMLPackage.DATA_MODEL__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends Relationship>)newValue);
        return;
      case MDMLPackage.DATA_MODEL__CONSTRAINT:
        getConstraint().clear();
        getConstraint().addAll((Collection<? extends Constraint>)newValue);
        return;
      case MDMLPackage.DATA_MODEL__PREDICATE:
        getPredicate().clear();
        getPredicate().addAll((Collection<? extends Predicate>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MDMLPackage.DATA_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MDMLPackage.DATA_MODEL__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case MDMLPackage.DATA_MODEL__GUID:
        setGuid(GUID_EDEFAULT);
        return;
      case MDMLPackage.DATA_MODEL__REFINES:
        setRefines(REFINES_EDEFAULT);
        return;
      case MDMLPackage.DATA_MODEL__ELEMENTS:
        getElements().clear();
        return;
      case MDMLPackage.DATA_MODEL__RELATIONS:
        getRelations().clear();
        return;
      case MDMLPackage.DATA_MODEL__CONSTRAINT:
        getConstraint().clear();
        return;
      case MDMLPackage.DATA_MODEL__PREDICATE:
        getPredicate().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MDMLPackage.DATA_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MDMLPackage.DATA_MODEL__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
      case MDMLPackage.DATA_MODEL__GUID:
        return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
      case MDMLPackage.DATA_MODEL__REFINES:
        return REFINES_EDEFAULT == null ? refines != null : !REFINES_EDEFAULT.equals(refines);
      case MDMLPackage.DATA_MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case MDMLPackage.DATA_MODEL__RELATIONS:
        return relations != null && !relations.isEmpty();
      case MDMLPackage.DATA_MODEL__CONSTRAINT:
        return constraint != null && !constraint.isEmpty();
      case MDMLPackage.DATA_MODEL__PREDICATE:
        return predicate != null && !predicate.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", status: ");
    result.append(status);
    result.append(", guid: ");
    result.append(guid);
    result.append(", refines: ");
    result.append(refines);
    result.append(')');
    return result.toString();
  }

} //DataModelImpl