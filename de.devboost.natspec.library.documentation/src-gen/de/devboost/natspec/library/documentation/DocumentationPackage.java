/**
 */
package de.devboost.natspec.library.documentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.devboost.natspec.library.documentation.DocumentationFactory
 * @model kind="package"
 *        annotation="org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper WARNING='This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element.'"
 * @generated
 */
public interface DocumentationPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "documentation";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.nat-spec.com/library/documentation";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "documentation";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  DocumentationPackage eINSTANCE = de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl.init();

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getDocumentation()
	 * @generated
	 */
  int DOCUMENTATION = 0;

  /**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENTATION__SECTIONS = 0;

  /**
	 * The feature id for the '<em><b>Terminology</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENTATION__TERMINOLOGY = 1;

  /**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENTATION__TITLE = 2;

  /**
	 * The number of structural features of the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DOCUMENTATION_FEATURE_COUNT = 3;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.TextFragmentContainerImpl <em>Text Fragment Container</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.TextFragmentContainerImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTextFragmentContainer()
	 * @generated
	 */
  int TEXT_FRAGMENT_CONTAINER = 4;

  /**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_FRAGMENT_CONTAINER__FRAGMENTS = 0;

  /**
	 * The number of structural features of the '<em>Text Fragment Container</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.SectionImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getSection()
	 * @generated
	 */
  int SECTION = 1;

  /**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECTION__FRAGMENTS = TEXT_FRAGMENT_CONTAINER__FRAGMENTS;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECTION__ID = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECTION__NAME = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SECTION_FEATURE_COUNT = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.SubsectionImpl <em>Subsection</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.SubsectionImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getSubsection()
	 * @generated
	 */
  int SUBSECTION = 2;

  /**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBSECTION__FRAGMENTS = TEXT_FRAGMENT_CONTAINER__FRAGMENTS;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBSECTION__ID = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBSECTION__NAME = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Subsection</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBSECTION_FEATURE_COUNT = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.SubsubsectionImpl <em>Subsubsection</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.SubsubsectionImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getSubsubsection()
	 * @generated
	 */
  int SUBSUBSECTION = 3;

  /**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBSUBSECTION__FRAGMENTS = TEXT_FRAGMENT_CONTAINER__FRAGMENTS;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBSUBSECTION__ID = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBSUBSECTION__NAME = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Subsubsection</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int SUBSUBSECTION_FEATURE_COUNT = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.ParagraphImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getParagraph()
	 * @generated
	 */
  int PARAGRAPH = 5;

  /**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAGRAPH__FRAGMENTS = TEXT_FRAGMENT_CONTAINER__FRAGMENTS;

  /**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PARAGRAPH_FEATURE_COUNT = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.FragmentImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getFragment()
	 * @generated
	 */
  int FRAGMENT = 6;

  /**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int FRAGMENT_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.LineImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getLine()
	 * @generated
	 */
  int LINE = 7;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE__TEXT = FRAGMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LINE_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.ListImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getList()
	 * @generated
	 */
  int LIST = 8;

  /**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST__ITEMS = FRAGMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.ListItemImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getListItem()
	 * @generated
	 */
  int LIST_ITEM = 9;

  /**
	 * The feature id for the '<em><b>Fragments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ITEM__FRAGMENTS = TEXT_FRAGMENT_CONTAINER__FRAGMENTS;

  /**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ITEM__TEXT = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int LIST_ITEM_FEATURE_COUNT = TEXT_FRAGMENT_CONTAINER_FEATURE_COUNT + 1;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.NamedElementImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getNamedElement()
	 * @generated
	 */
  int NAMED_ELEMENT = 10;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_ELEMENT__ID = 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_ELEMENT__NAME = 1;

  /**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NAMED_ELEMENT_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.TableImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTable()
	 * @generated
	 */
  int TABLE = 11;

  /**
	 * The feature id for the '<em><b>Table Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE__TABLE_HEADER = FRAGMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Table Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE__TABLE_ROWS = FRAGMENT_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 2;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.TableHeaderImpl <em>Table Header</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.TableHeaderImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTableHeader()
	 * @generated
	 */
  int TABLE_HEADER = 12;

  /**
	 * The feature id for the '<em><b>Header Cells</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE_HEADER__HEADER_CELLS = 0;

  /**
	 * The number of structural features of the '<em>Table Header</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE_HEADER_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.TableRowImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTableRow()
	 * @generated
	 */
  int TABLE_ROW = 13;

  /**
	 * The feature id for the '<em><b>Row Cells</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE_ROW__ROW_CELLS = 0;

  /**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TABLE_ROW_FEATURE_COUNT = 1;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.ImageImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getImage()
	 * @generated
	 */
  int IMAGE = 14;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE__ID = FRAGMENT_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE__NAME = FRAGMENT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE__WIDTH = FRAGMENT_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Original Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE__ORIGINAL_SOURCE = FRAGMENT_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int IMAGE_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 4;

  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.TermEntryImpl <em>Term Entry</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.TermEntryImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTermEntry()
	 * @generated
	 */
  int TERM_ENTRY = 15;

  /**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TERM_ENTRY__ID = NAMED_ELEMENT__ID;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TERM_ENTRY__NAME = NAMED_ELEMENT__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TERM_ENTRY__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Term Entry</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int TERM_ENTRY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;


  /**
	 * The meta object id for the '{@link de.devboost.natspec.library.documentation.impl.XMLImpl <em>XML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.devboost.natspec.library.documentation.impl.XMLImpl
	 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getXML()
	 * @generated
	 */
	int XML = 16;

		/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__ID = FRAGMENT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__NAME = FRAGMENT_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Context Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__CONTEXT_CLASS_NAME = FRAGMENT_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__RESOURCE = FRAGMENT_FEATURE_COUNT + 3;

		/**
	 * The number of structural features of the '<em>XML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 4;


		/**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see de.devboost.natspec.library.documentation.Documentation
	 * @generated
	 */
  EClass getDocumentation();

  /**
	 * Returns the meta object for the containment reference list '{@link de.devboost.natspec.library.documentation.Documentation#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see de.devboost.natspec.library.documentation.Documentation#getSections()
	 * @see #getDocumentation()
	 * @generated
	 */
  EReference getDocumentation_Sections();

  /**
	 * Returns the meta object for the containment reference list '{@link de.devboost.natspec.library.documentation.Documentation#getTerminology <em>Terminology</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology</em>'.
	 * @see de.devboost.natspec.library.documentation.Documentation#getTerminology()
	 * @see #getDocumentation()
	 * @generated
	 */
  EReference getDocumentation_Terminology();

  /**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.Documentation#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.devboost.natspec.library.documentation.Documentation#getTitle()
	 * @see #getDocumentation()
	 * @generated
	 */
  EAttribute getDocumentation_Title();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see de.devboost.natspec.library.documentation.Section
	 * @generated
	 */
  EClass getSection();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.Subsection <em>Subsection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsection</em>'.
	 * @see de.devboost.natspec.library.documentation.Subsection
	 * @generated
	 */
  EClass getSubsection();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.Subsubsection <em>Subsubsection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsubsection</em>'.
	 * @see de.devboost.natspec.library.documentation.Subsubsection
	 * @generated
	 */
  EClass getSubsubsection();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.TextFragmentContainer <em>Text Fragment Container</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Fragment Container</em>'.
	 * @see de.devboost.natspec.library.documentation.TextFragmentContainer
	 * @generated
	 */
  EClass getTextFragmentContainer();

  /**
	 * Returns the meta object for the containment reference list '{@link de.devboost.natspec.library.documentation.TextFragmentContainer#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fragments</em>'.
	 * @see de.devboost.natspec.library.documentation.TextFragmentContainer#getFragments()
	 * @see #getTextFragmentContainer()
	 * @generated
	 */
  EReference getTextFragmentContainer_Fragments();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see de.devboost.natspec.library.documentation.Paragraph
	 * @generated
	 */
  EClass getParagraph();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see de.devboost.natspec.library.documentation.Fragment
	 * @generated
	 */
  EClass getFragment();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see de.devboost.natspec.library.documentation.Line
	 * @generated
	 */
  EClass getLine();

  /**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.Line#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.devboost.natspec.library.documentation.Line#getText()
	 * @see #getLine()
	 * @generated
	 */
  EAttribute getLine_Text();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see de.devboost.natspec.library.documentation.List
	 * @generated
	 */
  EClass getList();

  /**
	 * Returns the meta object for the containment reference list '{@link de.devboost.natspec.library.documentation.List#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see de.devboost.natspec.library.documentation.List#getItems()
	 * @see #getList()
	 * @generated
	 */
  EReference getList_Items();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see de.devboost.natspec.library.documentation.ListItem
	 * @generated
	 */
  EClass getListItem();

  /**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.ListItem#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.devboost.natspec.library.documentation.ListItem#getText()
	 * @see #getListItem()
	 * @generated
	 */
  EAttribute getListItem_Text();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.devboost.natspec.library.documentation.NamedElement
	 * @generated
	 */
  EClass getNamedElement();

  /**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.devboost.natspec.library.documentation.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
  EAttribute getNamedElement_Id();

  /**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.devboost.natspec.library.documentation.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
  EAttribute getNamedElement_Name();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see de.devboost.natspec.library.documentation.Table
	 * @generated
	 */
  EClass getTable();

  /**
	 * Returns the meta object for the containment reference '{@link de.devboost.natspec.library.documentation.Table#getTableHeader <em>Table Header</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Header</em>'.
	 * @see de.devboost.natspec.library.documentation.Table#getTableHeader()
	 * @see #getTable()
	 * @generated
	 */
  EReference getTable_TableHeader();

  /**
	 * Returns the meta object for the containment reference list '{@link de.devboost.natspec.library.documentation.Table#getTableRows <em>Table Rows</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Rows</em>'.
	 * @see de.devboost.natspec.library.documentation.Table#getTableRows()
	 * @see #getTable()
	 * @generated
	 */
  EReference getTable_TableRows();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.TableHeader <em>Table Header</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Header</em>'.
	 * @see de.devboost.natspec.library.documentation.TableHeader
	 * @generated
	 */
  EClass getTableHeader();

  /**
	 * Returns the meta object for the attribute list '{@link de.devboost.natspec.library.documentation.TableHeader#getHeaderCells <em>Header Cells</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Header Cells</em>'.
	 * @see de.devboost.natspec.library.documentation.TableHeader#getHeaderCells()
	 * @see #getTableHeader()
	 * @generated
	 */
  EAttribute getTableHeader_HeaderCells();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see de.devboost.natspec.library.documentation.TableRow
	 * @generated
	 */
  EClass getTableRow();

  /**
	 * Returns the meta object for the attribute list '{@link de.devboost.natspec.library.documentation.TableRow#getRowCells <em>Row Cells</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Row Cells</em>'.
	 * @see de.devboost.natspec.library.documentation.TableRow#getRowCells()
	 * @see #getTableRow()
	 * @generated
	 */
  EAttribute getTableRow_RowCells();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see de.devboost.natspec.library.documentation.Image
	 * @generated
	 */
  EClass getImage();

  /**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.Image#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.devboost.natspec.library.documentation.Image#getWidth()
	 * @see #getImage()
	 * @generated
	 */
  EAttribute getImage_Width();

  /**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.Image#getOriginalSource <em>Original Source</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Source</em>'.
	 * @see de.devboost.natspec.library.documentation.Image#getOriginalSource()
	 * @see #getImage()
	 * @generated
	 */
  EAttribute getImage_OriginalSource();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.TermEntry <em>Term Entry</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Entry</em>'.
	 * @see de.devboost.natspec.library.documentation.TermEntry
	 * @generated
	 */
  EClass getTermEntry();

  /**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.TermEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.devboost.natspec.library.documentation.TermEntry#getDescription()
	 * @see #getTermEntry()
	 * @generated
	 */
  EAttribute getTermEntry_Description();

  /**
	 * Returns the meta object for class '{@link de.devboost.natspec.library.documentation.XML <em>XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML</em>'.
	 * @see de.devboost.natspec.library.documentation.XML
	 * @generated
	 */
	EClass getXML();

		/**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.XML#getContextClassName <em>Context Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Class Name</em>'.
	 * @see de.devboost.natspec.library.documentation.XML#getContextClassName()
	 * @see #getXML()
	 * @generated
	 */
	EAttribute getXML_ContextClassName();

		/**
	 * Returns the meta object for the attribute '{@link de.devboost.natspec.library.documentation.XML#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see de.devboost.natspec.library.documentation.XML#getResource()
	 * @see #getXML()
	 * @generated
	 */
	EAttribute getXML_Resource();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  DocumentationFactory getDocumentationFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.DocumentationImpl <em>Documentation</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getDocumentation()
		 * @generated
		 */
    EClass DOCUMENTATION = eINSTANCE.getDocumentation();

    /**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENTATION__SECTIONS = eINSTANCE.getDocumentation_Sections();

    /**
		 * The meta object literal for the '<em><b>Terminology</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DOCUMENTATION__TERMINOLOGY = eINSTANCE.getDocumentation_Terminology();

    /**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute DOCUMENTATION__TITLE = eINSTANCE.getDocumentation_Title();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.SectionImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getSection()
		 * @generated
		 */
    EClass SECTION = eINSTANCE.getSection();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.SubsectionImpl <em>Subsection</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.SubsectionImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getSubsection()
		 * @generated
		 */
    EClass SUBSECTION = eINSTANCE.getSubsection();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.SubsubsectionImpl <em>Subsubsection</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.SubsubsectionImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getSubsubsection()
		 * @generated
		 */
    EClass SUBSUBSECTION = eINSTANCE.getSubsubsection();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.TextFragmentContainerImpl <em>Text Fragment Container</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.TextFragmentContainerImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTextFragmentContainer()
		 * @generated
		 */
    EClass TEXT_FRAGMENT_CONTAINER = eINSTANCE.getTextFragmentContainer();

    /**
		 * The meta object literal for the '<em><b>Fragments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TEXT_FRAGMENT_CONTAINER__FRAGMENTS = eINSTANCE.getTextFragmentContainer_Fragments();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.ParagraphImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getParagraph()
		 * @generated
		 */
    EClass PARAGRAPH = eINSTANCE.getParagraph();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.FragmentImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getFragment()
		 * @generated
		 */
    EClass FRAGMENT = eINSTANCE.getFragment();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.LineImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getLine()
		 * @generated
		 */
    EClass LINE = eINSTANCE.getLine();

    /**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LINE__TEXT = eINSTANCE.getLine_Text();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.ListImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getList()
		 * @generated
		 */
    EClass LIST = eINSTANCE.getList();

    /**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference LIST__ITEMS = eINSTANCE.getList_Items();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.ListItemImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getListItem()
		 * @generated
		 */
    EClass LIST_ITEM = eINSTANCE.getListItem();

    /**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute LIST_ITEM__TEXT = eINSTANCE.getListItem_Text();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.NamedElementImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getNamedElement()
		 * @generated
		 */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_Id();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.TableImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTable()
		 * @generated
		 */
    EClass TABLE = eINSTANCE.getTable();

    /**
		 * The meta object literal for the '<em><b>Table Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TABLE__TABLE_HEADER = eINSTANCE.getTable_TableHeader();

    /**
		 * The meta object literal for the '<em><b>Table Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference TABLE__TABLE_ROWS = eINSTANCE.getTable_TableRows();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.TableHeaderImpl <em>Table Header</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.TableHeaderImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTableHeader()
		 * @generated
		 */
    EClass TABLE_HEADER = eINSTANCE.getTableHeader();

    /**
		 * The meta object literal for the '<em><b>Header Cells</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TABLE_HEADER__HEADER_CELLS = eINSTANCE.getTableHeader_HeaderCells();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.TableRowImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTableRow()
		 * @generated
		 */
    EClass TABLE_ROW = eINSTANCE.getTableRow();

    /**
		 * The meta object literal for the '<em><b>Row Cells</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TABLE_ROW__ROW_CELLS = eINSTANCE.getTableRow_RowCells();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.ImageImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getImage()
		 * @generated
		 */
    EClass IMAGE = eINSTANCE.getImage();

    /**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE__WIDTH = eINSTANCE.getImage_Width();

    /**
		 * The meta object literal for the '<em><b>Original Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute IMAGE__ORIGINAL_SOURCE = eINSTANCE.getImage_OriginalSource();

    /**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.TermEntryImpl <em>Term Entry</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.TermEntryImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getTermEntry()
		 * @generated
		 */
    EClass TERM_ENTRY = eINSTANCE.getTermEntry();

    /**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute TERM_ENTRY__DESCRIPTION = eINSTANCE.getTermEntry_Description();

				/**
		 * The meta object literal for the '{@link de.devboost.natspec.library.documentation.impl.XMLImpl <em>XML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.devboost.natspec.library.documentation.impl.XMLImpl
		 * @see de.devboost.natspec.library.documentation.impl.DocumentationPackageImpl#getXML()
		 * @generated
		 */
		EClass XML = eINSTANCE.getXML();

				/**
		 * The meta object literal for the '<em><b>Context Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML__CONTEXT_CLASS_NAME = eINSTANCE.getXML_ContextClassName();

				/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML__RESOURCE = eINSTANCE.getXML_Resource();

  }

} //DocumentationPackage
