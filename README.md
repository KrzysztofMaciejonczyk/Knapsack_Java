# Knapsack_problem
Autor: Krzysztof Maciejończyk

Opis programu:

Program służy do rozwiązywania problemu plecakowego. Został on podzielony na 3 części:

a) Program główny (**Main.java**), który działa w trybie aplikacji konsolowej,

b) Program dodatkowy (**GUI.java**), który działa w trybie okienkowym,

c) Testy jednostkowe (**ProblemTest.java**).

Program główny został podzielony na 4 klasy:
- **Problem.java** - zawiera ona listę przedmiotów do posortowania według stosunku wartości do wagi oraz metodę Solve służącą rozwiązaniu problemu plecakowego. Końcowy wynik można wyświetlić, przeciążając metodę ToString.
- **Item.java** - zawiera pola przedmiotu, takie jak jego waga, wartość, stosunek dwóch poprzednich pól oraz indeks. W celu ich korzystania utworzono funkcje typu get/set.
- **Main.java** - główny program, który zajmuje się wczytaniem od użytkownika ilości przedmiotów, seedu oraz pojemności plecaka. Na końcu wyświetla listę spakowanych przedmiotów, całkowitą wagę oraz wartość.
- **Result.java** - przechowuje informacje o przedmiotach, które zmieściły się w plecaku. Posaida również przeciążoną metodę ToString w celu przekształcenia wyników w stringa do łatwiejszej obsługi GUI.

Gui utworzono przy pomocy UI Designer'a, dzięki któremu umiejscowiono elementy GUI form, takie jak JPanel, JScrollPane czy JTextField.

Do GUI zastosowano 3 pola tekstowe, w które użytkownik może wpisać liczbę przedmiotów, seed oraz pojemność plecaka. Po kliknięciu przycisku "Solve" program wylicza ułożenie przedmiotów i wyświetla zarówno wszystkie dostępne przedmioty oraz wynik końcowy z przedmiotami, które się zmieściły oraz ich łączną wagę i wartość. Program został zabezpieczony w razie wpisania złych wartości w pola tekstowe.

Utworzono ponadto 4 testy jednostkowe badające najważniejsze funkcje programu:
- sprawdzenie czy przedmioty posiadają wagę i wartość z wybranego przedziału.
- sprawdzenie czy jeśli żaden z przedmiotów nie spełnia wymagań, to czy program zwróci pusty plecak.
- sprawdzenie czy jeśli chociaż jeden z przedmiotów spełnia wymagania, to czy program zwróci niepusty plecak.
- sprawdzenie czy łączna waga oraz wartość przedmiotó zgadza się z pojedynczymi przedmiotami w plecaku.

Screeny działania programu zostały umieszczone w folderze Screenshots.
