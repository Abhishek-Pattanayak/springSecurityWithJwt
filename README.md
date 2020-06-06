# springSecurityWithJwt

- This is an example of ***Spring boot + Spring security + JWT + JPA + H2 In memory DB***. 
- There are two users one with user role and the other with admin.
- So at first the request needs to be ***authenticated with username and password*** and once the ***JWT token gets genarted*** then can send request multiple times.

## Steps to test the application

- Start the application which will run on port 8000
- Then hit the below URL using Postman which will generate the ***JWT token*** for your current user (you need to generate token for each time you modify user)

![image](https://user-images.githubusercontent.com/64692097/83951124-04851480-a84d-11ea-972c-358cac2b150b.png)

- Copy the jwttoken value and add as Authorization token with ***"Bearer "*** prefixed as per below screen shot (And prior to that make sure the Type should be ***No Auth selected on Authorization tab***). Then hit the below URL as GET. As ***Stephen*** has only ***USER role***, so it can only acces /user whereas ***Margreta*** has both ***USER and ADMIN role***, so it can access both ***/user and /admin***

![image](https://user-images.githubusercontent.com/64692097/83951388-d4d70c00-a84e-11ea-91cf-4e38b819428e.png)

