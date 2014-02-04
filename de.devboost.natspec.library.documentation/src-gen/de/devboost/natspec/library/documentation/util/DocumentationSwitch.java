/**
 */
package de.devboost.natspec.library.documentation.util;

import de.devboost.natspec.library.documentation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.devboost.natspec.library.documentation.DocumentationPackage
 * @generated
 */
public class DocumentationSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static DocumentationPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DocumentationSwitch()
  {
		if (modelPackage == null) {
			modelPackage = DocumentationPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case DocumentationPackage.DOCUMENTATION: {
				Documentation documentation = (Documentation)theEObject;
				T result = caseDocumentation(documentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseTextFragmentContainer(section);
				if (result == null) result = caseNamedElement(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.SUBSECTION: {
				Subsection subsection = (Subsection)theEObject;
				T result = caseSubsection(subsection);
				if (result == null) result = caseTextFragmentContainer(subsection);
				if (result == null) result = caseFragment(subsection);
				if (result == null) result = caseNamedElement(subsection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.SUBSUBSECTION: {
				Subsubsection subsubsection = (Subsubsection)theEObject;
				T result = caseSubsubsection(subsubsection);
				if (result == null) result = caseTextFragmentContainer(subsubsection);
				if (result == null) result = caseFragment(subsubsection);
				if (result == null) result = caseNamedElement(subsubsection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.TEXT_FRAGMENT_CONTAINER: {
				TextFragmentContainer textFragmentContainer = (TextFragmentContainer)theEObject;
				T result = caseTextFragmentContainer(textFragmentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = caseTextFragmentContainer(paragraph);
				if (result == null) result = caseFragment(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.FRAGMENT: {
				Fragment fragment = (Fragment)theEObject;
				T result = caseFragment(fragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseFragment(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = caseFragment(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.LIST_ITEM: {
				ListItem listItem = (ListItem)theEObject;
				T result = caseListItem(listItem);
				if (result == null) result = caseTextFragmentContainer(listItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseFragment(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.TABLE_HEADER: {
				TableHeader tableHeader = (TableHeader)theEObject;
				T result = caseTableHeader(tableHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.TABLE_ROW: {
				TableRow tableRow = (TableRow)theEObject;
				T result = caseTableRow(tableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseFragment(image);
				if (result == null) result = caseNamedElement(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.TERM_ENTRY: {
				TermEntry termEntry = (TermEntry)theEObject;
				T result = caseTermEntry(termEntry);
				if (result == null) result = caseNamedElement(termEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentationPackage.XML: {
				XML xml = (XML)theEObject;
				T result = caseXML(xml);
				if (result == null) result = caseFragment(xml);
				if (result == null) result = caseNamedElement(xml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDocumentation(Documentation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSection(Section object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Subsection</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSubsection(Subsection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Subsubsection</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subsubsection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSubsubsection(Subsubsection object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Text Fragment Container</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Fragment Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTextFragmentContainer(TextFragmentContainer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseParagraph(Paragraph object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFragment(Fragment object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLine(Line object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseList(List object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseListItem(ListItem object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNamedElement(NamedElement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTable(Table object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Table Header</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTableHeader(TableHeader object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTableRow(TableRow object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseImage(Image object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Term Entry</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTermEntry(TermEntry object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>XML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXML(XML object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //DocumentationSwitch
