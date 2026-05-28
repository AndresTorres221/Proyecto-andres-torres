# Diccionario de datos


#  1. USUARIO

| Campo | Tipo SQL | Restricciones | Descripción |
|------|----------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador del usuario |
| nombre | VARCHAR(100) | NOT NULL | Nombre del usuario |
| email | VARCHAR(100) | NOT NULL, UNIQUE | Correo electrónico |
| password | VARCHAR(255) | NOT NULL | Contraseña |
| rol_id | BIGINT | FOREIGN KEY | Relación con Rol |

---

#  2. ROL

| Campo | Tipo SQL | Restricciones | Descripción |
|------|----------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador del rol |
| nombre | VARCHAR(50) | NOT NULL | Nombre del rol (ADMIN, DONANTE, etc.) |

---

#  3. DONANTE

| Campo | Tipo SQL | Restricciones | Descripción |
|------|----------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador del donante |
| nombre | VARCHAR(100) | NOT NULL | Nombre del donante |
| telefono | VARCHAR(20) | NOT NULL | Teléfono |
| direccion | VARCHAR(150) | NULL | Dirección |
| usuario_id | BIGINT | FOREIGN KEY | Relación con Usuario |

---

#  4. PRODUCTO

| Campo | Tipo SQL | Restricciones | Descripción |
|------|----------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador del producto |
| nombre | VARCHAR(100) | NOT NULL | Nombre del producto |
| descripcion | TEXT | NULL | Descripción |
| precio | DOUBLE | NOT NULL | Precio del producto |
| cantidad | INT | NOT NULL | Cantidad disponible |
| categoria_id | BIGINT | FOREIGN KEY | Relación con Categoría |
| estado_id | BIGINT | FOREIGN KEY | Relación con Estado de Conservación |

---

#  5. CATEGORIA

| Campo | Tipo SQL | Restricciones | Descripción |
|------|----------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador |
| nombre | VARCHAR(100) | NOT NULL | Nombre de la categoría |

---

#  6. ESTADO_CONSERVACION

| Campo | Tipo SQL | Restricciones | Descripción |
|------|----------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador |
| nombre | VARCHAR(50) | NOT NULL | Estado del producto (Bueno, Regular, Malo) |

---

#  7. DONACION

| Campo | Tipo SQL | Restricciones | Descripción |
|------|----------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador de la donación |
| fecha | DATE | NOT NULL | Fecha de la donación |
| donante_id | BIGINT | FOREIGN KEY | Relación con Donante |

---

#  8. DETALLE_DONACION

| Campo | Tipo SQL | Restricciones | Descripción |
|------|----------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador |
| cantidad | INT | NOT NULL | Cantidad donada |
| donacion_id | BIGINT | FOREIGN KEY | Relación con Donación |
| producto_id | BIGINT | FOREIGN KEY | Relación con Producto |

---

#  9. INVENTARIO

| Campo | Tipo SQL | Restricciones | Descripción |
|------|----------|---------------|-------------|
| id | BIGINT | PRIMARY KEY, AUTO_INCREMENT | Identificador |
| producto_id | BIGINT | FOREIGN KEY | Relación con Producto |
| stock | INT | NOT NULL | Cantidad disponible en inventario |

---

#  RELACIONES ENTRE TABLAS

- USUARIO → ROL (Muchos a Uno)
- DONANTE → USUARIO (Muchos a Uno)
- PRODUCTO → CATEGORIA (Muchos a Uno)
- PRODUCTO → ESTADO_CONSERVACION (Muchos a Uno)
- DONACION → DONANTE (Muchos a Uno)
- DONACION → DETALLE_DONACION (Uno a Muchos)
- DETALLE_DONACION → PRODUCTO (Muchos a Uno)
- INVENTARIO → PRODUCTO (Uno a Uno o Muchos a Uno)

---

#  CONCLUSIÓN

Este sistema permite gestionar usuarios, productos, donaciones e inventario con relaciones entre entidades y control de stock automático.

