/**
 */
package de.devboost.natspec.library.documentation.impl;

import de.devboost.natspec.library.documentation.Documentation;
import de.devboost.natspec.library.documentation.DocumentationPackage;
import de.devboost.natspec.library.documentation.Section;
import de.devboost.natspec.library.documentation.TermEntry;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.DocumentationImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.DocumentationImpl#getTerminology <em>Terminology</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.DocumentationImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentationImpl extends EObjectImpl implements Documentation
{
  /**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
  protected EList<Section> sections;

  /**
	 * The cached value of the '{@link #getTerminology() <em>Terminology</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTerminology()
	 * @generated
	 * @ordered
	 */
  protected EList<TermEntry> terminology;

  /**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
  protected static final String TITLE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
  protected String title = TITLE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DocumentationImpl()
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
		return DocumentationPackage.Literals.DOCUMENTATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Section> getSections()
  {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, DocumentationPackage.DOCUMENTATION__SECTIONS);
		}
		return sections;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TermEntry> getTerminology()
  {
		if (terminology == null) {
			terminology = new EObjectContainmentEList<TermEntry>(TermEntry.class, this, DocumentationPackage.DOCUMENTATION__TERMINOLOGY);
		}
		return terminology;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getTitle()
  {
		return title;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTitle(String newTitle)
  {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentationPackage.DOCUMENTATION__TITLE, oldTitle, title));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case DocumentationPackage.DOCUMENTATION__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
			case DocumentationPackage.DOCUMENTATION__TERMINOLOGY:
				return ((InternalEList<?>)getTerminology()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case DocumentationPackage.DOCUMENTATION__SECTIONS:
				return getSections();
			case DocumentationPackage.DOCUMENTATION__TERMINOLOGY:
				return getTerminology();
			case DocumentationPackage.DOCUMENTATION__TITLE:
				return getTitle();
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
		switch (featureID) {
			case DocumentationPackage.DOCUMENTATION__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
				return;
			case DocumentationPackage.DOCUMENTATION__TERMINOLOGY:
				getTerminology().clear();
				getTerminology().addAll((Collection<? extends TermEntry>)newValue);
				return;
			case DocumentationPackage.DOCUMENTATION__TITLE:
				setTitle((String)newValue);
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
			case DocumentationPackage.DOCUMENTATION__SECTIONS:
				getSections().clear();
				return;
			case DocumentationPackage.DOCUMENTATION__TERMINOLOGY:
				getTerminology().clear();
				return;
			case DocumentationPackage.DOCUMENTATION__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case DocumentationPackage.DOCUMENTATION__SECTIONS:
				return sections != null && !sections.isEmpty();
			case DocumentationPackage.DOCUMENTATION__TERMINOLOGY:
				return terminology != null && !terminology.isEmpty();
			case DocumentationPackage.DOCUMENTATION__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //DocumentationImpl
