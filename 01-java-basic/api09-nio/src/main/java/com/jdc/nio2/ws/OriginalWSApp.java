package com.jdc.nio2.ws;

import static com.jdc.nio2.Nio2Util.showTitle;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.util.List;

public class OriginalWSApp {

	public static void main(String[] args) {
		try (var watcher = FileSystems.getDefault().newWatchService()) {

            showTitle("START WATCHING", "=");

            Path pathForWatch = Path.of(System.getProperty("user.home"), "Desktop/nhp/watch");
            var watchKey = pathForWatch.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

            var changes = 0;

            while (changes < 10) {

                List<WatchEvent<?>> events = watchKey.pollEvents();

                for (WatchEvent<?> event : events) {

                    if (event.context() instanceof Path path) {
                        Path fullPath = pathForWatch.resolve(path);

                        if (event.kind().equals(ENTRY_CREATE)) {
                            System.out.println("%s is created.".formatted(fullPath.toAbsolutePath()));
                        }

                        if (event.kind().equals(ENTRY_MODIFY)) {
                            System.out.println("%s is modified.".formatted(fullPath));
                            Files.readAllLines(fullPath).forEach(System.out::println);
                        }

                        if (event.kind().equals(ENTRY_DELETE)) {
                            System.out.println("%s is deleted.".formatted(fullPath));
                        }

                        changes++;
                    }
                }

            }

            showTitle("END WATCHING", "=");

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
