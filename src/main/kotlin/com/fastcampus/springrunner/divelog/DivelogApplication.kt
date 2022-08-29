package com.fastcampus.springrunner.divelog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DivelogApplication

fun main(args: Array<String>) {
	args.forEach {
		println("Argument: $it")
	}
	runApplication<DivelogApplication>(*args)
}
