## Laboratorium 2
Termin: 25 listopada 2025 23:59
Instrukcje

1. Z wykorzystaniem klasy LocalDate napisać program który wydrukuje kalendarz na dany miesiąc z zaznaczeniem aktualnej daty (na przykład przy pomocy znaku *).

```aiignore
    Mon Tue Wed Thu Fri Sat Sun
    1   2   3
    4   5   6   7   8   9  10
    11  12  13  14  15  16* 17
    18  19  20  21  22  23  24
    25  26  27  28  29  30  31
```



2. Napisać program który składać się będzie z klasy Employee i klasy Manager. Klasa Employee powinna zawierać pola imię, wynagrodzenie oraz datę zatrudnienia oraz metody dostępowe do tych pól. Klasa Manager powinna dziedziczyć po klasie Employee i zawierać dodatkowo pole bonus oraz nadpisaną metodę dostępową dla wynagrodzenia w której uwzględniony będzie bonus. W metodzie main proszę utworzyć tablicę pracowników do której proszę wrzucić kilku pracowników oraz jednego managera, a następnie w pętli wyświetlić na ekranie ich imiona, wynagrodzenie i datę zatrudnienia.


3. Proszę rozszerzyć program z zadania drugiego o statyczne metody wytwórcze tworzące odpowiednio pracowników z podziałem na ich doświadczenie i bazowe wynagrodzenie (junior - 5000, mid - 10000, senior - 15000)


4. Proszę zmodyfikować program z zadania drugiego tworząc abstrakcyjną klasę osoba i przenosząc do niego pole imię wraz z implementacją metody dostępowej oraz dodatkową abstrakcyjną metodą zwracającą opis.


5. Proszę napisać program który składać się będzie z rekordu reprezentującego punkt w kartezjańskim układzie współrzędnych. Napisać do tego rekordu dodatkowy konstruktor tworzący punkt 0, 0 oraz metodę przyjmującą dwa punkty jako argument i liczącą odległość między tymi punktami.