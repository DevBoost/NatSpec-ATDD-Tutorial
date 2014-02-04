/**
 */
package de.devboost.natspec.library.documentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Fragment Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.devboost.natspec.library.documentation.TextFragmentContainer#getFragments <em>Fragments</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getTextFragmentContainer()
 * @model abstract="true"
 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
 * @generated
 */
public interface TextFragmentContainer extends EObject
{
  /**
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link de.devboost.natspec.library.documentation.Fragment}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fragments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#getTextFragmentContainer_Fragments()
	 * @model containment="true"
	 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
	 * @generated
	 */
  EList<Fragment> getFragments();

} // TextFragmentContainer
