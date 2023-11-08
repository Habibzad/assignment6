# Simple Banking App Backend with Spring Boot

This simple banking app backend is built using Spring Boot, Spring JDBC, Spring Security, and Slf4j for logging. The application manages various banking entities like `AccountHolder`, `BankAccount`, `CdOffering`, `User`, and `ContactDetails`. The structure includes abstract classes and their subclasses for different types of bank accounts, namely `CheckingAccount`, `SavingsAccount`, and `CDAccount`.

## Technologies Used
- **Spring Boot:** Provides a robust framework for building Java-based applications with minimal configuration.
- **Spring JDBC:** Simplifies database operations and eliminates the need for manual connection management.
- **Spring Security:** Offers authentication and authorization mechanisms to secure endpoints and resources.
- **Slf4j:** A simple logging facade for Java that serves as a front end for various logging frameworks.

## Database
The application uses **PostgreSQL** as the database management system to store account information and other relevant data.

## Functionality and Endpoints

### Endpoints

1. **Account Creation:**
   - **POST `/api/accounts/create`**: Allows users to create a new bank account. Users provide necessary details, and the system creates the account accordingly.

2. **Money Transfer:**
   - **POST `/api/accounts/transfer`**: Enables users to transfer money between their accounts. Users specify source and destination accounts along with the transfer amount.

3. **CD Offerings:**
   - **GET `/api/cd-offerings`**: Provides a list of available CD (Certificate of Deposit) offerings to users. Users can view the available options for investing.

### Admin Endpoints

- **Account Management:**
  - **DELETE `/api/accounts/{accountId}`**: Admin users can close an account by providing the account ID.
  
- **User and Account Creation:**
  - **POST `/api/admin/users/create`**: Admin users can create new users by specifying user details.
  - **POST `/api/admin/accounts/create`**: Admin users can create new accounts for users. They provide necessary details, and the system creates the account accordingly.
  
- **Account Holder Management:**
  - **GET `/api/account-holder/{accountHolderId}`**: Account holders can view their profile information.
  - **GET `/api/account-holder/{accountHolderId}/accounts`**: Account holders can view a list of their accounts.

## Security

- **User Authentication:** The application uses Spring Security to authenticate users.
- **User Authorization:** Admin users have elevated privileges to manage accounts and users, while regular account holders can only view their own information.

This simple banking app backend provides essential banking functionalities, ensuring secure transactions and user data privacy. It leverages modern technologies and best practices to deliver a seamless banking experience.
