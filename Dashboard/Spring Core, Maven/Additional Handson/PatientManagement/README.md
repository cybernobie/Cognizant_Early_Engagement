# Patient Management

## Patient Information:

A famous city hospital has to manage the patient records. This helps the
doctor to manage the patient records.

Provided Patient class with the following private attributes:

| Member Field Name | Type |
| ----------------- | ------- |
| pid | String |
| pname | String |
| disease | String |
| sex | String |
| admit_status | String |
| age | Integer |

Getter and setter methods for all the above attributes have beeprovided as a part of code skeleton. 

The values for these attributes should be injected via properties file. Provided PatientService class with the following private attributes:

| Member Field Name | Type |
| ----------------- | ---- |
| patient | Patient |

Service class should be registered as a bean with the spring containervia Java Configuration class. 

**`Main.java: main(String[] arg):void`**

1. Using ApplicationContext, get PatientService bean. 
2. Invoke the getPatientDetails() method using PatientServiceBean.

## Technical Specifications:

| ComponentName | Method Name | Input | Output | Exception |
| ------------- | ----------- | ----- | ------ | --------- |
| PatientService | getPatientDetails |  | void |  |
| AppConfig.class | Contains all the Java configurationsrelated to Service | | |

### Business Rules & Validations:

In PatientService class includes the following private attribute andinject via setter based injection. 

`private Patient patient;`

Getter and setter methods for the above attribute has been provided asa part of code skeleton

*Service 1: getPaientDetails():void*

Use Patient Bean, get the Patient information. 

### Limitations and Constraints:

1. Patient class should be in com.cts.patient.model package. 
2. PatientService class should be in com.cts.patient.service package. 
3. Main class should be in com.cts.patient package
4. All of the above mentioned java classes to be configured as beansin AppConfig.java fil
5. patient should be declared as an inner bean inthe PatientService class and shouldbe injected by autowire inside AppConfig.java. 
6. Use ONLY AppConfig.java for all configurations.

> Sample output

    Patient Id : P1000
    Patient Name : ABC
    Disease : fever
    Sex : female
    Admit Status : yes
    Age : 55