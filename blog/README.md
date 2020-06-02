# Mi Primer Blog

En esta aplicación, se pide que como desarrollador, construya un blog que permita a las personas ver las entradas
publicadas y poder comentar sobre las mismas.

## El Inicio

Cuando se inicia la aplicación, se deberán mostrar todas las entradas del blog, así:

```
*********************************************************
                   Entradas del Blog                              
*********************************************************
(1) Título: <Título> 
    Fecha: <Fecha> - Autor: <Autor>
(2) Título: <Título> 
    Fecha: <Fecha> - Autor: <Autor>
(3) Título: <Título> 
    Fecha: <Fecha> - Autor: <Autor>
...
(n) Título: <Título> 
    Fecha: <Fecha> - Autor: <Autor>

Para ver alguna entrada escriba el número de la misma, sino escriba 's' para salir: 

```

Consideraciones:

- A cada entrada del blog se le debe asignar un número consecutivo, el cual será usado
  por los usuarios para acceder al contenido de la entrada. Si por ejemplo, solo hay una
  entrada en el blog, en la opción yo digito '1' y me debería luego mostrar la información
  de esa entrada.
- Si la persona digita 's' el programa se acaba.
- Los valores <Título>, <Fecha> y <Autor> deben ser reemplazados por la información de la entrada

## Entrada
Una vez la persona haya digitado el número de la entrada, entonces se mostrará la siguiente sección:

```
*********************************************************
                   <Título>                             
*********************************************************
Fecha: <Fecha> - Autor: <Autor>
<Contenido>

-----------
Comentarios:

    Fecha: <Fecha> - Autor: <Autor>
    <Contenido>
    ---
    Fecha: <Fecha> - Autor: <Autor>
    <Contenido>
    ...

Opciones:
(1) Agregar un comentario
(2) Volver al listado de entradas 

```
Consideraciones:
- Los valores <Título>, <Fecha> y <Autor> deben ser reemplazados por la información de la entrada
- Los comentarios se deben mostrar desde el más reciente hasta el más antiguo (Se debe elegir la estructura
  adecuada para almacenarlos)
- Los valores <Título>, <Fecha> y <Autor> deben ser reemplazados por la información de cada uno de los
  comentarios
- Si no hay comentarios la sección de comentarios estará vacía
- Si la persona digita '1' se va a la sección de agregar comentario
- Si la persona digita '2' se volverá a la pantalla anterior (principal) en donde se muestran las entradas

## Agregar Comentario
En esta sección se pedirá a la persona que agrege la información del comentario, así:

```
Autor: 
Comentario: 
```

Consideraciones:
- El autor es el seudónimo de la persona. Es opcional. En el caso en que la persona no escriba nada deberá
  almacenarse el valor "Anónimo". Si la persona escribe algo, deberá ser no máximo a 10 caracteres.
- El comentario no puede ser vacío. Debe ser de un máximo de 100 caracteres.
- Una vez se agregue el comentario, se devuelve a la pantalla de la entrada, se muestra toda la información
  y el nuevo comentario agregado de primero.
  
## Consideraciones Generales
1. Para este ejercicio se entrega código base. Se han puesto comentarios ``` //TODO ``` por todo el código. Estos,
   indican el lugar y la acción a codificar para completar el ejercicio.
2. Se debe seleccionar la estructura adecuada para almacenar el listado de entradas del blog. Esta se debe poner
   en la clase "PostStructure".
3. En la clase "Post" se debe seleccionar la estructura adecuada para almacenar el listado de comentarios que 
   tiene una entrada (leer las especificaciones).
   
   _Tip: El comentario más nuevo al comienzo, el más viejo al final_
    