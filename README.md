# Reto Sophos
- Automatización en página Plazavea
- Automatización Servicio REST API Gorest  
### Tecnologías implementadas
- SerenityBDD
- Screenplay
- Cucumber
- Gradle
- Java
- RestAssured
## Automatización agregar producto plazavea
Se desarrolla una automatización para agregar un producto al carrito en la página plazavea
### Instrucciones de uso
- Clonar el proyecto y abrir con cualquier editor o IDE.  
- Descargar las dependencias
- Por default en el serenity.properties webdriver.chrome.driver está asignado al driver de Windows, considere la modificación de esta ruta si desea
ejecutarlo en otro sistema operativo
## Automatización gorest API
Se desarrolla una automatización para certificar un servicio rest
### Precondiciones
Antes de ejecutar la automatización ubicarse en el feature `validate_rest_services.feature` y modificar los siguientes valores
- Se debe colocar el token de autenticación que la API gorest proporciona para poder realizar las peticiones
```bash
Given That the user calls the service with the token "token".
```
- Colocar ID del cliente al cual se desea capturar
```bash
When Make a request to find the customer with ID "1"
```
- Establecer la data la cual desea o espera obtener el resultado para realizar la respectiva validación
```bash
And Response should includes the following
```