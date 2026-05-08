# Tabla 8: DDL → Modelo → PK → FK → Restricciones

| DDL | Modelo | PK | FK | Restricciones |
|-----|--------|----|----|---------------|
| Usuario | Usuario | id | - | NOT NULL |
| Donacion | Donación | id | usuario_id | FK |
| Producto | Producto | id | donacion_id | NOT NULL |
| Entrega | Entrega | id | recoleccion_id | FK |