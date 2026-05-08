#  Bitácora de Desarrollo - Proyecto Banco de Alimentos

---

##  Iteración 01 - Estructura inicial del proyecto

Se creó la estructura base del proyecto en Spring Boot utilizando arquitectura en capas:

- Controller
- Service
- Repository
- Model

Se configuró la conexión a base de datos MySQL y se verificó el funcionamiento inicial del proyecto.

---

##  Iteración 02 - Modelado de entidades

Se diseñaron y crearon las entidades principales del sistema:

- Usuario
- Rol
- Donante
- Producto
- Categoría
- Estado de conservación
- Donación
- Detalle de donación
- Inventario

Se establecieron relaciones JPA:

- OneToMany (Donación → DetalleDonación)
- ManyToOne (DetalleDonación → Producto / Donación)
- OneToOne (Inventario → Producto)

---

##  Iteración 03 - Implementación de API REST

Se implementaron los controladores REST para:

- Gestión de donaciones
- Gestión de productos
- Gestión de donantes
- Gestión de inventario

Se probaron endpoints en Postman para validación funcional.

---

##  Iteración 04 - Lógica de negocio (Inventario)

Se implementó la lógica de actualización automática del inventario:

- Cada vez que se registra una donación
- Se actualiza el stock de productos automáticamente

Esto se realizó en la capa Service.

---

##  Iteración 05 - Manejo de relaciones y persistencia

Se corrigieron problemas de relaciones entre entidades:

- Asociación de detalles con donación
- Persistencia en cascada (CascadeType.ALL)
- Corrección de errores de integridad referencial

---

##  Iteración 06 - Problemas de serialización JSON

Se resolvieron problemas de:

- Ciclos infinitos en JSON
- Exceso de profundidad en objetos
- Datos nulos en respuestas

Se aplicaron soluciones como:

- @JsonIgnore
- Ajuste de relaciones JPA
- Optimización de carga de datos

---

##  Iteración 07 - Implementación de DTOs y Mapper

Se implementó una arquitectura basada en DTOs para mejorar la respuesta de la API.

- Se crearon DTOs para Donación, Donante, Producto y DetalleDonación
- Se implementó un Mapper manual para conversión de entidades a DTOs
- Se mejoró la claridad y limpieza de las respuestas JSON

---

##  Iteración 08 - Trazabilidad diseño → código

Se documentaron los métodos principales del sistema con trazabilidad:

- CU-01 | RF-01 → Registrar donación
- CU-02 | RF-03 → Actualizar inventario
- CU-01 | RF-04 → Listar donaciones

Esto permitió relacionar el diseño del sistema con su implementación en código.

---

##  Iteración 09 - Pruebas finales en Postman

Se realizaron pruebas completas del sistema:

- Creación de donaciones con detalles
- Consulta de donaciones con DTOs
- Verificación de actualización automática del inventario

Resultados:

✔ API funcional  
✔ Datos coherentes  
✔ Inventario actualizado correctamente  
✔ Respuestas JSON limpias  

---

##  Estado final del proyecto

El sistema se encuentra funcional con:

- Arquitectura en capas implementada
- API REST completa
- Integración entre donaciones e inventario
- Uso de DTOs para respuestas limpias
- Base de datos relacional normalizada