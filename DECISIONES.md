#  Registro de decisiones técnicas del proyecto

---

##  Decisión #01

### ¿Qué decidí?
Implementar una arquitectura en capas (Controller, Service, Repository, Model) utilizando Spring Boot.

### ¿Por qué?
Porque permite separar responsabilidades, mejorar la organización del código y facilitar el mantenimiento del sistema. Además, es el estándar en aplicaciones backend profesionales.

###  Artefacto de diseño que respalda esta decisión
Arquitectura en capas 

- Controller → maneja solicitudes HTTP
- Service → lógica de negocio
- Repository → acceso a base de datos
- Model → entidades del sistema

---

##  Decisión #02

### ¿Qué decidí?
Usar relaciones JPA entre entidades (OneToMany, ManyToOne, OneToOne).

### ¿Por qué?
Porque el sistema requiere modelar relaciones reales entre donantes, donaciones, productos e inventario, asegurando integridad de los datos en la base de datos.

###  Artefacto de diseño que respalda esta decisión
Modelo entidad-relación (ERD) basado en base de datos relacional.

---

##  Decisión #03

### ¿Qué decidí?
Implementar DTOs para la respuesta de la API en lugar de exponer directamente las entidades.

### ¿Por qué?
Para evitar problemas de serialización JSON, ciclos infinitos y datos innecesarios en la respuesta. Además, mejora la seguridad y limpieza del API.

###  Artefacto de diseño que respalda esta decisión
Patrón DTO (Data Transfer Object).

---

##  Decisión #04

### ¿Qué decidí?
Usar un Mapper manual para convertir entidades a DTOs.

### ¿Por qué?
Porque permite controlar exactamente qué datos se envían en la respuesta y evita dependencias externas innecesarias.

###  Artefacto de diseño que respalda esta decisión
Patrón Mapper (Transformación de objetos entre capas).

---

##  Decisión #05

### ¿Qué decidí?
Actualizar automáticamente el inventario cuando se registra una donación.

### ¿Por qué?
Porque el sistema debe reflejar en tiempo real la cantidad de productos disponibles sin intervención manual.

###  Artefacto de diseño que respalda esta decisión
Regla de negocio (Business Rule) dentro de la capa Service.

---

##  Decisión #06

### ¿Qué decidí?
Usar Spring Boot con Spring Data JPA y MySQL como base de datos.

### ¿Por qué?
Porque facilita el desarrollo rápido de APIs REST, manejo de persistencia y escalabilidad del sistema.

###  Artefacto de diseño que respalda esta decisión
Arquitectura Spring Boot + ORM (Object Relational Mapping).

## Decisión #07

### ¿Qué decidí?
Implementar el módulo de detalle de donaciones como una entidad independiente (`DetalleDonacion`) con su propio CRUD y formulario en Thymeleaf, en lugar de manejar los productos donados directamente dentro de `Donacion`.

### ¿Por qué?
Porque se necesita modelar correctamente una relación de tipo “cabecera-detalle”, donde:
- Una donación puede contener múltiples productos
- Cada producto tiene una cantidad independiente
- Se requiere control individual de cada registro

Esto mejora:
- Escalabilidad del sistema
- Claridad en la estructura de datos
- Gestión independiente de cada detalle de donación

### ¿Qué artefacto de diseño respalda esta decisión?
- Modelo entidad-relación (ERD)
- Patrón Cabecera – Detalle (Master-Detail)
- Diagrama de clases UML

---

## Decisión #08

### ¿Qué decidí?
Implementar formularios dinámicos en Thymeleaf utilizando `th:object` y `th:field` para permitir la creación y edición de entidades en la misma vista (CRUD unificado).

### ¿Por qué?
Porque permite:
- Reutilizar el mismo formulario para crear y editar
- Evitar duplicación de vistas
- Facilitar el binding automático de Spring MVC
- Mejorar la experiencia de usuario en el CRUD visual

Además, fue necesario para resolver problemas de edición en `DetalleDonacion`, donde el formulario no persistía correctamente los cambios sin el uso de `th:object`.

### ¿Qué artefacto de diseño respalda esta decisión?
- Patrón MVC con Thymeleaf
- Form Binding de Spring MVC
- Diseño de interfaz CRUD unificado