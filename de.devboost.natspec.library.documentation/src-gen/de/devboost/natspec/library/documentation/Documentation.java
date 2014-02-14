/**
 */
package de.devboost.natspec.library.documentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.Documentation#getSections <em>Sections</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.Documentation#getTerminology <em>Terminology</em>}</li>
 *   <li>{@link de.devboost.natspec.library.documentation.Documentation#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getDocumentation()
 * @model annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
 * @generated
 */
public interface Documentation extends EObject
{
  /**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link de.devboost.natspec.library.documentation.Section}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getDocumentation_Sections()
	 * @model containment="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  EList<Section> getSections();

  /**
	 * Returns the value of the '<em><b>Terminology</b></em>' containment reference list.
	 * The list contents are of type {@link de.devboost.natspec.library.documentation.TermEntry}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terminology</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology</em>' containment reference list.
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getDocumentation_Terminology()
	 * @model containment="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  EList<TermEntry> getTerminology();

  /**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getDocumentation_Title()
	 * @model required="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  String getTitle();

  /**
	 * Sets the value of the '{@link de.devboost.natspec.library.documentation.Documentation#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
  void setTitle(String value);

} // Documentation
