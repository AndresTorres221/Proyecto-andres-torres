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