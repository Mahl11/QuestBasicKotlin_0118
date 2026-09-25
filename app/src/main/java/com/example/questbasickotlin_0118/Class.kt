package com.example.questbasickotlin_0118

// 1. Class Biasa dengan Member Function
class Contact(val id: Int, var email: String) {
    fun printContactInfo() {
        println("ID: $id, Email: $email")
    }
}

// 2. Data Class (Otomatis dilengkapi toString, equals/==, dan copy)
data class User(val name: String, val id: Int)

fun main() {
    println("=== SUB-BAB 5: CLASS & DATA CLASS ===")

    // 1. Instansiasi Class Biasa
    val contact = Contact(1, "mahli@gmail.com")
    println("1. Class Biasa:")
    contact.printContactInfo()
    contact.email = "mahli.official@gmail.com" // Update property
    println("   Email setelah diupdate: ${contact.email}\n")

    // 2. Data Class & toString() otomatis rapi
    val user1 = User("Alex", 1)
    val user2 = User("Alex", 1)
    val user3 = User("Max", 2)

    println("2. Data Class toString():")
    println("   User 1: $user1\n")

    // 3. Perbandingan Data Class (== membandingkan isinya)
    println("3. Perbandingan Data Class (==):")
    println("   Apakah user1 == user2? ${user1 == user2} (Isinya sama)")
    println("   Apakah user1 == user3? ${user1 == user3}\n")

    // 4. Copy Instance (.copy()) dengan modifikasi properti
    println("4. Copy Instance (.copy()):")
    val userClone = user1.copy(name = "Mahli Saputra")
    println("   Hasil Kloning user1: $userClone")
}
