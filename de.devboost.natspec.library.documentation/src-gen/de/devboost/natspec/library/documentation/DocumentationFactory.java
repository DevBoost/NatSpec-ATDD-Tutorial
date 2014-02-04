/**
 */
package de.devboost.natspec.library.documentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.devboost.natspec.library.documentation.DocumentationPackage
 * @generated
 */
public interface DocumentationFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  DocumentationFactory eINSTANCE = de.devboost.natspec.library.documentation.impl.DocumentationFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documentation</em>'.
	 * @generated
	 */
  Documentation createDocumentation();

  /**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
  Section createSection();

  /**
	 * Returns a new object of class '<em>Subsection</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsection</em>'.
	 * @generated
	 */
  Subsection createSubsection();

  /**
	 * Returns a new object of class '<em>Subsubsection</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subsubsection</em>'.
	 * @generated
	 */
  Subsubsection createSubsubsection();

  /**
	 * Returns a new object of class '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraph</em>'.
	 * @generated
	 */
  Paragraph createParagraph();

  /**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
  Line createLine();

  /**
	 * Returns a new object of class '<em>List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>List</em>'.
	 * @generated
	 */
  List createList();

  /**
	 * Returns a new object of class '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Item</em>'.
	 * @generated
	 */
  ListItem createListItem();

  /**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
  Table createTable();

  /**
	 * Returns a new object of class '<em>Table Header</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Header</em>'.
	 * @generated
	 */
  TableHeader createTableHeader();

  /**
	 * Returns a new object of class '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Row</em>'.
	 * @generated
	 */
  TableRow createTableRow();

  /**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
  Image createImage();

  /**
	 * Returns a new object of class '<em>Term Entry</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Entry</em>'.
	 * @generated
	 */
  TermEntry createTermEntry();

  /**
	 * Returns a new object of class '<em>XML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML</em>'.
	 * @generated
	 */
	XML createXML();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  DocumentationPackage getDocumentationPackage();

} //DocumentationFactory
