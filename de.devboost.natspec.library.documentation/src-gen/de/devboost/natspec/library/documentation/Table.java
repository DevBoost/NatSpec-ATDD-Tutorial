/**
 */
package de.devboost.natspec.library.documentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.Table#getTableHeader <em>Table Header</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.Table#getTableRows <em>Table Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getTable()
 * @model annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
 * @generated
 */
public interface Table extends Fragment
{
  /**
	 * Returns the value of the '<em><b>Table Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Header</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Header</em>' containment reference.
	 * @see #setTableHeader(TableHeader)
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getTable_TableHeader()
	 * @model containment="true" required="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  TableHeader getTableHeader();

  /**
	 * Sets the value of the '{@link de.devboost.natspec.library.documentation.Table#getTableHeader <em>Table Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Header</em>' containment reference.
	 * @see #getTableHeader()
	 * @generated
	 */
  void setTableHeader(TableHeader value);

  /**
	 * Returns the value of the '<em><b>Table Rows</b></em>' containment reference list.
	 * The list contents are of type {@link de.devboost.natspec.library.documentation.TableRow}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Rows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Rows</em>' containment reference list.
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getTable_TableRows()
	 * @model containment="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  EList<TableRow> getTableRows();

} // Table
