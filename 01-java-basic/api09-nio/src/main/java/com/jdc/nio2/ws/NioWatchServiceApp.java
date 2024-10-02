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
import java.nio.file.WatchKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NioWatchServiceApp {
	
	public static void main(String[] args) {
        try (var watcher = FileSystems.getDefault().newWatchService()) {

            showTitle("START WATCHING", "=");

            Path pathForWatch = Path.of(System.getProperty("user.home"), "Desktop/nhp/watch");
            pathForWatch.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

            var changes = 0;
            Map<Path, Long> lastModifiedTime = new HashMap<>();

            while (changes < 10) {

                WatchKey watchKey = watcher.take(); // blocks until events are available
                List<WatchEvent<?>> events = watchKey.pollEvents();

                for (WatchEvent<?> event : events) {

                    if (event.context() instanceof Path path) {
                        Path fullPath = pathForWatch.resolve(path);

                        long currentTime = System.currentTimeMillis();
                        long lastTime = lastModifiedTime.getOrDefault(fullPath, 0L);

                        // Debounce - ignore events that happen within 500 milliseconds of each other
                        if (currentTime - lastTime < 500) {
                            continue;
                        }

                        lastModifiedTime.put(fullPath, currentTime);

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

                // Reset the key -- this step is critical if you want to receive further watch events.
                boolean valid = watchKey.reset();
                if (!valid) {
                    break; // loop exits if the directory is no longer accessible
                }
            }

            showTitle("END WATCHING", "=");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
		
	}

}
