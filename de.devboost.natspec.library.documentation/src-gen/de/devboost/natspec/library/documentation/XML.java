/**
 */
package de.devboost.natspec.library.documentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.XML#getContextClassName <em>Context Class Name</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.XML#getResource <em>Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getXML()
 * @model annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
 * @generated
 */
public interface XML extends Fragment, NamedElement {
	/**
	 * Returns the value of the '<em><b>Context Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Class Name</em>' attribute.
	 * @see #setContextClassName(String)
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getXML_ContextClassName()
	 * @model required="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
	String getContextClassName();

	/**
	 * Sets the value of the '{@link de.devboost.natspec.library.documentation.XML#getContextClassName <em>Context Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Class Name</em>' attribute.
	 * @see #getContextClassName()
	 * @generated
	 */
	void setContextClassName(String value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getXML_Resource()
	 * @model required="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link de.devboost.natspec.library.documentation.XML#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

} // XML
