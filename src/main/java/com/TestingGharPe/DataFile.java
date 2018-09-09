package com.TestingGharPe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataFile {
Xls_Reader d = new Xls_Reader("C:\\Testing\\home framework data.xlsx");
String validEmail = d.getCellData("Sheet1", "UserName", 2);
String password = d.getCellData("Sheet1", "Password", 2);
String invalidEmail = d.getCellData("Sheet1", "UserName", 3);
String emailError = d.getCellData("Sheet1", "ErrorMessage", 3);	
String passwordError = d.getCellData("Sheet1", "ErrorMessage", 2);	
}
