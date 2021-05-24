# Passport Service

Application created should be a simple simulation for workflow of passport office. Head Passport office

Setting rules for Regional Passport office how to process document and issue of
passport

### Step 1: 

Create an Interface HeadPassportOffice with below mentioned public
methods 

| AccessSpecifier/Modifier | Method Name | Input Parameters | Output Parameters | Logic |
| ------------------------ | ----------- | ---------------- | ----------------- | ----- |
Public abstract | doPhotoVerification | nil | Void | This method shoulddo verification ofapplicant based onphoto id like driving licence, aadhaar card or pancard. This method should print which idproof was used for verification|
| Public abstract | issuePassport | Nil | Void | This method issues passport to theapplicant. This method will print thename and location ofapplicant. |

### Step 2: 

Create  class    ChennaiPassportOffice which  implementsHeadPassportOffice and gives implementation for do PhotoVerificatioin and issuePassport methods. Annotate the class with @Component.

*Variable*:

chennaiDocument of type Document

*Parameterized Constructor*:

Create a parameterized constructor which takes a Document object. Annotate theconstructor with @Autowire. 

### Step 3: 

Create  class    BangalorePassportOffice which  implementsHeadPassportOffice and gives implementation for doPhotoVerificatioin andissuePassport methods .Annotate the class with @Component. 

*Variable*:

bangaloreDocument of type Document

*Parameterized Constructor*:

Create a parameterized constructor which takes a Document object. Annotate theconstructor with @Autowire

### Step 4: 

Create class Document which has following variables. 

*Variables*:

name of type String, idProof of type String, city of type String

### Step 5: 

Create class AppConfig which will be used as configuration class. Annotate this class with @Configuration and @ComponentScan and create below methods. 

| Annotation | Method Name | Input Parameters | Output Parameters | Logic |
| ---------- | ----------- | ---------------- | ----------------- | ----- |
| @Bean | chennaiDocument | nil  | Document | This method willcreate and returndocument object for Chennai candidate, set name as Joe, idProof as drivinglicence and city as Chennai
| @Bean | bangaloreDocument | nil | Document | This method willcreate and returndocument object forBangalorecandidate , set nameas John , idProof asAadhaar Card andcity as Bangalore | 

> Sample Input Output 1:

    Select location:
    1.Chennai
    2.Bangalore
    1
    Photo verification done using Driving LicencePassport issue is in progress for Joe from Chennai office

> Sample Input Output 2:

    Select location:
    1.Chennai
    2.Bangalore
    2
    Photo verification done using Aadhaar CardPassport issue is in progress for John from Bangalore office