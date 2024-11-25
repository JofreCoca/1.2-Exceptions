
# Descripció - Enunciat de l'exercici

Nivell 1
- Exercici 1

Crea una classe Producte amb els atributs nom i preu. També, una classe Venda amb una col·lecció de productes i el preu total de la venda. La classe Venda inclou el mètode calcularTotal(), que llança una excepció personalitzada VendaBuidaException si la col·lecció està buida, mostrant el missatge "Per fer una venda primer has d’afegir productes". Si hi ha productes, calcula i assigna el preu total de la venda.

L'excepció VendaBuidaException, filla de Exception, rep el missatge al constructor i el mostra amb getMessage() quan és capturada. Finalment, implementa el codi per generar i capturar una excepció IndexOutOfBoundsException.

Nivell 2
- Exercici 1

Crea una classe Entrada per gestionar excepcions en la introducció de dades des del teclat utilitzant Scanner. Aquesta classe inclou mètodes estàtics per llegir diferents tipus de dades (byte, int, float, double, char, String i boolean), cadascun rebent un missatge personalitzat que es mostra a l’usuari.

Quan es produeix una excepció, com ara un InputMismatchException, es captura i es mostra un missatge d'error ("Error de format"), i es torna a demanar la dada fins que sigui correcta.

Mètodes a implementar:

Amb captura de InputMismatchException:
llegirByte(String missatge)
llegirInt(String missatge)
llegirFloat(String missatge)
llegirDouble(String missatge)
Amb captura d’una excepció personalitzada:
llegirChar(String missatge)
llegirString(String missatge)
llegirSiNo(String missatge) — retorna true per "s" i false per "n".

Nivell 3
- Exercici 1

Una empresa de cinemes necessita una aplicació per gestionar la reserva de seients, utilitzada pels venedors/es. L'aplicació permet introduir el nombre de files i seients de la sala i presenta un menú amb opcions per gestionar les reserves, incloent mostrar butaques reservades, reservar i anul·lar butaques, o gestionar reserves per persona.

Estructura de classes:
Classe Principal:
Conté el main que crea un objecte de la classe Cine i inicia l’aplicació.
Classe Butaca:
Modela una butaca amb atributs per fila, seient i persona que la reserva.
Inclou:
Constructor, getters, mètodes equals (compara fila i seient) i toString (format descriptiu).
Classe Cine:
Gestiona el cinema.
Atributs:
Nombre de files, nombre de seients.
Objectes de les classes GestioButaques i GestioCine.
Mètodes:
demanarDadesInicials: Inicialitza les dades del cinema.
iniciar: Gestiona el menú i crida mètodes de GestioCine.
Classe GestioCine:
Conté la lògica per gestionar les operacions del cinema.
Atributs:
Objecte de Cine.
Mètodes:
menu: Mostra el menú i retorna l’opció escollida.
Operacions per mostrar butaques, reservar i anul·lar reserves.
Valida la fila, el seient o el nom de la persona i llença excepcions personalitzades (ExcepcioNomPersonaIncorrecte, ExcepcioFilaIncorrecta, ExcepcioSeientIncorrecte).
Classe GestioButaques:
Gestiona un ArrayList de butaques.
Mètodes:
Afegir o eliminar butaques (amb validació mitjançant excepcions com ExcepcioButacaOcupada i ExcepcioButacaLliure).
Cercar butaques per fila i seient.
Menú d'operacions:
Mostrar totes les butaques reservades.
Mostrar reserves d’una persona.
Reservar una butaca.
Anul·lar una reserva.
Anul·lar totes les reserves d’una persona.
Sortir.
L'aplicació assegura la gestió correcta de dades i tracta errors mitjançant excepcions personalitzades.

# Tecnologies Utilitzades

IntelliJ, Git and GitHub

# Requisits

Nothing

# Instal·lació

Nothing

# Execució

Nothing

# Desplegament

Nothing

# Contribucions

Nothing
