Feature: US_029 Kullanici (hastanin) kendi panelinde Kan Bankasi bolumunde islemler yapacaktir

  Background: Kullanici login bolumune gidilir
    Given Kullanici tarayicida "patientURL"e gider
    And Kullanici bilgilerini girerek hasta paneline giris yapar


  Scenario: TC_01 Dashboard sidebar'inda Blood Bank menu basligi olmali ve tiklaninca yonlenmeli
    Given Blood Bank linkine tiklanir ve ilgili sayfaya yonlendirildigi dogrulanir
    And Browser kapatilir


  Scenario: TC_02 Blood Bank sayfasina gidilir ve hasta profil bilgilerinin varligi dogrulanir
    Given Hasta profil bilgilerinin bulundugu dogrulanir
    And Browser kapatilir


  Scenario: TC_03 Blood Bank sayfasindan Blood Issue ve Component Issue sayfalarina gecis yapilabilmeli.
    Given Blood Issue ve Component Issue sayfalarinin varligi ve bu sayfalara gecilebildigi dogrulanir
    And Browser kapatilir


  Scenario: TC_04 Blood Bank bolumunden Blood Issue sayfasina gidilip, Blood Issue List basliklari gorulebilmeli
    Given Blood Issue List basliklarinin gorulur oldugu dogrulanir
    And Browser kapatilir

  Scenario: TC_05 Blood Bank bolumunden Blood Issue List bolumunde arama yapmak icin search text box olmali
    Given Blood Issue List bolumunde search text box oldugu dogrulanir
    And Browser kapatilir

  Scenario: TC_06 Blood Bank bolumunde Blood Issue List 100'erli veya hepsi birden listelenebilmeli
    Given Blood Issue List bolumunde 100'erli veya hepsi birden listeleme secenekleri oldugu dogrulanir
    And Browser kapatilir

  Scenario: TC_07 Blood Bank bolumunde Blood Issue List basliklarindan hangisi tiklanirsa, ona gore listelenmeli
    Given Blood Issue List bolumunde liste basliklarina tiklanarak listeleme yapilabildigi dogrulanir
    And Browser kapatilir

  Scenario: TC_08 Blood Bank bolumunde Blood Issue List'teki Action basligindaki islemler yapilalabilmeli.
    Given Blood Issue List kisminda Action basligindaki view,show ve pay butonlarinin calistigi dogrulanmali
    And Browser kapatilir

  Scenario: TC_09 Blood Bank bolumunde Component Issue List'teki basliklar gorulur olmali
    Given Component Issue List kisminda tum basliklarin oldugu dogrulanmali
    And Browser kapatilir

  Scenario: TC_10 Blood Bank kisminda Component Issue List bolumunde arama yapmak icin search text box olmali
    Given Component Issue List bolumunde search text box oldugu dogrulanir
    And Browser kapatilir

  Scenario: TC_11 Blood Bank bolumunde Component Issue List 100'erli veya hepsi birden listelenebilmeli
    Given Component Issue List bolumunde 100'erli veya hepsi birden listeleme secenekleri oldugu dogrulanir
    And Browser kapatilir



  Scenario: TC_12 Blood Bank bolumunde Component Issue List basliklarindan hangisi tiklanirsa, ona gore listelenmeli
    Given Component Issue List bolumunde liste basliklarina tiklanarak listeleme yapilabildigi dogrulanir
    And Browser kapatilir


  Scenario: TC_13 Blood Bank bolumunde Component Issue List bolumunde Action kisminda View, Print ve Pay olmadigi tespit edilmeli
    Given Component Issue List bolumunde Action bolumunun bos oldugu dogrulanmali
    And Browser kapatilir
