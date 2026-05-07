#  Normalizacion (3FN)
## Primera Forma Normal (1FN)

¿Qué significa?

Que los datos no se repitan y que cada campo tenga un solo valor.

Problema encontrado

En el modelo hay relaciones donde:
•	una donación tiene varios productos 
•	una entrega tiene varios productos 
Esto puede generar datos repetidos.

Solución

Se crean dos tablas nuevas:
DETALLE_DONACION
•	id_donacion 
•	id_producto 
•	cantidad 
DETALLE_ENTREGA
•	id_entrega 
•	id_producto 
•	cantidad 

¿Por qué se hizo esto?
Para evitar repetir información y organizar mejor los productos dentro de cada donación y entrega.

## Segunda Forma Normal (2FN)
¿Qué significa?
Que todos los datos dependan completamente de la clave principal.

Análisis
Las tablas nuevas (DETALLE_DONACION y DETALLE_ENTREGA):
•	tienen claves compuestas 
•	pero sus datos dependen bien de esas claves 

Resultado
No fue necesario hacer cambios.

¿Por qué?
Porque no hay datos mal relacionados o incompletos.

## Tercera Forma Normal (3FN)
¿Qué significa?
Que los datos no dependan de otros datos, sino solo de la clave principal.

Cambios realizados

1. Manejo de roles

Antes:
•	el rol estaba dentro de USUARIO 
Ahora:
Se crea una tabla nueva:

ROL
•	id_rol 
•	nombre_rol 
Y la tabla USUARIO queda así:

USUARIO
•	id_usuario 
•	id_rol 
•	correo 
•	estado 

¿Por qué?

Porque hay varios tipos de usuario:

•	administrador 
•	donante 
•	voluntario 
•	beneficiario 
Esto hace que el sistema sea más ordenado y fácil de ampliar.

 2.Inventario
 
Antes:
•	había un campo llamado estado_stock 

Cambio
Se elimina ese campo.

¿Por qué?
Porque ese dato se puede calcular con la cantidad, no es necesario guardarlo.

 Revisión general
Se revisaron las demás tablas y:
•	están bien organizadas 
•	no tienen errores de dependencia 

## Tablas finales
USUARIO
•	id_usuario 
•	id_rol 
•	correo 
•	estado 

ROL
•	id_rol 
•	nombre_rol 

DONANTE
•	id_donante 
•	tipo_donante 
•	ubicacion 
•	id_usuario 

BENEFICIARIO
•	id_beneficiario 
•	estrato 
•	tipo_beneficiario 
•	id_usuario 

PRODUCTO
•	id_producto 
•	categoria 
•	fecha_vencimiento 
•	estado_conservacion 

DONACION
•	id_donacion 
•	id_donante 
•	estado 
•	evidencia_digital 

DETALLE_DONACION
•	id_donacion 
•	id_producto 
•	cantidad 

INVENTARIO
•	id_inventario 
•	id_producto 
•	cantidad_actual 

RECOLECCION
•	id_recoleccion 
•	id_donacion 
•	id_ruta 
•	estado 

RUTA
•	id_ruta 
•	id_operador 
•	distancia_total 
•	estado_ruta 

ENTREGA
•	id_entrega 
•	id_beneficiario 
•	id_voluntario 
•	estado 
•	evidencia_digital 

DETALLE_ENTREGA
•	id_entrega 
•	id_producto 
•	cantidad 

CALIFICACION
•	id_calificacion 
•	id_entrega 
•	puntuacion 
•	comentario 

NOTIFICACION
•	id_notificacion 
•	id_destinatario 
•	tipo_notificacion 
•	estado 

REPORTE
•	id_reporte 
•	id_solicitante 
•	tipo_reporte 
•	formato_exportacion 

LOG
•	id_log 
•	id_usuario 
•	tipo_operacion 
•	fecha_hora 

