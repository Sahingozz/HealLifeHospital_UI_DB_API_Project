Feature: US_029 Kullanici (hastanin) kendi panelinde Kan Bankasi bolumunde islemler yapacaktir

  Background: Kullanici login bolumune gidilir
    Given Kullanici tarayicida "patientURL"e gider
    And Kullanici bilgilerini girerek hasta paneline giris yapar

  @us_2901
  Scenario: TC_01 Dashboard sidebar'inda Blood Bank menu basligi olmali ve tiklaninca yonlenmeli
    Given Blood Bank linkine tiklanir ve ilgili sayfaya yonlendirildigi dogrulanir
    And Browser kapatilir

