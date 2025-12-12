# shorty

The repository was used as an example for a presentation about Gradle Conventions.

The slides reside in the root of the repository [Conventional development.pdf](Conventional%20development.pdf)

## Try it out

* Create a new project in Android Studio. I created one with an empty compose activity. 

* Switch to a branch which has the conventions - I use the branch "programmatic-convention" (other branch is dsl-convention)

* Copy the folder "build-logic" and paste it into the root of your project

* Add this line to your setting-gradle file

```
includeBuild("build-logic")
```

I generally put it below my actual settings and above my regular includes. Like this:

```
rootProject.name = "My Application"
includeBuild("build-logic")
include(":app")
```

* Modify your app build.gradle.kts file to use the convention. Add this line to your plugins
declarations.

```
id("shorty.application")
```

Since the convention include the android and kotlin plugins our plugins declaration now looks like
this:

```
plugins {
    id("shorty.application")
    alias(libs.plugins.kotlin.compose)
}
```

* Sync gradle - it should now work.

* Remove unnecessary code from the application build.gradle.kts.

