/**
 */
package de.devboost.natspec.library.documentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.Image#getWidth <em>Width</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.Image#getOriginalSource <em>Original Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getImage()
 * @model annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
 * @generated
 */
public interface Image extends Fragment, NamedElement
{
  /**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Integer)
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getImage_Width()
	 * @model required="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  Integer getWidth();

  /**
	 * Sets the value of the '{@link de.devboost.natspec.library.documentation.Image#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
  void setWidth(Integer value);

  /**
	 * Returns the value of the '<em><b>Original Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Original Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Source</em>' attribute.
	 * @see #setOriginalSource(String)
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getImage_OriginalSource()
	 * @model required="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  String getOriginalSource();

  /**
	 * Sets the value of the '{@link de.devboost.natspec.library.documentation.Image#getOriginalSource <em>Original Source</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Source</em>' attribute.
	 * @see #getOriginalSource()
	 * @generated
	 */
  void setOriginalSource(String value);

} // Image
