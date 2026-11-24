# DOCPULSE-A-Standalone-Java-Based-Hospital-Management-System-for-Patient-and-Hospital-Administration

## 1. Project Overview

The **Hospital Management System (HMS)** is a software application
developed to automate and simplify the day-to-day administrative
operations of a hospital. It provides a centralised way to manage
patient records, hospital departments, rooms, employees and ambulance
information.

The system aims to reduce paperwork, minimise manual errors, improve
record management and make hospital information easier to access and
update.

## 2. Project Information

  Field                Details
  -------------------- ---------------------------------------------------
  Project Title        Hospital Management System
  Organisation         Appsquadz Software Pvt. Ltd.
  Training Period      1 June 2026 -- 15 July 2026
  Training Mentor      Mr. Manish Bhatia
  Mentor Designation   Senior Java Consultant
  Institute            Jaypee Institute of Information Technology, Noida
  Department           B.Tech -- Computer Science and Engineering

## 3. Objectives

The main objectives of the project are to:

-   Digitise routine hospital administrative activities.
-   Maintain patient information in a centralised database.
-   Register new patients and view or update existing patient records.
-   Search hospital rooms and check their availability.
-   Display department and employee information.
-   View available ambulance details.
-   Manage patient discharge and update room availability.
-   Reduce paperwork and improve the efficiency of hospital
    administration.

## 4. Technologies Used

  -----------------------------------------------------------------------
  Technology                          Purpose
  ----------------------------------- -----------------------------------
  Core Java                           Implements application logic using
                                      object-oriented programming,
                                      exception handling, collections and
                                      file handling.

  Spring Framework                    Supports dependency injection, bean
                                      management and a modular
                                      application structure.

  JDBC                                Connects the Java application to
                                      the database and executes SQL
                                      operations such as INSERT, UPDATE,
                                      DELETE and SELECT.

  MySQL                               Stores and manages patient,
                                      employee, room, department and
                                      ambulance records.
  -----------------------------------------------------------------------

## 5. System Architecture

The application follows a layered structure:

1.  **User Layer:** The user interacts with the Hospital Management
    System.
2.  **Presentation Layer:** Handles the user interface and user
    requests.
3.  **Application Layer:** Uses Core Java and the Spring Framework to
    process business logic and perform hospital operations.
4.  **Data Access Layer:** Uses JDBC to connect the application with the
    database and execute database operations.
5.  **Database Layer:** MySQL stores and manages hospital-related
    records.

### Architecture Flow

``` text
                 USER
                   |
                   v
           PRESENTATION LAYER
          (Hospital Management UI)
                   |
                   v
            APPLICATION LAYER
          (Core Java + Spring)
                   |
                   v
             DATA ACCESS LAYER
                  (JDBC)
                   |
                   v
             DATABASE LAYER
                 (MySQL)
                   |
          ---------------------
          |         |         |
       Patients  Employees  Rooms
          |         |         |
      Departments Ambulances
```

## 6. Main Features and Modules

### 6.1 Patient Registration

-   Register new patients in the hospital database.
-   Store details such as name, age, gender, disease, contact number,
    address and room number.
-   Maintain organised patient records.

### 6.2 View All Patients

-   Display information about registered patients.
-   Retrieve patient records from the database.

### 6.3 Update Patient Information

-   Modify existing patient details when required.
-   Update the amount deposited.
-   Calculate and display the updated pending amount.

### 6.4 Department Information

-   Display the list of hospital departments.
-   Show department names and relevant details.

### 6.5 Room Search

-   Search for hospital rooms.
-   Display room numbers, room types, occupancy status and room charges.
-   Check room availability.

### 6.6 Employee Information

-   Display hospital employee information.
-   View details of doctors, nurses, receptionists, technicians and
    other staff members.

### 6.7 Ambulance Management

-   Display information about available ambulances.
-   View ambulance details, including availability and location
    information.

### 6.8 Patient Discharge

-   Discharge patients after completion of treatment.
-   Remove discharged patients from the active patient list.
-   Update room availability after discharge.

### 6.9 Login and Logout

-   Provide user login and logout functionality.
-   Allow users to exit the application through the logout option.

## 7. Development Process

The project development was organised into the following stages:

1.  **Requirement Analysis:** Identified common hospital operations and
    the information that needed to be managed.
2.  **Database Design:** Identified the main data categories, including
    patients, employees, rooms, departments and ambulances.
3.  **Database Connectivity:** Established connectivity between the Java
    application and MySQL using JDBC.
4.  **Application Development:** Implemented application logic using
    Core Java.
5.  **Framework Integration:** Used the Spring Framework for dependency
    injection and application organisation.
6.  **Testing:** Tested the application modules and database operations.
7.  **Final Deployment:** Prepared the application after implementation
    and testing.

## 8. Results

The Hospital Management System was developed with the following
implemented features:

-   Patient registration.
-   Patient record management.
-   Department information.
-   Room search and availability information.
-   Employee information.
-   Ambulance details.
-   Patient discharge.
-   Database connectivity.
-   User login and logout.

The application provides a digital approach to routine hospital
administration, helping reduce paperwork and improve the organisation of
hospital records.

## 9. Conclusion

The Hospital Management System demonstrates how software can be used to
digitise and simplify hospital administrative operations. It provides
modules for managing patient records, departments, rooms, employees and
ambulance information through a centralised database.

The project provided practical experience with Core Java, the Spring
Framework, JDBC and MySQL. It also strengthened understanding of
object-oriented programming, database connectivity, application
architecture and software development.

## 10. Future Enhancements

The system can be extended with additional features, including:

-   Online appointment booking.
-   Billing module.
-   Payment gateway integration.
-   Doctor scheduling.
-   Pharmacy management.
-   Medical report generation.
-   Email and SMS notifications.
-   Role-based authentication.

## 11. References

-   [Oracle Java Documentation](https://docs.oracle.com/en/java/)
-   [Spring Framework
    Documentation](https://docs.spring.io/spring-framework/reference/)
-   [MySQL Documentation](https://dev.mysql.com/doc/)
-   [JDBC API
    Documentation](https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/)
-   [GeeksforGeeks -- Java](https://www.geeksforgeeks.org/java/)

## 12. Appendix

### Software Requirements

-   Windows 11
-   Java JDK 26
-   IntelliJ IDEA
-   MySQL Workbench
-   Spring Framework
-   JDBC Driver

### Hardware Requirements

-   Intel Core i5 processor
-   4 GB RAM
-   500 MB free disk space

------------------------------------------------------------------------
