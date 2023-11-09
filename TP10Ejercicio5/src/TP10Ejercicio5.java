package com.mycompany.tp10ejercicio5;

/*

5. Logistica Morgana

Una empresa de transporte naval Logística Morgana organiza viajes de carga para diferentes
clientes. Para optimizar recursos, la empresa agrupa diferentes paquetes en Combos. Si un
combo no tiene suficientes paquetes para completar un barco, puede seguir agrupando dos o
más combos pequeños en un combo más grande, sin perder la estructura de qué paquetes
pertenecen a cada combo. Incluso la empresa podría agregar paquetes adicionales sueltos a un
combo de agrupación. De cada paquete y combo se guarda su identificación alfanumérica.

Cada Combo o paquete posee un destino determinado, una fecha de partida, un costo de envío
y un valor asegurado. A la hora de agrupar combos, la empresa debe controlar que todos se
dirijan al mismo destino, y con la misma fecha de partida.

La empresa ofrece diferentes precios promocionales y por lo tanto el precio que cobra por
cada paquete es distinto. En el caso del combo, el precio queda determinado por la suma de
los precios de todos sus paquetes. Asimismo, lleva la cuenta del valor asegurado de cada
paquete y en el caso del combo, el valor asegurado es la suma de los valores asegurados de
todos sus componentes.

La empresa solicita que se provean los siguientes servicios:

● Contar la cantidad total de paquetes que posee un combo.
● Retornar el paquete con mayor valor asegurado de un combo. Nota: debe ser un
paquete y no un combo
● Obtener una copia de un combo/paquete: Se debe obtener una copia de todo el
contenido respetando la estructura original.
● Realizar búsquedas de paquetes/combos. Por ejemplo:
    o Todos los que tienen un valor asegurado superior a $500.000.
    o Todos los que el precio no supere un décimo del valor asegurado acordado.
    o Todos los que van a China.
    o Los anteriores son solo algunos ejemplos de búsqueda, se pueden crear nuevas
    formas y combinaciones lógicas de los anteriores.

Nota: En el caso de la búsqueda, si un combo cumple con lo que se está buscando, el combo
en sí será parte del resultado, en caso que no cúmpla se propaga la búsqueda sobre los
elementos que él contiene.

El armado de combos fue un éxito y la empresa quiere armar combos sin la restricción de que
todos sus componentes vayan al mismo destino en la misma fecha. En este sentido agregó
combos que controlan que sólo la fecha de partida sea la misma, o que sólo el destino sea el
mismo (para poder enviar paquetes atrasados), o que el precio no supere un tercio del valor
asegurado, o que el valor asegurado no sea mayor a $5.000.000. Igualmente, como la
demanda va cambiando, este requisito se puede combinar y variar dinámicamente.

La empresa también quiere incluir dos tipos nuevos de combos: uno que se identifica como
“express”, el cual solo acepta que se agreguen elementos cuyo destino sea “Corea”; y el otro
que se identifica como “Promocionales”, en el cual el precio del mismo es el promedio de los
precios que él contiene.

*/

public class TP10Ejercicio5 {
    public static void main(String[] args) {
        
    }
}
