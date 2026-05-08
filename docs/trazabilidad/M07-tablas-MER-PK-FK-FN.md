# Tabla 7: Tablas → MER → PK → FK → Forma Normal

| Tabla | MER | PK | FK | Forma |
|-------|-----|----|----|-------|
| Usuario | Entidad | id_usuario | - | 3FN |
| Donacion | Entidad | id_donacion | id_usuario | 3FN |
| Producto | Entidad | id_producto | id_donacion | 3FN |
| Recoleccion | Relación | id_recoleccion | id_donacion | 3FN |
| Entrega | Relación | id_entrega | id_recoleccion | 3FN |