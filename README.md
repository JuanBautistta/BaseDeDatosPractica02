# Práctica 02

## Sistemas de Archivos vs Bases de Datos
![](https://bs-uploads.toptal.io/blackfish-uploads/blog/post/seo/og_image_file/og_image/15493/0712-Bad_Practices_in_Database_Design_-_Are_You_Making_These_Mistakes_Dan_Social-754bc73011e057dc76e55a44a954e0c3.png)
## Integrantes

1. [Juan Carlos Bautista Sandoval](https://github.com/JuanBautistta) 
2. [Daniel Beristain Hernandez](https://github.com/danBH11)
3. [Juan Manuel Diaz Quiñonez]()
4. [Adrián Felipe Fernández Romero]()
5. [Fausto David Hernández Jasso](https://github.com/faustodavidhernandezjasso)

## Problemática
La compañía **Nixut** entiende que el proceso para crear una base de datos puede ser tardada y laboriosa, pero le urge ya empezar a tener un avance en la información para su tienda virtual.

Para esto recurriremos a un plan alternativo. Vamos a desarrollar un prototipo que solicite información y la almacene en archivos **CSV**. Así, simularemos que ya almacenamos parte de la información necesaria en la base
de datos.

**Nixut** necesita almacenar información sobre los clientes, proveedores, productos y categorías que actualmente están dentro de la tienda. La información que se capturara se utilizara mas adelante para poblar la base de
datos una vez que esté creada. Por lo tanto deben tener cuidado al momento de concretar las entidades que se utilizaran para este trabajo.

El prototipo debe permitir agregar, consultar, editar, y eliminar información de clientes, proveedores, productos y categorías. Se debe tener en cuenta la relación que existe entre las entidades.

La información capturada tiene que persistir, por lo que el sistema debe guardar y leer la información en archivos **.CSV**, se tomará en cuenta como se organizan estos archivos **.CSV** para almacenar la información.

Confiamos en que el grupo de Fundamentos de Bases de Datos sea capaz de desarrollar en tiempo esta primera
entrega.

## Descarga
```bash
git clone https://github.com/JuanBautistta/BaseDeDatosPractica02.git
```
## Ejecución
```bash
cd Práctica02_LordsCiencias
javac BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/*.java
java BaseDeDatosPractica02/Practica2_LordsCiencias/SRC/Main
```

## Uso 
 Al ejecutar la aplicación siguiendo los pasos antes mecionados, se desplegara por medio de la terminal un menú en el cual
 se mostraran las tablas, de las cuales estamos guardando información, tambien se mostrara la opción salir en caso de querer
 abandonar la aplicación. Al elegir una entidad se desplegara otro menú el cual nos dara las opciones de agregar,consultar,
 editar,eliminar y regresar al menu principal, a continuación se detalla el uso de cada una de estas opciones.

 Agregar: 
    1.-Se pediran los datos del objeto que se desea agregar.
    2.-Una vez finalizado , automanticamente se agregara a la BD. En caso de que los datos
       sean incorrectos se le notificara.
    *Comentario: Asegurese de que los datos ingresados sean del tipo adeacuado.
 Consultar:
    1.-Se despliaga automanticamente la información relacionada con alguna tabla de la BD
 Modificar:
    1.-Se pedira al usuario todos los datos, de el objeto a modificar.
    2.-De encontrarlo se pediran de nuevo todos los datos, en esta parte se podran insertar las 
        modificaciones necesarias.En caso de no encontrarlo se le notificara al usurio.
    3.-Al finalizar los cambios, se mostrara un mensaje indicando que el elemento se agrego exitosamente.
    *Comentario: Al ingresar los datos, asegurese que sean correctos y del tipo adecuado.
 Eliminar: 
    1.-Se pediran los datos del objeto a eliminar.
    2.-De encontrar dicho elemento, se eliminara. En caso contrario se mostrara un mensaje de objeto
       no encontrado.
    *Comentario: Al ingresar los datos, asegurese que sean correctos y del tipo adecuado.
 Menu Principal: Nos regresa al menu principal
## Ejemplo de Uso

```bash
================= Gestión de Tienda Virtual =================
- Clientes      (1)
- Proveedores   (2)
- Productos     (3)
- Categorí­as    (4)
- Salir         (0)

Seleccione una opción: 3

================= Productos =================
- Agregar               (1)
- Consultar             (2)
- Editar                (3)
- Eliminar información  (4)
- Menú principal        (0)

Seleccione una opción: 1
Introduzca el nombre: 
Maruchan
Introduzca el precio: 
12.5
Introduzca la cantidad de unidades: 
100
Introduzca la descripciÃ³n: 
Sopa instantánea
Introduzca la imagen: 
maruchan.jpg
Introduzca el descuento: 
3
Producto agregado 
================= Gestión de Tienda Virtual =================
- Clientes      (1)
- Proveedores   (2)
- Productos     (3)
- Categorías    (4)
- Salir         (0)
Seleccione una opción: 0
Saliendo del sistema...
Hasta pronto.
```



## Licencia
[MIT](https://choosealicense.com/licenses/mit/)