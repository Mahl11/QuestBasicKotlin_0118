# 📱 QuestBasicKotlin_0118
### Tugas Praktikum Activity 1 — Basic Kotlin

---

## 👤 Identitas Mahasiswa
* **Nama**: Ilham Saputra
* **NIM**: 20240140118
* **Mata Kuliah**: Pengembangan Aplikasi Mobile
* **Program Studi**: Teknologi Informasi
* **Fakultas**: Fakultas Teknik
* **Instansi**: Universitas Muhammadiyah Yogyakarta (UMY)
* **Dosen Pengampu**: Haris Setyawan, ST., M.Eng
* **Repository**: [https://github.com/ilham101106/QuestBasicKotlin_0118](https://github.com/ilham101106/QuestBasicKotlin_0118)

---

## 📌 Deskripsi Proyek
Repositori ini berisi dokumentasi tugas mandiri **Activity 1 - Basic Kotlin (Pertemuan 2)**. Proyek ini mengimplementasikan 6 materi fundamental bahasa Kotlin yang dicoba secara langsung menggunakan platform **Kotlin Editor (Kotlin Playground)** dan dikelola menggunakan **Android Studio** dengan sistem kontrol versi **Git**.

Sesuai instruksi penugasan, seluruh perkembangan proyek didokumentasikan dalam **6 commit bertahap** dengan penamaan commit yang persis mengikuti nama sub-bab modul perkuliahan.

---

## 📊 Riwayat Commit (Version Control Log)

| No | Nama Commit | File Terkait | Pokok Bahasan |
| :---: | :--- | :--- | :--- |
| **1** | `Variables` | [`Variables.kt`](app/src/main/java/com/example/questbasickotlin_0118/Variables.kt) | Perbedaan `val` (read-only) vs `var` (mutable), Tipe Data Dasar, dan String Template (`$` & `${}`). |
| **2** | `Collection` | [`Collection.kt`](app/src/main/java/com/example/questbasickotlin_0118/Collection.kt) | Struktur koleksi: `List` (terurut & duplikat), `Set` (filter unik otomatis), dan `Map` (*key-value*). |
| **3** | `Conditional expressions` | [`ConditionalExpressions.kt`](app/src/main/java/com/example/questbasickotlin_0118/ConditionalExpressions.kt) | Percabangan `if-else` ekspresi, percabangan cerdas `when`, `ranges` (`downTo`, `step`), dan perulangan `for`. |
| **4** | `Functions` | [`Functions.kt`](app/src/main/java/com/example/questbasickotlin_0118/Functions.kt) | Fungsi ber-return value, fungsi tanpa return (`Unit`), *Default Parameters*, *Named Arguments*, dan *Lambda*. |
| **5** | `Class` | [`Class.kt`](app/src/main/java/com/example/questbasickotlin_0118/Class.kt) | Class biasa dengan member function vs **`data class`** (`.toString()`, perbandingan `==`, dan `.copy()`). |
| **6** | `Null safety` | [`NullSafety.kt`](app/src/main/java/com/example/questbasickotlin_0118/NullSafety.kt) | Non-null vs Nullable type (`?`), Safe Call (`?.`), dan Elvis Operator (`?:`) anti-crash. |

---

## 📑 Dokumentasi & Hasil Running Per Sub-Bab

### 1. Variables & Tipe Data Dasar
Eksplorasi deklarasi variabel `val` (nilai konstan) dan `var` (nilai dinamis), tipe data eksplisit, serta string templates.

```kotlin
package com.example.questbasickotlin_0118

fun main() {
    // 1. Variabel val (read-only) dan var (mutable)
    val nama = "Mahli"
    val nim = "20240140118"
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
```

#### 📷 Bukti Running Screenshot:
<img width="1534" height="956" alt="Screenshot Variables" src="https://github.com/user-attachments/assets/5e24eef0-9967-4fad-8e6f-182d40e54d64" />

---

### 2. Collection (List, Set, Map)
Eksplorasi tiga jenis koleksi data di Kotlin: List (berurutan), Set (otomatis memfilter data kembar), dan Map (pasangan kunci-nilai).

```kotlin
package com.example.questbasickotlin_0118

fun main() {
    println("=== SUB-BAB 2: COLLECTION ===")

    // 1. List (Berurutan & Boleh Ada Duplikat)
    val listHobi = listOf("Ngoding", "Gaming", "Ngopi", "Gaming")
    println("1. List Hobi (Boleh Duplikat): $listHobi")
    println("   Hobi pertama: ${listHobi.first()}")
    println("   Total hobi: ${listHobi.count()} item\n")

    // 2. Set (Hanya Menyimpan Data Unik / Anti-Duplikat)
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
```

#### 📷 Bukti Running Screenshot:
<img width="1534" height="956" alt="Screenshot Collection" src="https://github.com/user-attachments/assets/bd115877-9c6c-42cc-ae92-f802ce1df387" />

---

### 3. Conditional Expressions & Loops
Menggunakan percabangan modern Kotlin: `if` sebagai ekspresi pengembali nilai, `when` multi-kondisi, serta perulangan `for` mundur (`downTo`) dan langkah (`step`).

```kotlin
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
```

#### 📷 Bukti Running Screenshot:
<img width="1535" height="959" alt="Screenshot Conditional Expressions" src="https://github.com/user-attachments/assets/bf3dd1e6-4f4c-4378-a79b-afad60b3d9a8" />

---

### 4. Functions & Lambda Expressions
Implementasi fungsi dengan return value, fungsi tanpa return (`Unit`), fleksibilitas pemanggilan via *Default Argument* dan *Named Arguments*, serta fungsi anonim ringkas (*Lambda*).

```kotlin
package com.example.questbasickotlin_0118

fun hitungTotalNilai(tugas: Int, kuis: Int): Int {
    return tugas + kuis
}

fun kirimNotifikasi(pesan: String, pengirim: String = "Admin PAM") {
    println("[$pengirim] -> $pesan")
}

fun main() {
    println("=== SUB-BAB 4: FUNCTIONS & LAMBDA ===")

    val totalSkor = hitungTotalNilai(85, 90)
    println("1. Total Skor Nilai: $totalSkor\n")

    println("2. Memanggil Fungsi (Default Argument):")
    kirimNotifikasi("Tugas Activity 1 berhasil dikumpulkan!")

    println("\n3. Memanggil Fungsi (Named Arguments):")
    kirimNotifikasi(pengirim = "Dosen Pengampu", pesan = "Selamat Mahli, progres belajar Anda luar biasa!")

    println("\n4. Lambda Expression:")
    val formatNamaKapital = { nama: String -> nama.uppercase() }
    println("   Format Nama: ${formatNamaKapital("mahli saputra")}")
}
```

#### 📷 Bukti Running Screenshot:
<img width="1535" height="955" alt="Screenshot Functions" src="https://github.com/user-attachments/assets/39f8f387-1421-4e68-bb8a-41388a0a18ab" />

---

### 5. Class & Data Class
Perbandingan class biasa dengan `data class` yang secara otomatis dilengkapi method `toString()`, perbandingan nilai isi (`==`), dan manipulasi kloning objek (`.copy()`).

```kotlin
package com.example.questbasickotlin_0118

class Contact(val id: Int, var email: String)

data class User(val name: String, val id: Int)

fun main() {
    println("=== SUB-BAB 5: CLASS & DATA CLASS ===")

    val contact = Contact(1, "mahli@gmail.com")
    contact.email = "mahli.official@gmail.com"
    println("1. Class Contact: ID=${contact.id}, Email=${contact.email}")

    val user1 = User("Alex", 1)
    val user2 = User("Alex", 1)
    val user3 = User("Max", 2)
    println("2. Data Class toString: $user1")
    println("3. Compare: (user1 == user2) is ${user1 == user2} | (user1 == user3) is ${user1 == user3}")

    val userClone = user1.copy(name = "Mahli Saputra")
    println("4. Copy Instance: $userClone")
}
```

#### 📷 Bukti Running Screenshot:
<img width="1535" height="959" alt="Screenshot Class" src="https://github.com/user-attachments/assets/899aac85-7e34-47bc-8f2e-0100371726f7" />

---

### 6. Null Safety
Penerapan paradigma Null Safety di Kotlin untuk mencegah crash `NullPointerException`: deklarasi tipe nullable (`?`), safe call operator (`?.`), dan Elvis operator (`?:`).

```kotlin
package com.example.questbasickotlin_0118

fun main() {
    println("=== SUB-BAB 6: NULL SAFETY ===")

    val namaWajib: String = "Mahli"
    var namaBolehNull: String? = null
    println("1. Non-null: $namaWajib | Nullable: $namaBolehNull")

    println("2. Safe Call: ${namaBolehNull?.length} (Aplikasi aman dari crash)")

    val panjangNama = namaBolehNull?.length ?: 0
    println("3. Elvis Operator: Panjang nama = $panjangNama")

    namaBolehNull = "Ilham Saputra"
    println("4. Setelah diisi: $namaBolehNull | Panjang: ${namaBolehNull?.length ?: 0}")
}
```

#### 📷 Bukti Running Screenshot:
<img width="1535" height="959" alt="Screenshot Null Safety" src="https://github.com/user-attachments/assets/f07e8723-a33f-4ad1-b5c2-16f24561b479" />

---
*Dikembangkan untuk penugasan mata kuliah Pengembangan Aplikasi Mobile (TI505) — Universitas Muhammadiyah Yogyakarta.*
