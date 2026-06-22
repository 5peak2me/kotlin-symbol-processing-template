# %NAME%

![Build](https://github.com/%REPOSITORY%/workflows/Build/badge.svg)

## Template ToDo list
- [x] Create a new [Kotlin Symbol Processing Template][template] project.
- [ ] Get familiar with the [template documentation][template].
- [ ] Adjust the [group](./gradle.properties) and [version](./gradle.properties), as well as the [SymbolProcessorProvider](./processor/src/main/resources/META-INF/services/com.google.devtools.ksp.processing.SymbolProcessorProvider) in [processor](./processor/src/main/resources/META-INF/services).
- [ ] Adjust the [packgae name](/src/main/resources/META-INF/plugin.xml) in [gradle-plugin](./gradle-plugin)、[compiler-plugin](./compiler-plugin) and [annotations](./annotations) or [api](./api).
- [ ] Adjust the ksp description in `README` (see [Tips][docs:ksp-description])
- [ ] [Publish a ksp manually](https://vanniktech.github.io/gradle-maven-publish-plugin/) for the first time.
- [ ] Set the `PLUGIN_ID` in the above README badges. You can obtain it once the plugin is published to [Gradle Plugin Portal](https://plugins.gradle.org/).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [Kotlin Symbol Processing Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->
This Fancy Kotlin Symbol Processing is going to be your implementation of the brilliant ideas that you have.
<!-- Plugin description end -->

## Installation

You can add ksp plugin to your top-level build script using the following configuration:

### `plugins` block:

```diff
plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.kotlin.compose) apply false
  alias(libs.plugins.kotlin.jvm) apply false
+  alias(libs.plugins.ksp) apply false
}

dependencies {
    implementation(project(":runtime"))
    ksp(project(":processor"))
}
```
or via the

### `buildscript` block:
```groovy
apply plugin: "com.google.devtools.ksp"

dependencies {
  implementation(project(":runtime"))
  ksp(project(":processor"))
}
```

---
Plugin based on the [Kotlin Symbol Processing Template][template].

[template]: https://github.com/5peak2me/kotlin-symbol-processing-template
[docs:ksp-description]: https://github.com/5peak2me/kotlin-symbol-processing-template/README.md
