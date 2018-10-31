package br.com.newway.nwnews.Models

import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "person")
data class Person(
    val name: String,
    val birthday: String,
    val squad: String,
    val picture: String,
    val qrCode: String
)