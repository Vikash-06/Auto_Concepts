Feature: Login functionality


@Reg
Scenario: Checking successfull login with valid credentials
When Enter the valid "standard_user" and "secret_sauce" credentials
And Click the login button
Then validate successfull login


