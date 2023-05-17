
Feature: US_062 Doktor bolumune giris yapildiginda Dashboard Sidebar'da bulunan Radiology bolumune gidilir

  Background: Doktor login bolumune gidilir
    Given Kullanici tarayicida "doctorURL"e gider
    And Kullanici bilgilerini girerek doktor paneline giris yapar

  Scenario: TC_01 Doktor bolumunde Dashboard Sidebar'da Radiology linkine tiklanir ve sayfaya gidilir
    Given Radiology linkine tiklanip, ilgili sayfaya gidildigi dogrulanir
    And Browser kapatilir


  Scenario: TC_02 Radiology linkinde bulunan basliklar tespit edilir
    Given Radiology linkine gidilir ve acilan sayfadaki liste basliklarinin varligi dogrulanir
    And Browser kapatilir


  Scenario: TC_03 Radiology Bill List'te liste icerikleri sutun basliklari uzerinden siralanabilmeli.
    Given Radiology linkine gidilir ve Radio Bill alanındaki basliklara gore siralama yapildigi dogrulanir
    And Browser kapatilir


  Scenario: TC_04 Radiology Bill  LIst'teki icerikler arasinda kolayca arama yapabilmek icin searchBox olmali
    Given Radiology linkine gidilir ve Radio Bill alanında search text box oldugu dogrulanir
    And Browser kapatilir

  @us_6205
  Scenario: TC_05 Radiology Bill  List'te 100er veya All olarak goruntuleme imkani bulunmalidir
    Given Radiology bolumunde Radio Bill List'in 100'er veya All seklinde goruntuleme olanagi oldugu dogrulanir
    And Browser kapatilir
