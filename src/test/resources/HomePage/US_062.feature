
Feature: US_062 Doktor bolumune giris yapildiginda Dashboard Sidebar'da bulunan Radiology bolumune gidilir

  Background: Doktor login bolumune gidilir
    Given Kullanici tarayicida "doctorURL"e gider
    And Kullanici bilgilerini girerek doktor paneline giris yapar

  Scenario: TC_01 Doktor bolumunde Dashboard Sidebar'da Radiology linkine tiklanir ve sayfaya gidilir
    Given Radiology linkine tiklanip, ilgili sayfaya gidildigi dogrulanir
    And Browser kapatilir

  @us_6202
  Scenario: TC_02 Radiology linkinde bulunan basliklar tespit edilir
    Given Radiology linkine gidilir ve acilan sayfadaki liste basliklarinin varligi dogrulanir
    And Browser kapatilir

