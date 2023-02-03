package samplePackage;

import java.io.*;
import java.util.Arrays;
import java.io.FileReader;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.taskdefs.Java;
import org.testng.annotations.Test;


public class SampleTest3 {
	// Fibanocci series upto 15 numbers
	// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610

	@Test
	public void Fibanocci() {
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a + " ");
		for (int i = 0; i < 15; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(a + " ");
		}
	}

	// Check prime number
	@Test
	public void CheckPrime() {
		int n = 15;
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime == true) {
			System.out.println(n + " is a Prime number");
		} else {
			System.out.println(n + " is not a Prime number");
		}
	}

	// Prime number series
	// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
	@Test
	public void primeSeries() {
		int n = 100;

		for (int i = 2; i < n; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				System.out.print(i + " ");
			}
		}
	}

	// Armstrong Number
	@Test
	public void armstrongNumber() {
		int n = 8208;

		String s = Integer.toString(n);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int a = Integer.parseInt(Character.toString(c));
			sum = (int) (sum + Math.pow(a, s.length()));
		}
		if (sum == n) {
			System.out.println(n + " is an Armstrong number");
		} else {
			System.out.println(n + " is not an Armstrong number");
		}
	}

	// Armstrong Number series
	// 1 2 3 4 5 6 7 8 9 153 370 371 407 1634 8208 9474
	@Test
	public void armstrongNumberSeries() {

		for (int n = 1; n < 10000; n++) {
			String s = Integer.toString(n);
			int sum = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				int a = Integer.parseInt(Character.toString(c));
				sum = (int) (sum + Math.pow(a, s.length()));
			}
			if (sum == n) {
				System.out.print(n + " ");
			}
		}
	}

	// Factorial of a number
	@Test
	public void factorial() {

		int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of the number " + n + " is " + fact);
	}

	// Factorial series
	// 1 2 6 24 120 720 5040
	@Test
	public void factorialSeries() {

		for (int n = 1; n <= 7; n++) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.print(fact + " ");
		}
	}

	// Sort array in ascending and descending order
	@Test
	public void sortArraysAscDesc() {
		int[] a = { 5, 1, 9, 6, 3, 2 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Ascending order: "+Arrays.toString(a));

		

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Descending order: "+Arrays.toString(a));

	}
	
	@Test
	public void fileOperations() throws IOException {
		/*
		 * File fo = new File("C:\\Users\\ravic\\Desktop\\MyFolder"); fo.mkdir();
		 * System.out.println(fo.exists()); File txtFo = new
		 * File("C:\\Users\\ravic\\Desktop\\MyFolder\\test.txt"); File txtFo1 = new
		 * File("C:\\Users\\ravic\\Desktop\\MyFolder\\MyFile.txt");
		 * System.out.println(txtFo.exists()); txtFo.createNewFile();
		 * System.out.println(txtFo.exists()); System.out.println(txtFo.getPath());
		 * txtFo.delete(); System.out.println(txtFo.exists()); txtFo.createNewFile();
		 * txtFo.renameTo(txtFo1); System.out.println(txtFo1.getPath());
		 */
		
		File txtFo2 = new File("C:\\Users\\ravic\\Desktop\\TestFolder\\MyFile.txt");
		
		FileReader fr = new FileReader(txtFo2);
		BufferedReader br = new BufferedReader(fr);
		
		int character;
		character = br.read();
		/*
		 * while(character != -1) { System.out.println((char)character); character =
		 * br.read(); }
		 */
		/*
		 * String line=br.readLine(); while(line != null) { System.out.println(line);
		 * line=br.readLine(); }
		 */
		
		File txtFo3 = new File("C:\\Users\\ravic\\Desktop\\TestFolder\\test.xlsx");
		
		FileInputStream ins = new FileInputStream(txtFo3);
		
		XSSFWorkbook wb = new XSSFWorkbook(ins);
		
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r = ws.getRow(1);
		Cell cell = r.getCell(0);
		
		
		DataFormatter formatter = new DataFormatter();
		
		System.out.println(formatter.formatCellValue(cell));
		
		XSSFSheet ws1 = wb.createSheet("Sheet2");
		Row row = ws1.createRow(0);
		Cell c = row.createCell(0);
		c.setCellValue("Ravi");
		FileOutputStream fos = new FileOutputStream(txtFo3);
		wb.write(fos);
		wb.close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
