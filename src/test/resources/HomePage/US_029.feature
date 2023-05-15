@us_029
  Feature: US_029 Bir kullanici olarak hastane yonetimiyle iletisim icin Contact Us sayfasinin olmasini istiyorum

    Background: Test oncesi yapilacak adimlar
      * Kullanici tarayicida "heallifeURL"e gider

    Scenario: TC_01 Anasayfada header bolumunde Contact Us linki tiklandiginda ilgili sayfaya gittigi dogrulanir
      Given Anasayfada header bolumunde contact us linki tiklanir ve ilgili sayfaya gittigi dogrulanir
      * Browser kapatilir

    Scenario: TC_02 Contact Us sayfasina gidilir ve mesaj gondermek icin gerekli text alanlari oldugu dogrulanir
      Given Contact Us sayfasinda mesaj gondermek icin gerekli text alanlari oldugu dogrulanir
      * Browser kapatilir
