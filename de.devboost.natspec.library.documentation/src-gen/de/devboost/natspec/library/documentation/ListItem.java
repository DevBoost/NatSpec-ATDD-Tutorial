/**
 */
package de.devboost.natspec.library.documentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.ListItem#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getListItem()
 * @model annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
 * @generated
 */
public interface ListItem extends TextFragmentContainer
{
  /**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getListItem_Text()
	 * @model required="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  String getText();

  /**
	 * Sets the value of the '{@link de.devboost.natspec.library.documentation.ListItem#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
  void setText(String value);

} // ListItem
