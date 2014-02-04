package com.nat_spec.examples.airline.documentation;

import de.devboost.natspec.library.documentation.Documentation;
import de.devboost.natspec.library.documentation.DocumentationGenerator;
import de.devboost.natspec.library.documentation.DocumentationSupport;

public class DragonFly_Airline_Documentation {

	private DocumentationSupport documentationSupport = new DocumentationSupport(
			this.getClass());

	public static void main(String[] args) throws Exception {
		new DragonFly_Airline_Documentation().saveDocumentation();
	}

	@SuppressWarnings("unused")
	public void saveDocumentation() throws Exception {

		// The code in this method is generated from: /com.nat-spec.examples.airline.documentation/model/com/nat_spec/examples/airline/documentation/DragonFly_Airline_Documentation.natspec
		// Never change this method or any contents of this file, all local changes will be overwritten.
		// Change _NatSpecTemplate.java instead.
		
		// Documentation - Arch42 Documentation for DragonFly Airline Management System (DAMS)
		de.devboost.natspec.library.documentation.Documentation documentation_Arch42_Documentation_for_DragonFly_Airline_Management_System__DAMS_ = documentationSupport.initDocumentation(java.util.Arrays.asList(new java.lang.String[] {"Arch42", "Documentation", "for", "DragonFly", "Airline", "Management", "System", "(DAMS)"}));
		// Section - Metadata		
		de.devboost.natspec.library.documentation.Section section_Metadata__ = documentationSupport.addSection(java.util.Arrays.asList(new java.lang.String[] {"Metadata\t\t"}), documentation_Arch42_Documentation_for_DragonFly_Airline_Management_System__DAMS_);
		// Subsection - Authors
		de.devboost.natspec.library.documentation.Subsection subsection_Authors = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Authors"}), section_Metadata__);
		// |---- ----------------------------------------------------------------------------- ----|
		de.devboost.natspec.library.documentation.Table table______________________________________________________________________________ = documentationSupport.createOrEndTable(java.util.Arrays.asList(new java.lang.String[] {"-----------------------------------------------------------------------------"}), subsection_Authors);
		// |- Author -|-  Affiliation -|- E-Mail	  -|
		documentationSupport.createTableHeader(java.util.Arrays.asList(new java.lang.String[] {"Author", "-|-", "", "Affiliation", "-|-", "E-Mail\t", ""}), table______________________________________________________________________________);
		// | Christian Wende | DevBoost GmbH | christian.wende@devboost.de |
		documentationSupport.createTableRow(java.util.Arrays.asList(new java.lang.String[] {"Christian", "Wende", "|", "DevBoost", "GmbH", "|", "christian.wende@devboost.de"}), table______________________________________________________________________________);
		// |---- ----------------------------------------------------------------------------- ----|
		de.devboost.natspec.library.documentation.Table table______________________________________________________________________________0 = documentationSupport.createOrEndTable(java.util.Arrays.asList(new java.lang.String[] {"-----------------------------------------------------------------------------"}), subsection_Authors);
		// Subsection - Revisions
		de.devboost.natspec.library.documentation.Subsection subsection_Revisions = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Revisions"}), section_Metadata__);
		// |---- -------------------------------------------------------------------------------------- ----|
		de.devboost.natspec.library.documentation.Table table_______________________________________________________________________________________ = documentationSupport.createOrEndTable(java.util.Arrays.asList(new java.lang.String[] {"--------------------------------------------------------------------------------------"}), subsection_Revisions);
		// |- Date -|- Revision -|-  Author -|- Changes	  -|
		documentationSupport.createTableHeader(java.util.Arrays.asList(new java.lang.String[] {"Date", "-|-", "Revision", "-|-", "", "Author", "-|-", "Changes\t", ""}), table_______________________________________________________________________________________);
		// | 01.06.2013 | 0.1 | Christian Wende | initialised content |
		documentationSupport.createTableRow(java.util.Arrays.asList(new java.lang.String[] {"01.06.2013", "|", "0.1", "|", "Christian", "Wende", "|", "initialised", "content"}), table_______________________________________________________________________________________);
		// | 05.06.2013 | 0.2 | Christian Wende | including modelled artifacts |
		documentationSupport.createTableRow(java.util.Arrays.asList(new java.lang.String[] {"05.06.2013", "|", "0.2", "|", "Christian", "Wende", "|", "including", "modelled", "artifacts"}), table_______________________________________________________________________________________);
		// | 09.06.2013 | 0.3 | Christian Wende | further contents |
		documentationSupport.createTableRow(java.util.Arrays.asList(new java.lang.String[] {"09.06.2013", "|", "0.3", "|", "Christian", "Wende", "|", "further", "contents"}), table_______________________________________________________________________________________);
		// | 10.06.2013 | 1.0 | Christian Wende | prepared version for DemoCamp |
		documentationSupport.createTableRow(java.util.Arrays.asList(new java.lang.String[] {"10.06.2013", "|", "1.0", "|", "Christian", "Wende", "|", "prepared", "version", "for", "DemoCamp"}), table_______________________________________________________________________________________);
		// |---- -------------------------------------------------------------------------------------- ----|
		de.devboost.natspec.library.documentation.Table table_______________________________________________________________________________________0 = documentationSupport.createOrEndTable(java.util.Arrays.asList(new java.lang.String[] {"--------------------------------------------------------------------------------------"}), subsection_Revisions);
		// Section - Introduction and Goals
		de.devboost.natspec.library.documentation.Section section_Introduction_and_Goals = documentationSupport.addSection(java.util.Arrays.asList(new java.lang.String[] {"Introduction", "and", "Goals"}), documentation_Arch42_Documentation_for_DragonFly_Airline_Management_System__DAMS_);
		// Paragraph
		de.devboost.natspec.library.documentation.Paragraph paragraph_ = documentationSupport.createParagraphWithHeading(java.util.Arrays.asList(new java.lang.String[] {}), section_Introduction_and_Goals);
		// The online airline agency DragonFly requires a software system that supports their core business cases related to planing, booking and
		de.devboost.natspec.library.documentation.Line line_The_online_airline_agency_DragonFly_requires_a_software_system_that_supports_their_core_business_cases_related_to_planing__booking_and = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"The", "online", "airline", "agency", "DragonFly", "requires", "a", "software", "system", "that", "supports", "their", "core", "business", "cases", "related", "to", "planing,", "booking", "and"}), paragraph_);
		// operating national and international flights. Its meant to help operations officers to manage employees, airplanes, flights, customers, and
		de.devboost.natspec.library.documentation.Line line_operating_national_and_international_flights__Its_meant_to_help_operations_officers_to_manage_employees__airplanes__flights__customers__and = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"operating", "national", "and", "international", "flights.", "Its", "meant", "to", "help", "operations", "officers", "to", "manage", "employees,", "airplanes,", "flights,", "customers,", "and"}), paragraph_);
		// bookings. Service employees should be supported in dealing with customer requests and to operate the check-in counter. Customers should be
		de.devboost.natspec.library.documentation.Line line_bookings__Service_employees_should_be_supported_in_dealing_with_customer_requests_and_to_operate_the_check_in_counter__Customers_should_be = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"bookings.", "Service", "employees", "should", "be", "supported", "in", "dealing", "with", "customer", "requests", "and", "to", "operate", "the", "check-in", "counter.", "Customers", "should", "be"}), paragraph_);
		// enabled to book and cancel flights on their own using the DragonFly online interface.
		de.devboost.natspec.library.documentation.Line line_enabled_to_book_and_cancel_flights_on_their_own_using_the_DragonFly_online_interface_ = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"enabled", "to", "book", "and", "cancel", "flights", "on", "their", "own", "using", "the", "DragonFly", "online", "interface."}), paragraph_);
		// DAMS is planned to replace an existing set of heterogeneous airline management systems that are currently used at DragonFly. Their functionality
		de.devboost.natspec.library.documentation.Line line_DAMS_is_planned_to_replace_an_existing_set_of_heterogeneous_airline_management_systems_that_are_currently_used_at_DragonFly__Their_functionality = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"DAMS", "is", "planned", "to", "replace", "an", "existing", "set", "of", "heterogeneous", "airline", "management", "systems", "that", "are", "currently", "used", "at", "DragonFly.", "Their", "functionality"}), paragraph_);
		// is out-dated and they are roughly integrated. Thus, their operation is ineffective and DragonFly employees are unsatisfied with their
		de.devboost.natspec.library.documentation.Line line_is_out_dated_and_they_are_roughly_integrated__Thus__their_operation_is_ineffective_and_DragonFly_employees_are_unsatisfied_with_their = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"is", "out-dated", "and", "they", "are", "roughly", "integrated.", "Thus,", "their", "operation", "is", "ineffective", "and", "DragonFly", "employees", "are", "unsatisfied", "with", "their"}), paragraph_);
		// application. For a re-launch of its online booking channel DragonFly plans to replace these systems with a more integrated
		de.devboost.natspec.library.documentation.Line line_application__For_a_re_launch_of_its_online_booking_channel_DragonFly_plans_to_replace_these_systems_with_a_more_integrated = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"application.", "For", "a", "re-launch", "of", "its", "online", "booking", "channel", "DragonFly", "plans", "to", "replace", "these", "systems", "with", "a", "more", "integrated"}), paragraph_);
		// full-service airline management system.
		de.devboost.natspec.library.documentation.Line line_full_service_airline_management_system_ = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"full-service", "airline", "management", "system."}), paragraph_);
		// Subsection - Quality Goals
		de.devboost.natspec.library.documentation.Subsection subsection_Quality_Goals = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Quality", "Goals"}), section_Introduction_and_Goals);
		// Due to the various involved stakeholders and the intended degree of automation through customer-self-service the DragonFly Airline Management
		de.devboost.natspec.library.documentation.Line line_Due_to_the_various_involved_stakeholders_and_the_intended_degree_of_automation_through_customer_self_service_the_DragonFly_Airline_Management = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"Due", "to", "the", "various", "involved", "stakeholders", "and", "the", "intended", "degree", "of", "automation", "through", "customer-self-service", "the", "DragonFly", "Airline", "Management"}), subsection_Quality_Goals);
		// System (DAMS) needs to meet highest quality standards. DAMS constitutes the backbone of the DragonFly business model that aims to combine
		de.devboost.natspec.library.documentation.Line line_System__DAMS__needs_to_meet_highest_quality_standards__DAMS_constitutes_the_backbone_of_the_DragonFly_business_model_that_aims_to_combine = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"System", "(DAMS)", "needs", "to", "meet", "highest", "quality", "standards.", "DAMS", "constitutes", "the", "backbone", "of", "the", "DragonFly", "business", "model", "that", "aims", "to", "combine"}), subsection_Quality_Goals);
		// List
		de.devboost.natspec.library.documentation.List list_ = documentationSupport.addList(subsection_Quality_Goals);
		// * optimal operative efficiency
		de.devboost.natspec.library.documentation.ListItem listItem_optimal_operative_efficiency = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"optimal", "operative", "efficiency"}), list_);
		// * highest customer satisfaction,
		de.devboost.natspec.library.documentation.ListItem listItem_highest_customer_satisfaction_ = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"highest", "customer", "satisfaction,"}), list_);
		// * a healthy company culture, and
		de.devboost.natspec.library.documentation.ListItem listItem_a_healthy_company_culture__and = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"a", "healthy", "company", "culture,", "and"}), list_);
		// in the highly competitive market for online airlines.
		de.devboost.natspec.library.documentation.Line line_in_the_highly_competitive_market_for_online_airlines_ = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"in", "the", "highly", "competitive", "market", "for", "online", "airlines."}), listItem_a_healthy_company_culture__and);
		// Subsection - Stakeholders
		de.devboost.natspec.library.documentation.Subsection subsection_Stakeholders = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Stakeholders"}), section_Introduction_and_Goals);
		// Paragraph
		de.devboost.natspec.library.documentation.Paragraph paragraph_0 = documentationSupport.createParagraphWithHeading(java.util.Arrays.asList(new java.lang.String[] {}), subsection_Stakeholders);
		// |---- ------------------------------------------------------------------------------------------------------------------------------------- ----|
		de.devboost.natspec.library.documentation.Table table______________________________________________________________________________________________________________________________________ = documentationSupport.createOrEndTable(java.util.Arrays.asList(new java.lang.String[] {"-------------------------------------------------------------------------------------------------------------------------------------"}), paragraph_0);
		// |- Name -|-  Description                      -|
		documentationSupport.createTableHeader(java.util.Arrays.asList(new java.lang.String[] {"Name", "-|-", "", "Description", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""}), table______________________________________________________________________________________________________________________________________);
		// | DragonFly Operations Officers | responsible for staffing, inventory management, operative planning									 |
		documentationSupport.createTableRow(java.util.Arrays.asList(new java.lang.String[] {"DragonFly", "Operations", "Officers", "|", "responsible", "for", "staffing,", "inventory", "management,", "operative", "planning\t\t\t\t\t\t\t\t\t"}), table______________________________________________________________________________________________________________________________________);
		// | DragonFly Service Employees	 | responsible for customers support and check-in operations  |
		documentationSupport.createTableRow(java.util.Arrays.asList(new java.lang.String[] {"DragonFly", "Service", "Employees\t", "|", "responsible", "for", "customers", "support", "and", "check-in", "operations", ""}), table______________________________________________________________________________________________________________________________________);
		// | DragonFly Customers		 | responsible for booking and canceling flights in terms of a customer self service    |
		documentationSupport.createTableRow(java.util.Arrays.asList(new java.lang.String[] {"DragonFly", "Customers\t\t", "|", "responsible", "for", "booking", "and", "canceling", "flights", "in", "terms", "of", "a", "customer", "self", "service", "", "", ""}), table______________________________________________________________________________________________________________________________________);
		// |---- ------------------------------------------------------------------------------------------------------------------------------------- ----|
		de.devboost.natspec.library.documentation.Table table______________________________________________________________________________________________________________________________________0 = documentationSupport.createOrEndTable(java.util.Arrays.asList(new java.lang.String[] {"-------------------------------------------------------------------------------------------------------------------------------------"}), paragraph_0);
		// Section - Constraints
		de.devboost.natspec.library.documentation.Section section_Constraints = documentationSupport.addSection(java.util.Arrays.asList(new java.lang.String[] {"Constraints"}), documentation_Arch42_Documentation_for_DragonFly_Airline_Management_System__DAMS_);
		// Subsection - Architecture Constraints
		de.devboost.natspec.library.documentation.Subsection subsection_Architecture_Constraints = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Architecture", "Constraints"}), section_Constraints);
		// List
		de.devboost.natspec.library.documentation.List list_0 = documentationSupport.addList(subsection_Architecture_Constraints);
		// * Due to very different requirements and responsibilities of each stakeholder, a custom client interface for each is required
		de.devboost.natspec.library.documentation.ListItem listItem_Due_to_very_different_requirements_and_responsibilities_of_each_stakeholder__a_custom_client_interface_for_each_is_required = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"Due", "to", "very", "different", "requirements", "and", "responsibilities", "of", "each", "stakeholder,", "a", "custom", "client", "interface", "for", "each", "is", "required"}), list_0);
		// * All client interfaces need to be realised as online applications that run on current operation systems and the commonly used web browser
		de.devboost.natspec.library.documentation.ListItem listItem_All_client_interfaces_need_to_be_realised_as_online_applications_that_run_on_current_operation_systems_and_the_commonly_used_web_browser = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"All", "client", "interfaces", "need", "to", "be", "realised", "as", "online", "applications", "that", "run", "on", "current", "operation", "systems", "and", "the", "commonly", "used", "web", "browser"}), list_0);
		// * The system is meant to operate worldwide and needs to be capable of handling and synchronise concurrent access to all data records
		de.devboost.natspec.library.documentation.ListItem listItem_The_system_is_meant_to_operate_worldwide_and_needs_to_be_capable_of_handling_and_synchronise_concurrent_access_to_all_data_records = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"The", "system", "is", "meant", "to", "operate", "worldwide", "and", "needs", "to", "be", "capable", "of", "handling", "and", "synchronise", "concurrent", "access", "to", "all", "data", "records"}), list_0);
		// * Internal management data (used by DragonFly employees) needs to be physically separated from data that is accessible for customers
		de.devboost.natspec.library.documentation.ListItem listItem_Internal_management_data__used_by_DragonFly_employees__needs_to_be_physically_separated_from_data_that_is_accessible_for_customers = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"Internal", "management", "data", "(used", "by", "DragonFly", "employees)", "needs", "to", "be", "physically", "separated", "from", "data", "that", "is", "accessible", "for", "customers"}), list_0);
		// * All data is business critical	and needs to be stored redundantly
		de.devboost.natspec.library.documentation.ListItem listItem_All_data_is_business_critical_and_needs_to_be_stored_redundantly = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"All", "data", "is", "business", "critical\tand", "needs", "to", "be", "stored", "redundantly"}), list_0);
		// * The server back-end needs to be scalable to handle numerous distributed clients
		de.devboost.natspec.library.documentation.ListItem listItem_The_server_back_end_needs_to_be_scalable_to_handle_numerous_distributed_clients = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"The", "server", "back-end", "needs", "to", "be", "scalable", "to", "handle", "numerous", "distributed", "clients"}), list_0);
		// Subsection - Technical Constraints
		de.devboost.natspec.library.documentation.Subsection subsection_Technical_Constraints = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Technical", "Constraints"}), section_Constraints);
		// List
		de.devboost.natspec.library.documentation.List list_1 = documentationSupport.addList(subsection_Technical_Constraints);
		// * The server needs be implemented using JEE7 technologies and the open-source JEE web-server Tomcat
		de.devboost.natspec.library.documentation.ListItem listItem_The_server_needs_be_implemented_using_JEE7_technologies_and_the_open_source_JEE_web_server_Tomcat = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"The", "server", "needs", "be", "implemented", "using", "JEE7", "technologies", "and", "the", "open-source", "JEE", "web-server", "Tomcat"}), list_1);
		// * The clients needs to be implemented as a JEE web application
		de.devboost.natspec.library.documentation.ListItem listItem_The_clients_needs_to_be_implemented_as_a_JEE_web_application = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"The", "clients", "needs", "to", "be", "implemented", "as", "a", "JEE", "web", "application"}), list_1);
		// * The database back-end is meant to be based on the open-source database MySQL
		de.devboost.natspec.library.documentation.ListItem listItem_The_database_back_end_is_meant_to_be_based_on_the_open_source_database_MySQL = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"The", "database", "back-end", "is", "meant", "to", "be", "based", "on", "the", "open-source", "database", "MySQL"}), list_1);
		// Subsection - Conventions
		de.devboost.natspec.library.documentation.Subsection subsection_Conventions = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Conventions"}), section_Constraints);
		// List
		de.devboost.natspec.library.documentation.List list_2 = documentationSupport.addList(subsection_Conventions);
		// * The functionality and validity of all business functions, of the clients and the server need to be verified using automated tests
		de.devboost.natspec.library.documentation.ListItem listItem_The_functionality_and_validity_of_all_business_functions__of_the_clients_and_the_server_need_to_be_verified_using_automated_tests = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"The", "functionality", "and", "validity", "of", "all", "business", "functions,", "of", "the", "clients", "and", "the", "server", "need", "to", "be", "verified", "using", "automated", "tests"}), list_2);
		// * Developers Documentation should be provided and refined continuously using the arch24 Documentation template
		de.devboost.natspec.library.documentation.ListItem listItem_Developers_Documentation_should_be_provided_and_refined_continuously_using_the_arch24_Documentation_template = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"Developers", "Documentation", "should", "be", "provided", "and", "refined", "continuously", "using", "the", "arch24", "Documentation", "template"}), list_2);
		// * Users Documentation for each stakeholders client needs to provided and continuously updated for all client functions
		de.devboost.natspec.library.documentation.ListItem listItem_Users_Documentation_for_each_stakeholders_client_needs_to_provided_and_continuously_updated_for_all_client_functions = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"Users", "Documentation", "for", "each", "stakeholders", "client", "needs", "to", "provided", "and", "continuously", "updated", "for", "all", "client", "functions"}), list_2);
		// * Implementation should follow the Java Sun Coding Conventions
		de.devboost.natspec.library.documentation.ListItem listItem_Implementation_should_follow_the_Java_Sun_Coding_Conventions = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"Implementation", "should", "follow", "the", "Java", "Sun", "Coding", "Conventions"}), list_2);
		// Section - System Scope and Context
		de.devboost.natspec.library.documentation.Section section_System_Scope_and_Context = documentationSupport.addSection(java.util.Arrays.asList(new java.lang.String[] {"System", "Scope", "and", "Context"}), documentation_Arch42_Documentation_for_DragonFly_Airline_Management_System__DAMS_);
		// Subsection - Business Context
		de.devboost.natspec.library.documentation.Subsection subsection_Business_Context = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Business", "Context"}), section_System_Scope_and_Context);
		// The DAMS System needs to contribute both
		de.devboost.natspec.library.documentation.Line line_The_DAMS_System_needs_to_contribute_both = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"The", "DAMS", "System", "needs", "to", "contribute", "both"}), subsection_Business_Context);
		// List
		de.devboost.natspec.library.documentation.List list_3 = documentationSupport.addList(subsection_Business_Context);
		// * a business software solution used by DragonFly employees and
		de.devboost.natspec.library.documentation.ListItem listItem_a_business_software_solution_used_by_DragonFly_employees_and = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"a", "business", "software", "solution", "used", "by", "DragonFly", "employees", "and"}), list_3);
		// * a B2C client exposing online flight booking services for DragonFly customers
		de.devboost.natspec.library.documentation.ListItem listItem_a_B2C_client_exposing_online_flight_booking_services_for_DragonFly_customers = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"a", "B2C", "client", "exposing", "online", "flight", "booking", "services", "for", "DragonFly", "customers"}), list_3);
		// Subsection - Technical Context
		de.devboost.natspec.library.documentation.Subsection subsection_Technical_Context = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Technical", "Context"}), section_System_Scope_and_Context);
		// For the introduction of DASM a stepwise transition form the previous systems is planned. To enable an easy integration
		de.devboost.natspec.library.documentation.Line line_For_the_introduction_of_DASM_a_stepwise_transition_form_the_previous_systems_is_planned__To_enable_an_easy_integration = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"For", "the", "introduction", "of", "DASM", "a", "stepwise", "transition", "form", "the", "previous", "systems", "is", "planned.", "To", "enable", "an", "easy", "integration"}), subsection_Technical_Context);
		// and stepwise transition DAMS has to provide interfaces to the existing legacy databases and management systems, that
		de.devboost.natspec.library.documentation.Line line_and_stepwise_transition_DAMS_has_to_provide_interfaces_to_the_existing_legacy_databases_and_management_systems__that = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"and", "stepwise", "transition", "DAMS", "has", "to", "provide", "interfaces", "to", "the", "existing", "legacy", "databases", "and", "management", "systems,", "that"}), subsection_Technical_Context);
		// can later be deactivated when the transition is finished.
		de.devboost.natspec.library.documentation.Line line_can_later_be_deactivated_when_the_transition_is_finished_ = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"can", "later", "be", "deactivated", "when", "the", "transition", "is", "finished."}), subsection_Technical_Context);
		// Subsection - External Interfaces
		de.devboost.natspec.library.documentation.Subsection subsection_External_Interfaces = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"External", "Interfaces"}), section_System_Scope_and_Context);
		// Interfaces to legacy systems
		de.devboost.natspec.library.documentation.Line line_Interfaces_to_legacy_systems = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"Interfaces", "to", "legacy", "systems"}), subsection_External_Interfaces);
		// List
		de.devboost.natspec.library.documentation.List list_4 = documentationSupport.addList(subsection_External_Interfaces);
		// * DragonFly Employee Manager
		de.devboost.natspec.library.documentation.ListItem listItem_DragonFly_Employee_Manager = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"DragonFly", "Employee", "Manager"}), list_4);
		// * DragonFly Check-in Counter
		de.devboost.natspec.library.documentation.ListItem listItem_DragonFly_Check_in_Counter = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"DragonFly", "Check-in", "Counter"}), list_4);
		// * DragenFly Asset Management Solution
		de.devboost.natspec.library.documentation.ListItem listItem_DragenFly_Asset_Management_Solution = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"DragenFly", "Asset", "Management", "Solution"}), list_4);
		// Other interfaces
		de.devboost.natspec.library.documentation.Line line_Other_interfaces = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"Other", "interfaces"}), listItem_DragenFly_Asset_Management_Solution);
		// List
		de.devboost.natspec.library.documentation.List list_5 = documentationSupport.addList(listItem_DragenFly_Asset_Management_Solution);
		// * Interfaces to online price portals
		de.devboost.natspec.library.documentation.ListItem listItem_Interfaces_to_online_price_portals = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"Interfaces", "to", "online", "price", "portals"}), list_5);
		// * Interface to business performance analysis tool
		de.devboost.natspec.library.documentation.ListItem listItem_Interface_to_business_performance_analysis_tool = documentationSupport.addListItem(java.util.Arrays.asList(new java.lang.String[] {"Interface", "to", "business", "performance", "analysis", "tool"}), list_5);
		// Section - Components View
		de.devboost.natspec.library.documentation.Section section_Components_View = documentationSupport.addSection(java.util.Arrays.asList(new java.lang.String[] {"Components", "View"}), documentation_Arch42_Documentation_for_DragonFly_Airline_Management_System__DAMS_);
		// Subsection - Level I
		de.devboost.natspec.library.documentation.Subsection subsection_Level_I = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Level", "I"}), section_Components_View);
		// The overall architecture of DAMS is organised in 3 layers. The lower most layer contributes the database layer that
		de.devboost.natspec.library.documentation.Line line_The_overall_architecture_of_DAMS_is_organised_in_3_layers__The_lower_most_layer_contributes_the_database_layer_that = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"The", "overall", "architecture", "of", "DAMS", "is", "organised", "in", "3", "layers.", "The", "lower", "most", "layer", "contributes", "the", "database", "layer", "that"}), subsection_Level_I);
		// holds and manages all persistent data for DAMS. The middle layer constitutes a set of enterprise service components that
		de.devboost.natspec.library.documentation.Line line_holds_and_manages_all_persistent_data_for_DAMS__The_middle_layer_constitutes_a_set_of_enterprise_service_components_that = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"holds", "and", "manages", "all", "persistent", "data", "for", "DAMS.", "The", "middle", "layer", "constitutes", "a", "set", "of", "enterprise", "service", "components", "that"}), subsection_Level_I);
		// implement all business services for the B2B and B2C functions of DAMS. In the upper most layer three DAMS clients are
		de.devboost.natspec.library.documentation.Line line_implement_all_business_services_for_the_B2B_and_B2C_functions_of_DAMS__In_the_upper_most_layer_three_DAMS_clients_are = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"implement", "all", "business", "services", "for", "the", "B2B", "and", "B2C", "functions", "of", "DAMS.", "In", "the", "upper", "most", "layer", "three", "DAMS", "clients", "are"}), subsection_Level_I);
		// implemented as online applications that run on all common web browsers.
		de.devboost.natspec.library.documentation.Line line_implemented_as_online_applications_that_run_on_all_common_web_browsers_ = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"implemented", "as", "online", "applications", "that", "run", "on", "all", "common", "web", "browsers."}), subsection_Level_I);
		// Section - Detailed Design
		de.devboost.natspec.library.documentation.Section section_Detailed_Design = documentationSupport.addSection(java.util.Arrays.asList(new java.lang.String[] {"Detailed", "Design"}), documentation_Arch42_Documentation_for_DragonFly_Airline_Management_System__DAMS_);
		// Subsection - Business Rules
		de.devboost.natspec.library.documentation.Subsection subsection_Business_Rules = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"Business", "Rules"}), section_Detailed_Design);
		// Subsubsection - Rules for the Booking Service
		de.devboost.natspec.library.documentation.Subsubsection subsubsection_Rules_for_the_Booking_Service = documentationSupport.addSubsubsection(java.util.Arrays.asList(new java.lang.String[] {"Rules", "for", "the", "Booking", "Service"}), subsection_Business_Rules);
		// Rules - ../com.nat-spec.examples.airline.services/model/com/nat_spec/examples/airline/services/validator/BookingValidation.natspec
		documentationSupport.addRules("../com.nat-spec.examples.airline.services/model/com/nat_spec/examples/airline/services/validator/BookingValidation.natspec", subsubsection_Rules_for_the_Booking_Service);
		// Section - User Stories
		de.devboost.natspec.library.documentation.Section section_User_Stories = documentationSupport.addSection(java.util.Arrays.asList(new java.lang.String[] {"User", "Stories"}), documentation_Arch42_Documentation_for_DragonFly_Airline_Management_System__DAMS_);
		// Subsection - User Stories for Booking
		de.devboost.natspec.library.documentation.Subsection subsection_User_Stories_for_Booking = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"User", "Stories", "for", "Booking"}), section_User_Stories);
		// Story - ../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/BookSeatForPassenger.natspec
		documentationSupport.addStory("../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/BookSeatForPassenger.natspec", subsection_User_Stories_for_Booking);
		// Story - ../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/BookSeatForPassengerTwice.natspec
		documentationSupport.addStory("../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/BookSeatForPassengerTwice.natspec", subsection_User_Stories_for_Booking);
		// Story - ../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/OverbookSeatNumber.natspec
		documentationSupport.addStory("../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/OverbookSeatNumber.natspec", subsection_User_Stories_for_Booking);
		// Subsection - User Stories for Canceling
		de.devboost.natspec.library.documentation.Subsection subsection_User_Stories_for_Canceling = documentationSupport.addSubsection(java.util.Arrays.asList(new java.lang.String[] {"User", "Stories", "for", "Canceling"}), section_User_Stories);
		// Story - ../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/CancelAndRebookSeat.natspec
		documentationSupport.addStory("../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/CancelAndRebookSeat.natspec", subsection_User_Stories_for_Canceling);
		// Story - ../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/CancelSeatTwice.natspec
		documentationSupport.addStory("../com.nat-spec.examples.airline.tests/src-endusertests/com/nat_spec/examples/airline/test/CancelSeatTwice.natspec", subsection_User_Stories_for_Canceling);
		// Section - Design Decisions
		de.devboost.natspec.library.documentation.Section section_Design_Decisions = documentationSupport.addSection(java.util.Arrays.asList(new java.lang.String[] {"Design", "Decisions"}), documentation_Arch42_Documentation_for_DragonFly_Airline_Management_System__DAMS_);
		// Should be documented and refined during implementation
		de.devboost.natspec.library.documentation.Line line_Should_be_documented_and_refined_during_implementation = documentationSupport.createPlainContents(java.util.Arrays.asList(new String[] {"Should", "be", "documented", "and", "refined", "during", "implementation"}), section_Design_Decisions);
		
		int unused = 0;
		Documentation documentation = documentationSupport.getDocumentation();
		DocumentationGenerator generator = new DocumentationGenerator();
		generator.saveDocumentationToFile(documentation);

	}
}
