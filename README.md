# REST-API-CLIENT

**COMPANY** : CODTECH IT SOLUTIONS

**NAME** :   MHASKE PRANAY SURESH

**INTERN ID**: CTIS3600

**DOMAIN** : JAVA PROGRAMMING

**BATCH DURATION** : 4 WEEKS

**MENTOR NAME** : NEELA SANTOSH

# ENTER DESCRIPTION OF TASK PERFORMED NOT LESS THAN 500 WORDS
In Task 2, a Java console application was designed and implemented to demonstrate how to consume a public REST API using core Java libraries. The application integrates with the GitHub public REST API to retrieve user profile information dynamically over the internet. The primary objective of this task was to establish HTTP communication, handle API responses, parse JSON data, and display structured output within a Java environment.

The application uses the HttpClient class available in Java 11 and later to send an HTTP GET request to the GitHub API endpoint: https://api.github.com/users/{username}. A specific username is provided in the program, and the request is constructed using HttpRequest. Appropriate headers such as Accept and User-Agent are included to ensure proper communication with the GitHub server. After sending the request, the program receives an HttpResponse object and verifies the HTTP status code to confirm whether the request was successful (status code 200). Basic error handling is also implemented to manage unsuccessful responses.

Once a valid JSON response is received, the program parses the returned data to extract key information, including the user’s login name, full name, biography, number of public repositories, followers, and following count. The extracted data is then formatted and displayed clearly in the console. This task demonstrates practical knowledge of REST API consumption, HTTP request handling, JSON parsing, and structured data presentation using Java, fulfilling the requirements of developing a functional Java application that interacts with external web services.

# OUTPUT OF THE TASK

<img width="1588" height="925" alt="Image" src="https://github.com/user-attachments/assets/62a93bf9-bb19-4d3d-9611-ff34e0c647e5" />
