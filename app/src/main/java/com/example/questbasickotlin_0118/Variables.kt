package com.example.questbasickotlin_0118

fun main() {
    // 1. Variabel val (read-only) dan var (mutable)
    val nama = "Mahli"
    val nim = "20220140118"
    var umur = 20
    umur = 21 // Mengubah nilai var

    // 2. Tipe Data Dasar
    val tinggiBadan: Double = 172.5
    val isActive: Boolean = true

    // 3. String Template ($ dan ${})
    println("Halo! Nama saya $nama dengan NIM $nim.")
    println("Umur saya $umur tahun, tahun depan berumur ${umur + 1} tahun.")
    println("Tinggi badan: $tinggiBadan cm, status aktif: $isActive.")
}
