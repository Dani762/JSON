# Cómo añadir más objetos para serializar y deserializar con JSON
Escribir un solo objeto es tarea fácil, pero escribir más de uno requiere de una labor un poco más avanzada. Para empezar, porque para escribir y leer varios objetos y pasarlos a JSON necesitaríamos, como realizo en el código fuente, un 
ArrayList de tipo coche que nos permita añadir los objetos Coche que queramos. Una vez realizado, la escritura la realizamos de la misma manera, pero pasando esta vez la lista por parámetro, y en vez de la clase del objeto, la clase del 
ArrayList (ArrayList.class). Una vez escrito, debemos deserializar esta escritura, realizanado el mismo procedimiento que antes, pero con un pequeño cambio. Cuando deserializábamos un objeto, al JSON le indicábamos de qué tipo era el objeto
(en este caso, de la clase Coche). Ahora, no obstante, hay que indicarle que el ArrayList que debe crear es de tipo Coche. para eso, utilizamos Type, una interfaz, y la clase TypeToken, que permite obtener el tipo de un objeto en tiempo de ejecución. Con getType, se obtiene el objeto Type correspondiente al tipo de lista ArrayList<Coche>. el objeto Type, se utiliza en fromJson() para indicarle al objeto gson cómo debe deserializar el JSON.
