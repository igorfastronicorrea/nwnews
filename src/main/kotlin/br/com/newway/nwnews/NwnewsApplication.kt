package br.com.newway.nwnews

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NwnewsApplication

fun main(args: Array<String>) {
    runApplication<NwnewsApplication>(*args)
}
