/**
 */
package de.devboost.natspec.library.documentation.impl;

import de.devboost.natspec.library.documentation.Documentation;
import de.devboost.natspec.library.documentation.DocumentationFactory;
import de.devboost.natspec.library.documentation.DocumentationPackage;
import de.devboost.natspec.library.documentation.Fragment;
import de.devboost.natspec.library.documentation.Image;
import de.devboost.natspec.library.documentation.Line;
import de.devboost.natspec.library.documentation.List;
import de.devboost.natspec.library.documentation.ListItem;
import de.devboost.natspec.library.documentation.NamedElement;
import de.devboost.natspec.library.documentation.Paragraph;
import de.devboost.natspec.library.documentation.Section;
import de.devboost.natspec.library.documentation.Subsection;
import de.devboost.natspec.library.documentation.Subsubsection;
import de.devboost.natspec.library.documentation.Table;
import de.devboost.natspec.library.documentation.TableHeader;
import de.devboost.natspec.library.documentation.TableRow;
import de.devboost.natspec.library.documentation.TermEntry;
import de.devboost.natspec.library.documentation.TextFragmentContainer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentationPackageImpl extends EPackageImpl implements DocumentationPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass documentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass sectionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass subsectionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass subsubsectionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass textFragmentContainerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass paragraphEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass fragmentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass lineEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass listEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass listItemEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass namedElementEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tableEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tableHeaderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass tableRowEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass imageEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass termEntryEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEClass = null;

		/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.devboost.natspec.library.documentation.DocumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private DocumentationPackageImpl()
  {
		super(eNS_URI, DocumentationFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DocumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static DocumentationPackage init()
  {
		if (isInited) return (DocumentationPackage)EPackage.Registry.INSTANCE.getEPackage(DocumentationPackage.eNS_URI);

		// Obtain or create and register package
		DocumentationPackageImpl theDocumentationPackage = (DocumentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DocumentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DocumentationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDocumentationPackage.createPackageContents();

		// Initialize created meta-data
		theDocumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocumentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocumentationPackage.eNS_URI, theDocumentationPackage);
		return theDocumentationPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDocumentation()
  {
		return documentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDocumentation_Sections()
  {
		return (EReference)documentationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDocumentation_Terminology()
  {
		return (EReference)documentationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDocumentation_Title()
  {
		return (EAttribute)documentationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSection()
  {
		return sectionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSubsection()
  {
		return subsectionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSubsubsection()
  {
		return subsubsectionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTextFragmentContainer()
  {
		return textFragmentContainerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTextFragmentContainer_Fragments()
  {
		return (EReference)textFragmentContainerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getParagraph()
  {
		return paragraphEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFragment()
  {
		return fragmentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLine()
  {
		return lineEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLine_Text()
  {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getList()
  {
		return listEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getList_Items()
  {
		return (EReference)listEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getListItem()
  {
		return listItemEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getListItem_Text()
  {
		return (EAttribute)listItemEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNamedElement()
  {
		return namedElementEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNamedElement_Id()
  {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNamedElement_Name()
  {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTable()
  {
		return tableEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTable_TableHeader()
  {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTable_TableRows()
  {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTableHeader()
  {
		return tableHeaderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTableHeader_HeaderCells()
  {
		return (EAttribute)tableHeaderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTableRow()
  {
		return tableRowEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTableRow_RowCells()
  {
		return (EAttribute)tableRowEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getImage()
  {
		return imageEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImage_Width()
  {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImage_OriginalSource()
  {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTermEntry()
  {
		return termEntryEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTermEntry_Description()
  {
		return (EAttribute)termEntryEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXML() {
		return xmlEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXML_ContextClassName() {
		return (EAttribute)xmlEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXML_Resource() {
		return (EAttribute)xmlEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DocumentationFactory getDocumentationFactory()
  {
		return (DocumentationFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentationEClass = createEClass(DOCUMENTATION);
		createEReference(documentationEClass, DOCUMENTATION__SECTIONS);
		createEReference(documentationEClass, DOCUMENTATION__TERMINOLOGY);
		createEAttribute(documentationEClass, DOCUMENTATION__TITLE);

		sectionEClass = createEClass(SECTION);

		subsectionEClass = createEClass(SUBSECTION);

		subsubsectionEClass = createEClass(SUBSUBSECTION);

		textFragmentContainerEClass = createEClass(TEXT_FRAGMENT_CONTAINER);
		createEReference(textFragmentContainerEClass, TEXT_FRAGMENT_CONTAINER__FRAGMENTS);

		paragraphEClass = createEClass(PARAGRAPH);

		fragmentEClass = createEClass(FRAGMENT);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__TEXT);

		listEClass = createEClass(LIST);
		createEReference(listEClass, LIST__ITEMS);

		listItemEClass = createEClass(LIST_ITEM);
		createEAttribute(listItemEClass, LIST_ITEM__TEXT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__ID);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__TABLE_HEADER);
		createEReference(tableEClass, TABLE__TABLE_ROWS);

		tableHeaderEClass = createEClass(TABLE_HEADER);
		createEAttribute(tableHeaderEClass, TABLE_HEADER__HEADER_CELLS);

		tableRowEClass = createEClass(TABLE_ROW);
		createEAttribute(tableRowEClass, TABLE_ROW__ROW_CELLS);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__WIDTH);
		createEAttribute(imageEClass, IMAGE__ORIGINAL_SOURCE);

		termEntryEClass = createEClass(TERM_ENTRY);
		createEAttribute(termEntryEClass, TERM_ENTRY__DESCRIPTION);

		xmlEClass = createEClass(XML);
		createEAttribute(xmlEClass, XML__CONTEXT_CLASS_NAME);
		createEAttribute(xmlEClass, XML__RESOURCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sectionEClass.getESuperTypes().add(this.getTextFragmentContainer());
		sectionEClass.getESuperTypes().add(this.getNamedElement());
		subsectionEClass.getESuperTypes().add(this.getTextFragmentContainer());
		subsectionEClass.getESuperTypes().add(this.getFragment());
		subsectionEClass.getESuperTypes().add(this.getNamedElement());
		subsubsectionEClass.getESuperTypes().add(this.getTextFragmentContainer());
		subsubsectionEClass.getESuperTypes().add(this.getFragment());
		subsubsectionEClass.getESuperTypes().add(this.getNamedElement());
		paragraphEClass.getESuperTypes().add(this.getTextFragmentContainer());
		paragraphEClass.getESuperTypes().add(this.getFragment());
		lineEClass.getESuperTypes().add(this.getFragment());
		listEClass.getESuperTypes().add(this.getFragment());
		listItemEClass.getESuperTypes().add(this.getTextFragmentContainer());
		tableEClass.getESuperTypes().add(this.getFragment());
		imageEClass.getESuperTypes().add(this.getFragment());
		imageEClass.getESuperTypes().add(this.getNamedElement());
		termEntryEClass.getESuperTypes().add(this.getNamedElement());
		xmlEClass.getESuperTypes().add(this.getFragment());
		xmlEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentation_Sections(), this.getSection(), null, "sections", null, 0, -1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentation_Terminology(), this.getTermEntry(), null, "terminology", null, 0, -1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentation_Title(), ecorePackage.getEString(), "title", null, 1, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsectionEClass, Subsection.class, "Subsection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsubsectionEClass, Subsubsection.class, "Subsubsection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textFragmentContainerEClass, TextFragmentContainer.class, "TextFragmentContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextFragmentContainer_Fragments(), this.getFragment(), null, "fragments", null, 0, -1, TextFragmentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fragmentEClass, Fragment.class, "Fragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_Text(), ecorePackage.getEString(), "text", null, 1, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getList_Items(), this.getListItem(), null, "items", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListItem_Text(), ecorePackage.getEString(), "text", null, 1, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_TableHeader(), this.getTableHeader(), null, "tableHeader", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_TableRows(), this.getTableRow(), null, "tableRows", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableHeaderEClass, TableHeader.class, "TableHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableHeader_HeaderCells(), ecorePackage.getEString(), "headerCells", null, 0, -1, TableHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableRow_RowCells(), ecorePackage.getEString(), "rowCells", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Width(), ecorePackage.getEIntegerObject(), "width", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_OriginalSource(), ecorePackage.getEString(), "originalSource", null, 1, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termEntryEClass, TermEntry.class, "TermEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermEntry_Description(), ecorePackage.getEString(), "description", null, 1, 1, TermEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlEClass, de.devboost.natspec.library.documentation.XML.class, "XML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXML_ContextClassName(), ecorePackage.getEString(), "contextClassName", null, 1, 1, de.devboost.natspec.library.documentation.XML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXML_Resource(), ecorePackage.getEString(), "resource", null, 1, 1, de.devboost.natspec.library.documentation.XML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper
		createOrgAnnotations();
	}

  /**
	 * Initializes the annotations for <b>org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createOrgAnnotations()
  {
		String source = "org.emftext.language.mecore.resource.mecore.mopp.MecoreWrapper";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (documentationEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getDocumentation_Sections(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getDocumentation_Terminology(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getDocumentation_Title(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (sectionEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (subsectionEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (subsubsectionEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (textFragmentContainerEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getTextFragmentContainer_Fragments(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (paragraphEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (fragmentEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (lineEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getLine_Text(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (listEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getList_Items(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (listItemEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getListItem_Text(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getNamedElement_Id(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getNamedElement_Name(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getTable_TableHeader(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getTable_TableRows(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (tableHeaderEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getTableHeader_HeaderCells(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (tableRowEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getTableRow_RowCells(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (imageEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getImage_Width(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getImage_OriginalSource(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (termEntryEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getTermEntry_Description(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (xmlEClass, 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getXML_ContextClassName(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });		
		addAnnotation
		  (getXML_Resource(), 
		   source, 
		   new String[] {
			 "WARNING", "This element was generated from an .mecore file. Removing this annotation will signal the MinimalEcore builder to keep this element."
		   });
	}

} //DocumentationPackageImpl
