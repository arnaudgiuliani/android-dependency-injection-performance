package com.sloydev.dependencyinjectionperformance

import com.sloydev.dependencyinjectionperformance.koin.koinKotlinModule
import org.koin.dsl.koinApplication

fun main(vararg args: String) {
    val koin = koinApplication {
        modules(koinKotlinModule)
    }.koin
    koin.get<Fib8>()
}