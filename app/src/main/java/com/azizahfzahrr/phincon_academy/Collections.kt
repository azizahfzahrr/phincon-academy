package com.azizahfzahrr.phincon_academy

//fun main() {
//    // list
//    val listName = mutableListOf("John", "Cena", "Rey")
//    println(listName)
//    listName.add("Undertaker")
//    println(listName)
//
//    // map
//    val mapFamily = mutableMapOf(
//        "Bapak" to "Kepala Keluarga",
//        "Ibu" to "Istri bapak",
//        "Anak" to "Anak ibu bapak"
//    )
//    println(mapFamily)
//    println(mapFamily["Bapak"])
//    mapFamily["Ibu baru"] = "Istri bapak ke 2"
//    println(mapFamily)
//    mapFamily.remove("Ibu baru")
//    println(mapFamily)
//
//    // set
//    val setNik = setOf("9086689776", "20046842937", "2459295573")
//    println(setNik)
//
//    val setResidence = mutableSetOf("Ibu Budi", "Bapak Budi", "Anak Budi")
//    println(setResidence)
//    setResidence.add("Anak Budi")
//    println(setResidence.contains("Anak Budi"))
//
//    val dayOfWeek = mutableListOf(
//        "Sunday",
//        "Monday",
//        "Tuesday",
//        "Wednesday",
//        "Thursday",
//        "Friday",
//        "Saturday"
//    )
//    println(dayOfWeek)
//    dayOfWeek[6] = "Holiday"
//    println(dayOfWeek)
//    dayOfWeek.remove("Monday")
//    println(dayOfWeek)
//
//
//    val setAngka = mutableSetOf(1, 2, 3, 4, 5)
//    println(setAngka)
//    setAngka.add(3)
//    setAngka.add(6)
//    println(setAngka)
//    setAngka.remove(1)
//    println(setAngka)
//    println(setAngka.contains(1))
//
//    val mapBuah = mutableMapOf(
//        "Jeruk" to 50000,
//        "Pisang" to 20000,
//        "Apel" to 45000
//    )
//    println(mapBuah)
//    mapBuah["Anggur Muscat"] = 50000
//    mapBuah["Durian"] = 100000
//    println(mapBuah)
//    println(mapBuah["Apel"])
//    mapBuah["Pisang"] = 10000
//    println(mapBuah)
//    mapBuah.remove("Jeruk")
//    println(mapBuah)
//
//    // sequence
//    val numbers = (1..5).asSequence()
//    println(numbers)
//
//    numbers.forEach {
//        println(it)
//    }
//    println("===================")
//
//    val skip2Numbers = generateSequence(2) { it + 2 } // seed adalah nilai 2
//    skip2Numbers.take(5).forEach { println(it) }
//
//    println("===================")
//
//    val bilGanjil = generateSequence (5){ it + 2}
//    bilGanjil.take(3).forEach { print("$it \n")}
//
//    println("===================")
//
////    val fibonacciSequence = generateSequence(0 to 1) { it.second to it.first + it.second }
////    fibonacciSequence.take(5).forEach { print("$it \n") }
//    val fibonacciSequence = generateSequence(0 to 1) { (a, b) -> b to (a + b) }
//    fibonacciSequence.take(5).map { it.first }. forEach { print("$it ") }
//
//}

fun searchAnimal(A: String, list: List<String>){
    val cariHewan = list.filter { it.startsWith("A", ignoreCase = true) }
    return if (cariHewan.isEmpty()){
        println("Tidak ada nama hewan dengan awal $A")
    }else{
        println(cariHewan)
    }
}

data class Manusia(
    val nama: String, val usia: Int, val alamat: String)

data class Product(
    val nama: String,
    val harga: Int,
    val kategori: String,
)

fun main(){
    val listNumber = listOf(5, 4, 7, 3, 10)
    println(listNumber)

    println(listNumber.filter{it % 2 == 0})
    println(listNumber.filter { it % 2 == 0 } .sorted())

    val _listNumber = listOf(2, 567, 213, 780, 234)

    // for, digunakan ketika butuh index, ada break dan continue, lebih customize, beberapa kurang aman
    for(number in _listNumber){
        println(_listNumber)
    }
    println("===========")

    // forEach, digunakan ketika data yang udah terima jadi, udah safety
    _listNumber.forEach { println(it) }
    println("===========")

    // index
    for((index, value) in _listNumber.withIndex()){
        println("nomornya itu $value, di index ke-$index")
    }
    println("===========")

    val bilBul = listOf(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(bilBul)
    val numbers = bilBul.map { it * 2 }
    println(numbers)
    println("===========")

    val hewan = listOf(
        "Ayam",
        "anjing",
        "Beruang",
        "Kuda Nil",
        "Jerapah"
    )
    println(hewan)
//    val cariHewan = hewan.filter { it.startsWith("A") }
//    println(cariHewan)
    val hewanX = hewan.find {it.startsWith("X")}
    if (hewanX != null) {
     println(hewanX)
    }else{
        println("Tidak ada nama hewan dengan awal X")
    }
    searchAnimal("X", hewan)
    println("===========")

    val orang = listOf(
        Manusia("Azizah", 22, "Jakarta Timur"),
        Manusia("Kevin", 23, "Jakarta Timur"),
        Manusia("Tyo", 27, "Bekasi"),
        Manusia("Anthi", 29, "Bekasi"),
        Manusia("Karin", 24, "Tangerang")
    )
    println(orang)
    val listTuaMuda = orang.sortedByDescending { it.usia }
    println(listTuaMuda)
    val orangTermuda = orang.sortedBy { it.usia }.take(3)
    println(orangTermuda)

    println("===========")

    val Barang = listOf(
        Product("Laptop", 10000000, "Elektronik"),
        Product("TV", 5000000, "Elektronik"),
        Product("Smartphone", 8000000, "Elektronik"),
        Product("Kemeja", 30000, "Pakaian"),
        Product("Celana", 40000, "Pakaian"),
        Product("Sepatu", 50000, "Pakaian"),
        Product("Martabak", 50000, "Makanan"),
        Product("Pizza", 100000, "Makanan"),
        Product("Burger", 20000, "Makanan")
    )
    println(Barang)
    val produkElektronik = Barang.filter { it.kategori == "Elektronik" }
    println(produkElektronik)
    val urutHarga = Barang.sortedBy { it.harga }
    println(urutHarga)
    val topProduk = urutHarga.take(5)
    println(topProduk)
    val namaHarga = Barang.map { it.nama to it.harga }
    println(namaHarga)
}