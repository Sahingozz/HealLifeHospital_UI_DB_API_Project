
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


  Scenario: TC_05 Radiology Bill  List'te 100er veya All olarak goruntuleme imkani bulunmalidir
    Given Radiology bolumunde Radio Bill List'in 100'er veya All seklinde goruntuleme olanagi oldugu dogrulanir
    And Browser kapatilir


  Scenario: TC_06 Radiology Bill  List'te Balance Amount'taki Viev Reports'a tiklanip, yeni sayfa acilmasi saglanir
    Given Radio Bill List'te Balance Amount'da bulunan view Reports tiklanir ve detay sayfasi acildigi dogrulanir
    And Browser kapatilir


  Scenario: TC_07 Radiology Bill  List'te Bill Details bolumunde hasta bilgileri kisminda duzenleme yapilabilmelidir
    Given Radio Bill List'te Bill Details bolumune gecilip, addEdit person kisminda bilgiler duzenlenebilmeli
    And Browser kapatilir


  Scenario: TC_08 Radiology Bill  List bolumunden Radiology Test bolumune gecis yapilabilmelidir
    Given Radio Bill List bolumunden Radiology Test bolumune gecilebildigi dogrulanmalidir
    And Browser kapatilir


  Scenario: TC_09 Radiology Test bolumune gecilir ve basliklar gorulur
    Given Radiology Test bolumunde test liste basliklarinin gorunurlugu dogrulanmalidir
    And Browser kapatilir


  Scenario: TC_10 Radiology Test List'te liste icerikleri sutun basliklari uzerinden siralanabilmeli.
    Given Radiology linkinden Radiology Test sayfasina gidilip, sutun basliklarina gore siralama yapildigi dogrulanmali
    And Browser kapatilir


  Scenario: TC_11 Radiology Test  LIst'teki icerikler arasinda kolayca arama yapabilmek icin searchBox olmali
    Given Radiology linkine gidilir, Radiology Test linki tiklanir ve Test List alaninda search text box oldugu dogrulanir
    And Browser kapatilir

  @us_6212
  Scenario: TC_12 Radiology Test  List'te 100er veya All olarak goruntuleme imkani bulunmalidir
    Given Radiology Test List bolumunde listenin 100'er veya All seklinde goruntuleme olanagi oldugu dogrulanir
    And Browser kapatilir
