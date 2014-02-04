/**
 */
package de.devboost.natspec.library.documentation.impl;

import de.devboost.natspec.library.documentation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentationFactoryImpl extends EFactoryImpl implements DocumentationFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DocumentationFactory init()
  {
		try {
			DocumentationFactory theDocumentationFactory = (DocumentationFactory)EPackage.Registry.INSTANCE.getEFactory(DocumentationPackage.eNS_URI);
			if (theDocumentationFactory != null) {
				return theDocumentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocumentationFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DocumentationFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case DocumentationPackage.DOCUMENTATION: return createDocumentation();
			case DocumentationPackage.SECTION: return createSection();
			case DocumentationPackage.SUBSECTION: return createSubsection();
			case DocumentationPackage.SUBSUBSECTION: return createSubsubsection();
			case DocumentationPackage.PARAGRAPH: return createParagraph();
			case DocumentationPackage.LINE: return createLine();
			case DocumentationPackage.LIST: return createList();
			case DocumentationPackage.LIST_ITEM: return createListItem();
			case DocumentationPackage.TABLE: return createTable();
			case DocumentationPackage.TABLE_HEADER: return createTableHeader();
			case DocumentationPackage.TABLE_ROW: return createTableRow();
			case DocumentationPackage.IMAGE: return createImage();
			case DocumentationPackage.TERM_ENTRY: return createTermEntry();
			case DocumentationPackage.XML: return createXML();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Documentation createDocumentation()
  {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Section createSection()
  {
		SectionImpl section = new SectionImpl();
		return section;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Subsection createSubsection()
  {
		SubsectionImpl subsection = new SubsectionImpl();
		return subsection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Subsubsection createSubsubsection()
  {
		SubsubsectionImpl subsubsection = new SubsubsectionImpl();
		return subsubsection;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Paragraph createParagraph()
  {
		ParagraphImpl paragraph = new ParagraphImpl();
		return paragraph;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Line createLine()
  {
		LineImpl line = new LineImpl();
		return line;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List createList()
  {
		ListImpl list = new ListImpl();
		return list;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ListItem createListItem()
  {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Table createTable()
  {
		TableImpl table = new TableImpl();
		return table;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TableHeader createTableHeader()
  {
		TableHeaderImpl tableHeader = new TableHeaderImpl();
		return tableHeader;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TableRow createTableRow()
  {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Image createImage()
  {
		ImageImpl image = new ImageImpl();
		return image;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TermEntry createTermEntry()
  {
		TermEntryImpl termEntry = new TermEntryImpl();
		return termEntry;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XML createXML() {
		XMLImpl xml = new XMLImpl();
		return xml;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DocumentationPackage getDocumentationPackage()
  {
		return (DocumentationPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static DocumentationPackage getPackage()
  {
		return DocumentationPackage.eINSTANCE;
	}

} //DocumentationFactoryImpl
