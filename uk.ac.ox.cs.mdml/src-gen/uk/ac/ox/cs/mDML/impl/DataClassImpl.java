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

import uk.ac.ox.cs.mDML.ContainerElement;
import uk.ac.ox.cs.mDML.DataClass;
import uk.ac.ox.cs.mDML.ExtensionItem;
import uk.ac.ox.cs.mDML.MDMLPackage;
import uk.ac.ox.cs.mDML.RelationDestination;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataClassImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataClassImpl#getGuid <em>Guid</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataClassImpl#getRefines <em>Refines</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataClassImpl#getDataelements <em>Dataelements</em>}</li>
 *   <li>{@link uk.ac.ox.cs.mDML.impl.DataClassImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataClassImpl extends RelationSourceImpl implements DataClass
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
   * The cached value of the '{@link #getDataelements() <em>Dataelements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataelements()
   * @generated
   * @ordered
   */
  protected EList<ContainerElement> dataelements;

  /**
   * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtension()
   * @generated
   * @ordered
   */
  protected EList<ExtensionItem> extension;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataClassImpl()
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
    return MDMLPackage.Literals.DATA_CLASS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MDMLPackage.DATA_CLASS__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MDMLPackage.DATA_CLASS__STATUS, oldStatus, status));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MDMLPackage.DATA_CLASS__GUID, oldGuid, guid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MDMLPackage.DATA_CLASS__REFINES, oldRefines, refines));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContainerElement> getDataelements()
  {
    if (dataelements == null)
    {
      dataelements = new EObjectContainmentEList<ContainerElement>(ContainerElement.class, this, MDMLPackage.DATA_CLASS__DATAELEMENTS);
    }
    return dataelements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExtensionItem> getExtension()
  {
    if (extension == null)
    {
      extension = new EObjectContainmentEList<ExtensionItem>(ExtensionItem.class, this, MDMLPackage.DATA_CLASS__EXTENSION);
    }
    return extension;
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
      case MDMLPackage.DATA_CLASS__DATAELEMENTS:
        return ((InternalEList<?>)getDataelements()).basicRemove(otherEnd, msgs);
      case MDMLPackage.DATA_CLASS__EXTENSION:
        return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
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
      case MDMLPackage.DATA_CLASS__NAME:
        return getName();
      case MDMLPackage.DATA_CLASS__STATUS:
        return getStatus();
      case MDMLPackage.DATA_CLASS__GUID:
        return getGuid();
      case MDMLPackage.DATA_CLASS__REFINES:
        return getRefines();
      case MDMLPackage.DATA_CLASS__DATAELEMENTS:
        return getDataelements();
      case MDMLPackage.DATA_CLASS__EXTENSION:
        return getExtension();
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
      case MDMLPackage.DATA_CLASS__NAME:
        setName((String)newValue);
        return;
      case MDMLPackage.DATA_CLASS__STATUS:
        setStatus((String)newValue);
        return;
      case MDMLPackage.DATA_CLASS__GUID:
        setGuid((String)newValue);
        return;
      case MDMLPackage.DATA_CLASS__REFINES:
        setRefines((String)newValue);
        return;
      case MDMLPackage.DATA_CLASS__DATAELEMENTS:
        getDataelements().clear();
        getDataelements().addAll((Collection<? extends ContainerElement>)newValue);
        return;
      case MDMLPackage.DATA_CLASS__EXTENSION:
        getExtension().clear();
        getExtension().addAll((Collection<? extends ExtensionItem>)newValue);
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
      case MDMLPackage.DATA_CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MDMLPackage.DATA_CLASS__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case MDMLPackage.DATA_CLASS__GUID:
        setGuid(GUID_EDEFAULT);
        return;
      case MDMLPackage.DATA_CLASS__REFINES:
        setRefines(REFINES_EDEFAULT);
        return;
      case MDMLPackage.DATA_CLASS__DATAELEMENTS:
        getDataelements().clear();
        return;
      case MDMLPackage.DATA_CLASS__EXTENSION:
        getExtension().clear();
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
      case MDMLPackage.DATA_CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MDMLPackage.DATA_CLASS__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
      case MDMLPackage.DATA_CLASS__GUID:
        return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
      case MDMLPackage.DATA_CLASS__REFINES:
        return REFINES_EDEFAULT == null ? refines != null : !REFINES_EDEFAULT.equals(refines);
      case MDMLPackage.DATA_CLASS__DATAELEMENTS:
        return dataelements != null && !dataelements.isEmpty();
      case MDMLPackage.DATA_CLASS__EXTENSION:
        return extension != null && !extension.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == RelationDestination.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ContainerElement.class)
    {
      switch (derivedFeatureID)
      {
        case MDMLPackage.DATA_CLASS__NAME: return MDMLPackage.CONTAINER_ELEMENT__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == RelationDestination.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ContainerElement.class)
    {
      switch (baseFeatureID)
      {
        case MDMLPackage.CONTAINER_ELEMENT__NAME: return MDMLPackage.DATA_CLASS__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //DataClassImpl
