## ENUNCIADO

Una empresa de software que se dedica a crear componentes gráficos para el desarrollo de aplicaciones nos había pedido desarrollar el “corazón” del sistema de menúes que utilizará. Este menú está implementado para consola y cuenta con una clase para el menú y varias clases distintas que heredan de una clase abstracta común para implementar varios tipos de opciones de menú. Aceptaron nuestro prototipo (cuyo diseño se puede ver aquí debajo) pero nos pidieron ciertos cambios.

![Parcial1](https://user-images.githubusercontent.com/66759199/213951180-b585c5e0-9839-4b04-be5d-65db05dbb629.png)

## Nos piden


- Escribir la interfaz **Activable**, que tiene declarado los métodos **activar()**, **desactivar()** y **estaActivada():boolean**.

- Crear la clase **OpcionOnOff** que extiende OpcionDeMenu e implementa Activable.

Esta clase tiene dos constructores: El primero recibe como parámetros la descripción y el caracter de selección. El segundo, además, recibe un booleano que indica el estado inicial de la acción (si está activada o no). Por defecto, cuando no se recibe, el valor de activada debe ser false.

- El método **mostrar()** de OpcionOnOff debe escribir, antes de la descripción de la opción:

“[x]”, cuando la opción está activa;

“[ ]” (con un espacio en blanco en vez de la ‘x’) si no está activa.

- El método **ejecutar()** de OpcionOnOff invierte el estado de activación (pasa de activa a inactiva y viceversa).

- Implementar la clase **MenuDeTareas** a partir de la clase Menu. Los cambios respecto a esta segunda clase son: Su método registrar() solamente recibe objetos de la clase OpcionOnOff.

- Implementa el método **getTotalTareasCumplidas():int** que devuelve la cantidad de opciones del menú que están marcadas como activas.

- Implementar la clase **OpcionTareasCumplidas** que extiende OpcionDeMenu. Además de la descripción y el caracter del selección recibe un MenuDeTareas. Su método **ejecutar()** mostrará la cantidad de opciones marcadas como cumplidas (activadas) en la instancia de MenuDeTareas recibida en el constructor.

Descomentar las líneas comentadas del main y probar.

La ejecución del programa completo, activando la primera de las opciones sin marcar mostraría lo siguiente:

![image](https://user-images.githubusercontent.com/66759199/213951243-b34d4000-09d7-407e-a3e5-375145d39cb0.png)
