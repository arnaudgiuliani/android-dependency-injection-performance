# Android Injection Performance

This project aims to measure the performance of several Dependency Injection frameworks (or Service Locators) in different devices.

## Libraries tested
- [Koin](https://insert-koin.io/) - 2.0.1
- [Kodein](http://kodein.org/Kodein-DI/) - 5.3.0
- [Dagger 2](https://google.github.io/dagger/) - 2.16
- [Katana](https://github.com/rewe-digital-incubator/katana/) - 1.2.2

## The test
The test data are classes with dependencies in a structure similar to Fibonacci sequence, to simulate multiple levels of transitive dependencies.
For each library there is a test with Kotlin classes and one with Java classes, because some libraries seem to be affected by this difference.

Each test injects one of this dependencies 100 times and prints the maximum time, the minimum and the average.

The project contains an Android application that run the tests on its onCreate and prints the result to the Logcat.

The actual test is implemented in the class [InjectionTest.kt](https://github.com/Sloy/android-dependency-injection-performance/blob/master/app/src/main/java/com/sloydev/dependencyinjectionperformance/InjectionTest.kt)

## Results
Results can be quite different between different devices, so here are some results in different devices with different Android versions. Each table contains the **median** time of each library's setup and injection. More results are welcomed.

- [Samsung Galaxy J5](#samsung-galaxy-j5)
- [Samsung Galaxy S8](#samsung-galaxy-s8)
- [Huawei P8 Lite](#huawei-p8-lite)
- [Xiaomi MI A1](#xiaomi-mi-a1)
- [OnePlus One](#oneplus-one)
- [OnePlus 5](#oneplus-5)
- [Nexus 6](#nexus-6)

### LG G4

Library | Setup Kotlin | Setup Java | Inject Kotlin | Inject Java
--- | ---:| ---:| ---:| ---:
**Custom** | 2.05 ms  | 2.13 ms  | 0.30 ms | 0.36 ms
**Koin**   | 10.72 ms | 11.01 ms | 1.40 ms | 1.48 ms
**Kodein** | 39.95 ms | 37.38 ms | 3.58 ms | 3.76 ms
**Katana** | 5.37 ms  | 5.84 ms  | 0.82 ms | 0.77 ms
**Dagger** | 0.01 ms  | 0.01 ms  | 0.13 ms | 0.09 ms

### Nokia 7p

Library | Setup Kotlin | Setup Java | Inject Kotlin | Inject Java
--- | ---:| ---:| ---:| ---:
**Custom** | 0.11 ms | 0.09 ms  | 0.06 ms | 0.06 ms
**Koin**   | 0.53 ms | 0.49 ms  | 0.08 ms | 0.06 ms
**Kodein** | 5.41 ms | 5.24 ms  | 0.12 ms | 0.09 ms
**Katana** | 0.37 ms | 0.36 ms  | 0.06 ms | 0.10 ms
**Dagger** | 0.01 ms | 0.01 ms  | 0.05 ms | 0.05 ms
