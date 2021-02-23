package com.Library_ct.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    /*
--> PROPERTIES FILE / ConfigurationReader
    - What is properties file? Why do we use it?
        - Properties is just another type of a file such as .txt, .xml where we store information. But the type is .properties
    - Why this file is different than others?
        - The reason we use properties type is because we want to store data in "key=value" format.
        - Properties file stores information in key=value format.
    - What kind of information we store in configuration.properties?
        - We store "important test data" in configuration.properties file
        - Important test data such as:
            - Browser type
            - Username
            - Password
            - Environment/URLS
        - WE don't want to store every single test data here, because it would defeat the purpose of creating this file.
        - Only test data that can be applied to either all of the tests or the majority of the tests.
    - What is HARD CODING?
        - Hard coding is keeping your data in your source code.
        - In our case we are trying to avoid HARD CODING important test data.
        - That is one of the reasons why we are using .properties file.
    EX: key=value
        browser = chrome
        username = tester
        password = test
        env = qa1.test.com
    - Key part is hard coded into our source code.
    - Value part is not hard coded, so that we can change the value from "configuration.properties" file without having to go to source code itself.
    - What is properties utility(ConfigurationReader.java)? Why do we use it?
        - ConfigurationReader and .getProperty method we created in this class is basically java logic we created to be able to read from configuration.properties file
        - ConfigurationReader class created to be able to read from --> configuration.properties
How do you read from properties file?
    #1- I create an object of Properties class.
    #2- I open the .properties file that I want to read from in JVM.
    #3- Load the file into properties object.
    #4- Read the file using .getProperty method
--> Syntax of each step above:
    #1- Properties properties = new Properties();
    #2- FileInputStream file = new FileInputStream("pathOfTheFile");
    #3- properties.load(file);
    #4- properties.getProperty("keyWord"); --> This method will return the value of the given key.
 */

    //1- we created properties object

    private static Properties properties = new Properties();

    static {

        //2- get the path and store in String, or directly pass into fileInputStream obj

        String path = "configuration.properties";

        try {

            //3- we need to open the file

            FileInputStream file = new FileInputStream(path);

            //4- we need to load the file

            properties.load(file);

            //5- close.file

            file.close();

        }catch (IOException e){

            System.out.println("Properties file not found.");
        }
    }

    // Our own custom method to read get values from configuration.properties file

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);
    }

}
