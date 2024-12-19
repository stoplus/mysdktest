# MySDKTest

MySDK is a simple test SDK for Android.

## Overview

- Calculator, which can sum
- metod

## Implementation details

To include MySDKTest in your project, add in your settings.gradle.kts

```kotlin
dependencyResolutionManagement {
    repositories {
        maven(url = "https://jitpack.io")
    }
}
```

add the following dependency to your build.gradle.kts:

```kotlin
dependencies {
    implementation("com.github.stoplus:mysdktest:1.0.15")
}
```

or if using libs.versions.toml, add the following dependency to your
libs.versions.toml:

```kotlin
[versions]
mysdktest = "1.0.15"

[libraries]
mysdktest = { group = "com.github.stoplus", name = "mysdktest", version.ref = "mysdktest" }
```

build.gradle.kts:

```kotlin
dependencies {
    implementation(libs.mysdktest)
}
```

example

```kotlin
private val calc: ICalculator = Calculator()
val sum = calc.intPlus(5, 4)
```

