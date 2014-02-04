/**
 */
package de.devboost.natspec.library.documentation.impl;

import de.devboost.natspec.library.documentation.DocumentationPackage;
import de.devboost.natspec.library.documentation.TableHeader;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.TableHeaderImpl#getHeaderCells <em>Header Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableHeaderImpl extends EObjectImpl implements TableHeader
{
  /**
	 * The cached value of the '{@link #getHeaderCells() <em>Header Cells</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHeaderCells()
	 * @generated
	 * @ordered
	 */
  protected EList<String> headerCells;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TableHeaderImpl()
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
		return DocumentationPackage.Literals.TABLE_HEADER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getHeaderCells()
  {
		if (headerCells == null) {
			headerCells = new EDataTypeUniqueEList<String>(String.class, this, DocumentationPackage.TABLE_HEADER__HEADER_CELLS);
		}
		return headerCells;
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
			case DocumentationPackage.TABLE_HEADER__HEADER_CELLS:
				return getHeaderCells();
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
			case DocumentationPackage.TABLE_HEADER__HEADER_CELLS:
				getHeaderCells().clear();
				getHeaderCells().addAll((Collection<? extends String>)newValue);
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
			case DocumentationPackage.TABLE_HEADER__HEADER_CELLS:
				getHeaderCells().clear();
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
			case DocumentationPackage.TABLE_HEADER__HEADER_CELLS:
				return headerCells != null && !headerCells.isEmpty();
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
		result.append(" (headerCells: ");
		result.append(headerCells);
		result.append(')');
		return result.toString();
	}

} //TableHeaderImpl
