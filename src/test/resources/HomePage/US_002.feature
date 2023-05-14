@wip1
Feature: US_002 Bir kullanici olarak Ana Sayfa üst barinda site ici erisimleri kolaylastiracak
  menü basliklarininin olmasini istiyorum.

  Background: Test oncesi yapilacak adimlar
    * Kullanici tarayicida "heallifeURL"e gider

  Scenario: TC_01 Anasayfa ust barinda Latest News bilgilerinin kayan yazi seklinde gorunur oldugu dogrulanmali.
    Given Anasayfada Latest News bilgilerinin kayan yazi seklinde ve gorunur oldugu dogrulanir
    * Browser kapatilir

  Scenario: TC_02 Ana sayfa ust barinda site logosu ve  menu basliklarinin gorunur oldugu dogrulanmali.
    Given Anasayfada logo ve ust bardaki menu basliklarinin varligi dogrulanir
    * Browser kapatilir
@wip3
  Scenario: TC_03 Ana sayfa üst barinda site logosuna tiklandiginda ana sayfayi yeniledigi dogrulanmali.
    Given Anasayfada logo tiklanir ve sayfanin yeniden cagrildigi (refresh) dogrulanir
    * Browser kapatilir



