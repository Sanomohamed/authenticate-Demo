User Authentication System
Overview
This Java application provides a simple user authentication system with a graphical user interface (GUI) built using Swing. 
It allows users to register, log in, and access a dashboard upon successful authentication.

Features
User Registration: Users can create a new account by providing a username, password, and email. Passwords must be confirmed before registration is complete.
User Authentication: Registered users can log in using their username and password. Successful login redirects to a dashboard page.
Dashboard: After logging in, users are redirected to a dashboard where they can see their username and have the option to log out.
Components
Users Class
Attributes:
username: User's username.
password: User's password.
email: User's email address.
status: Authentication status of the user.

Methods:
authenticate(Users user): Authenticates a user by comparing the username and password.
LoginForm Class

GUI Components:
txtusername: Field for entering username.
txtpassword: Field for entering password.
btnlogin: Button to log in.
btnregister: Button to open the registration dialog.
registerdialog: Dialog for user registration with fields for username, password, confirm password, and email.

Features:
Allows users to log in or register.
Validates registration information and provides feedback.
Opens a new dashboard window upon successful login.

Dashbordform Class
GUI Components:
txtcurrentuser: Label displaying the current logged-in username.
jButton1: Button to log out and return to the login screen.
Features:

Displays a welcome message with the current username.
Provides a logout button to return to the login screen.

Usage
Registration:

Click on the "Register" button on the login form.
Fill out the registration form with a username, password, confirm the password, and provide an email address.
Click "Register" to complete the registration.
Login:

Enter your registered username and password on the login form.
Click "Login" to access the dashboard.
Dashboard:

After logging in, you will be redirected to the dashboard.
Click the "Logout" button to return to the login screen.
Troubleshooting
Invalid Login Credentials: Ensure that the username and password match those used during registration. Passwords are case-sensitive.
Registration Issues: Make sure that all required fields are filled out correctly and that passwords match.
