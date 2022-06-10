# PunkApiProject

## Pasos para probar la solución

* Para probar la solución es necesario clonar el proyecto y abrirlo en el IDE de su preferencia.
* Este proyecto usa maven y Spring boot, por lo que las dependencias pueden encontrarse en el pom.xml.
* Puede cambiar la url base del api desde el archivo application.properties del proyecto.
* Este proyecto usa una base de datos H2 en memoria, así que puede cambiar su configuración (usuario, contraseña) desde el application.properties.
* La solución se ejecuta en el puerto 8080, por lo que es necesario dirigirse a la ruta "http://localhost:8080/swagger-ui.html" para poder visualizar la documentación de los servicios realizados y poder probarlos.


## Logs

Este proyecto cuenta con un log de búsquedas realizadas con los siguientes atributos: Servicio consumido, hora de ejecución y tiempo de respuesta.

Esta información se guarda en una base de datos H2 y para visualizarla es necesario dirigirse al servicio de listar logs en la ruta de documentación swagger definida anteriormente. De esta forma se podrá revisar las búsquedas realizadas en la sesión de ejecución, ya que al ser BD en memoria, los logs no se guardan fuera de la sesión actual.
