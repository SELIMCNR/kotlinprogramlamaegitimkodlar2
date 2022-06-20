package com.example.kotlnprogramlama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Kotlin yazdırma
        println("Hello World!")



        println("Merhaba Kotlin")
        println(5 * 10)

        /* Değişkenler */
        val a = 5
        val b = 10
        print(a * b)

        var yas = 50
        println(yas / 5 * 8)
        yas = 60
        println(yas / 5 * 8)

        /*Sabitler */
        //Değişkenler var sabit val
        val pi = 3.14
        println(pi)

        val x = 5
        val y = 20
        println(x + y)

        println(yas)
        println(yas * x)

        //camelCase
        //snake_case


        val yasSonucu = yas * x
        println(yasSonucu)

        // Integer
        println("---Integer----")

        //Tanımlama(Defining)
        val benimIntegerim : Int
        // Başlatma, Değerini Atama (Initializin,Initilazation)
        benimIntegerim = 10

        val yeniInteger: Int = 20

        println(benimIntegerim/2)
        println(yeniInteger/2)

        //Long
        println("---Long----")
        val benimLong : Long
        benimLong = 300000000000000000
        println(benimLong)
        //Double & float
        println("----Double & Float ----")

        val floatPi : Float = 3.14f
        println(floatPi)

        val yeniDouble : Double = 5.0

        //String
        println("---String----")
        val isim = "Selim"
        val soyisim = "Çınar"
        val tamisim = isim +" "+soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString = "20"

        println(yeniBirString + baskaBirString)

        //Boolean
        println("---Boolean----")
        var benimBoolean = true
        benimBoolean = false
        /*
        <,>,==,!=,<=,>=,&& ve , || veya
        */
        println(3<5)
        println(4!=4)

        //Veri Tipi Dönüştürme
        println("---Dönüştürme----")
        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2 )

        //Diziler
        println("--Dizi---")
        val stringOrnegi = "Atıl"
        val benimDizim = arrayOf(stringOrnegi,"Samancıoğlu","46","Kerem")
        println(benimDizim[0])
        println(benimDizim.get(1))
        println(benimDizim.get(2))
        benimDizim [2] = "Selim"
        println(benimDizim.get(2))
        benimDizim.set(3,"Mehmet")
        println(benimDizim[3])

        val numaraDizisi = doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Atıl",24,16.5,true,false)
        println(karisikDizi.get(3))

        //ArrayList - Listeler

        println("-----ArrayList------")

        val isimListesi = arrayListOf <String>() /*İnternetten veri çekerken boş liste işe yarar*/
        val isimListesi2 = arrayListOf<String>("ATIL","46","OSMAN")

        println(isimListesi2[0])
        println(isimListesi2.get(2))

        isimListesi2.add("Mehmet")
        isimListesi2.add("Atlas")
        println(isimListesi2.get(4))


        val karisikArrayList = arrayListOf<Any>()    /*Herhangi bir değer internetten alınabilir.*/
        karisikArrayList.add("Selim")
        karisikArrayList.add(5)
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))

        // Set tekil veri bir veri tekrar eden veriler gözükmez
        println("-----Set-----")

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 2: ${ornekDizi[3]}")
        println(ornekDizi.size) /*Dize liste uzunluğu verir.*/

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size)

        //For Each her biri için
        benimSet.forEach{
            println(it)
        }
        val digerSet = HashSet<String>()
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Samancıoğlu")
        digerSet.forEach{
            println(it)
        }

        //Map Harita {Sözlük dictionary}

        println("-----Map-----")

        //Anahtar Kelime - Değer (Key - Value Pairing)
        //ornek kalori --yemek eşleşmesi yapımında kullanılır

        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)

        println("${yemekDizisi[0]}'ın kalorisi: ${kaloriDizisi[0]}")
        println("${yemekDizisi[1]}'ın kalorisi: ${kaloriDizisi[1]}")
        println("${yemekDizisi[2]}'ın kalorisi: ${kaloriDizisi[2]}")

        val yemekKaloriMap = hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)

        println(yemekKaloriMap.get("Et"))


        val benimMapim = HashMap<String,String>()
        benimMapim.put("Örnek","Değer")

        val yeniMap = hashMapOf<String,Int>("Atıl" to 40 ,"Örnek" to 50)
        println(yeniMap.get("Örnek"))


        /* Matematiksel işlemler  */
        println("----Matematiksel işlemler----")

        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++ /*Sayiya eklem yapar*/
        println(sayi)
        sayi-- /*Sayidan çıkarma yapar*/
        println(sayi)
        var digerSayi=10
        // &&-> VE
        //|| -> VEYA

        println(digerSayi> sayi && 2>3)
        println(digerSayi> sayi || 2>3)

        println(8+7)
        println(10-4)
        println(20*5)
        println(10/2)

        //Remainder- Kalanı Bulmak
        println(10%2)
        println(11%3)

        // if-else kontrolleri
        println("-----If Statements (Eğer Kontrolleri)----")
        val skor = 10
        if (skor<10){
            println("Oyunu kaybettin!")
        }
        else if (skor >= 10 && skor<20) {
            println("Skorun 10 ve 20 arasında,çok iyi skor aldın")
        }
        else if(skor>=20 && skor <30){
            println("Skorun 20 ve 30 arasında,rekorlar kırıyorsun")
        }
        else {
            println("Skorun 30'un üstünde,efsane oynadın")
        }

        //When (ne zaman)Şuysa bunu yap -Switch fazla else if varsa bunu kullan
        println("-----When------")

        var notRakami = 0
        var notStringi=""
        when(notRakami) {
            0 -> notStringi = "Geçersiz Not"
            1 -> notStringi = "Zayıf"
            2 -> notStringi = "Kötü"
            3 -> notStringi = "Orta"
            4 -> notStringi = "İyi"
            else -> notStringi = "Pek iyi"
        }
        /*
        if(notRakami==0){
            notStringi="Geçersiz Not"
        }
        else if (notRakami==1){
            notStringi="Zayıf"
        }
        else if (notRakami==2) {
            notStringi="Kötü"
        }
        else if (notRakami==3) {
            notStringi="Orta"
        }
        else if (notRakami==4){
            notStringi = "iyi"
        }
        else {
            notStringi="Pek iyi"
        }
        println(notStringi) */

        /* Döngüler  */
        println("----For Döngüsü -----")
        /*Diziler ve koleksiyonlarla beraber kullanılabilir*/
        val baskaBirDizi1 = arrayOf(5,10,15,20,25,30)
        val q = baskaBirDizi1[0] / 5 + 3
        println(q)

        println("Döngü başladı")
        for (numara in baskaBirDizi1){
            println(numara / 5 + 3)
        }
        println("Döngü bitti")

        for (indeks in baskaBirDizi1.indices) /*geçerli indeksleri ver*/
        {
            println(baskaBirDizi1[indeks /5 +3])
        }
        for (b in 0..9) { /*range fonksiyon yazımı*/
            println(b)
        }

        val benimDigerStringDizim = ArrayList <String>()
        benimDigerStringDizim.add("Atıl")
        benimDigerStringDizim.add("Samancıoğlu")

        for (str in benimDigerStringDizim) {
            println(str)
        }
        benimDigerStringDizim.forEach {
            println(it)
        }

        /*While şu olduğu sürece yap*/
        print("---While Döngüsü----")

        var j=0
        while (j<=10) {
            println(j)
            j = j+1
        }
















        val unreadCount = 5
        val readCount = 100
        println("You have ${unreadCount + readCount} total messages in your inbox.")

        val numberOfPhotos = 100
        val photosDeleted = 10
        println("$numberOfPhotos photos")
        println("$photosDeleted photos deleted")
        println("${numberOfPhotos - photosDeleted} photos left")

        var count = 10
        println("You have $count unread messages.")
        count--
        println("You have $count unread messages.")

        val trip1: Double = 3.20
        val trip2: Double = 4.10
        val trip3: Double = 1.72
        val totalTripLength: Double = trip1 + trip2 + trip3
        println("$totalTripLength miles left to destination")

        val nextMeeting = "Next meeting is: "
        val date = "January 1"
        val reminder = nextMeeting + date + " at work"
        println(reminder)

        val notificationsEnabled: Boolean = false
        println("Are notifications enabled? " + notificationsEnabled)

        fun birthdayGreeting() {
            println("Happy Birthday, Rover!")
            println("You are now 5 years old!")
        }

        fun main1() {
            birthdayGreeting()
        }

        fun birthdayGreeting1(): String {
            val nameGreeting = "Happy Birthday, Rover!"
            val ageGreeting = "You are now 5 years old!"
            return "$nameGreeting\n$ageGreeting"
        }
        val greeting = birthdayGreeting1()
        println(greeting)

        fun birthdayGreeting2(name: String): String {
            val nameGreeting = "Happy Birthday, $name!"
            val ageGreeting = "You are now 5 years old!"
            return "$nameGreeting\n$ageGreeting"
        }
        fun main2() {
            println(birthdayGreeting2("Rover"))
            println(birthdayGreeting2("rez"))
            println(birthdayGreeting2("Rex"))
        }

        fun birthdayGreeting3(name: String, age: Int): String {
            val nameGreeting = "Happy Birthday, $name!"
            val ageGreeting = "You are now $age years old!"
            return "$nameGreeting\n$ageGreeting"
        }
        fun main3() {
            println(birthdayGreeting3("Rover", 5))
            println(birthdayGreeting3("Rex", 2))
            println(birthdayGreeting3(name = "Rex", age = 2)) /*Bağımsız değişkenler çıktı değiştirmezler*/
        }

        fun birthdayGreeting4(name: String = "Rover", age: Int): String {
            return "Happy Birthday, $name! You are now $age years old!"
        }
        fun main4(){
            println(birthdayGreeting4(age = 5))
            println(birthdayGreeting4("Rex", 2))
        }
    }
}