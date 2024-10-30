package com.pphyo.lom;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class ColorFormatter extends Formatter {
	
    @Override
    public String format(LogRecord record) {
        StringBuilder sb = new StringBuilder();
        
        // Get the log level
        Level level = record.getLevel();
        
        // Add ANSI color codes based on log level
        if (level == Level.SEVERE) {
            sb.append("\u001B[1;31m"); // Red for SEVERE
        } else if (level == Level.WARNING) {
            sb.append("\u001B[1;33m"); // Yellow for WARNING 
        } else if (level == Level.INFO) {
            sb.append("\u001B[1;34m"); // Blue for INFO
        } else { // FINE, FINER, FINEST
            sb.append("\u001B[1;32m"); // Green for FINE and below
        }
        
        // Add the log message
        sb.append(record.getMessage());
        sb.append("\u001B[0m"); // Reset color
        sb.append("\n");
        
        return sb.toString();
    }
}