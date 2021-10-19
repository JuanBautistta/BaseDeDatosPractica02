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