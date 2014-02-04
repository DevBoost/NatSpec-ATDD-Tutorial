/**
 */
package de.devboost.natspec.library.documentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.TableRow#getRowCells <em>Row Cells</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getTableRow()
 * @model annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
 * @generated
 */
public interface TableRow extends EObject
{
  /**
	 * Returns the value of the '<em><b>Row Cells</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Row Cells</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Cells</em>' attribute list.
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getTableRow_RowCells()
	 * @model annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  EList<String> getRowCells();

} // TableRow
