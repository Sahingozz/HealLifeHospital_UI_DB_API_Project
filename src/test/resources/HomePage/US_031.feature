
Feature: US_031 Bir kullanici olarak kolayca randevu olusturabilmek icin ana sayfada appointment sayfasinin olmasini istiyorum.

  Background: Her senaryo oncesi calisir
    * Kullanici tarayicida "heallifeURL"e gider
    * Kullanici navbar menuden 2. secenege tiklar

  Scenario: TC_01 Ana sayfa header bölümündeki Appointment linkine tiklandiginda "appointment" sayfasina yönlendirmeli.
    Given Kullanici appointment'e tiklar ve appointment sayfasina gittigini dogrular
    * Kullanici browseri kapatir

  Scenario: TC_02 Appointment sayfasinda randevu olusturabilmek icin istenen bilgilerin (Specialist, Doctor, Shift, Date, Message) girilecegi textBox'lar olmali.
    Then Kullanici appointment dropdown menulerinin gorunur oldugunu dogrular
    * Kullanici browseri kapatir
  @bektas
  Scenario: TC_03 Gecerli bilgiler ile uygun zaman araligi secildiginde hastane sisteminde randevu olusturulabilmeli.
    When Kullanici appointment dropdown 1. menuden "Cardiologists" secer
    When Kullanici appointment dropdown 2. menuden "Sonia Bush (9002)" secer
    When Kullanici appointment dropdown 3. menuden "Evening" secer
    Then Kullanici appointment Message'a "Goze Civi Batmasi" yazar
    Then Kullanici appointment Slot'a tiklar. Uygun zaman secilip, randevu olusturulur
    Then Kullanici randevu odemelerini gerceklestirir


    