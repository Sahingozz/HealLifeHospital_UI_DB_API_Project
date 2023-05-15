
  Feature: US_029 Bir kullanici olarak hastane yonetimiyle iletisim icin Contact Us sayfasinin olmasini istiyorum

    Background: Test oncesi yapilacak adimlar
      * Kullanici tarayicida "heallifeURL"e gider

    Scenario: TC_01 Anasayfada header bolumunde Contact Us linki tiklandiginda ilgili sayfaya gittigi dogrulanir
      Given Anasayfada header bolumunde contact us linki tiklanir ve ilgili sayfaya gittigi dogrulanir
      * Browser kapatilir

    Scenario: TC_02 Contact Us sayfasina gidilir ve mesaj gondermek icin gerekli text alanlari oldugu dogrulanir
      Given Contact Us sayfasinda mesaj gondermek icin gerekli text alanlari oldugu dogrulanir
      * Browser kapatilir

    @us_029

    Scenario: TC_03 Contact Us sayfasındaki bilgi alanlarina giris yapilip, mesaj gonderilebildigi dogrulanir
      Given Anasayfada ust barda bulunan contact us sayfasina gidir, bilgiler girilir ve mesaj submit edilir
      * Browser kapatilir
