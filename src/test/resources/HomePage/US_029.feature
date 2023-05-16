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

  @us_2904

  Scenario: TC_04 Blood Issue sayfasina gidilip, Blood Issue List basliklari gorulebilmeli
    Given Blood Issue List basliklarinin gorulur oldugu dogrulanir
    And Browser kapatilir

