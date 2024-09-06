package com.jdc.nio2;

import static com.jdc.nio2.Nio2Util.*;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class PathDemoApp {

	public static void main(String[] args) {

//		try {
//			var fs = FileSystems.getDefault();
//			getFileStores(fs);
//			
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
		
		getRealFileSystem();
		
	}
	
	static void getRealFileSystem() {
		try {
			var home = System.getProperty("user.home");
			var root = Path.of(home, "Documents");
			
			showTitle("Grand Children of Root Directory", "-");
			Files.list(root).forEach(path -> {
				var fileType = Files.isDirectory(path) ? "Folder" : "File";
				System.out.println("%-10s %s".formatted(fileType, path.toString()));
			});
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	static void getVirtualFileSystem() {
		var home = System.getProperty("user.home");
		try(var fs = FileSystems.newFileSystem(Path.of(home, "Downloads/eclipse.zip"))) {
			
			var root = fs.getRootDirectories().iterator().next();
			
//			showTitle("Direct Children of Root Directory", "+");
//			Files.list(root.resolve("eclipse")).forEach(path -> System.out.println(path));
			
			showTitle("Grand Children of Root Directory", "-");
			Files.walk(root).forEach(path -> {
				var fileType = Files.isDirectory(root) ? "Folder" : "File";
				System.out.println("%-10s %s".formatted(fileType, path.toString()));
			});
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void getFileStores(FileSystem fs) throws IOException {
		showTitle("File Stores", "=");
		var stores = fs.getFileStores();
		
		for(Iterator<FileStore> itr = stores.iterator(); itr.hasNext();) {
			var store = itr.next();
			
			System.out.println("%-18s: %s".formatted("Name", store.name()));
			System.out.println("%-18s: %s".formatted("Type", store.type()));
			System.out.println("%-18s: %s".formatted("Total Space", store.getTotalSpace()));
			System.out.println("%-18s: %s".formatted("Usable Space", store.getUsableSpace()));
			System.out.println("%-18s: %s".formatted("Unallocated Space", store.getUnallocatedSpace()));
			System.out.println();
		}
	}

	static void getRootDirs(FileSystem fs) {
		showTitle("Root Directories", "*");
		var rootDirs = fs.getRootDirectories();
		System.out.println(fs);

		for (Iterator<Path> iterator = rootDirs.iterator(); iterator.hasNext();) {
			var path = iterator.next();
			System.out.println(path);
		}
	}

}
