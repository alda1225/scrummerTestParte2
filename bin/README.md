- El ejercicio fue elaborado utilizando el IDE Spring Tool Suite version 3.9.3.
- La base de datos utilizada fue Postgresql version 9.3.5.
- El ejercicio fue elaborado utilizando el framework SpringBoot.
- La parte 1 del ejercicio "modelado" se encuentra en el paquete "com.grupo.geopago.modelado", allí se encontrara el archivo Main para correr el programa.
- La parte 2 del ejercicio "sercivios" se encuentra en el paquete "com.grupo.geopago", allí estará el archivo "GeopagoApplication" para correr la aplicación.

MODELADO DE CLASES
Desarrollar una clase que permita la creación de objetos que representen figuras
geométricas dadas (cuadrado, triangulo, círculo) proveyendo un parámetro de entrada
único que identifiqué el tipo de objeto esperado como retorno. Tip de ayuda: “Factory”
La estructura del modelo de clases que deben tener las implementaciones de dichas
figuras geométricas será la siguiente:
- Se debe definir una interfaz que exija la definición de métodos que permitan la
obtención de los datos: superficie; base; altura; diámetro; tipo de figura
geométrica.
- Puede definirse alguna clase intermedia (no instanciable) para reducir la
redundancia de código.
- Cada una de sus concreciones debe, ante la invocación de alguno de sus
métodos, retornar el valor correspondiente o null en caso de que la figura
geométrica correspondiente no posea dicha característica.
-
En caso de conocer la notación se valorará el diseño de su diagrama UML.
SERVICIOS
Desarrollar una API Rest en JAVA, para el registro y obtención de datos de figuras
geométricas (cuadrado, triángulo, círculo) y sus distintos parámetros (superficie; base;
altura; diámetro; tipo de figura geométrica).
- Las librerías/frameworks a utilizar para esta prueba se deja a elección del
aspirante.
- Se considerará el uso de inyección de dependencias.
