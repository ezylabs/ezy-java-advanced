# Ezy Java Advanced Course

[![Gradle Build](https://github.com/jetbrains-academy/java-course-template/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/jetbrains-academy/java-course-template/actions/workflows/gradle-build.yml)

## Testing

To check the programming exercises for [**edu**][ref:tasks] tasks, you need to write tests.
It contains functionality to test student solutions by using the Java Reflection API under the hood.
This approach allows you to call students' functions that do not exist yet.
It is a powerful mechanism that enables you to create excesses without predefined classes or function
templates and check their signature and behaviour properly.

You can find little examples of programming tasks in the repository in the `Tests.java` files.

## Continuous integration

Continuous integration depends on [GitHub Actions][gh:actions], a set of workflows that make it possible to automate your testing and release process.
Thanks to such automation, you can delegate the testing and verification phases to the Continuous Integration (CI) and instead focus on development (and writing more tests).

In the `.github/workflows` directory, you can find definitions for the following GitHub Actions workflows:
- Build
    - Builds your course
    - Runs all tests for all tasks

## Useful links

- [JetBrains Academy plugin][ref:plugin.marketplace]
- [Course creator start guide][ref:course.creator.start.guide]
- [Courses on Marketplace][ref:marketplace]

[ref:marketplace]: https://plugins.jetbrains.com/education
[ref:course.creator.start.guide]: https://plugins.jetbrains.com/plugin/10081-jetbrains-academy/docs/educator-start-guide.html
[ref:plugin.marketplace]: https://plugins.jetbrains.com/plugin/10081-jetbrains-academy
