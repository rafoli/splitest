# Splitest

[![Build Status](https://semaphoreci.com/api/v1/rafoli/splitest/branches/master/badge.svg)](https://semaphoreci.com/rafoli/splitest)

JUnit Categories (org.junit.experimental.categories.Category) made easy!

* @AcceptanceTest
* @FeatureTest
* @FuncionalTest
* @IntegrationTest
* @RegressionTest
* @SanityTest
* @SmokeTest
* @SystemTest
* @UnitTest

# Usage

Full doc: https://plugins.gradle.org/plugin/io.splitest

### Gradle 2.1+

```gradle
plugins {
  id "io.splitest" version "0.1.4"
}
```

### Old gradle versions

```gradle
buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "gradle.plugin.io.splitest:splitest:0.1.4"
  }
}

apply plugin: "io.splitest"
```

# Example

https://github.com/rafoli/splitest-samples
