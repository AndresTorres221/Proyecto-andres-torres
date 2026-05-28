#  Proyecto Backend - Sistema de Banco de Alimentos

##  ¿Qué módulo implementas?

En este proyecto se implementa el módulo de **Gestión de Donaciones**, el cual permite registrar donaciones realizadas por donantes, asociar productos donados, y actualizar automáticamente el inventario disponible en el sistema.

Este módulo es el núcleo del sistema, ya que conecta donantes, productos e inventario en un flujo automático.

---

##  ¿Qué tablas cubre tu módulo?

El módulo de donaciones trabaja con las siguientes tablas de la base de datos:

- USUARIO (autenticación y acceso al sistema)
- ROL (roles de usuario)
- DONANTE (personas que realizan donaciones)
- DONACION (registro principal de cada donación)
- DETALLE_DONACION (productos y cantidades por donación)
- PRODUCTO (productos disponibles para donación)
- CATEGORIA_PRODUCTO (clasificación de productos)
- ESTADO_CONSERVACION (estado del producto)
- INVENTARIO (control de stock actualizado automáticamente)

---

##  ¿Qué framework elegiste y por qué?

Se utilizó **Spring Boot (Java)** como framework principal porque:

- Permite desarrollar aplicaciones backend de forma rápida y estructurada
- Facilita la integración con bases de datos mediante Spring Data JPA
- Soporta arquitectura REST para comunicación con Postman o frontend
- Maneja inyección de dependencias automáticamente
- Permite escalar el proyecto de forma ordenada y profesional

---

##  ¿Cómo ejecutar el proyecto?

### 1. Requisitos previos
- Java 17 o superior
- Maven instalado
- MySQL o HeidiSQL configurado
- IDE como IntelliJ IDEA o VS Code

---

### 2. Configurar base de datos

Crear una base de datos en MySQL:

```sql
CREATE DATABASE persondb;