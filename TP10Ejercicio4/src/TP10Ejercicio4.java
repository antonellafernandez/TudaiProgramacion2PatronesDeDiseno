package com.mycompany.tp10ejercicio4;

/*

4. Control de Gastos

Se desea implementar un sistema para el control de gastos de una organización. El sistema
debe poder permitir almacenar el gasto con su descripción, la fecha, su monto y demás
características que se le deseen incorporar. Asimismo, es posible incluir un detalle
pormenorizado sobre un gasto. De esta forma el usuario puede detallar cómo se compone
originalmente el gasto. Por ejemplo, el gasto “construcción edificio” se basa en gastos en
cimientos, gastos en edificación y gastos en pintura. El monto total del gasto es la suma de
cada una de las partes que lo componen.

Siempre se puede caracterizar cualquiera de los tipos de gasto acorde a lo deseado por el
usuario, por ejemplo para gastos de pintura, color rojo, calidad media, metros 35.

Se deben proveer servicios que permitan obtener:

1. El total de dinero gastado en una fecha dada.
2. El total de dinero que se gastó en el rubro: Alimentos.
3. Un listado con todos los gastos de una fecha dada.
4. Un listado con todos los gastos de calidad media que se hicieron.
5. El total de dinero que se gastó en pintura, en una fecha dada.
6. Un listado de todos los gastos que superen los 1556 pesos.
7. Estos son solo algunos ejemplos de listados y sumas de gastos que se pueden
solicitar. Es posible que se combinen distintas formas de pedir sumas o listados.

Aclaración sobre los listados de gastos: Cuando se trabaja con un gasto que se encuentra
detallado se debe proceder de la siguiente forma. Por ejemplo, si se solicitan los productos
de calidad alta, y el gasto (que está detallado) posee una calidad alta, este gasto es incluido en
el listado, ahora sí el mismo NO posee calidad alta pero dentro del detalle hay gastos que sí
poseen calidad alta, estos últimos son los que deben ser incluidos en el listado.

Proveer la funcionalidad necesaria para el siguiente tipo de gasto: la organización administra
un caso de gasto pendiente de pago. Dicho gasto puede ser cualquier tipo existente (un gasto
simple o un gasto detallado) o cualquier tipo de gasto que se agregue en un futuro, tiene un
porcentaje de actualización anual, la cantidad de días pendiente, si el mismo ya se pagó o está
pendiente, y el monto se calcula en base al gasto contenido más el porcentaje acorde a los
días pendiente de pago. Si ya se pagó el monto es un valor fijo, calculado al momento que se
informó el pago. Implementar la funcionalidad que permita informar el pago del gasto y fijar
el valor de dicho monto.

*/

public class TP10Ejercicio4 {
    public static void main(String[] args) {
        
    }
}
