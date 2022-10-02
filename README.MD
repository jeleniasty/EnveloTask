## Zadanie rekrutacyjne - program szkoleniowy Java

### **Treść zadania**

**1.A.** W jakim celu używa się klas abstrakcyjnych, a w jakim interfejsów?

**Klas abstrakcyjnych używamy w celu:**

* określenia zachowania pewnych klas (zwykle blisko spokrewnionych) , używając pól non-static lub non-final,
  a także używając innych modyfikatorów dostępu niż public (takich jak protected i private)
* implementacji konkretnej funkcjonalności w metodach innych niż metody abstrakcyjne.

**Interfejsów używamy w celu:**

* określenia zachowania pewnych klas, bez względu na rodzaj klasy i stopień pokrewieństwa - interfejs może być
  implementowany przez niepowiązane klasy
* wykorzystania wielokrotnego dziedziczenia interfejsów.

**1.B.** Czym różni się tablica od listy liniowej?

| Array                                                                                                                                                            | ArrayList                                                                                                                                              | LinkedList                                                                                                                             |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------|
| Używa statycznej tablicy do przechowywania danych (tablica nie może zmienić swojej wielkości)                                                                    | ArrayList używa dynamicznej tablicy do przechowywania danych (każdy element ma swoje miejsce w tablicy (index))                                        | LinkedList używa podwójnej połączonej listy (każdy element ma odnośnik (pointer) do kolejnego elementu)                                |
| Array jest szybszy od LinkedList , jeżeli chodzi o przechowywanie i dostęp do danych. Złożoność obliczeniowa operacji wyszukiwania O(1), dodawania/usuwania O(n) | ArrayList jest szybszy , jeżeli chodzi o przechowywanie i dostęp do danych. Złożoność obliczeniowa operacji wyszukiwania O(1), dodawania/usuwania O(n) | LinkedList jest szybszy, jeżeli chodzi o manipulację zbiorem danych. Złożoność obliczeniowa wyszukiwania O(n), dodawania/usuwania O(1) |
| Elementy zapisane w pamięci występują kolejno po sobie (sąsiadująco)                                                                                             | Elementy zapisane w pamięci występują kolejno po sobie (sąsiadująco)                                                                                   | Elementy zapisane w pamięci nie występują kolejno po sobie (elementy posiadają odnośniki)                                              |
| Podczas inicjalizacji tablicy musimy określić jej rozmiar                                                                                                        | Domyślny rozmiar instancji ArrayListy to 10                                                                                                            | Instancja LinkedListy nie ma domyślnego rozmiaru - po instancjonowaniu zostaje utworzona pusta lista                                   |
| Pamięć jest alokowana podczas kompilacji                                                                                                                         | Pamięć jest alokowana podczas runtime'u                                                                                                                | Pamięć jest alokowana podczas runtime'u                                                                                                |
| Wykorzystuje mniej pamięci niż ArrayList i LinkedList                                                                                                            | Wykorzystuje więcej pamięci, niż tablica, ale mniej niż LinkedList                                                                                     | Wykorzystuje więcej pamięci, niż array i ArrayList (każdy element posiada odnośnik)                                                    |

**2.** Mając tablicę int[] numbers, wypełnioną liczbami całkowitymi i posortowaną malejąco ( numbers[i] >
  numbers[i+1] ), sprawdź czy występuje w niej liczba int x. Metoda powinna zwracać wartość TRUE, jeśli dana liczba
  występuje oraz FALSE w przeciwnym wypadku. W rozwiązaniu zależy nam na jak najmniejszej złożoności obliczeniowej (
  priorytet) oraz pamięciowej. Podaj szacowaną złożoność obliczeniową oraz pamięciową. Poniżej sygnatura metody do
  napisania.
  private boolean search(int[] numbers, int x){}

  **Implementacja zadania w klasie SearchNumber**

**3.** Napisz program, który wykorzysta API Kanye Rest https://kanye.rest/ by każdorazowo zaproponować nową perełkę
  mądrości od Kanye Westa. Program powinien być obsługiwany z poziomu konsoli i obsługiwać komendę "next" by wywołać
  następny cytat. Program nie potrzebuje oprawy graficznej. Zwróć uwagę na poprawną architekturę aplikacji oraz na
  czystość kodu.
  Dla chętnych, za dodatkowe punkty: dodaj zapisywanie cytatów w pamięci, by upewnić się, że każdy kolejny cytat jest
  nowy.

  **Implementacja zadania w klasie KanyeQuote**


