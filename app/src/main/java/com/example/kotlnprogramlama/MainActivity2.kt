package com.example.kotlnprogramlama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Logcate çıktı verme
        println("Merhaba Kotlin")
        println(5*10)

        //Değişkenler

        var a = 5 // var : variable : Değişken
        var b = 10
        println(a*b)

        var yas = 50
        println(yas / 5 * 8)

        yas = 60
        print(yas / 5 *8)

        //sabitler val : value : değer
        val x = 10
        val pi = 3.14 //değimesini istenmeyenlerde kullanılır
        val y = 20
        println(x+y)

        println(yas * x) // değişken ve sabit yazılabilir.


        //camelCase  deveYazım
        //snake_case yılan_yazım
        val yasSonucu = yas *x
        print(yasSonucu)

       //Veri Tipleri

       //Numbers Tam Sayılar long >Int>Short>Byte -128 and +128
       //Integer -2 milyar and + 2milyar
       println("-----Int------")

       //Tanımlam (Defining)
       var benimIntegerim:Int

       //Başlatma,Değerini Atama (Inıtıalizing,Inıtialization)
       benimIntegerim=5

       var yeniInteger : Int = 20
       println(benimIntegerim / 2)

       //Long -9 trilton and +9 trilyon
       println("-------Long-------")

       var benimLong : Long =100
       benimLong = 30000000000
       println(benimLong)

       //Short  -32767 and +32767
       var benimShort : Short = 15
       benimShort = 32767
       println(benimShort)

      //Double & Float Ondalıklı Sayılar
       println("-------Double 12,13 & Float 6,7 ondalık sayı yazdırır ----")

       val pi1 = 3.14
       println(pi1 * 2)

       val floatPi : Float = 3.14f
       println(floatPi * 2)

       val yeniDouble : Double = 5.0
       println(yeniDouble / 2)

      //String- Metin
       println("-------String------")

       val benimString = "Benim Yeni Metnim"
       println(benimString.length) //Metin uzunlunu bulur

       val isim ="Selim"
       val soyisim ="Çınar"

       val tamİsim= isim + " "+soyisim
       println(tamİsim)

       val yeniBirString:String
       yeniBirString = "10"

       val başkaBirString="20"
       println(yeniBirString + başkaBirString)

       //Boolean doğru yanlış
       println("-------Boolean------")

       var benimBoolean = true
       benimBoolean = false

       // < -> küçüktür
       // > -> büyüktür
       // == -> eşittir
       // != -> eşit değildir
       // <= -> küçük eşittir
       // >= -> büyük eşittir
       // && -> ve
       // || -> veya

       println(3<5)
       println(4!=4)

       //Veri Tipi dönüşümü
       println("-----Dönüştürme-----")

       val benimInt = 10
       val benimLongaCevrılenInt = benimInt.toLong()
       println(benimLongaCevrılenInt)

       var kullanıcıGirdisi = "50" // "Selim" yazılsaydı uygulama çökerdi format yanlış
       var kullaniciInt = kullanıcıGirdisi.toInt()
       println(kullaniciInt /2 )

       //Koleksiyonlar Birden fazla veriyi tutar
       //Array - Dizi
        println("------Dizi-------")
        val strıngOrnegi = "Selim"
        val benimDizim = arrayOf(strıngOrnegi,"Çınar","Yusuf","Sudenaz")

        //Index
        println(benimDizim[0])  //ındex 0 çağır
        println(benimDizim.get(1))  //ındex 1 çağır
        //Ekleme yapma
        benimDizim[2] = "Mahmut"
        println(benimDizim.get(2))
        benimDizim.set(3,"Mehmet") //indekse göre ekleme
        println(benimDizim[3])

        //Dizilerde farlı veriler
        //Double dizisi
        val numaraDizisi = doubleArrayOf(1.0,2.0,3.0,4.0)
        println(numaraDizisi.get(2))
        //Karisik veri dizisi
        val karisikDizi = arrayOf("Selim",24,16.5,true,false)
        println(karisikDizi.get(3))

        //Array -List -Dizi listesi
        println("-------ArrayList----")
        val isimListesi = arrayListOf("Selim","Yusuf","İbrahim")
        println(isimListesi[0])
        println(isimListesi.get(1))
        //ekleme yapma
        isimListesi.add("Mehmet")
        isimListesi.add("Yusuf")
        println(isimListesi.get(4))

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("Atıl")
        karisikArrayList.add(5)
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))

        //Set tekrarlı verilerden kurtarır
        println("------Set-----")
        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")

        println(ornekDizi.size)//Dizi boyutu
        val benimSet = setOf <Int>(7,8,9,9,8,10)
        println(benimSet.size)
        //For Each
        benimSet.forEach{
            println(it)
        }
        val digerSet = HashSet<String>()
        digerSet.add("Selim")
        digerSet.add("Selim")
        digerSet.add("Selim")
        digerSet.add("Çınar")
        digerSet.forEach{
            println(it)
    }
        //Map
        println("----Map-----")
        //Anahtar Kelime -Değer(Key-Value Pairing)
        val yemekDizisi = arrayOf("Elma","Et","")
        val kaloriDizisi = arrayOf(100,200,300)
        println("${yemekDizisi[0]}'nın kalorisi: ${kaloriDizisi[0]}")

        //Tanım
        val yemekKaloriMap = hashMapOf<String,Int>()
        //ekleme
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("et",300)
        yemekKaloriMap.put("Tavuk",200)
        //Yazdırma
        println(yemekKaloriMap.get("Et"))

        val benimMapim = HashMap<String,String>()
        benimMapim.put("Örnek","Değer")

        val yeniMap = hashMapOf<String,Int>("Selim" to 22,"Örnek" to 46)
        println(yeniMap.get("Örnek"))

        //Matematiksel işlemler
        println("-------Matematiksel İşlemler----")
        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)
        var digerSayi = 10
        println(digerSayi > sayi)

        // && -> VE
        // || -> VEYA
        println(digerSayi > sayi && 2 > 3)
        println(digerSayi > sayi || 2>3)
        println(digerSayi > sayi || 2>3)

        println(8+7)
        println(10-4)
        println(20*5)
        println(10/2)

        //Remainde - Kalanı Bulmak
        println(11%3)


        //If kontrollerii
        println("---If Statements (eğer Kontrolleri)------")

        val skor=5
        if (skor < 10) {
            println("Oyunu kaybettin")
        }
        else if(skor >= 10 && skor<20) {
            println("Skorun 10 ve 20 arasında , çok iyi skor aldın.")
        }
        else if (skor >=20 && skor<30){
            println("Skorun 20 ve 30 arasında ,rekorlar kırıyorsun")
        }
        else {
            println("Skorun 30' un üstünde , efsane oynadın")
        }

    }
}