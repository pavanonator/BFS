
//package com.restfb.example;

import java.util.logging.LogManager;

/**
 * @author <a href="http://restfb.com">Mark Allen</a>
 */
public abstract class Example {
  // Reads logging config from the classpath instead of specifying a JVM startup
  // parameter
  static {
    try {
      LogManager.getLogManager().readConfiguration(Example.class.getResourceAsStream("/logging.properties"));
    } catch (Exception e) {
      throw new IllegalStateException("Could not read in logging configuration", e);
    }
  }
}