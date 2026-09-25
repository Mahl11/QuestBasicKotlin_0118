package com.example.questbasickotlin_0118

fun main() {
    println("=== SUB-BAB 3: CONDITIONAL EXPRESSIONS & LOOPS ===")

    val nilaiMahli = 85

    // 1. Percabangan IF-ELSE (Sebagai Expression)
    val statusKelulusan = if (nilaiMahli >= 75) {
        "Lulus dengan Memuaskan"
    } else {
        "Perlu Remedial"
    }
    println("1. Status Evaluasi (If-Else): $statusKelulusan")

    // 2. Percabangan WHEN (Pengganti Switch-Case Cerdas)
    val gradeHuruf = when (nilaiMahli) {
        in 85..100 -> "A (Sempurna)"
        in 75..84  -> "B (Baik)"
        in 60..74  -> "C (Cukup)"
        else       -> "D (Kurang)"
    }
    println("2. Grade Nilai Mahli (When): $gradeHuruf\n")

    // 3. Ranges & Perulangan FOR
    println("3. Menghitung Mundur Peluncuran Aplikasi (DownTo):")
    for (detik in 5 downTo 1) {
        print("$detik.. ")
    }
    println("🚀 APLIKASI MELUNCUR!\n")

    // 4. Perulangan dengan STEP (Melompat per 2 angka)
    println("4. Perulangan dengan Step 2:")
    for (angka in 1..7 step 2) {
        print("$angka ")
    }
    println()
}
