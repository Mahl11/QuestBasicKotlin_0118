package com.example.questbasickotlin_0118

fun main() {
    println("=== SUB-BAB 2: COLLECTION ===")

    // 1. List (Berurutan & Boleh Ada Duplikat)
    val listHobi = listOf("Ngoding", "Gaming", "Ngopi", "Gaming")
    println("1. List Hobi (Boleh Duplikat): $listHobi")
    println("   Hobi pertama: ${listHobi.first()}")
    println("   Total hobi: ${listHobi.count()} item\n")

    // 2. Set (Hanya Menyimpan Data Unik / Anti-Duplikat)
    // Perhatikan: NIM "0118" ditulis 2 kali, tapi otomatis disaring jadi 1
    val setNIM = setOf("0118", "0119", "0118", "0120")
    println("2. Set NIM (Otomatis Saring Duplikat): $setNIM\n")

    // 3. Map (Pasangan Kunci & Nilai / Key-Value)
    val mapNilaiPAM = mapOf(
        "Mahli" to 95,
        "Budi" to 85,
        "Citra" to 90
    )
    println("3. Map Nilai PAM: $mapNilaiPAM")
    println("   Nilai khusus Mahli: ${mapNilaiPAM["Mahli"]}")
}
