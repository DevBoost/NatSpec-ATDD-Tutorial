/**
 */
package de.devboost.natspec.library.documentation.impl;

import de.devboost.natspec.library.documentation.DocumentationPackage;
import de.devboost.natspec.library.documentation.Image;
import de.devboost.natspec.library.documentation.NamedElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.ImageImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.ImageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.ImageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.ImageImpl#getOriginalSource <em>Original Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageImpl extends FragmentImpl implements Image
{
  /**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
  protected static final String ID_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
  protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
  protected static final Integer WIDTH_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
  protected Integer width = WIDTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getOriginalSource() <em>Original Source</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOriginalSource()
	 * @generated
	 * @ordered
	 */
  protected static final String ORIGINAL_SOURCE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getOriginalSource() <em>Original Source</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOriginalSource()
	 * @generated
	 * @ordered
	 */
  protected String originalSource = ORIGINAL_SOURCE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ImageImpl()
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
		return DocumentationPackage.Literals.IMAGE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getId()
  {
		return id;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setId(String newId)
  {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentationPackage.IMAGE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentationPackage.IMAGE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Integer getWidth()
  {
		return width;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWidth(Integer newWidth)
  {
		Integer oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentationPackage.IMAGE__WIDTH, oldWidth, width));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getOriginalSource()
  {
		return originalSource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOriginalSource(String newOriginalSource)
  {
		String oldOriginalSource = originalSource;
		originalSource = newOriginalSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentationPackage.IMAGE__ORIGINAL_SOURCE, oldOriginalSource, originalSource));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case DocumentationPackage.IMAGE__ID:
				return getId();
			case DocumentationPackage.IMAGE__NAME:
				return getName();
			case DocumentationPackage.IMAGE__WIDTH:
				return getWidth();
			case DocumentationPackage.IMAGE__ORIGINAL_SOURCE:
				return getOriginalSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case DocumentationPackage.IMAGE__ID:
				setId((String)newValue);
				return;
			case DocumentationPackage.IMAGE__NAME:
				setName((String)newValue);
				return;
			case DocumentationPackage.IMAGE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case DocumentationPackage.IMAGE__ORIGINAL_SOURCE:
				setOriginalSource((String)newValue);
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
		switch (featureID) {
			case DocumentationPackage.IMAGE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocumentationPackage.IMAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DocumentationPackage.IMAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case DocumentationPackage.IMAGE__ORIGINAL_SOURCE:
				setOriginalSource(ORIGINAL_SOURCE_EDEFAULT);
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
		switch (featureID) {
			case DocumentationPackage.IMAGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocumentationPackage.IMAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DocumentationPackage.IMAGE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case DocumentationPackage.IMAGE__ORIGINAL_SOURCE:
				return ORIGINAL_SOURCE_EDEFAULT == null ? originalSource != null : !ORIGINAL_SOURCE_EDEFAULT.equals(originalSource);
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
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case DocumentationPackage.IMAGE__ID: return DocumentationPackage.NAMED_ELEMENT__ID;
				case DocumentationPackage.IMAGE__NAME: return DocumentationPackage.NAMED_ELEMENT__NAME;
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
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case DocumentationPackage.NAMED_ELEMENT__ID: return DocumentationPackage.IMAGE__ID;
				case DocumentationPackage.NAMED_ELEMENT__NAME: return DocumentationPackage.IMAGE__NAME;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", width: ");
		result.append(width);
		result.append(", originalSource: ");
		result.append(originalSource);
		result.append(')');
		return result.toString();
	}

} //ImageImpl
