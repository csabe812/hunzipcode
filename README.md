# Hungarian ZIPCode - City - Subcity manager
This is a repository for getting hungarian zipcodes, cities and subcities.
In Hungary, ZIPCODE stands for 4 digits, starting with number 1, for example: 1222, 5500, 6724, etc.
1) ZIPCODE: is the 4 digits
2) CITYNAME: is the name of the city
3) SUBCITYNAME: a city may have a subcity with another ZIPCODE, see at example:

Resource has been downloaded from the Official Hungarian Post Office called Magyar Post Zrt.
See at: https://www.posta.hu/static/internet/download/Iranyitoszam-Internet_uj.xlsx

| ZIPCODE   |      CITYNAME      |  SUBCITYNAME |
|----------|:-------------:|------:|
| 5500 |  Gyomaendrőd | Gyoma |
| 5502 |    Gyomaendrőd   |   Endrőd |
| 6724 | Szeged |    null |

# Magyar irányítószám lekérdező
Ez a github repo a Magyarországon található irányítószámokat és a hozzá tartozó városokat (alnévvel) jeleníti meg.
Lehetőség van egy objektum lekérdezéséhez is az irányítószám alapján.
A magyar írányítószámok 4 jegyűek és nem kezdődhetnek nullával.
A DTO objektumban három adattagot tárolok:
1) ZIPCODE: a 4-jegyű szám
2) CITYNAME: a város neve
3) SUBCITYNAME: a városoknak ellehetnek látva alnévvel is (de annak más irányítószáma van, lásd fenti példa)
A resource hivatalos forrásból van használva, pontosabban a Magyar Posta Zrt. oldaláról: https://www.posta.hu/static/internet/download/Iranyitoszam-Internet_uj.xlsx

A kód és a hozzá tartozó comment angolul van írva.
Felelősséget nem vállalok érte.
