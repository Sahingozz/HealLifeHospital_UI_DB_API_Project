@wip
Feature: US_001 Bir kullanıcı olarak siteyi kullanabilmek icin web sitesine erisebilmeliyim

  Background: url acilisi
    * Kullanici tarayicida "heallifeURL"e gider

  Scenario: TC_01 Kullanici (Verilen URL) ile browserdan web sitesine erisilebilir olmali
    Given Acilan sayfanin dogru url ye gittigi dogrulanır
    * Kullanici browseri kapatir


  Scenario: TC_02 Web sitesine erisim saglandiginda ana sayfa görünür olmali

    Given Acilan sayfanin homepage oldugu dogrulanır
    * Kullanici browseri kapatir




