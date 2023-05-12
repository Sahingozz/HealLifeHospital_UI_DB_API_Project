
@wip
Feature: US_033 Bir kullanici olarak hastane hakkinda daha cok görsel bilgiye sahip olmak icin ana sayfada Gallery sayfasinin olmasini istiyorum

  Background: url acilisi
    * Kullanici tarayicida "heallifeURL"e gider
    * Kullanici navbar menuden 9. secenege tiklar

  Scenario: TC_01 Ana sayfa header bölümündeki Gallery linkine tiklandiginda "gallery" sayfasina yönlendirmeli.
    Given kullanici gallery linkine tiklar ve gallery sayfasina gittigini dogrular
    * Kullanici browseri kapatir

  Scenario: TC_02 Gallery sayfasinda farkli bölümler (Health & Wellness, Hospitals and Directions, Specialities, Recreation Centre, Your Health, Surgery) ile ilgili her bölüme ait sayfalar olmali.
    When Kullanici Gallery sayfasindaki basliklarin gorunur oldugunu dogrular
    * Kullanici browseri kapatir

  Scenario: TC_03 Her bölümün kendine ait sayfasinda ilgili görseller ve kisa bir aciklama bulunmali
    Then Kullanici Gallery sayfasindaki bolumlerde aciklama yazdigi dogrulanir
    * Kullanici browseri kapatir