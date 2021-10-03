<h1 align="center">File Readers for Dataproviders (TestNG)</h1>
<div align="center">
<a href="https://github.com/deadpool1418/com.cypher/pulls"><img src="https://img.shields.io/github/issues/deadpool1418/com.cypher"/></a>
<a href="https://github.com/deadpool1418/com.cypher/network/members"><img src="https://img.shields.io/github/forks/deadpool1418/com.cypher"/></a>
<a href="https://github.com/deadpool1418/com.cypher/stargazers"><img src="https://img.shields.io/github/stars/deadpool1418/com.cypher"/></a>
<a href="https://github.com/deadpool1418/com.cypher/blob/master/LICENSE"><img src="https://img.shields.io/github/license/deadpool1418/com.cypher"/></a>
<a href="https://github.com/deadpool1418/com.cypher/graphs/contributors"><img alt="GitHub contributors" src="https://img.shields.io/github/contributors/deadpool1418/com.cypher?color=2b9348"></a>
</div>

## Getting Started

 1. Add dependency to yor pom.xml file.

	```
	<dependency>  
	<groupId>com.cypher</groupId>  
	<artifactId>dataprovider</artifactId>  
	<version>0.0.2</version>  
	</dependency>
	```

2. Execute the command
	`mvn install`

## Usage
### CSV Files
Use the following code snippet for reading data from csv files and returning the iterator.
``` 
@DataProvider
  public Iterator<Object[]> dp() throws IOException {
	  return CsvFileReader.readDataFromCsv(filePath);    //filPath is path of the csv file
    };
```
### Excel Files
Use the following code snippet for reading data from excel files and returning the 
object[][] .
```
  @DataProvider
  public Object[][] dp() throws IOException {
	  return ExcelFileReader.readDataFromExcel(filePath);		  //filPath is path of the excel file
    };
```

## Contributing
Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement". Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request



