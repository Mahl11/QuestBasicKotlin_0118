
// 1. Fungsi Standar dengan Return Value
fun hitungTotalNilai(tugas: Int, kuis: Int): Int {
    return tugas + kuis
}

// 2. Fungsi dengan Default Parameter & Tanpa Return (Unit)
fun kirimNotifikasi(pesan: String, pengirim: String = "Admin PAM") {
    println("[$pengirim] -> $pesan")
}

fun main() {
    println("=== SUB-BAB 4: FUNCTIONS & LAMBDA ===")

    // Memanggil fungsi standar
    val totalSkor = hitungTotalNilai(85, 90)
    println("1. Total Skor Nilai: $totalSkor\n")

    // Memanggil fungsi dengan Default Parameter (pengirim otomatis 'Admin PAM')
    println("2. Memanggil Fungsi (Default Argument):")
    kirimNotifikasi("Tugas Activity 1 berhasil dikumpulkan!")

    // Memanggil fungsi dengan Named Arguments (urutan dibalik tetap aman)
    println("\n3. Memanggil Fungsi (Named Arguments):")
    kirimNotifikasi(pengirim = "Dosen Pengampu", pesan = "Selamat Mahli, progres belajar Anda luar biasa!")

    // 4. Lambda Expression (Fungsi Anonim Ringkas)
    println("\n4. Lambda Expression:")
    val formatNamaKapital = { nama: String -> nama.uppercase() }
    println("   Format Nama: ${formatNamaKapital("mahli saputra")}")
}
