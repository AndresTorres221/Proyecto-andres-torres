# Diccionario de datos


## 1. USUARIO

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Long | Identificador único |
| nombre | String | Nombre del usuario |
| email | String | Correo electrónico |
| password | String | Contraseña de acceso |
| rol_id | Long | Relación con Rol |

---

##  2. ROL

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Long | Identificador del rol |
| nombre | String | Tipo de rol (ADMIN, DONANTE, etc.) |

---

##  3. DONANTE

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Long | Identificador del donante |
| nombre | String | Nombre del donante |
| telefono | String | Número de contacto |
| direccion | String | Dirección |
| usuario_id | Long | Relación con Usuario |

---

##  4. PRODUCTO

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Long | Identificador del producto |
| nombre | String | Nombre del producto |
| descripcion | String | Descripción del producto |
| precio | Double | Precio del producto |
| cantidad | Integer | Cantidad disponible |
| categoria_id | Long | Relación con Categoría |
| estado_id | Long | Relación con Estado de Conservación |

---

##  5. CATEGORIA

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Long | Identificador |
| nombre | String | Nombre de la categoría |

---

##  6. ESTADO_CONSERVACION

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Long | Identificador |
| nombre | String | Estado del producto (Bueno, Regular, etc.) |

---

##  7. DONACION

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Long | Identificador de la donación |
| fecha | LocalDate | Fecha de la donación |
| donante_id | Long | Relación con Donante |

---

##  8. DETALLE_DONACION

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Long | Identificador |
| cantidad | Integer | Cantidad donada |
| donacion_id | Long | Relación con Donación |
| producto_id | Long | Relación con Producto |

---

##  9. INVENTARIO

| Campo | Tipo | Descripción |
|------|------|-------------|
| id | Long | Identificador |
| producto_id | Long | Relación con Producto |
| stock | Integer | Cantidad disponible en inventario |

---

#  RELACIONES ENTRE ENTIDADES

- Usuario → Rol (Muchos a Uno)
- Donante → Usuario (Muchos a Uno)
- Producto → Categoria (Muchos a Uno)
- Producto → EstadoConservacion (Muchos a Uno)
- Donacion → Donante (Muchos a Uno)
- Donacion → DetalleDonacion (Uno a Muchos)
- DetalleDonacion → Producto (Muchos a Uno)
- Inventario → Producto (Uno a Uno o Muchos a Uno según diseño)

---

#  CONCLUSIÓN

Este sistema permite gestionar usuarios, productos, donaciones e inventario con relaciones entre entidades y control de stock automático.