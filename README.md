# Splitest

JUnit Cateogories (org.junit.experimental.categories.Category) made easy!

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
