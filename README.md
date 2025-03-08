# Project Setup Guide

## Follow the steps below to set up and run the project on your local machine.

### Step 1: Download the Project

Download the project as a ZIP file from the repository.

Extract the ZIP file to a desired location on your machine.

### Step 2: Configure Database Credentials

Navigate to the application properties file where database credentials are defined.

Update the database credentials as per your local database connection.

#### Step 3: Build the Project

Open a terminal or command prompt.

Navigate to the project's root directory.

Run the following command to build the project and create a WAR file:

# mvn clean install -Dmaven.test.skip=true -P your-profile

Replace <profile> with the appropriate Maven profile as per your environment.

### Step 4: Run the Project

Deploy the generated WAR file to your preferred application server.

Start the server and ensure the application runs successfully.

### Step 5: Access the Application

Open your browser and navigate to the application's URL.

Verify that the setup is complete and the application is running as expecte
