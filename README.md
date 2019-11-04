# contenedores_archivosplanos_java
Contenedores con anidamiento y archivos planos en Java

La base de datos COMPAÑIA se ocupa de los empleados, departamentos y proyectos de una empresa, de acuerdo con los siguientes requisitos:

La compañía está organizada en departamentos. Cada departamento tiene un Nombre único, un código único y un empleado que la dirige. Se guarda la fecha en que dicho empleado comenzó a dirigir el departamento.

Cada departamento controla un cierto número de proyectos

Cada proyecto tiene un número asociado, un nombre, una descripción, fecha de inicio, fecha de finalización y el empleado relacionado.

Se almacena el nombre, número de la Seguridad Social, dirección, salario, genero (1=masculino, 2=femenino), numero de hijos y fecha de nacimiento de cada empleado. Todo empleado está asignado a un departamento, pero puede trabajar en varios proyectos que no tienen porque ser del mismo departamento.

El programa debe construirse en base a contenedores con anidamiento y archivos planos.

# Se debe generar:

* Mantenimiento (inserción, búsqueda y modificación) de objetos (empleados,proyectos, departamentos)
* Listado de departamentos
* Listado de empleados
* Listado de proyectos en general
* Listado de proyectos según departamento
* Listado de proyectos que tiene asignado un empleado X
* Cuales empleados tienen más de 2 hijos
* Listado de empleados que tienen sueldos mayores a $1.000.000
* Listado de empleados según género y el sueldo es menor o igual a 2.000.000 o tengan más de 3 hijos.
* Listado de proyectos según fecha de inicio y terminación
