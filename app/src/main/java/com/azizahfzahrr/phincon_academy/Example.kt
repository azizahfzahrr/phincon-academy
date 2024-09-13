package com.azizahfzahrr.phincon_academy

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import java.time.DayOfWeek
import java.time.LocalDateTime

//
//fun hitungHarga(hargaTotal: Double, persenDiskon: Double): Double {
//   val diskon = hargaTotal * (persenDiskon / 100)
//   return hargaTotal - diskon
//}
//
//fun hitungPersenDiskon(totalBelanja: Int): Double {
//   return when {
//      totalBelanja < 50000 -> 0.0
//      totalBelanja in 50000..100000 -> 10.0
//      else -> 20.0
//   }
//}
//
//fun main() {
//   val totalBelanja = 200000
//   val persenDiskon = hitungPersenDiskon(totalBelanja)
//   val hargaAkhir = hitungHarga(totalBelanja.toDouble(), persenDiskon)
//
//   println("Total belanja: Rp$totalBelanja")
//   println("Persen Diskon: $persenDiskon%")
//   println("Harga setelah diskon: Rp$hargaAkhir")
//}


//package com.azizahfzahrr.phincon_academy
//
//fun hitungHarga(hargaTotal: Double, persenDiskon: Double): Double {
//   val diskon = hargaTotal * (persenDiskon / 100)
//   return hargaTotal - diskon
//}
//
//fun main() {
//   val totalBelanja = 200000
//
//   val persenDiskon =
//      when {
//         totalBelanja < 50000 -> 0.0
//         totalBelanja in 50000..100000 -> 10.0
//         else -> 20.0
//      }
//
//   val hargaAkhir = hitungHarga(totalBelanja.toDouble(), persenDiskon)
//
//   println("Total belanja: Rp$totalBelanja")
//   println("Persen Diskon: $persenDiskon%")
//   println("Harga setelah diskon: Rp$hargaAkhir")
//}

//package com.azizahfzahrr.phincon_academy
//
//open class bentukGeometri {
//    open fun hitungLuas(): Double {
//        return 0.0
//    }
//
//    open fun hitungKeliling(): Double {
//        return 0.0
//    }
//}
//
//class Persegi(val sisi: Double) : bentukGeometri() {
//    override fun hitungLuas(): Double {
//        return sisi * sisi
//    }
//
//    override fun hitungKeliling(): Double {
//        return 4 * sisi
//    }
//}
//
//class Lingkaran(val jariJari: Double) : bentukGeometri() {
//     val pi = 3.14159
//
//    override fun hitungLuas(): Double {
//        return pi * jariJari * jariJari
//    }
//
//    override fun hitungKeliling(): Double {
//        return 2 * pi * jariJari
//    }
//}
//
//class Segitiga(val alas: Double, val tinggi: Double, val sisi1: Double, val sisi2: Double, val sisi3: Double) : bentukGeometri() {
//    override fun hitungLuas(): Double {
//        return 0.5 * alas * tinggi
//    }
//
//    override fun hitungKeliling(): Double {
//        return sisi1 + sisi2 + sisi3
//    }
//}
//
//fun main() {
//    val persegi = Persegi(4.0)
//    val lingkaran = Lingkaran(3.0)
//    val segitiga = Segitiga(5.0, 12.0, 5.0, 12.0, 13.0)
//
//    println("Persegi:")
//    println("Luas: ${persegi.hitungLuas()}")
//    println("Keliling: ${persegi.hitungKeliling()}")
//
//    println("\nLingkaran:")
//    println("Luas: ${lingkaran.hitungLuas()}")
//    println("Keliling: ${lingkaran.hitungKeliling()}")
//
//    println("\nSegitiga:")
//    println("Luas: ${segitiga.hitungLuas()}")
//    println("Keliling: ${segitiga.hitungKeliling()}")
//}

//package com.azizahfzahrr.phincon_academy

//fun main(){
//    // contoh call encapsulation
//    val rekeningBank = RekeningBank(371000.0)
//    println(rekeningBank.getSaldo())
//
//    rekeningBank.deposit(9000.0)
//    println(rekeningBank.getSaldo())
//
//    rekeningBank.withdraw(10000.0)
//    println(rekeningBank.getSaldo())
//}

// contoh polymorphism
//abstract class BangunDatar{
//    abstract fun hitungLuas(): Double
//}
//
//class Persegi(val sisi: Double) : BangunDatar() {
//    override fun hitungLuas(): Double {
//
//    }
//}
//
//fun hitungLuas(sisi: Double){
//    val persegi = Persegi(sisi)
//    println("Luas persegi: ${sisi * sisi}")
//}
//
//fun hitungLuas(panjang: Double, lebar: Double){
//    println("Luas persegi: ${panjang * lebar}")
//
//}

// contoh encapsulation
//class RekeningBank(saldoAwal: Double) {
//    private var saldo = saldoAwal
//
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun deposit(dana: Double) {
//        saldo += dana
//    }
//
//    fun withdraw(jumlah: Double) {
//        if (jumlah <= saldo) {
//            saldo -= jumlah
//        } else {
//            println("Saldo tidak mencukupi")
//        }
//    }

    // contoh interface
//    interface Menggambar{
//        fun gambar(): String{
//            return "gambar"
//        }
//    }
//
//    class Pegunungan(val nama: String) : Menggambar {
//        override fun gambar() {
//        }
//    }
// }

//class Karyawan(val nama: String, val ID: String, val gaji: Int) {
//    private var _gaji: Int = this.gaji
//
//    fun informasi(): String {
//        return "Nama: $nama, ID: $ID, Gaji: $_gaji"
//    }
//
//    fun naikkanGaji(jumlah: Int) {
//        _gaji += jumlah
//    }
//}
//
//fun main() {
//
//    val karyawan = Karyawan("Azizah", "Azizah14", 5000000)
//
//    println(karyawan.informasi())
//
//    karyawan.naikkanGaji(1000000)
//
//    println(karyawan.informasi())
//}

// latihan enum
//enum class dayOfWeek(){
//    SUNDAY,
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY;
//}
//
//@SuppressLint("NewApi")
//fun main(){
//    val today = LocalDateTime.now().dayOfWeek.toString().uppercase()
//    val enumToday = try {
//        DayOfWeek.valueOf(today)
//    } catch (e: IllegalArgumentException){
//        null
//    }
//
//    val statusDay = when (enumToday){
//        DayOfWeek.MONDAY -> "Today is working"
//        DayOfWeek.TUESDAY -> "Today is working"
//        DayOfWeek.WEDNESDAY -> "Today is working"
//        DayOfWeek.THURSDAY -> "Today is working"
//        DayOfWeek.FRIDAY -> "Today is working"
//        DayOfWeek.SATURDAY -> "It's time to holiday"
//        DayOfWeek.SUNDAY -> "It's time to holiday"
//        null -> TODO()
//    }
//}

//data class Mahasiswa(
//    var nama: String,
//    val nim: Int,
//    val jurusan: String? = null)
//fun main(){
//    val mahasiswa1 = Mahasiswa("Aufa", 371110, null)
//    println(mahasiswa1)
//    mahasiswa1.nama = "Dimas Anggora"
//}

fun main(){
    ConfigApp.getConfigApp()
    ConfigApp.changeTheme()
    ConfigApp.changeLanguage("ID")
    println(ConfigApp.env)
}

object ConfigApp{
    private var language: String = "ENG"
    var env: String = "DEV"
    private var theme: String = "LIGHT"
        private set

    fun getConfigApp(){
        println("language = $language, env = $env, theme = $theme")
    }

    fun changeTheme(){
        theme = if (theme == "Light") "Dark" else "Light"
    }

    fun changeLanguage(newLanguage: String){
        this.language = newLanguage
    }

    fun changeEnv(newEnv: String){
        this.env = newEnv
    }
}







