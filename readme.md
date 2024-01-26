
# In-App Update for Android

## Introduction

The In-App Update Library simplifies the integration of in-app updates in Android applications. It provides a straightforward way to check for updates and prompt users to update your app using Google Play's core app update features. This library is ideal for ensuring that your users always have the latest version of your app with minimal hassle.

## Getting Started

### Prerequisites

- Android Studio
- An Android project with minimum SDK version 23.

## Installation

To use the In-App Update Library in your project, follow these steps:

### Step 1: Add the JitPack repository to your build file

Add JitPack to your project's build file. Open your root `build.gradle` file and add the following to the `repositories` section:

```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2: Add the dependency

Next, add the dependency for the In-App Update Library in your module's `build.gradle` file:

```gradle
dependencies {
    implementation 'com.google.android.play:app-update-ktx:2.1.0'
}
```

