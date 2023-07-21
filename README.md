# KotlinSena

Este repositorio contiene todas las versiones del Proyecto Dashboard de tienda SENA, a continuacion se especificara el contenido de cada una de las versiones y tambien la funcion de cada archivo que este proyecto contiene

### [ProyectoDashboard1](ProyectoDashboard)

Esta version contiene unicamente la navegacion sin ningun contenido y colores predeterminados, por lo tanto se muestra la funcionalidad de la navegacion y cada una de las secciones, se utilizo material y la navegacion es antigua

### [ProyectoDashboard2](ProyectoDashboard2)

En este caso se le asignaron los colores del SENA y diseño de contenidos, donde se pueden mostrar las secciones (Flores, Frutas y Verduras, Huevos, Lacteos, Ver mas, Principal, Inicio, Contenidos, Informacion), por otro lado este proyecto contiene las notificaciones (Sencilla, Extensa, Con imagen, Programada).

### [ProyectoDashboard3](ProyectoDashboard3)

Contiene el dashboard, splash y login conectados pero con navegacion antigua, tambien el login tiene un video de fondo, el splash es animado, y al registrarse o iniciar sesion, pasa al dashboard conectando dos navegaciones distintas (Materia y Materia 3).

### [ProyectoDashboard4](ProyectoDashboard4)

Esta version final del proyecto contiene Splash, Login y Dashboard, a diferencia del anterior este contiene navegacion actual con Material 3, el login, splash y dashboard estan almacenados en una sola navegacion y cumple sus funciones.

## Archivos 

### [ui.theme](

▶️ Este archivo contiene todos los temas de la aplicacion, incluye colores y tipos de letra.

### res

▶️ Estas carpetas contienen las imagenes, clasificadas por (flores, contenido, frutas y verduras, huevos, informacion, inicio, lacteos, principal, ver mas).

### Components

▶️ Esta carpeta contiene los compnentes de dashboard y su navegacion con login y splash, los archivos que contienen son los siguientes:

✔️ Navigation_Bottom: Esta seccion es la navegacion inferior, donde estan las paginas (inicio, contenidos e informacion) junto a su boton de recordatorio.

✔️ Navigation_Drawer: Es el menu lateral que contienen las paginas (principal, flores, lacteos, huevos, frutas y verduras, ver mas), ademas viene asociado con la imagen superior de tienda CBA.

✔️ NotificacionProgramada: Aplica toda la configuracion para la notificacion que contiene el recordatorio.

✔️ NotificationsChannel: Dentro de este archivo se puede encontrar las configuraciones para el resto de notificaciones (sencilla, extensa, con imagen).

✔️ TiendaApp: Es la configuracion de nuestra aplicacion, contiene todas las navegaciones composables y su clase de rutas.

✔️ TopBar: Contiene los iconos, titulo y acciones que se pueden realizar en el navegador superior de la aplicacion.



