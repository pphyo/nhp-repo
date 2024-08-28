package com.jdc.io;

import java.io.File;
import java.io.FileFilter;

public class FileTest {
	
	private static final String USER_HOME = System.getProperty("user.home");
	
	public static void main(String[] args) {
		
		File source = new File(USER_HOME, "Documents/JDC");
		FileFilter filter = pn -> pn.isDirectory() || pn.getName().endsWith(".pdf");
		
		printFolderTree(filter, source);
		
	}
	
	static void printFolderTree(FileFilter filter, File source) {
		var fileList = source.listFiles(filter);
		
		for(File file : fileList) {
			
			if(file.isDirectory()) {
				System.out.println();
				printFolderName(file.getName(), "=");
				printFolderTree(filter, new File(source, file.getName()));
			} else {
				System.out.println(file.getName());
			}
			
		}
	}
	
	static void testForList(FileFilter filter, File source) {
		var list = source.listFiles(filter);
		
		for(File file : list) {
			System.out.println("%-6s %s".formatted(file.isDirectory() ? "Folder" : "File", file.getName()));
		}
	}
	
	static void testForSpace() {
		try {
			File file = new File(USER_HOME.concat("/Desktop/nhp/file-test/resource/child/"), "resource.txt");
			if(!file.exists())
				file.createNewFile();
			
			System.out.println("Total Space: " + convertGB(file.getTotalSpace()));
			System.out.println("Free Space: " + convertGB(file.getFreeSpace()));
			System.out.println("Usable Space: " + convertGB(file.getUsableSpace()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static long convertGB(long byteData) {
		return byteData / 1024 / 1024/ 1024;
	}
	
	static void testForCreateFile() {
		try {
			File parent = new File("resource");
			boolean dirCreated = parent.mkdir();
			
			if(dirCreated) {
				File file = new File(parent, "data.txt");
				boolean created = file.createNewFile();
				
				if(created) {
					System.out.println("File created successfully.");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void printFolderName(String folderName, String sign) {
		String result = "";
		for(int i = 0; i < folderName.length(); i ++) {
			result += sign;
		}
		
		System.out.println("%s%s%s%s%s".formatted(sign, sign, result, sign, sign));
		System.out.println("%s %s %s".formatted(sign, folderName, sign));
		System.out.println("%s%s%s%s%s".formatted(sign, sign, result, sign, sign));
	}

}
