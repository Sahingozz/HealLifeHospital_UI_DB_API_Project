@wip1
Feature: US_002 Bir kullanici olarak Ana Sayfa üst barinda site ici erisimleri kolaylastiracak
         menü basliklarininin olmasini istiyorum.

  Background: Test oncesi yapilacak adimlar
    * Kullanici tarayicida "heallifeURL"e gider

    Scenario: TC_01 Anasayfa ust barinda Latest News bilgilerinin kayan yazi seklinde gorunur oldugu dogrulanmali.
    Given Anasayfada Latest News bilgilerinin kayan yazi seklinde ve gorunur oldugu dogrulanir
    * Browser kapatilir

