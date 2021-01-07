# Test Remoto (Parte 2)

<p><strong>Documentacion</strong></p>
<p>El proyecto esta creado utilizando el IDE Spring Tool Suite version 4 y base de datos en Postgresq.l</p>
<p>Dentro de el mismo se encuntra el paquete "com.scrummertest.test" donde se encuentra <strong>"FiguraApplication"</strong> para correr la aplicación.</p>
<p>Dentro del archivo <strong>"application.properties"</strong> se puede configurar el puerto y parametros para el acceso a la base de datos.</p>
<p>Se debe crear una base de datos en Postgresql con el nombre "scrummerdb" o el nombre configurado en <strong>"application.properties"</strong>.</p>

<p><strong>Metodos POST</strong></p>
<p>'http://localhost:8091/api/figura' es el link del servicio para crear las figuras en la base de datos esta recibe por parametros:</p>
<p>
<strong>JSON = </strong> {
    "superficie":"1F",
    "base": "1F",
    "altura":"1F",
    "diametro":"1F",
    "tipoFigura": "circulo"
}</strong>
</p>
<p>donde 'tipoFigura' solo acepta triangulo, cuadrado y circulo</p>
</p> </p>
<p><strong>Metodos GET</strong></p>
<p>'http://localhost:8091/api/figura' es link que genera el servicio  para listar las figuras creadas con el metodo POST.</p>
<p>'http://localhost:8091/api/figura/circulo' es link que genera el servicio  para listar las figuras por tipo de figura donde el parametro '/circulo' puede ser cambiado por el tipo de figura que desea listar.</p>

<p><strong>SERVICIOS</p>

Desarrollar una API Rest en JAVA, para el registro y obtención de datos de figuras
geométricas (cuadrado, triángulo, círculo) y sus distintos parámetros (superficie; base;
altura; diámetro; tipo de figura geométrica).
- Las librerías/frameworks a utilizar para esta prueba se deja a elección del
aspirante.
- Se considerará el uso de inyección de dependencias.
