/**
 */
package de.devboost.natspec.library.documentation.impl;

import de.devboost.natspec.library.documentation.DocumentationPackage;
import de.devboost.natspec.library.documentation.Table;
import de.devboost.natspec.library.documentation.TableHeader;
import de.devboost.natspec.library.documentation.TableRow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.TableImpl#getTableHeader <em>Table Header</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.impl.TableImpl#getTableRows <em>Table Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends FragmentImpl implements Table
{
  /**
	 * The cached value of the '{@link #getTableHeader() <em>Table Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTableHeader()
	 * @generated
	 * @ordered
	 */
  protected TableHeader tableHeader;

  /**
	 * The cached value of the '{@link #getTableRows() <em>Table Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTableRows()
	 * @generated
	 * @ordered
	 */
  protected EList<TableRow> tableRows;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TableImpl()
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
		return DocumentationPackage.Literals.TABLE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TableHeader getTableHeader()
  {
		return tableHeader;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTableHeader(TableHeader newTableHeader, NotificationChain msgs)
  {
		TableHeader oldTableHeader = tableHeader;
		tableHeader = newTableHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentationPackage.TABLE__TABLE_HEADER, oldTableHeader, newTableHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTableHeader(TableHeader newTableHeader)
  {
		if (newTableHeader != tableHeader) {
			NotificationChain msgs = null;
			if (tableHeader != null)
				msgs = ((InternalEObject)tableHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentationPackage.TABLE__TABLE_HEADER, null, msgs);
			if (newTableHeader != null)
				msgs = ((InternalEObject)newTableHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentationPackage.TABLE__TABLE_HEADER, null, msgs);
			msgs = basicSetTableHeader(newTableHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentationPackage.TABLE__TABLE_HEADER, newTableHeader, newTableHeader));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TableRow> getTableRows()
  {
		if (tableRows == null) {
			tableRows = new EObjectContainmentEList<TableRow>(TableRow.class, this, DocumentationPackage.TABLE__TABLE_ROWS);
		}
		return tableRows;
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
			case DocumentationPackage.TABLE__TABLE_HEADER:
				return basicSetTableHeader(null, msgs);
			case DocumentationPackage.TABLE__TABLE_ROWS:
				return ((InternalEList<?>)getTableRows()).basicRemove(otherEnd, msgs);
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
			case DocumentationPackage.TABLE__TABLE_HEADER:
				return getTableHeader();
			case DocumentationPackage.TABLE__TABLE_ROWS:
				return getTableRows();
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
			case DocumentationPackage.TABLE__TABLE_HEADER:
				setTableHeader((TableHeader)newValue);
				return;
			case DocumentationPackage.TABLE__TABLE_ROWS:
				getTableRows().clear();
				getTableRows().addAll((Collection<? extends TableRow>)newValue);
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
			case DocumentationPackage.TABLE__TABLE_HEADER:
				setTableHeader((TableHeader)null);
				return;
			case DocumentationPackage.TABLE__TABLE_ROWS:
				getTableRows().clear();
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
			case DocumentationPackage.TABLE__TABLE_HEADER:
				return tableHeader != null;
			case DocumentationPackage.TABLE__TABLE_ROWS:
				return tableRows != null && !tableRows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
