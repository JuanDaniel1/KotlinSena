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

### Imagenes

![image](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/964fb2df-f098-4bdb-9f0b-90901d09d952)
![image](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/becf9ec2-66a7-40f0-9a74-7d06cf74ec3e)
![image](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/e6efa8e3-7a7e-4577-bc60-2f253c56d3a0)
![image](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/285ed51d-f99e-4136-b092-6f9e69253567)
![image](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/038be1ee-9041-4cd2-b53e-e44b62a30fda)
![image](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/b9df8f5a-3494-4eb8-aae2-33b29398acaa)
![image](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/2f33d26d-6327-46b7-9a8d-365b37e39a4d)


## [Calculadora_2](Calculadora_2)

Este proyecto es el desarrollo de la calculadora kotlin XML que se realizo, es el unico proyecto del repositorio que contiene codigo XML ya que el resto hace uso de Jetpack Compose.

![Screenshot_20230731-200509](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/c411a7ee-d1dc-4218-8ae4-107404ca1bc1)


## [CalculadoraJet](CalculadoraJet)

Esta calculadora a diferencia del anterior, contiene codigo Jetpack Compose, ademas se hizo cambios en la UI, junto a otra libreria Rhino para reconocimiento de operaciones matematicas.

![Screenshot_20230731-200504](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/8b879a98-4dce-42a1-b664-0893fe421e4e)

## [MyEcommerce](MyEcommerce)

Este proyecto es el desarrollo de una tienda ecommerce de yoga con el mismo UI del tutorial en android developers, tambien se hace uso de codigo jetpack compose.

![Screenshot_20230801-005931~2](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/407b90a6-5450-449c-be14-4db1ceb093d9)


## [MyEcommerce2](MyEcommerce2)

Es la version actualizada del proyecto anterior, contiene UI con colores relacionados al Sena, junto a un boton flotante en el navegador inferior y mas grillas para la distribucion de productos Sena.

![Screenshot_20230801-010029](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/90cd2afb-3236-4c26-8582-901bf8ec677b)

## [kotlin](kotlin)

Este proyecto contiene la aplicacion de contenedores desplegables donde se muestra la animacion de despliegue y la nueva informacion.

![Screenshot_20230801-004108](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/548c9c02-d51a-440c-9b68-aa2f429d01a2)


## [JetpackCompose2](JetpackCompose2)

Se muestra la aplicacion de chat simulado donde cada mensaje tiene su detalle corto y largo, haciendo despliegue pero sin animacion, tambien representa la simulacion de mensajes de chat, se uso jetpack compose.

![Screenshot_20230801-010400](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/d0b4c5cf-f0a8-4ccb-9725-6bd15ca8d144)

## [Tasks](Tasks)

El proyecto contiene una aplicacion de salud donde se muestra un listado de tareas y puedo eliminar, seleccionar tareas, por otro lado las que seleccione no seran eliminadas.

![Screenshot_20230801-004851](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/02f8eb1d-71f4-4654-bf6e-4fd862c00740)

## [jetloginsena](jetloginsena)

Es un login alusivo al sena con sus colores y estilos, junto a un splash animado, contiene notificaciones al iniciar sesion y registrarse.

![Screenshot_20230731-200550](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/7f2a86db-4b1c-4e3d-aae5-999226de219a)

## [cupcake](cupcake)

Esta aplicacion consiste en el pedido de cupcakes, donde se selecciona cantidad, sabores, fecha de entrega, factura y por ultimo hay opcion para compartir el pedido por cualquier aplicacion.

![Screenshot_20230731-200625](https://github.com/JuanDaniel1/KotlinSena/assets/110575826/fb28869e-2de1-4332-a9ca-56df066ea55d)






