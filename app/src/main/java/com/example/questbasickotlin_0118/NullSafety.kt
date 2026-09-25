fun main() {
    println("=== SUB-BAB 6: NULL SAFETY ===")

    // 1. Non-nullable vs Nullable Type (?)
    val namaWajib: String = "Mahli"
    var namaBolehNull: String? = null
    println("1. Non-null: $namaWajib | Nullable: $namaBolehNull")

    // 2. Safe Call Operator (?.) - Penangkal Crash
    println("2. Safe Call: ${namaBolehNull?.length} (Aplikasi aman dari crash)")

    // 3. Elvis Operator (?:) - Nilai Cadangan jika Null
    val panjangNama = namaBolehNull?.length ?: 0
    println("3. Elvis Operator: Panjang nama = $panjangNama")

    // 4. Setelah Variabel Diisi Nilai
    namaBolehNull = "Ilham Saputra"
    println("4. Setelah diisi: $namaBolehNull | Panjang: ${namaBolehNull?.length ?: 0}")
}
