/**
 */
package de.devboost.natspec.library.documentation.impl;

import de.devboost.natspec.library.documentation.DocumentationPackage;
import de.devboost.natspec.library.documentation.TableRow;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.TableRowImpl#getRowCells <em>Row Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableRowImpl extends EObjectImpl implements TableRow
{
  /**
	 * The cached value of the '{@link #getRowCells() <em>Row Cells</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRowCells()
	 * @generated
	 * @ordered
	 */
  protected EList<String> rowCells;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TableRowImpl()
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
		return DocumentationPackage.Literals.TABLE_ROW;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<String> getRowCells()
  {
		if (rowCells == null) {
			rowCells = new EDataTypeUniqueEList<String>(String.class, this, DocumentationPackage.TABLE_ROW__ROW_CELLS);
		}
		return rowCells;
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
			case DocumentationPackage.TABLE_ROW__ROW_CELLS:
				return getRowCells();
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
			case DocumentationPackage.TABLE_ROW__ROW_CELLS:
				getRowCells().clear();
				getRowCells().addAll((Collection<? extends String>)newValue);
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
			case DocumentationPackage.TABLE_ROW__ROW_CELLS:
				getRowCells().clear();
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
			case DocumentationPackage.TABLE_ROW__ROW_CELLS:
				return rowCells != null && !rowCells.isEmpty();
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
		result.append(" (rowCells: ");
		result.append(rowCells);
		result.append(')');
		return result.toString();
	}

} //TableRowImpl
