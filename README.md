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

### [ui.theme](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/ui/theme)

▶️ Este archivo contiene todos los temas de la aplicacion, incluye colores y tipos de letra.

### [res](ProyectoDashboard4/app/src/main/res)

▶️ Estas carpetas contienen las imagenes, clasificadas por (flores, contenido, frutas y verduras, huevos, informacion, inicio, lacteos, principal, ver mas).

### [Components](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/components)

▶️ Esta carpeta contiene los compnentes de dashboard y su navegacion con login y splash, los archivos que contienen son los siguientes:

✔️ [Navigation_Bottom](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/components/Navigation_Bottom.kt): Esta seccion es la navegacion inferior, donde estan las paginas (inicio, contenidos e informacion) junto a su boton de recordatorio.

✔️ [Navigation_Drawer](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/components/Navigation_Drawer.kt): Es el menu lateral que contienen las paginas (principal, flores, lacteos, huevos, frutas y verduras, ver mas), ademas viene asociado con la imagen superior de tienda CBA.

✔️ [NotificacionProgramada](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/components/NotificacionProgramada.kt): Aplica toda la configuracion para la notificacion que contiene el recordatorio.

✔️ [NotificationsChannel](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/components/NotificationsChannel.kt): Dentro de este archivo se puede encontrar la configuracion para la notificacion programada y sus permisos.

✔️ [TiendaApp](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/components/TiendaApp.kt): Es la configuracion de nuestra aplicacion, contiene todas las navegaciones composables y su clase de rutas.

✔️ [TopBar](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/components/TopBar.kt): Contiene los iconos, titulo y acciones que se pueden realizar en el navegador superior de la aplicacion.

✔️ [notifications](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/components/notifications.kt): En el archivo se encuentra cada una de las notificaciones con sus configuraciones(Sencilla, Extensa, Con imagen).

### [pages](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages)

Esta carpeta contiene todas las paginas de la aplicacion, son las siguientes:

✔️ [login](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/login)

✔️ [splash](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/splash)

✔️ [Page_Contenidos](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/Page_Contenidos.kt)

✔️ [Page_Flores](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/Page_Flores.kt)

✔️ [Page_Frutas_Verduras](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/Page_Frutas_Verduras.kt)

✔️ [Page_Huevos](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/Page_Huevos.kt)

✔️ [Page_Informacion](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/Page_Informacion.kt)

✔️ [Page_Inicio](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/Page_Inicio.kt)

✔️ [Page_Lacteos](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/Page_Lacteos.kt)

✔️ [Page_Principal](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/Page_Principal.kt)

✔️ [Page_Ver_Mas](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/pages/Page_Ver_Mas.kt)

### [MainActivity](ProyectoDashboard4/app/src/main/java/com/example/proyectodashboard4/MainActivity.kt)

Este archivo contiene toda la configuracion inicial de la aplicacion, donde se aplica el tema y la primera funcion que la aplicacion ejecuta.

## [Calculadora_2](Calculadora_2)

Este proyecto es el desarrollo de la calculadora kotlin XML que se realizo, es el unico proyecto del repositorio que contiene codigo XML ya que el resto hace uso de Jetpack Compose.

## [CalculadoraJet](CalculadoraJet)

Esta calculadora a diferencia del anterior, contiene codigo Jetpack Compose, ademas se hizo cambios en la UI, junto a otra libreria Rhino para reconocimiento de operaciones matematicas.

## [MyEcommerce](MyEcommerce)

Este proyecto es el desarrollo de una tienda ecommerce de yoga con el mismo UI del tutorial en android developers, tambien se hace uso de codigo jetpack compose.

## [MyEcommerce2](MyEcommerce2)

Es la version actualizada del proyecto anterior, contiene UI con colores relacionados al Sena, junto a un boton flotante en el navegador inferior y mas grillas para la distribucion de productos Sena.

## [kotlin](




