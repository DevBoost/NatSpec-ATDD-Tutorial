/**
 */
package de.devboost.natspec.library.documentation.util;

import de.devboost.natspec.library.documentation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.devboost.natspec.library.documentation.DocumentationPackage
 * @generated
 */
public class DocumentationAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static DocumentationPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DocumentationAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = DocumentationPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DocumentationSwitch<Adapter> modelSwitch =
    new DocumentationSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentation(Documentation object) {
				return createDocumentationAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseSubsection(Subsection object) {
				return createSubsectionAdapter();
			}
			@Override
			public Adapter caseSubsubsection(Subsubsection object) {
				return createSubsubsectionAdapter();
			}
			@Override
			public Adapter caseTextFragmentContainer(TextFragmentContainer object) {
				return createTextFragmentContainerAdapter();
			}
			@Override
			public Adapter caseParagraph(Paragraph object) {
				return createParagraphAdapter();
			}
			@Override
			public Adapter caseFragment(Fragment object) {
				return createFragmentAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseList(List object) {
				return createListAdapter();
			}
			@Override
			public Adapter caseListItem(ListItem object) {
				return createListItemAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableHeader(TableHeader object) {
				return createTableHeaderAdapter();
			}
			@Override
			public Adapter caseTableRow(TableRow object) {
				return createTableRowAdapter();
			}
			@Override
			public Adapter caseImage(Image object) {
				return createImageAdapter();
			}
			@Override
			public Adapter caseTermEntry(TermEntry object) {
				return createTermEntryAdapter();
			}
			@Override
			public Adapter caseXML(XML object) {
				return createXMLAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.Documentation
	 * @generated
	 */
  public Adapter createDocumentationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.Section
	 * @generated
	 */
  public Adapter createSectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.Subsection <em>Subsection</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.Subsection
	 * @generated
	 */
  public Adapter createSubsectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.Subsubsection <em>Subsubsection</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.Subsubsection
	 * @generated
	 */
  public Adapter createSubsubsectionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.TextFragmentContainer <em>Text Fragment Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.TextFragmentContainer
	 * @generated
	 */
  public Adapter createTextFragmentContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.Paragraph
	 * @generated
	 */
  public Adapter createParagraphAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.Fragment
	 * @generated
	 */
  public Adapter createFragmentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.Line
	 * @generated
	 */
  public Adapter createLineAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.List
	 * @generated
	 */
  public Adapter createListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.ListItem
	 * @generated
	 */
  public Adapter createListItemAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.NamedElement
	 * @generated
	 */
  public Adapter createNamedElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.Table
	 * @generated
	 */
  public Adapter createTableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.TableHeader <em>Table Header</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.TableHeader
	 * @generated
	 */
  public Adapter createTableHeaderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.TableRow
	 * @generated
	 */
  public Adapter createTableRowAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.Image
	 * @generated
	 */
  public Adapter createImageAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.TermEntry <em>Term Entry</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.TermEntry
	 * @generated
	 */
  public Adapter createTermEntryAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link de.devboost.natspec.library.documentation.XML <em>XML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.devboost.natspec.library.documentation.XML
	 * @generated
	 */
	public Adapter createXMLAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //DocumentationAdapterFactory
