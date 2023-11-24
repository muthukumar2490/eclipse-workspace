package testPageObjectModel;

public class testPageObjectmodelBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
	
		//-------POM approach----------------
		
		//1.Page object model is a design pattern
		//2.Data driven framework
		//3.TestNG
		//-----------I.Page Layer--------------package com.qa.pages
		//4. for each page in the application seperate java class need to be created
		//collection of all page classes is called page Library.(ex. login_page.java)
		//5.for each page/class, will define webelements/web objects (collectoin of web objects
		// or web elements are called object repository)
		//6.for each page/class, will then define actions/methods -- Features
		//7. 4 +5+6 points are Page Layer
		//----------II.Test Layer----------------------package com.qa.tests
		//8.for each page in the app there will be a seperate test.java class
		//created to test the actions.(ex. login_pageTest.java)
		//9.all testNG annotations will be define in the test layer with the
		//help of TestNG.
		//----------III.testBase Layer-------------- package com.qa.testbase
		//10. after page and Test Layer, Test base class need to be created.
		//this would be the parent class of all page class.
		//11. all page classes child class of testbase.so, page class extends testBase.java
		//12.similarly all test layer classes are also extending testbase.java class
		//13.inside testBase class webdriver initialization and properties file ,
		//window.maximize(), pageLoadWait, implicit wait, deleteAll Cookies, get(url)
		//-----------IV. Environment Layer-----------------------package com.qa.config
		//14.create config.properties layer. can contain url, username, password
		//----------V.test data--------------com.qa.testdata
		//15.create testData.xlsx
		//---------VI. test utilities-----------------com.qa.util
		//16.create test Util.java. inside screenshot(), sendmail() or any
		//common utils can written
		//---------VII. test Report-------------Test-outputs/reports
		//17.can have html, testNG or Extent Reports
		
		
		
		//-----------Technologies needed-------------------
		//Java
		//Selenium Web driver
		//TestNG - to write tests
		//Maven
		//Apache POI API
		//Extent Report/TestNG report
		//Log4j API
		//Jenkins - for continuous integration
		//Git - Repo
		//Grid - Parallel teting
		//browsers - chrome/edge/FF
		//OS - windows, MAC
		//VMs/SourceLabs/Browser Stack/ Locally - to run the code
		
		//----------create a sample project---------
		//1.create a Maven project
		//2.download all dependencies
		//3.create all packages for pages, teasecase, testbase, 
		//config, utils, testdata
		//4.create a config.properties file inside config package
		//
	}

}
