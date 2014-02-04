/**
 */
package de.devboost.natspec.library.documentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.List#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getList()
 * @model annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
 * @generated
 */
public interface List extends Fragment
{
  /**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.devboost.natspec.library.documentation.ListItem}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getList_Items()
	 * @model containment="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  EList<ListItem> getItems();

} // List
