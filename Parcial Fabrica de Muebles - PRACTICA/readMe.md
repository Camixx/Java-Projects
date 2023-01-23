##ENUNCIADO


Una empresa se dedica a la fabricación y venta de muebles de distintos tipos. Cada mueble tendrá un modelo – String, un costo base – decimal y un porcentaje de ganancia – decimal. Además los muebles deberán ser Mostrables, indicando por consola:
- El tipo de mueble
- El modelo
- El precio de venta
La fábrica produce muebles de los siguientes tipos indicando sus características
- Mesa
- Largo – entero
- Ancho – entero
- Tipo de mesa (Moderna, Antigua y de Cristal)
- Silla
- Alto - entero
- Material de fabricación (Madera, Metal o Plástico)
- Sillón
- Cantidad de cuerpos – entero
- Tipo de tela del sillón

Todos los muebles deberán poder calcular e informar el precio de venta. Este precio es el valor de costo incrementado por el porcentaje de ganancia de cada uno.
El costo de los muebles depende del tipo de mueble. 
- Para las mesa el costo se calcula como la multiplicación del costo base por un multiplicador dependiente del tipo de mesa más el 0,2 de la superficie (el 20% de la superficie) (costo base * multiplicador del tipo de mesa + 0.2 * largo * ancho)
- Para las sillas el costo se calcula como la suma entre el costo base más la multiplicación entre el alto de la silla y el multiplicador dependiente del material. (costo base + multiplicador del material * alto)
- Para los sillones el costo se calcula como la multiplicación del costo base por la cantidad de cuerpos por un porcentaje definido para el tipo de tela pedido (costo base * cantidad de cuerpos * porcentaje adicional por tela)


Adicionalmente todos los muebles deberán poder indicar, mediante un método, si su modelo corresponde con el recibido por parámetro


Por otro lado, la fábrica de muebles poseerá un listado de muebles fabricados y un nombre. Además tendrá como responsabilidad la fabricación de muebles (registro de los muebles fabricados), deberá poder indicar si un determinado modelo de mueble ha sido fabricado y por último, al ser Mostrable, deberá mostrar por consola un resumen que indique su nombre, la cantidad de muebles fabricados de cada tipo y el importe total de las ventas de los muebles fabricados.


## Diagrama de clases INCOMPLETO de la solución:



Para aprobar el examen se deberá realizar lo siguiente:
1. Completar los atributos faltantes, el constructor y los métodos incompletos de las clases FabricaDeMuebles, Mueble, Mesa, Silla y Sillón
2. Implementar los métodos definidos por la interfaz Mostrable donde corresponda y en base a lo especificado.
3. Implementar el método “calcularPrecioCosto” en las clases que crea conveniente
4. Implementar el método “modeloCorrecto” de la clase Mueble.
5. Implementar el método “fabricar” de la FabricaDeMuebles que deberá recibir un mueble e indicar si lo pudo fabricar devolviendo un true. No se podrá fabricar si el mueble recibido es nulo.
6. Implementar el método “seHaFabricado” de la clase FabricaDeMuebles que dado un modelo indique si dicho modelo se ha fabricado.
7. Implementar el método que permita que la clase FabricaDeMuebles muestre la información solicitada.


Para probar el funcionamiento del programa se dispone de una clase de prueba ​“Parcial1” que contiene la creación de la Fábrica “Súper Fábrica 2000” y dispone de un lote de pruebas de muebles que serán fabricados.
**NOTA: Esta clase no deberá ser modificada por los alumnos.**


La ejecución de la clase Parcial1 deberá arrojar el siguiente resultado:


